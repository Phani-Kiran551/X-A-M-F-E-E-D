package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem7_mechanical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem7_mechanical);
    }

    public void dac(View view) {
        WebView w=new WebView(this);
        setContentView(w);
        w.loadUrl("https://drive.google.com/drive/folders/1GnjhRhBJBKIzVenWREEopJ8-zgqnESfg?usp=sharing");
    }

    public void mt(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/1uUANo4NOjfKfs7Wi4haAWjcJnLq3nIzb?usp=sharing");
    }

    public void mdp(View view) {
        WebView w2=new WebView(this);
        setContentView(w2);
        w2.loadUrl("https://drive.google.com/drive/folders/1Qrs4VTYHExUzVxTiVccBG9UaQV2CPhQi?usp=sharing");
    }

    public void me(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/1oiFWw5syYuw5Xy0km4I6NKL0Mf3_9eUL?usp=sharing");
    }

    public void oe(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/157kZUoz0cqt_C_HP09Sw7tv8jfP243yJ?usp=sharing");
    }

    public void oe1(View view) {
        WebView w5=new WebView(this);
        setContentView(w5);
        w5.loadUrl("https://drive.google.com/drive/folders/1ETV_NmutdQvu3HElvvP7p-TxqTSza1Oj?usp=sharing");
    }

    public void oe4(View view) {
        WebView w6=new WebView(this);
        setContentView(w6);
        w6.loadUrl("https://drive.google.com/drive/folders/1TcvqTmeqXnZFjJcC-UaXndv_8mowfDLo?usp=sharing");
    }
}