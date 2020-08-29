package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem4_mechanical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem4_mechanical);
    }

    public void som(View view) {
        WebView w=new WebView(this);
        setContentView(w);
        w.loadUrl("https://drive.google.com/drive/folders/1wMpeRJScDWJLFp1kDZ5NXOa9GjIwZ6Tb?usp=sharing");
    }

    public void de(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/1L5v7AeTJlYMu11_CVeNmf3MrRU5h_FbO?usp=sharing");
    }

    public void ss(View view) {
        WebView w2=new WebView(this);
        setContentView(w2);
        w2.loadUrl("https://drive.google.com/drive/folders/1S6xTH_UwUzkZ5CPIPhhn1UUdlKkgOPUW?usp=sharing");
    }

    public void kam(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/18PRCPDfCHgnU0d63iqn75LdExJw-GhKU?usp=sharing");
    }

    public void pas(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/1mw_390jbg9KK1bLKror594v6PAKtO2fa?usp=sharing");
    }

    public void fm(View view) {
        WebView w5=new WebView(this);
        setContentView(w5);
        w5.loadUrl("https://drive.google.com/drive/folders/1Hut1tmsjBsmKX1RGMboLdmOIDt9p_rqK?usp=sharing");
    }

    public void oe(View view) {
        WebView w6=new WebView(this);
        setContentView(w6);
        w6.loadUrl("https://drive.google.com/drive/folders/1JMtPou0igQxgDvmOhrMzDav4ccCZB4cq?usp=sharing");
    }
}