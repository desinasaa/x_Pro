package org.xbrowser.prosuperfast.database.downloads

/**
 * An entry in the downloads database.
 */
data class DownloadEntry(
    val url: String,
    val title: String,
    val contentSize: String
)
