/*
 * Copyright 2014 A.C.R. Development
 */
package org.xbrowser.prosuperfast.settings.fragment

import org.xbrowser.prosuperfast.BuildConfig
import org.xbrowser.prosuperfast.R
import android.os.Bundle

class AboutSettingsFragment : AbstractSettingsFragment() {

    override fun providePreferencesXmlResource() = R.xml.preference_about

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        clickablePreference(
            preference = SETTINGS_VERSION,
            summary = BuildConfig.VERSION_NAME,
            onClick = { }
        )
    }

    companion object {
        private const val SETTINGS_VERSION = "pref_version"
    }
}
