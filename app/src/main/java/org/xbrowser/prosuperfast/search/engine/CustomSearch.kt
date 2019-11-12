package org.xbrowser.prosuperfast.search.engine

import org.xbrowser.prosuperfast.R

/**
 * A custom search engine.
 */
class CustomSearch(queryUrl: String) : BaseSearchEngine(
    "file:///android_asset/a5gfastbrowser.png",
    queryUrl,
    R.string.search_engine_custom
)
