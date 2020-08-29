package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem1_ece extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem1_ece);
    }

    public void ce(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/1OqE9aRpIQmHrPcaiWFXV8FxAWzbdIifg?usp=sharing");
    }

    public void cm(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/1fGVXC_L2IoSInpEnnuzsBYdIibezGlaG?usp=sharing");
    }

    public void be(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/1y0ZkwaywV6FiDFl4g18zcITunHih5Brs?usp=sharing");
    }

    public void itcsap(View view) {
        WebView w5=new WebView(this);
        setContentView(w5);
        w5.loadUrl("https://drive.google.com/drive/folders/1cmdY__KitsxU3tu8UG5kf51G9D-Wnd2d?usp=sharing");
    }

    public void svc(View view) {
        WebView w6=new WebView(this);
        setContentView(w6);
        w6.loadUrl("https://drive.google.com/drive/folders/1M7DYvhptU5Xwp9AdoW3EtREJh1Xo3Te5?usp=sharing");
    }

    public void itb(View view) {
        WebView w7=new WebView(this);
        setContentView(w7);
        w7.loadUrl("https://drive.google.com/drive/folders/18LeZyWmoN109Z0qndmrnUsvsd4mkACht?usp=sharing");
    }

    public void ss4(View view) {
        WebView w8=new WebView(this);
        setContentView(w8);
        w8.loadUrl("https://drive.google.com/drive/folders/1LUYev9CAI2zsxreS1ZFcrn9g0tHebTL9?usp=sharing");
    }
}