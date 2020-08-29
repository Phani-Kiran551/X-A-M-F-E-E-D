package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem6_mechanical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem6_mechanical);
    }

    public void me(View view) {
        WebView w=new WebView(this);
        setContentView(w);
        w.loadUrl("https://drive.google.com/drive/folders/1AhKNHsOGg-98ZHWd91tdT-M3n7gk67aF?usp=sharing");
    }

    public void hamt(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/1I5S3lEpgSKsJnWIyZK75qeo9aQtpC3Bi?usp=sharing");
    }

    public void me1(View view) {
        WebView w2=new WebView(this);
        setContentView(w2);
        w2.loadUrl("https://drive.google.com/drive/folders/1lbErFU3ZvGHYK1qe45DycDWyqd1K9xiW?usp=sharing");
    }

    public void fm(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/19hbMXRi5lt5B3YVETxxTX0O6f6lKaYRu?usp=sharing");
    }

    public void me3(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/1zLatcgVohikZ2QwSar05q1Eba0trjZOy?usp=sharing");
    }

    public void oe(View view) {
        WebView w5=new WebView(this);
        setContentView(w5);
        w5.loadUrl("https://drive.google.com/drive/folders/111WQbrsmosNcxFuQ5kpUpWJicFIwsJSs?usp=sharing");
    }
}