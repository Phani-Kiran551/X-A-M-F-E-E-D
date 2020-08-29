package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem3_mechanical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem3_mechanical);
    }

    public void em(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/1QHVXNb5o9APrbnriUlgr2TEccV_sumNS?usp=sharing");
    }

    public void la(View view) {
        WebView w2=new WebView(this);
        setContentView(w2);
        w2.loadUrl("https://drive.google.com/drive/folders/1Z-JE2CxAlkECLgWHgEnah6TLEGIoMGaF?usp=sharing");
    }

    public void ss(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/1uZHQkN-h3BYb0LMDM4AuAu6FT7l0QfHb?usp=sharing");
    }

    public void t(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/1sNyzvb2M4sAFY_6VKNhwfIuOuCyA6mPB?usp=sharing");
    }

    public void msam(View view) {
        WebView w5=new WebView(this);
        setContentView(w5);
        w5.loadUrl("https://drive.google.com/drive/folders/1-YjVM7LpCcTO7f2FQU_ZDWhiPnXSFetJ?usp=sharing");
    }

    public void es(View view) {
        WebView w6=new WebView(this);
        setContentView(w6);
        w6.loadUrl("https://drive.google.com/drive/folders/1VKZiy1-0I8eCipEVlmHAjb4R9xbPBsep?usp=sharing");
    }

    public void dp(View view) {
        WebView w7=new WebView(this);
        setContentView(w7);
        w7.loadUrl("https://drive.google.com/drive/folders/1gt4i_YKrqIGX7ojNb0vNRK0a_DDtxzee?usp=sharing");
    }

    public void heio(View view) {
        WebView w8=new WebView(this);
        setContentView(w8);
        w8.loadUrl("https://drive.google.com/drive/folders/1QpkrxtTLwx5ZKBBAYZluOJBfwK3yzenT?usp=sharing");
    }
}