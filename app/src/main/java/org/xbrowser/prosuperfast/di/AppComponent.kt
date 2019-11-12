package org.xbrowser.prosuperfast.di

import org.xbrowser.prosuperfast.BrowserApp
import org.xbrowser.prosuperfast.adblock.AssetsAdBlocker
import org.xbrowser.prosuperfast.adblock.NoOpAdBlocker
import org.xbrowser.prosuperfast.browser.SearchBoxModel
import org.xbrowser.prosuperfast.browser.activity.BrowserActivity
import org.xbrowser.prosuperfast.browser.activity.ThemableBrowserActivity
import org.xbrowser.prosuperfast.browser.fragment.BookmarksFragment
import org.xbrowser.prosuperfast.browser.fragment.TabsFragment
import org.xbrowser.prosuperfast.dialog.LightningDialogBuilder
import org.xbrowser.prosuperfast.download.DownloadHandler
import org.xbrowser.prosuperfast.download.LightningDownloadListener
import org.xbrowser.prosuperfast.reading.activity.ReadingActivity
import org.xbrowser.prosuperfast.search.SuggestionsAdapter
import org.xbrowser.prosuperfast.settings.activity.SettingsActivity
import org.xbrowser.prosuperfast.settings.activity.ThemableSettingsActivity
import org.xbrowser.prosuperfast.settings.fragment.*
import org.xbrowser.prosuperfast.utils.ProxyUtils
import org.xbrowser.prosuperfast.view.LightningChromeClient
import org.xbrowser.prosuperfast.view.LightningView
import org.xbrowser.prosuperfast.view.LightningWebClient
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(AppModule::class), (AppBindsModule::class)])
interface AppComponent {

    fun inject(activity: BrowserActivity)

    fun inject(fragment: BookmarksFragment)

    fun inject(fragment: BookmarkSettingsFragment)

    fun inject(builder: LightningDialogBuilder)

    fun inject(fragment: TabsFragment)

    fun inject(lightningView: LightningView)

    fun inject(activity: ThemableBrowserActivity)

    fun inject(advancedSettingsFragment: AdvancedSettingsFragment)

    fun inject(app: BrowserApp)

    fun inject(proxyUtils: ProxyUtils)

    fun inject(activity: ReadingActivity)

    fun inject(webClient: LightningWebClient)

    fun inject(activity: SettingsActivity)

    fun inject(activity: ThemableSettingsActivity)

    fun inject(listener: LightningDownloadListener)

    fun inject(fragment: PrivacySettingsFragment)

    fun inject(fragment: DebugSettingsFragment)

    fun inject(suggestionsAdapter: SuggestionsAdapter)

    fun inject(chromeClient: LightningChromeClient)

    fun inject(downloadHandler: DownloadHandler)

    fun inject(searchBoxModel: SearchBoxModel)

    fun inject(generalSettingsFragment: GeneralSettingsFragment)

    fun inject(displaySettingsFragment: DisplaySettingsFragment)

    fun provideAssetsAdBlocker(): AssetsAdBlocker

    fun provideNoOpAdBlocker(): NoOpAdBlocker

}
