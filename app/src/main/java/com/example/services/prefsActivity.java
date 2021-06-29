package com.example.services;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class prefsActivity extends PreferenceActivity {

    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        addPreferencesFromResource(R.xml.prefs);
    }
}
