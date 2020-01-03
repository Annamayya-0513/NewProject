package com.example.newproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Google extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);

/// Initalize Webview
        webView = (WebView) findViewById(R.id.WebViewId);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.co.in");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }


public void onBackPressed(){

    if (webView.canGoBack()) {
        webView.goBack();
    } else {
        super.onBackPressed();
    }
    }
}
