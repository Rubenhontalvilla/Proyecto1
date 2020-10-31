package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Mis_resenhas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_resenhas);
    }

    public void masresenhas(View view){
        Intent masresenhas = new Intent(this, Hacer_resenhas.class);
        startActivity(masresenhas);
    }
}