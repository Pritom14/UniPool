package garbagecollectors.com.unipool.activities.SettingsActivity;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

import garbagecollectors.com.unipool.R;

public class SettingsFragment extends PreferenceFragmentCompat
{
	@Override
	public void onCreatePreferences(Bundle bundle, String s)
	{
		// Load the Preferences from the XML file
		addPreferencesFromResource(R.xml.app_preferences);
	}

}