package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem1_mechanical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem1_mechanical);
    }

    public void ce(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/1P_R1p2ctAv6tbpIvO52S5f4CN5D-pEuS?usp=sharing");
    }

    public void ss(View view) {
        WebView w2=new WebView(this);
        setContentView(w2);
        w2.loadUrl("https://drive.google.com/drive/folders/1aooVxnBIX4Ffvpa-Ysrm6DYhNVpGN8j9?usp=sharing");
    }

    public void svc(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/1uUaJXmxezB4jMu9oyWyA-zkT3gANfbOl?usp=sharing");
    }

    public void cm(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/1WHyp-4hzip-oXWpFw95HQg7rWuvuckr6?usp=sharing");
    }

    public void itb(View view) {
        WebView w5=new WebView(this);
        setContentView(w5);
        w5.loadUrl("https://drive.google.com/drive/folders/1GQX65r75ZXtojV15n8KAnANaUzW9IFka?usp=sharing");
    }

    public void be(View view) {
        WebView w6=new WebView(this);
        setContentView(w6);
        w6.loadUrl("https://drive.google.com/drive/folders/11lBXBotR_U3435mBeK5XaIV5BcaXBJtN?usp=sharing");
    }

    public void itcsap(View view) {
        WebView w7=new WebView(this);
        setContentView(w7);
        w7.loadUrl("https://drive.google.com/drive/folders/1Vd2bVHJ_nGKrCdxDVoRNLNAo0J0ZQ2xf?usp=sharing");
    }
}