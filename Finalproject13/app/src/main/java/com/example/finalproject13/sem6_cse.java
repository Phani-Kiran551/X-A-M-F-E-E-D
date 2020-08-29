package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem6_cse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem6_cse);
    }

    public void se(View view) {
        WebView w=new WebView(this);
        setContentView(w);
        w.loadUrl("com/example/finalproject13/sem6_cse.java:20");
    }

    public void cse2(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/1O3rDYvEUNEaVRYRFOIu16FqCYOH1HhQY?usp=sharing");
    }

    public void oe1(View view) {
        WebView w2=new WebView(this);
        setContentView(w2);
        w2.loadUrl("https://drive.google.com/drive/folders/1uIfjT4K0InRhK8RbwCS_ejyCnrvorTCE?usp=sharing");
    }

    public void oe2(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/1zrSMSCaF5KaGcv-C3hSrQen1TcBMc4uL?usp=sharing");
    }

    public void urop(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/1Imq9fu0LIE6AvfaEN1Z9YNp99fkEKrSm?usp=sharing");
    }

    public void iscp2(View view) {
        WebView w5=new WebView(this);
        setContentView(w5);
        w5.loadUrl("https://drive.google.com/drive/folders/1uaRsHgiNFbxfa301KlsYsw5OSeEEler_?usp=sharing");
    }

    public void de(View view) {
        WebView w6=new WebView(this);
        setContentView(w6);
        w6.loadUrl("https://drive.google.com/drive/folders/1zzuKAZfbmkWxDFnCnTxmkCV-pU1lYIYq?usp=sharing");
    }
}