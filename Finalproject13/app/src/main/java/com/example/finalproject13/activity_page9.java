package com.example.finalproject13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_page9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
    }

    public void csesem1(View view) {
        Intent cs1=new Intent(activity_page9.this,sem6_cse.class);
        startActivity(cs1);
    }


    public void civilsem1(View view) {
        Intent cis1=new Intent(activity_page9.this,sem6_civil.class);
        startActivity(cis1);
    }

    public void ecesem1(View view) {
        Intent eces1=new Intent(activity_page9.this,sem6_ece.class);
        startActivity(eces1);
    }

    public void eeesem1(View view) {
        Intent eees1=new Intent(activity_page9.this,sem6_eee.class);
        startActivity(eees1);
    }

    public void mechanicalsem1(View view) {
        Intent mecs1=new Intent(activity_page9.this,sem6_mechanical.class);
        startActivity(mecs1);
    }
}