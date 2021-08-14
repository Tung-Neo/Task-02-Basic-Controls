package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void login(View v){
        EditText un = findViewById(R.id.un);
        EditText pw = findViewById(R.id.pw);
        Log.i("info", "Login Starting");
        Log.i("Username", un.getText().toString());
        Log.i("Password", pw.getText().toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}