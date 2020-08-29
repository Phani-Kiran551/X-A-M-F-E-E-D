package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem4_civil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem4_civil);
    }

    public void cdc(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/1e7OYQCI4aQmFer80SHY0MJNC1FvDpLNs?usp=sharing");
    }

    public void oe(View view) {
        WebView w2=new WebView(this);
        setContentView(w2);
        w2.loadUrl("https://drive.google.com/drive/folders/19RKR5wTO6v6G0iAGZAgNiHiH9Rb1VsuC?usp=sharing");
    }

    public void eg(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/10RhR2Nfp8XChMnA28kw6xJc05Na_04aq?usp=sharing");
    }

    public void egl(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/1LYSFqIWjUfNxKGNsin_yAgyqi7GAiAVi?usp=sharing");
    }

    public void ge(View view) {
        WebView w5=new WebView(this);
        setContentView(w5);
        w5.loadUrl("https://drive.google.com/drive/folders/1n1bSeDN2rjAZiQAQSDcVGI3ld-jsjv9s?usp=sharing");
    }

    public void gel(View view) {
        WebView w6=new WebView(this);
        setContentView(w6);
        w6.loadUrl("https://drive.google.com/drive/folders/1NpgGd5_kyyGVkdPQpu6uKG0rnQ7PcOVe?usp=sharing");
    }

    public void tee(View view) {
        WebView w7=new WebView(this);
        setContentView(w7);
        w7.loadUrl("https://drive.google.com/drive/folders/1kTs_Zdhe2J7Mfrnqgr1OrGgUk40V6k-9?usp=sharing");
    }


}