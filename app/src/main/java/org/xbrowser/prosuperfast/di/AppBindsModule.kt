package org.xbrowser.prosuperfast.di

import org.xbrowser.prosuperfast.adblock.allowlist.AllowListModel
import org.xbrowser.prosuperfast.adblock.allowlist.SessionAllowListModel
import org.xbrowser.prosuperfast.database.allowlist.AdBlockAllowListDatabase
import org.xbrowser.prosuperfast.database.allowlist.AdBlockAllowListRepository
import org.xbrowser.prosuperfast.database.bookmark.BookmarkDatabase
import org.xbrowser.prosuperfast.database.bookmark.BookmarkRepository
import org.xbrowser.prosuperfast.database.downloads.DownloadsDatabase
import org.xbrowser.prosuperfast.database.downloads.DownloadsRepository
import org.xbrowser.prosuperfast.database.history.HistoryDatabase
import org.xbrowser.prosuperfast.database.history.HistoryRepository
import org.xbrowser.prosuperfast.ssl.SessionSslWarningPreferences
import org.xbrowser.prosuperfast.ssl.SslWarningPreferences
import dagger.Binds
import dagger.Module

/**
 * Dependency injection module used to bind implementations to interfaces.
 */
@Module
abstract class AppBindsModule {

    @Binds
    abstract fun provideBookmarkModel(bookmarkDatabase: BookmarkDatabase): BookmarkRepository

    @Binds
    abstract fun provideDownloadsModel(downloadsDatabase: DownloadsDatabase): DownloadsRepository

    @Binds
    abstract fun providesHistoryModel(historyDatabase: HistoryDatabase): HistoryRepository

    @Binds
    abstract fun providesAdBlockAllowListModel(adBlockAllowListDatabase: AdBlockAllowListDatabase): AdBlockAllowListRepository

    @Binds
    abstract fun providesAllowListModel(sessionAllowListModel: SessionAllowListModel): AllowListModel

    @Binds
    abstract fun providesSslWarningPreferences(sessionSslWarningPreferences: SessionSslWarningPreferences): SslWarningPreferences

}
