package android.example.com.visualizerpreferences;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

/**
 * Created by aaroncrutchfield on 8/15/17.
 */

public class SettingsFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        //generates a preference screen from the file passed in
        addPreferencesFromResource(R.xml.pref_visualizer);
    }
}
