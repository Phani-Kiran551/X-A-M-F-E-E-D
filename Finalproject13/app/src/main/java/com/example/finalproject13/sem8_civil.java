package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem8_civil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem8_civil);
    }

    public void cp(View view) {
        WebView w=new WebView(this);
        setContentView(w);
        w.loadUrl("https://drive.google.com/drive/folders/14RyWvO7Nb3HD1HmpqdeGk2P0mcOm2NJ-?usp=sharing");
    }
}