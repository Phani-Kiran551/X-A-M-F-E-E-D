package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem2_ece extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem2_ece);
    }

    public void ss2(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/13rm1vpoSMx7Y_o_LFjuABhN8Muxjf4RW?usp=sharing");
    }

    public void dsaauc(View view) {
        WebView w2=new WebView(this);
        setContentView(w2);
        w2.loadUrl("https://drive.google.com/drive/folders/1uehEBFsniMF73VXDkf2bMgUrwBHm_Rn4?usp=sharing    ");
    }

    public void e(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/1jMxC6aEgje-gRrHh6lRn-2hnZ0EKgsq5?usp=sharing");
    }

    public void eam(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/1eanh1k8a4iiVcgkSR94zJd4MTINxotdD?usp=sharing");
    }

    public void mvc(View view) {
        WebView w5=new WebView(this);
        setContentView(w5);
        w5.loadUrl("https://drive.google.com/drive/folders/11lAj_8TT4y3jwGJzoHwmZ6ADNmjTHxJn?usp=sharing");
    }

    public void es(View view) {
        WebView w6=new WebView(this);
        setContentView(w6);
        w6.loadUrl("https://drive.google.com/drive/folders/1NY_tJZs8pXITcRnd5wUnH5rAHqDGjZlp?usp=sharing");
    }

    public void dsaaucl(View view) {
        WebView w7=new WebView(this);
        setContentView(w7);
        w7.loadUrl("https://drive.google.com/drive/folders/1vmpQWLk3hTwvL9mSzhzypJts22KBmEXc?usp=sharing");
    }

    public void poc(View view) {
        WebView w8=new WebView(this);
        setContentView(w8);
        w8.loadUrl("https://drive.google.com/drive/folders/1KbyfSu2nmX692NiEyaYTUTYtAkso4FMa?usp=sharing");
    }
}