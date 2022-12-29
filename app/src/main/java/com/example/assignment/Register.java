package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void btnsbmit(View view) {
        Intent intent = new Intent(this,welcome.class);
        startActivity(intent);
    }

    public void next(View view) {
        Intent intent = new Intent(this,forget.class);
        startActivity(intent);
    }
}