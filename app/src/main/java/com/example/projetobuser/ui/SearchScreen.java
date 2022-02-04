package com.example.projetobuser.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.projetobuser.R;

import java.util.Objects;

public class SearchScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_screen2);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }
}