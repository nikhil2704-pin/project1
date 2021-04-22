package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.project1.common_func;

public class login extends AppCompatActivity {
    Button button;
    EditText phnum;
    common_func cf = new common_func();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button = findViewById(R.id.button);
        phnum = findViewById(R.id.phonenumber1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phonenumber = phnum.getText().toString();

                String correctphonenumber = "123456789";
                if(phonenumber.equalsIgnoreCase(correctphonenumber)) {
                    Toast.makeText(getApplicationContext(),"YOU ARE LOGGED IN",Toast.LENGTH_SHORT).show();
                    cf.setUserSession(getApplicationContext(), phonenumber);
                    Intent intent = new Intent(getApplicationContext(), checkotp.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "LOGIN UNSUCCESFULL", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}