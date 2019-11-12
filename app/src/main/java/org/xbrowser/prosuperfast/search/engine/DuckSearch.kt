package org.xbrowser.prosuperfast.search.engine

import org.xbrowser.prosuperfast.R

/**
 * The DuckDuckGo search engine.
 *
 * See https://duckduckgo.com/assets/logo_homepage.normal.v101.png for the icon.
 */
class DuckSearch : BaseSearchEngine(
    "file:///android_asset/duckduckgo.png",
    "https://duckduckgo.com/?t=a5gfastbrowser&q=",
    R.string.search_engine_duckduckgo
)
