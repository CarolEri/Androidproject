package com.example.projetobuser;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.projetobuser.ui.SearchScreen;

import java.util.Objects;

public class LoginForm extends AppCompatActivity {

    private TextView text_RegisterForm;
    private androidx.appcompat.widget.AppCompatButton login_botao;

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

        login_botao.setOnClickListener(v -> {
            checkIfEmpty();
        });
    }

    private void StartComponents(){
        text_RegisterForm = findViewById(R.id.cadastre_se);
        login_botao = findViewById(R.id.botao_entrar);
    }

    private void checkIfEmpty(){
        EditText campoEmail = findViewById(R.id.edit_email);
        EditText campoSenha = findViewById(R.id.edit_senha);

        String email = campoEmail.getText().toString();
        String senha = campoSenha.getText().toString();

        if (email.matches("") || senha.matches("")){
            //INSTANCIAR ALERT DIALOG
            AlertDialog.Builder dialog = new AlertDialog.Builder(this);

            //CONFIGURAR MENSAGEM
            dialog.setMessage("Preencha os campos para efetuar o login.");

            //CONFIGURAR SIM E NAO
            dialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                }
            });

            //CRIAR E EXIBIR A DIALOG
            dialog.create();
            dialog.show();
        }
        else{
            Intent intent = new Intent(LoginForm.this, SearchScreen.class);
            startActivity(intent);
        }
    }

}