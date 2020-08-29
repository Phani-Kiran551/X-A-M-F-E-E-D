package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sem5_mechanical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem5_mechanical);
    }

    public void mai(View view) {
        WebView w1=new WebView(this);
        setContentView(w1);
        w1.loadUrl("https://drive.google.com/drive/folders/1F9ULjkgNRkSucp__2UV0nLC2w0nyQqWr?usp=sharing");
    }

    public void md(View view) {
        WebView w2=new WebView(this);
        setContentView(w2);
        w2.loadUrl("https://drive.google.com/drive/folders/1baSAjUI0JfzMZGTqLm86MHqKHVZtYiIS?usp=sharing");
    }

    public void nm(View view) {
        WebView w3=new WebView(this);
        setContentView(w3);
        w3.loadUrl("https://drive.google.com/drive/folders/1IV824Dvst5slPU4_ZIpE1WfVHLcIna_a?usp=sharing");
    }

    public void mee(View view) {
        WebView w4=new WebView(this);
        setContentView(w4);
        w4.loadUrl("https://drive.google.com/drive/folders/1RN_T_n-o3WPen2Is4X8FurxTLwNNEbF8?usp=sharing");
    }

    public void me1(View view) {
        WebView w5=new WebView(this);
        setContentView(w5);
        w5.loadUrl("https://drive.google.com/drive/folders/1JcIkJQlEKFXa9-QzldZs9n9wxkE0NF4A?usp=sharing");
    }

    public void uro(View view) {
        WebView w6=new WebView(this);
        setContentView(w6);
        w6.loadUrl("https://drive.google.com/drive/folders/1MM6ZeUpcZrnOR4AhKTZCxKA7Ui8pMBL1?usp=sharing");
    }
}