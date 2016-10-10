package com.example.karlos.google;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Catergoria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catergoria);
        WebView wv = (WebView) findViewById(R.id.webCategoria);
        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled(true);
        ws.setSupportZoom(false);

        wv.loadUrl("https://www.google.com.br/search?q=carros&rlz=1C1JZAP_pt-BRBR690BR690&source=lnms&tbm=isch&sa=X&ved=0ahUKEwjM4-aFz6bPAhVGhJAKHZrhBh0Q_AUICCgB&biw=1366&bih=653#tbm=isch&q=categoria&imgrc=FWi2KVzDt_tJeM%3A");





    }
}
