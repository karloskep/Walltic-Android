package com.example.karlos.google;

import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.carros).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Carros.class);

                startActivity(i);
            }
        });

        findViewById(R.id.motos).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Motos.class);

                startActivity(i);
            }
        });

        findViewById(R.id.agua).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Agua.class);

                startActivity(i);
            }
        });

        findViewById(R.id.flores).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Flores.class);

                startActivity(i);
            }
        });

        findViewById(R.id.ceu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Ceu.class);

                startActivity(i);
            }
        });

        findViewById(R.id.natureza).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Natureza.class);

                startActivity(i);

           }
        });


        findViewById(R.id.remover).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                WallpaperManager wall = WallpaperManager.getInstance(getApplicationContext());
                try {
                    wall.clear();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Context contexto = getApplicationContext();
                String texto = "Wallpaper Removido";
                int duracao = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(contexto, texto,duracao);
                toast.show();

            }
        });


        findViewById(R.id.sair).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
               finish();

            }
        });






        /*findViewById(R.id.agua).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = Intent(MainActivity.this, Agua.class);

                startActivity(i);
            }
        }
*/

        }};