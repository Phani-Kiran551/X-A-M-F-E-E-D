package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem3_cse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem3_cse);
    }

    public void la(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/1xTzMFw17ZYq21ly32rv0RjQZ1yBDiL8Z?usp=sharing");
    }

    public void cm(View view) {
        WebView w2=new WebView(this);
        setContentView(w2);
        w2.loadUrl("https://drive.google.com/drive/folders/1BdirNwIXGNWiOiTeVF-3WKa1dyyUKPwh?usp=sharing");
    }

    public void es(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/1xvlIk_mpa8zTVDJIL7a4LZ228Cbc5Oo5?usp=sharing");
    }

    public void daaoa(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/11H142hJ2vffZHGyYOPWgprsouCHiVZZo?usp=sharing");
    }

    public void de(View view) {
        WebView w5=new WebView(this);
        setContentView(w5);
        w5.loadUrl("https://drive.google.com/drive/folders/1S_BapwG5AudIJ5Z4G2NwN0oCAZTd6jLb?usp=sharing");
    }

    public void ss3(View view) {
        WebView w6=new WebView(this);
        setContentView(w6);
        w6.loadUrl("https://drive.google.com/drive/folders/1sYHu7OzYI6zgZWPvE1g4uJANsjOXctlm?usp=sharing");
    }

    public void pi(View view) {
        WebView w7=new WebView(this);
        setContentView(w7);
        w7.loadUrl("https://drive.google.com/drive/folders/1oJYlS3A0F0eFj-ZqZXyEYuETZPHloVi3?usp=sharing");
    }
}