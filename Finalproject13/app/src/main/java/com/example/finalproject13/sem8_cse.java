package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem8_cse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem8_cse);
    }

    public void cs(View view) {
        WebView w=new WebView(this);
        setContentView(w);
        w.loadUrl("https://drive.google.com/drive/folders/16kooJg54KgpI__4AsAB95Ygunew4pWqU?usp=sharing");
    }

    public void oe(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/1aebgwtLkzCC-tbLtuGZZxeLlW1_PwFYP?usp=sharing");
    }
}