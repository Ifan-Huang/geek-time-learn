package com.codeforc.configuration;


import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

public class PreferencesDemo {


    public static void main(String[] args) throws BackingStoreException {
        Preferences userPreferences = Preferences.userRoot();
        userPreferences.put("my-key", "hello,world!!!");
        userPreferences.flush();

        System.out.println(userPreferences.get("myz-key", null));
    }
}
