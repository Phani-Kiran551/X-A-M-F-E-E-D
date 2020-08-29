package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem5_ece extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem5_ece);
    }

    public void ac(View view) {
        WebView w=new WebView(this);
        setContentView(w);
        w.loadUrl("https://drive.google.com/drive/folders/1OvWdd6Dn79uJz3EjsXMyGrg8GwsvJw5O?usp=sharing");
    }

    public void licaa(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/18cIXTVxi4wT_xr-AZQoha75K6r7zxdNL?usp=sharing");
    }

    public void tlaw(View view) {
        WebView w2=new WebView(this);
        setContentView(w2);
        w2.loadUrl("https://drive.google.com/drive/folders/1_EQIIj0x7VrPJ7GlVt1qP8fxnNLn9ray?usp=sharing");
    }

    public void te(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/15s3ZECgUWOaate5XIRUzTiJlwnz6bL41?usp=sharing");
    }

    public void oe(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/1OuYpxxp0w0IMft6fCT5Q-JpuP_k5XRBT?usp=sharing");
    }

    public void ss5(View view) {
        WebView w5=new WebView(this);
        setContentView(w5);
        w5.loadUrl("https://drive.google.com/drive/folders/1LrkZP9hUzY8zVlvnWpYCekTq7h3KND4X?usp=sharing");
    }
}