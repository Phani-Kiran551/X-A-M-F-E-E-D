package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem5_cse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem5_cse);
    }

    public void pas(View view) {
        WebView w=new WebView(this);
        setContentView(w);
        w.loadUrl("https://drive.google.com/drive/folders/1k1hcJAI2Kl8AJYvv7-ievuXbcQhnbCso?usp=sharing");
    }

    public void os(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/1tbP0s64-XboTFw93_ZRA-5Nkmba01Zwl?usp=sharing");
    }

    public void cn(View view) {
        WebView w2=new WebView(this);
        setContentView(w2);
        w2.loadUrl("https://drive.google.com/drive/folders/1NTKGIFYSnWeB3502h-vZYLCxU3hD5m1X?usp=sharing");
    }

    public void dbms(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/1PvyYhYuu3Kz1RMRYwFS6dGT6yAqa_0VE?usp=sharing");
    }

    public void cd(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/1Y-VI06RL4gKdQYFe0k8lgR3mXcheyb7L?usp=sharing");
    }

    public void cse(View view) {
        WebView w5=new WebView(this);
        setContentView(w5);
        w5.loadUrl("https://drive.google.com/drive/folders/1btWE5kSIsiyFElX2KzjTMU0YmPeVcraD?usp=sharing");
    }

    public void ss5(View view) {
        WebView w6=new WebView(this);
        setContentView(w6);
        w6.loadUrl("https://drive.google.com/drive/folders/1kim228eKBD480tx5vU-m9MwQciIuAYI6?usp=sharing");
    }
}