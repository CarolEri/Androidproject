package com.example.projetobuser;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class LoginForm extends AppCompatActivity {

    private TextView text_RegisterForm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);

        Objects.requireNonNull(getSupportActionBar()).hide();
        StartComponents();

        text_RegisterForm.setOnClickListener(v -> {
            Intent intent = new Intent(LoginForm.this, RegisterForm.class);
            startActivity(intent);
        });
    }

    private void StartComponents(){
        text_RegisterForm = findViewById(R.id.cadastre_se);
    }
}