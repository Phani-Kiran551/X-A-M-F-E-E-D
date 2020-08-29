package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem8_mechanical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem8_mechanical);
    }

    public void op(View view) {
        WebView w=new WebView(this);
        setContentView(w);
        w.loadUrl("https://drive.google.com/drive/folders/1m4BvblXVDVTGwKbbaGo-JKgqbKTnzRbK?usp=sharing");
    }

    public void odp(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/1j_XOEgjWJGGdpOLhYrv5uQeFNQbRBGoo?usp=sharing");
    }
}