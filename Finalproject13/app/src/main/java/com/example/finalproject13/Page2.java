package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
    }

    public void semI(View view) {
        Intent sem1=new Intent(Page2.this,activity_page4.class);
        startActivity(sem1);
    }

    public void semII(View view) {
        Intent sem2=new Intent(Page2.this,activity_page5.class);
        startActivity(sem2);
    }

    public void semIII(View view) {
        Intent sem3=new Intent(Page2.this,activity_page6.class);
        startActivity(sem3);
    }

    public void semIV(View view) {
        Intent sem4=new Intent(Page2.this,activity_page7.class);
        startActivity(sem4);
    }

    public void semV(View view) {
        Intent sem5=new Intent(Page2.this,activity_page8.class);
        startActivity(sem5);
    }

    public void semVI(View view) {
        Intent sem6=new Intent(Page2.this,activity_page9.class);
        startActivity(sem6);
    }

    public void semVII(View view) {
        Intent sem7=new Intent(Page2.this,activity_page10.class);
        startActivity(sem7);
    }

    public void semVIII(View view) {
        Intent sem8=new Intent(Page2.this,activity_page11.class);
        startActivity(sem8);
    }
}