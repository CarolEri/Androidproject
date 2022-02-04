package com.example.projetobuser.ui;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.projetobuser.R;

import java.util.Objects;

public class SearchScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_screen2);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }

    public void openDialog(View view){

        //INSTANCIAR ALERT DIALOG
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        //CONFIGURAR TÍTULO MENSAGEM
        dialog.setTitle("Notificações");
        dialog.setMessage("Você não possui notificações no momento.");

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
}