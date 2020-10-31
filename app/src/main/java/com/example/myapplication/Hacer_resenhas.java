package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class Hacer_resenhas extends AppCompatActivity {

    private EditText etnombre,etresenha;
    private Button btnenviar;
    private RadioButton btnjuego,btnaplicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hacer_resenhas);

        btnjuego = (RadioButton)findViewById(R.id.rbtnjuego);
        btnaplicacion = (RadioButton)findViewById(R.id.rbtnaplicacion);
        etnombre = (EditText)findViewById(R.id.etnombre);
        etresenha = (EditText)findViewById(R.id.etresenha);
        btnenviar = (Button)findViewById(R.id.btnenviar);

    }

    public void enviar (View view){
        Intent enviar = new Intent(this, Mis_resenhas.class);
        startActivity(enviar);
    }


}