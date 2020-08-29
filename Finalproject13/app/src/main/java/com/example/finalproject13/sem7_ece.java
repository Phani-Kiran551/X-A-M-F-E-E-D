package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem7_ece extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem7_ece);
    }

    public void te(View view) {
        WebView w=new WebView(this);
        setContentView(w);
        w.loadUrl("https://drive.google.com/drive/folders/1gn_YU2Z4iY4MClJylaoebNYUTLoQIk5u?usp=sharing");
    }

    public void oe(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/1ICp8D1J0Wm0V3GRi2A4-cJ1r3Qccm2Cj?usp=sharing");
    }

    public void oe1(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/10_g37fLbhaaLudn0irr7zNyssir3aHbb?usp=sharing");
    }

    public void oe3(View view) {
        WebView w2=new WebView(this);
        setContentView(w2);
        w2.loadUrl("https://drive.google.com/drive/folders/15SLCBRX4e-IIu9A16ch9EDa-TZeUmHqC?usp=sharing");
    }

    public void oe4(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/1jyGxfdD_yttHhdsP63yzMl_QQ-1mYw4O?usp=sharing");
    }

    public void oe5(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/1ocYpTdUVNtp_bEcMu6caXgzkHO9xDTeT?usp=sharing");
    }
}