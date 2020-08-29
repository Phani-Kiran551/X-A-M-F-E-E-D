package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem7_cse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem7_cse);
    }

    public void cse3(View view) {
        WebView w=new WebView(this);
        setContentView(w);
        w.loadUrl("https://drive.google.com/drive/folders/1fextyTEYtQVqh_t1CaoIfHh_aM44hXlm?usp=sharing");
    }

    public void cte2(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/1ttJ4gwbYM4cV6b4iUFpuSBTvnd7YVbTR?usp=sharing");
    }

    public void oe3(View view) {
        WebView w2=new WebView(this);
        setContentView(w2);
        w2.loadUrl("https://drive.google.com/drive/folders/1X83oGUn_GY8izDB0EnAwxKxEf6r3uwqU?usp=sharing");
    }

    public void oe4(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/1oAOg7I0Sg5YFbPU2oRfdYVkAk1e9PUR6?usp=sharing");
    }

    public void cpp(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/1FKIzlM51MTcuphnmX81jvFUeo7Olda9a?usp=sharing");
    }
}