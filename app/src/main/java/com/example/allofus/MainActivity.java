package com.example.allofus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button gotologin = (Button) findViewById(R.id.gotologin);
//        gotologin.setOnClickListener(v -> openLoginActivity());
        Button unreg = (Button) findViewById(R.id.unreg);
        unreg.setOnClickListener(v -> openActivity());
    }
    public void openActivity(){
        Intent intent_env = new Intent(this , Environment2.class);
        startActivity(intent_env);
    }
    public void openLoginActivity(){
        Intent intent_login = new Intent(this , LoginActivity.class);
        startActivity(intent_login);
    }
}