package com.example.karlos.google;

import android.app.WallpaperManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

import java.io.IOException;

import static com.example.karlos.google.R.id.webCarros;

public class Carros extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carros);

        WebView wv = (WebView) findViewById(webCarros);


        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled(true);
        ws.setSupportZoom(false);

        wv.loadUrl("https://www.google.com.br/search?q=carros&source=lnms&tbm=isch&sa=X&ved=0ahUKEwjsn-ajvcnPAhXFXD4KHROMDOoQ_AUICCgB&biw=1920&bih=990#imgrc=44BYmWLLnvRGJM%3A");

        findViewById(R.id.aplicarCarros).setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                WallpaperManager wall = WallpaperManager.getInstance(getApplicationContext());
                try {

                    wall.setResource(R.drawable.carrospp);

                } catch (IOException e) {
                    e.printStackTrace();
                }


                Context contexto = getApplicationContext();
                String texto = "Aplicado";
                int duracao = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(contexto, texto,duracao);
                toast.show();

            }});


        }

}