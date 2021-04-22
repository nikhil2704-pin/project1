package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;

public class dashboard extends AppCompatActivity {

    TextView txtPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        txtPhoneNumber = findViewById(R.id.txtPhoneNumber);

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences( getApplicationContext());
        String strPhoneNumber = prefs.getString("phonenumber", "");
        txtPhoneNumber.setText(strPhoneNumber);
    }
}