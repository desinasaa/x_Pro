package org.xbrowser.prosuperfast.browser

import org.xbrowser.prosuperfast.database.Bookmark

interface BookmarksView {

    fun navigateBack()

    fun handleUpdatedUrl(url: String)

    fun handleBookmarkDeleted(bookmark: Bookmark)

}
