package com.example.allofus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;


public class Trees_For_Cities extends AppCompatActivity {
    private WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree_for_cities);
        web = findViewById(R.id.wv_trees);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("https://www.treesforcities.org/about-us");
        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);

        Button back = findViewById(R.id.back2);
        back.setOnClickListener(v -> {
            Intent intent = new Intent(this.getApplication(), Environment2.class);
            startActivity(intent);
        });

    }

    @Override
    public void onBackPressed() {
        if(web.canGoBack()){
            web.goBack();
        }
        else {
            super.onBackPressed();
        }

    }
}