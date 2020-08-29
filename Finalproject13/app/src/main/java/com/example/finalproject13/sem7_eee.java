package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem7_eee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem7_eee);
    }

    public void te3(View view) {
        WebView w=new WebView(this);
        setContentView(w);
        w.loadUrl("https://drive.google.com/drive/folders/1xpuk64kdp2nf-9D_qMlxtjrVYErmkE7i?usp=sharing");
    }

    public void te4(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/1o1k10AsYuKDTmUn-5_dXZDVEUuHGYBmp?usp=sharing");
    }

    public void te5(View view) {
        WebView w2=new WebView(this);
        setContentView(w2);
        w2.loadUrl("https://drive.google.com/drive/folders/1d8T1TGoAUKlAA5EIWE2XAJG8k-owgFBZ?usp=sharing");
    }

    public void ps3(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/1tzQWEI_pmGeVKg7a0N0VZCczWGO4XnIF?usp=sharing");
    }

    public void ps3l(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/1nYFfnUz8taAbkpzr0Hnzhdycej63L83B?usp=sharing");
    }

    public void oe7(View view) {
        WebView w5=new WebView(this);
        setContentView(w5);
        w5.loadUrl("https://drive.google.com/drive/folders/19inmRc1BnWTKuh_P3GFvMj5-_ExY5fU-?usp=sharing");
    }

    public void hve(View view) {
        WebView w6=new WebView(this);
        setContentView(w6);
        w6.loadUrl("https://drive.google.com/drive/folders/1ZCD9L-cl8e7s_fhHJge-V94ZKokZ89uZ?usp=sharing");
    }

    public void hvel(View view) {
        WebView w7=new WebView(this);
        setContentView(w7);
        w7.loadUrl("https://drive.google.com/drive/folders/1WuRbLvRovNFhu2gwFDUiQi82F1hrngTT?usp=sharing");
    }
}