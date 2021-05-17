package com.example.allofus;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;

public class AnimalCare extends AppCompatActivity {
    private WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_care);
        web = findViewById(R.id.wv_animalcare);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("https://www.goeco.org/projects_search?platform=&categories%5B%5D=6&categories%5B%5D=21");
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