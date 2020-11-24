package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Registrarse extends AppCompatActivity {


     EditText etnombre;
     EditText etApellido;
     Spinner opciones;
     EditText NombreUsuario;
     TextView contrasenha;
     TextView repetircontrasenha;
     Button registrar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);

        etnombre = (EditText)findViewById(R.id.etnombre);
        etApellido = (EditText)findViewById(R.id.etApellido);
        opciones= (Spinner)findViewById(R.id.spinner);
        NombreUsuario = (EditText)findViewById(R.id.etNombreusuario);
        contrasenha = (EditText)findViewById(R.id.tvContrasenha2);
        repetircontrasenha = (EditText)findViewById(R.id.tvContrasenha2);
        registrar = (Button)findViewById(R.id.entrar);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResources(this, R.array.opciones, android.R.layout.simple_spinner_item);
        opciones.setAdapter(adapter);








    }

    public void entrar2 (View view){
        Intent entrar2 = new Intent(this, Mis_resenhas.class);
        startActivity(entrar2);
    }


}