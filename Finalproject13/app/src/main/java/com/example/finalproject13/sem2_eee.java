package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem2_eee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem2_eee);
    }

    public void c2(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/1YutpuYYD_hrnWR4IcQOp3O9BobzqZOJS?usp=sharing");
    }

    public void poc(View view) {
        WebView w2=new WebView(this);
        setContentView(w2);
        w2.loadUrl("https://drive.google.com/drive/folders/1BhhXx9UtcNlGDMukQRRLMAUqKY3EJnqL?usp=sharing");
    }

    public void eam(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/1tP6LXSgJfLRE4PvQomC-3bNr5MbqviHH?usp=sharing");
    }

    public void e(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/181DRWlZZ6D8KJMp2_hiwyZsBSrV5DFlu?usp=sharing");
    }

    public void dsaauc(View view) {
        WebView w5=new WebView(this);
        setContentView(w5);
        w5.loadUrl("https://drive.google.com/drive/folders/11wyS72WhkT1hS7q6f5KnAdyizRfnEUEC?usp=sharing");
    }

    public void mvc(View view) {
        WebView w6=new WebView(this);
        setContentView(w6);
        w6.loadUrl("https://drive.google.com/drive/folders/1DmK51a7v1fZO-kkGMmmuIT0a5FAGBxrp?usp=sharing    ");
    }

    public void ioee(View view) {
        WebView w7=new WebView(this);
        setContentView(w7);
        w7.loadUrl("https://drive.google.com/drive/folders/1ghRztVDQ4ynsUkq9JWTZ_QBcIju_oulB?usp=sharing");
    }
}