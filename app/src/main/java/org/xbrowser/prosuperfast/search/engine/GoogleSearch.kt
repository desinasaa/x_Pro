package org.xbrowser.prosuperfast.search.engine

import org.xbrowser.prosuperfast.R

/**
 * The Google search engine.
 *
 * See https://www.google.com/images/srpr/logo11w.png for the icon.
 */
class GoogleSearch : BaseSearchEngine(
    "file:///android_asset/search.png",
    "https://www.google.com/search?q=",
    R.string.search_engine_google
)
