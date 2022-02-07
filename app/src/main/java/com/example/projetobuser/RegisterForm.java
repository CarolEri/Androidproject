package com.example.projetobuser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Objects;

public class RegisterForm extends AppCompatActivity {

    private androidx.appcompat.widget.AppCompatButton voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_form);

        Objects.requireNonNull(getSupportActionBar()).hide();
        StartComponents();

        voltar.setOnClickListener(v -> {
            Intent intent = new Intent(RegisterForm.this, LoginForm.class);
            startActivity(intent);
        });
    }

    private void StartComponents(){
        voltar = findViewById(R.id.botao_voltar);
    }
}