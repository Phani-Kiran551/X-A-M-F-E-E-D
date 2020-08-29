package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem1_civil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem1_civil);
    }

    public void ce(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/1wPAcKwbRoo_vKrDbeAvecI5yQlL1zbkX?usp=sharing");
    }

    public void cm(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/1VdfauVYrBRDbnjd198D8aptBHwEZANtS?usp=sharing");
    }

    public void be(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/1Grv4vzeDxLWwoNRWF4WmQMJkxD6at4W-?usp=sharing");
    }

    public void itb(View view) {
        WebView w5=new WebView(this);
        setContentView(w5);
        w5.loadUrl("https://drive.google.com/drive/folders/1so2KQ2hy0V4AxkqxegVOVOvnit9JAbGJ?usp=sharing");
    }

    public void svc(View view) {
        WebView w6=new WebView(this);
        setContentView(w6);
        w6.loadUrl("https://drive.google.com/drive/folders/1Z4Lozqh7C2AMAoDxfPAYiVnHI8S4Y7sU?usp=sharing");
    }

    public void bcsp(View view) {
        WebView w7=new WebView(this);
        setContentView(w7);
        w7.loadUrl("https://drive.google.com/drive/folders/1zapiRpyBRbTpn4kFTI6Tr6xYOM4NrHYt?usp=sharing");
    }

    public void ss(View view) {
        WebView w8=new WebView(this);
        setContentView(w8);
        w8.loadUrl("https://drive.google.com/drive/folders/1KHI8x6vmGOV1LrMvUYa6x6AtXWyG9mNo?usp=sharing");
    }
}