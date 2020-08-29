package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem6_civil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem6_civil);
    }

    public void fem(View view) {
        WebView w=new WebView(this);
        setContentView(w);
        w.loadUrl("https://drive.google.com/drive/folders/1EZhrpLT2NctsKPT5di1hAN8HwarRxLsj?usp=sharing");
    }

    public void te3(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/1am8dQZo5V-E81GG0ZqCN3QH3Fv3e098V?usp=sharing");
    }

    public void dp(View view) {
        WebView w2=new WebView(this);
        setContentView(w2);
        w2.loadUrl("https://drive.google.com/drive/folders/13ssF-bUq5MwBKrO_PVSdZ6-DYb1IyRsw?usp=sharing");
    }

    public void oe(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/1FPiuLSPtPGdYfZpkbxfBskvmYfF3KvGx?usp=sharing");
    }

    public void oe4(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/17VK-LCOPVOsqoggnreyMCgDlmFBhgz7o?usp=sharing");
    }

    public void te(View view) {
        WebView w5=new WebView(this);
        setContentView(w5);
        w5.loadUrl("https://drive.google.com/drive/folders/1Ixj3z6hPm5Z9815aFekZ4gvZEOpl9x7u?usp=sharing");
    }

    public void oe5(View view) {
        WebView w6=new WebView(this);
        setContentView(w6);
        w6.loadUrl("https://drive.google.com/drive/folders/1d6UO-uktYKjWRdmICvi0ktORR42gon1U?usp=sharing");
    }
}