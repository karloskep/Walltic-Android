package com.example.karlos.google;

import android.annotation.TargetApi;
import android.app.WallpaperManager;
import android.content.Context;
import android.os.Build;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.io.IOException;

public class Motos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motos);

        WebView wv = (WebView) findViewById(R.id.webMotos);


        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled(true);
        ws.setSupportZoom(false);

        wv.loadUrl("https://www.google.com.br/search?q=carros&rlz=1C1JZAP_pt-BRBR690BR690&source=lnms&tbm=isch&sa=X&ved=0ahUKEwjM4-aFz6bPAhVGhJAKHZrhBh0Q_AUICCgB&biw=1366&bih=653#tbm=isch&q=motos&imgrc=1pwnGgzRVAioXM%3A");

        findViewById(R.id.aplicarMotos).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                WallpaperManager wall = WallpaperManager.getInstance(getApplicationContext());
                try {
                    wall.setResource(R.drawable.motospp);
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
