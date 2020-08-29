package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem3_ece extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem3_ece);
    }

    public void hsse(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/1SqyV-hMTRZgwecqwifxv91N-1Li5wEnP?usp=sharing");
    }

    public void la(View view) {
        WebView w2=new WebView(this);
        setContentView(w2);
        w2.loadUrl("https://drive.google.com/drive/folders/1VAE6XLwvr1iiKHeIzM398Yh9BA7o75Tk?usp=sharing");
    }

    public void et(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/1rF4nIGd-k_RNzD_WEs0HByrnnQmqd3qw?usp=sharing");
    }

    public void de(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/1ltwR5m0KuBcj6lDi95rX0pDeFR15uuZV?usp=sharing");
    }

    public void sas(View view) {
        WebView w5=new WebView(this);
        setContentView(w5);
        w5.loadUrl("https://drive.google.com/drive/folders/1lsgW15_iQy5kkFFVOKd6bQSiDFg0hOBs?usp=sharing");
    }

    public void ss3(View view) {
        WebView w6=new WebView(this);
        setContentView(w6);
        w6.loadUrl("https://drive.google.com/drive/folders/12-hnRTLUQGzPCioJzaH-gACMdDDNptYK?usp=sharing");
    }

    public void ef(View view) {
        WebView w7=new WebView(this);
        setContentView(w7);
        w7.loadUrl("https://drive.google.com/drive/folders/1WaVlaRzeBc-lwpUomyeUMPfMO62Ah9v0?usp=sharing    ");
    }
}