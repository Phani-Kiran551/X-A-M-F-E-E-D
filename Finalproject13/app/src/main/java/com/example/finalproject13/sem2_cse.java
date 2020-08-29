package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem2_cse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem2_cse);
    }

    public void mvc(View view) {
        WebView w=new WebView(this);
        setContentView(w);
        w.loadUrl("https://drive.google.com/drive/folders/1JWcpan6aARGp8AJJlBJHTERBqFH9pXAT?usp=sharing");
    }

    public void itb(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/1Gc4Z1bi163y4Db4Hybh9F1FTQOekntiy?usp=sharing");
    }

    public void ef(View view) {
        WebView w2=new WebView(this);
        setContentView(w2);
        w2.loadUrl("https://drive.google.com/drive/folders/1b2WNbByfW_C1r5Wfnp8tpdbCRZ5OqwzA?usp=sharing");
    }

    public void eam(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/1QyFdAynfZkrwO468hegqzIYKI108qPlz?usp=sharing");
    }

    public void dsaauc(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/1jKkQ-0PKKGYzlYs0S-t1OfAt_zr6Jxao?usp=sharing");
    }

    public void be(View view) {
        WebView w5=new WebView(this);
        setContentView(w5);
        w5.loadUrl("https://drive.google.com/drive/folders/1Ab0BgJKpu4ox-BA3Mm1DXmHA7SmBgHod?usp=sharing");
    }

    public void ss2(View view) {
        WebView w6=new WebView(this);
        setContentView(w6);
        w6.loadUrl("https://drive.google.com/drive/folders/1JFAXFnc2mPETIeRZJMKYmOHz14aX2D95?usp=sharing");
    }
}