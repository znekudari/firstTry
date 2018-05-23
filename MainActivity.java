package com.example.asus.zneku.myapplicationtest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.SharedPreferencesCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText english;
    private EditText farsi;
     SharedPreferences share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        share=getSharedPreferences("com.example.asus.zneku.myapplicationtest",MODE_PRIVATE);
    }
    public void ondo (View v){
        english=(EditText) findViewById(R.id.en);
        farsi=(EditText) findViewById(R.id.fa);
        String e=english.getText().toString();
        String f=farsi.getText().toString();
        SharedPreferences.Editor edit =share.edit();
        edit.putString("en",e);
        edit.putString("fa",f);
      edit.commit();
       Intent list=new Intent(this,List.class);
        startActivity(list);

    }
}
