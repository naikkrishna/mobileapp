package com.example.carrental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        final Intent intent =getIntent();
        TextView myText= findViewById(R.id.TextMsg);
        //  TextView myText1= findViewById(R.id.textpwd);

        //String display =_intent.getStringExtra("id");
        //String display1 =_intent.getStringExtra("name");

        //myText.setText(display);
//        myText1.setText("password: " +display1);
    }
}
