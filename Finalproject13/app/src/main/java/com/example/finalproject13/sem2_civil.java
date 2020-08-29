package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem2_civil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem2_civil);
    }

    public void dsaauc(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/1lmiQXEbtE_oVBeHQzTq4eGXYV5mQk_-l?usp=sharing");
    }

    public void ss2(View view) {
        WebView w2=new WebView(this);
        setContentView(w2);
        w2.loadUrl("https://drive.google.com/drive/folders/1iPZmz1wHKheHG_H6PXBVABtTRgrR7T6U?usp=sharing");
    }

    public void poe(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/1dfFMCz6vLXjAokIMaZgrZ71xfwbLSRhb?usp=sharing    ");
    }

    public void poc(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/16sjpY4-zAmBUMH4V7exwb0E8-6B8e9QX?usp=sharing");
    }

    public void mvc(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/135hxGT1GXlGhM7I46tg_opH6a6k5dLA8?usp=sharing");
    }

    public void eg(View view) {
        WebView w5=new WebView(this);
        setContentView(w5);
        w5.loadUrl("https://drive.google.com/drive/folders/1wiFn6iVNpjMA75KjA001iP50Li9SccM9?usp=sharing");
    }

    public void eam(View view) {
        WebView w6=new WebView(this);
        setContentView(w6);
        w6.loadUrl("https://drive.google.com/drive/folders/1jECs9bIXyN1GyEONsu6mm2KmJgTEvw71?usp=sharing");
    }
}