package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem6_ece extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem6_ece);
    }

    public void mtaa(View view) {
        WebView w=new WebView(this);
        setContentView(w);
        w.loadUrl("https://drive.google.com/drive/folders/1xmr6PpL_exLJkqEhD3K7fh5RrcDQqinH?usp=sharing");
    }

    public void vd(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/1VJArVuHPVbPxkDkLL-wixKc-XDyHBozl?usp=sharing");
    }

    public void dc(View view) {
        WebView w2=new WebView(this);
        setContentView(w2);
        w2.loadUrl("https://drive.google.com/drive/folders/1XioqpDxIRi6Uvz4aX2pJhiS7dWnHjcFd?usp=sharing");
    }

    public void mdp(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/1feiFkydvZHNLOm4qYk6Pb8WKphYQ6cfc?usp=sharing");
    }

    public void oe(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/1BmUi8RCoIPLtJSLc40qFu_S4VrrdmEye?usp=sharing");
    }

    public void te(View view) {
        WebView w5=new WebView(this);
        setContentView(w5);
        w5.loadUrl("https://drive.google.com/drive/folders/1ZAUs-exsVftqWuQVnzcGJulIt1gHhILZ?usp=sharing");
    }
}