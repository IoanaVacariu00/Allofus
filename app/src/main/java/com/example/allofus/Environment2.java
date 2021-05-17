package com.example.allofus;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
//import android.view.View;
//import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
//import android.widget.Toolbar;
import androidx.appcompat.widget.Toolbar;

public class Environment2 extends AppCompatActivity {
    Toolbar mToolbar;
    ListView mListView;

    String[] titles =
            {"Tree Planting", "Environment CleanUp","Wildlife & Animal Care","Petitions", "Humanitarian Projects"};
    int[] img = {
            R.drawable.tree_ic,
            R.drawable.cleanup_ic,
            R.drawable.animal_care_ic,
            R.drawable.petition_ic,
            R.drawable.people2

    };

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_environment2);

        mToolbar = (Toolbar) findViewById(R.id.toolbar2);
        mToolbar.setTitle(getResources().getString(R.string.app_name));
        Button back = findViewById(R.id.back1);
        back.setOnClickListener(v -> {
            Intent intent = new Intent(Environment2.this, MainActivity.class);
            startActivity(intent);
        });

        mListView = (ListView) findViewById(R.id.listviewenv2);
        MyAdapter myAdapter = new MyAdapter(Environment2.this,titles,img );
        mListView.setAdapter(myAdapter);

        mListView.setOnItemClickListener((parent, view, i, id) -> {

            if(i==0)
            {
                Intent mIntent = new Intent(Environment2.this, Trees_For_Cities.class);

                startActivity(mIntent);
            }
            else if(i==1){
                Intent mIntent = new Intent(Environment2.this, Cleanup.class);

                startActivity(mIntent);
            }

            else if(i==2){
                Intent mIntent = new Intent(Environment2.this, AnimalCare.class);

                startActivity(mIntent);
            }

            else if(i==3){
                Intent mIntent = new Intent(Environment2.this, Petitions_Env.class);

                startActivity(mIntent);
            }
            else if(i==4){
                Intent mIntent = new Intent(Environment2.this, People.class);

                startActivity(mIntent);
            }


        });
    }
}