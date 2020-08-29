package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem1_eee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem1_eee);
    }

    public void itc(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/1Zpcrnu1K5_WS8IfXzaevhKGWwZlzhXxo?usp=sharing");
    }

    public void itcm(View view) {
        WebView w2=new WebView(this);
        setContentView(w2);
        w2.loadUrl("https://drive.google.com/drive/folders/1daJmKMD77A8YmvCkvfdx3uvl9J6SnkW3?usp=sharing");
    }

    public void itcml(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/1iT1yNhOiaNAfEdSxzNcdrmfVN4EzNqV4?usp=sharing");
    }

    public void be(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/159uTh0YfFLQeBfpPFuysijzLw7p-eVtb?usp=sharing");
    }

    public void bel(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/14alGcKaYDPHYxO_nVtQ8Xe4D4IwVugwD?usp=sharing");
    }

    public void svc(View view) {
        WebView w5=new WebView(this);
        setContentView(w5);
        w5.loadUrl("https://drive.google.com/drive/folders/1IlfYQ66DaomT2rDW9sS7ptXGVDHBTxiq?usp=sharing");
    }

    public void itb(View view) {
        WebView w6=new WebView(this);
        setContentView(w6);
        w6.loadUrl("https://drive.google.com/drive/folders/1VPAo_Fua5mwVJW5qyYIL_MQ1GymP7IyZ?usp=sharing");
    }

    public void itcsap(View view) {
        WebView w7=new WebView(this);
        setContentView(w7);
        w7.loadUrl("https://drive.google.com/drive/folders/1fh4TcsUSAjKi7T3U_yHzGmUaHkb67AQh?usp=sharing");
    }

    public void itcsapl(View view) {
        WebView w8=new WebView(this);
        setContentView(w8);
        w8.loadUrl("https://drive.google.com/drive/folders/1LXKrArVl-6rF9uj4GJKLpxKieo1ph7Z5?usp=sharing");
    }
}