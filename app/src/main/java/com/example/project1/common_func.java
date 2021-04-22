package com.example.project1;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class common_func {

    public boolean isUserLoggedIn(Context context){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences( context);
        return prefs.getBoolean("Islogin", false); // get value of last login status
    }

    public void setUserSession(Context context, String phonenumber){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        prefs.edit().putBoolean("Islogin", true).commit();
        prefs.edit().putString("phonenumber", phonenumber).commit();
    }
}
