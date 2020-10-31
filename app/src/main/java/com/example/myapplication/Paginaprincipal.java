package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Paginaprincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paginaprincipal);
    }



    public void registrar (View view){
        Intent registrar = new Intent(this, Registrarse.class);
        startActivity(registrar);

    }

    public void entrar (View view){
        Intent entrar = new Intent(this, Mis_resenhas.class);
        startActivity(entrar);

    }
}