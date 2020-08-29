package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem4_ece extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem4_ece);
    }

    public void de(View view) {
        WebView w=new WebView(this);
        setContentView(w);
        w.loadUrl("https://drive.google.com/drive/folders/1nX0kGIb_HNxsemWShj7kZgI0uvfo536G?usp=sharing");
    }

    public void pasfe(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/1CWre1sWDSNyZOdKjZsw_Ou55fBvTvaky?usp=sharing");
    }

    public void ae(View view) {
        WebView w2=new WebView(this);
        setContentView(w2);
        w2.loadUrl("https://drive.google.com/drive/folders/1ExLRCrSmrfosPSRkFPaCqFNer8ji0W2d?usp=sharingg");
    }

    public void cs(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/1JNroT21tA6FjC053iqZdSB_aJAkdRw2x?usp=sharing");
    }

    public void dsp(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/1QEytQ_-LdA20dTo93d8mRQKhBEHeZ4PE?usp=sharing");
    }

    public void eawp(View view) {
        WebView w5=new WebView(this);
        setContentView(w5);
        w5.loadUrl("https://drive.google.com/drive/folders/1qJajpr5TD6I0GpvcP9gwxzPImAlQN7v7?usp=sharing");
    }
}