package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wv=(WebView)findViewById(R.id.webview1);
         wv.setWebViewClient(new WebViewClient());
         wv.loadUrl("https://www.google.com/");
        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed(){
        if(wv.canGoBack()){
            wv.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}