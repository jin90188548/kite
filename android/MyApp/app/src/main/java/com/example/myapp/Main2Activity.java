package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView wv = findViewById(R.id.webview);

        WebSettings webSettings = wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportZoom(true);

        wv.setWebViewClient(new WebViewClient());

        wv.loadUrl("file:///android_asset/br.html");
        //wv.loadUrl("http://192.168.0.64:5000/sw_r");
    }
}
