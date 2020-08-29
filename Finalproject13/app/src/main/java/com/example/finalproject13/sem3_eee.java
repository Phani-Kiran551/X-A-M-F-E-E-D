package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem3_eee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem3_eee);
    }

    public void eaem(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/1qLSbHHh3n1nzOnCKLHSeE2KFysRsN-P_?usp=sharing");
    }

    public void de(View view) {
        WebView w2=new WebView(this);
        setContentView(w2);
        w2.loadUrl("https://drive.google.com/drive/folders/1NikkShsESj9ce6LEFhaRt00-oS2TkdjQ?usp=sharing");
    }

    public void eca(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/1vuc5eQJwr-oDTf6QFYL6aBFDSg6zcBCL?usp=sharing");
    }

    public void oe1(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/1yygK08izERKHm_AfIPXpOOz0aVSlbZIZ?usp=sharing");
    }

    public void oe2(View view) {
        WebView w5=new WebView(this);
        setContentView(w5);
        w5.loadUrl("https://drive.google.com/drive/folders/1JXLwSjNzT2kArbz7eRCNgvWTdawhIilt?usp=sharing");
    }

    public void fome(View view) {
        WebView w6=new WebView(this);
        setContentView(w6);
        w6.loadUrl("https://drive.google.com/drive/folders/1ygim6rv_SkuMVj3tlsrRR17N1EiACGzb?usp=sharing");
    }

    public void c(View view) {
        WebView w7=new WebView(this);
        setContentView(w7);
        w7.loadUrl("https://drive.google.com/drive/folders/133qfmHcFQWDR5OBtrSDaULQcWjs2hwDL?usp=sharing");
    }
}