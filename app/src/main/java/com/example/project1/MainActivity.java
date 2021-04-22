package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.project1.common_func;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_SCREEN_TIME_OUT=2000;
    common_func cf = new common_func();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getApplicationContext(), "IS USER LOGGED IN : " + cf.isUserLoggedIn(getApplicationContext()), Toast.LENGTH_LONG);
                if(cf.isUserLoggedIn(getApplicationContext()) == false) {
                    Intent i = new Intent(getApplicationContext(), login.class);
                    startActivity(i);
                    finish();
                }
                else{
                    Intent i = new Intent(getApplicationContext(), dashboard.class);
                    startActivity(i);
                    finish();
                }
            }
        }, SPLASH_SCREEN_TIME_OUT);
    }
}