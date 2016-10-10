package com.example.karlos.google;

import android.app.WallpaperManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

import java.io.IOException;

public class Ceu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ceu);

        WebView wv = (WebView) findViewById(R.id.webCeu);

        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled(true);
        ws.setSupportZoom(false);

        wv.loadUrl("https://www.google.com.br/search?q=carros&rlz=1C1JZAP_pt-BRBR690BR690&source=lnms&tbm=isch&sa=X&ved=0ahUKEwjM4-aFz6bPAhVGhJAKHZrhBh0Q_AUICCgB&biw=1366&bih=653#tbm=isch&q=c%C3%A9u&imgrc=EhR-juQ1PUa06M%3A");

        findViewById(R.id.aplicarCeu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                WallpaperManager wall = WallpaperManager.getInstance(getApplicationContext());
                try {
                    wall.setResource(R.drawable.ceupp);
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
