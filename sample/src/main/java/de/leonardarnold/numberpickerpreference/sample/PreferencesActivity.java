package de.leonardarnold.numberpickerpreference.sample;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;

/**
 * Created by Leonard Arnold on 17.06.15.
 */
public class PreferencesActivity extends PreferenceActivity {
    private static final String TAG = PreferencesActivity.class.getSimpleName();

    PrefsFragment prefsFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prefsFragment = new PrefsFragment();
        getFragmentManager().beginTransaction().replace(android.R.id.content, prefsFragment).commit();
    }

    /**
     * This fragment shows the preferences for the first header.
     */
    public static class PrefsFragment extends PreferenceFragment {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            // Load the preferences from an XML resource
            addPreferencesFromResource(R.xml.preferences);
        }
    }

}