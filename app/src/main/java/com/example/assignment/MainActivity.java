package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnsignup(View view) {
        Intent intent = new Intent(this,Register.class);
        startActivity(intent);

    }

    public void btlogin(View view) {
        Intent intent = new Intent(this,welcome.class);
        startActivity(intent);
    }
}