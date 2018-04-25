package com.example.resource.sharedprefs;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesHelper {

    private static final String PREF_FILE = "qualquer_coisa";

    public static void setSharedPrefs(Context context, String key, Integer value) {
        SharedPreferences settings = context.getSharedPreferences(PREF_FILE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public static Integer getSharedPrefs(Context context, String key) {
        SharedPreferences settings = context.getSharedPreferences(PREF_FILE, Context.MODE_PRIVATE);
        return settings.getInt(key, 0);
    }
}
