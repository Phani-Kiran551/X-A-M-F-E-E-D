package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem2_mechanical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem2_mechanical);
    }

    public void poe(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/1_3zBgVld5GhqftxUojp1qx9koKNDqkSc?usp=sharing");
    }

    public void ss(View view) {
        WebView w2=new WebView(this);
        setContentView(w2);
        w2.loadUrl("https://drive.google.com/drive/folders/1D_RMA1n-M21TFqiNOtqRGI3n5PXyQDZK?usp=sharing");
    }

    public void poc(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/1xY0TeU0REG1wIqfeuy1r01S_Z9gem0jn?usp=sharing");
    }

    public void eg(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/12LanLXfigdxI_9jAEwDkeivZZDY1FA5u?usp=sharing");
    }

    public void ef(View view) {
        WebView w5=new WebView(this);
        setContentView(w5);
        w5.loadUrl("https://drive.google.com/drive/folders/1UcBoJDkZ6ZX_i8ov3dxYaC92UJnEcGs2?usp=sharing");
    }

    public void met(View view) {
        WebView w6=new WebView(this);
        setContentView(w6);
        w6.loadUrl("https://drive.google.com/drive/folders/1t_Q-jxH2O3J49mzDyhcJhRBwYI2Px6Jv?usp=sharing");
    }

    public void mvc(View view) {
        WebView w7=new WebView(this);
        setContentView(w7);
        w7.loadUrl("https://drive.google.com/drive/folders/1LolxELIX149DcAVBL0K_WN7QcZfQbQxv?usp=sharing");
    }

    public void eam(View view) {
        WebView w8=new WebView(this);
        setContentView(w8);
        w8.loadUrl("https://drive.google.com/drive/folders/1IDn8_ON6626DJIMRqApva08IpPlZ65CI?usp=sharing");
    }
}