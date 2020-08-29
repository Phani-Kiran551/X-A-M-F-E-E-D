package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_page4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
    }

    public void csesem1(View view) {
        Intent cs1=new Intent(activity_page4.this,sem1_cse.class);
        startActivity(cs1);
    }


    public void civilsem1(View view) {
        Intent cis1=new Intent(activity_page4.this,sem1_civil.class);
        startActivity(cis1);
    }

    public void ecesem1(View view) {
        Intent eces1=new Intent(activity_page4.this,sem1_ece.class);
        startActivity(eces1);
    }

    public void eeesem1(View view) {
        Intent eees1=new Intent(activity_page4.this,sem1_eee.class);
        startActivity(eees1);
    }

    public void mechanicalsem1(View view) {
        Intent mecs1=new Intent(activity_page4.this,sem1_mechanical.class);
        startActivity(mecs1);
    }
}