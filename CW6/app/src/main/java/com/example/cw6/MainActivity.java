package com.example.cw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Movie joker = new Movie("Joker","Joaquin Phoenix",8.5,13,"Drama/Crime");
        Movie Tonya = new Movie("I,Tonya","Margot Robbie",7.5,16,"Comedy/Sport");
    }
}