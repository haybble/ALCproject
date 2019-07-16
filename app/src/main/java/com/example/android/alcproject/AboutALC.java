package com.example.android.alcproject;

import android.app.Activity;
import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.net.URL;

public class AboutALC extends AppCompatActivity {

    public static final String URL = "https://andela.com/alc/";
    private WebView mLoadWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_about_alc);

        mLoadWeb = findViewById( R.id.web_view );

        mLoadWeb.setWebViewClient( new WebViewClient() {
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        } );

        mLoadWeb.loadUrl( URL );

    }
}
