package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Paginaprincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paginaprincipal);

    }




    //Action Bar

    public boolean onOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.atras){
            Intent intent =new Intent(this, Paginaprincipal.class);
            startActivity(intent);
            finish();
        }

        return true;
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