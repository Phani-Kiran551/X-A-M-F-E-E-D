package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem3_civil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem3_civil);
    }

    public void itt(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/18n9vvTNhAJyJY5MFIcNYpweig4k8-3ra?usp=sharing");
    }

    public void la(View view) {
        WebView w2=new WebView(this);
        setContentView(w2);
        w2.loadUrl("https://drive.google.com/drive/folders/1zjPDWSlkylaKVOcTE_cKyMMhd-1cMDsA?usp=sharing");
    }

    public void ittl(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/1LfJdXBfN6ONUNvtW2AghvhxFwo8NeA5E?usp=sharing");
    }

    public void em(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/1CGHOZwCNb_nuLezaQwnMrfranJOpSv8L?usp=sharing");
    }

    public void ee(View view) {
        WebView w5=new WebView(this);
        setContentView(w5);
        w5.loadUrl("https://drive.google.com/drive/folders/1-qBz4UMpgp5YpjCTtTEPqn-9hG6Vqo_z?usp=sharing");
    }

    public void he(View view) {
        WebView w6=new WebView(this);
        setContentView(w6);
        w6.loadUrl("https://drive.google.com/drive/folders/1f1ERRIB8bbiJOTHTbeOZuocVO2DA1M8-?usp=sharing");
    }

    public void ef(View view) {
        WebView w7=new WebView(this);
        setContentView(w7);
        w7.loadUrl("https://drive.google.com/drive/folders/1_A7lDKWuBqvJnBaP3Xn-c-G3SqOHaqG5?usp=sharing");
    }

    public void met(View view) {
        WebView w8=new WebView(this);
        setContentView(w8);
        w8.loadUrl("https://drive.google.com/drive/folders/11YM7JdZ51UJaG0SLRv4jIt0mvc_UMpEA?usp=sharing");
    }

    public void c(View view) {
        WebView w9=new WebView(this);
        setContentView(w9);
        w9.loadUrl("https://drive.google.com/drive/folders/1cL0kpnwW-jgxhM8XUgPpzZar0ajeM1Gr?usp=sharing");
    }
}