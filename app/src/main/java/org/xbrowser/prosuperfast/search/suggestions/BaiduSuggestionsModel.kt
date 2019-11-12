package org.xbrowser.prosuperfast.search.suggestions

import org.xbrowser.prosuperfast.R
import org.xbrowser.prosuperfast.constant.UTF8
import org.xbrowser.prosuperfast.database.SearchSuggestion
import org.xbrowser.prosuperfast.extensions.map
import org.xbrowser.prosuperfast.log.Logger
import android.app.Application
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import okhttp3.ResponseBody
import org.json.JSONArray

/**
 * The search suggestions provider for the Baidu search engine.
 */
class BaiduSuggestionsModel(
    httpClient: OkHttpClient,
    requestFactory: RequestFactory,
    application: Application,
    logger: Logger
) : BaseSuggestionsModel(httpClient, requestFactory, UTF8, logger) {

    private val searchSubtitle = application.getString(R.string.suggestion)
    private val inputEncoding = "GBK"

    // see http://unionsug.baidu.com/su?wd={encodedQuery}
    // see http://suggestion.baidu.com/s?wd={encodedQuery}&action=opensearch
    override fun createQueryUrl(query: String, language: String): HttpUrl = HttpUrl.Builder()
        .scheme("http")
        .host("suggestion.baidu.com")
        .encodedPath("/s")
        .addEncodedQueryParameter("wd", query)
        .addQueryParameter("action", "opensearch")
        .build()


    @Throws(Exception::class)
    override fun parseResults(responseBody: ResponseBody): List<SearchSuggestion> {
        return JSONArray(responseBody.string())
            .getJSONArray(1)
            .map { it as String }
            .map { SearchSuggestion("$searchSubtitle \"$it\"", it) }
    }

}
