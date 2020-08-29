package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem1_cse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem1_cse);
    }

    public void bcsp(View view) {

        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/1cKgpSw2T2ND45I7NNR_LCCQkmcFYZFBM?usp=sharing");

    }

    public void poe(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/1xg_HYrEOAbO6ip6uDGlpevsC-P6SxgiH?usp=sharing");
    }

    public void ce(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/1qzO9FAeflFJ1jaIMEg7WLE2QboSYa9KZ?usp=sharing");
    }

    public void m(View view) {
        WebView w5=new WebView(this);
        setContentView(w5);
        w5.loadUrl("https://drive.google.com/drive/folders/1AthoZMVA1CZpB_-BAR5MCxNE0hd1D1gB?usp=sharing");
    }

    public void poc(View view) {
        WebView w6=new WebView(this);
        setContentView(w6);
        w6.loadUrl("https://drive.google.com/drive/folders/1CkQcxH8uuXr8mgHtPKMhw0fTVuuy15Ye?usp=sharing");
    }

    public void ss(View view) {
        WebView w7=new WebView(this);
        setContentView(w7);
        w7.loadUrl("https://drive.google.com/drive/folders/17bqi7yIXbgK462EuLAaQptzBxoqki1a2?usp=sharing");
    }

    public void e(View view) {
        WebView w8=new WebView(this);
        setContentView(w8);
        w8.loadUrl("https://drive.google.com/drive/folders/1ohNpgs8sT1w9ADPDyfA_yVkhP0EUDZYA?usp=sharing");
    }
}