package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem4_cse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem4_cse);
    }

    public void dm(View view) {
        WebView w=new WebView(this);
        setContentView(w);
        w.loadUrl("https://drive.google.com/drive/folders/1NUlKIa4qVV2Ic30Rt5cYSRBm4-sMW3TB?usp=sharing");
    }

    public void wt(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/1f5-HdMqw61u_Akct0W-ERIOAvSVWSRfE?usp=sharing");
    }

    public void flat(View view) {
        WebView w2=new WebView(this);
        setContentView(w2);
        w2.loadUrl("https://drive.google.com/drive/folders/1DzKVNSpt39ZyRUuxo0ys5TcmwBwNWY-R?usp=sharing");
    }

    public void coa(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/1d8WwveWaJvF-vePcgWQE6Bw24B-ksFH4?usp=sharing");
    }

    public void oop(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/1T_CauAV3EBs1s-qTtMwIUrJHMwJ0aS7W?usp=sharing");
    }

    public void ss4(View view) {
        WebView w5=new WebView(this);
        setContentView(w5);
        w5.loadUrl("https://drive.google.com/drive/folders/1sqqSZ1-DgBJfb4xTP32ivkkFoE5eWKxM?usp=sharing");
    }

    public void iscp(View view) {
        WebView w6=new WebView(this);
        setContentView(w6);
        w6.loadUrl("https://drive.google.com/drive/folders/1KlHgwNVSuKrKf0NztM7EXCXGl5wz0VWG?usp=sharing");
    }
}