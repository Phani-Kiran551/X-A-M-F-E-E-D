package com.example.finalproject13;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.telephony.AvailableNetworkInfo;
import android.util.Log;
import android.view.View;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextInputEditText user,pass;
    DatabaseReference reference;
    List<User> lst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkConnection();
        user=findViewById(R.id.username);
        pass=findViewById(R.id.password1);
        reference=FirebaseDatabase.getInstance().getReference();
        lst=new ArrayList<>();
        lst.clear();
        reference.child("USers").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot snap:snapshot.getChildren()) {
                    User u = snap.getValue(User.class);
                    lst.add(u);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
int k=0;
    public void forgot(View view) {

    }

    public void newuser(View view) {
        Intent i=new Intent(MainActivity.this,activity_page3.class);
        startActivity(i);
    }

    public void login(View view) {
        final String username=user.getText().toString();
        final String password=pass.getText().toString();
        for (int i=0;i<lst.size();i++){
            Log.i("user", ""+lst.get(i).getName());

            if(username.equals(lst.get(i).getEmail()) && password.equals(lst.get(i).getPass1())){
                Intent in=new Intent(MainActivity.this,Page2.class);
                startActivity(in);
                k=1;
                break;
            }
            else {
                k=0;
            }
        }
        if(k==0){
            Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
        }
    }
    public void checkConnection(){
        ConnectivityManager manager = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = manager.getActiveNetworkInfo();
        if(null!=activeNetwork) {
            if (activeNetwork.getType() == ConnectivityManager.TYPE_WIFI) {
                Toast.makeText(this, "Wifi Enabled", Toast.LENGTH_SHORT).show();
            } else if (activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE) {
                Toast.makeText(this, "Mobile Data Enabled", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(this, "No Internet Connection", Toast.LENGTH_SHORT).show();
        }
    }

    public void master(View view) {
        WebView w6=new WebView(this);
        setContentView(w6);
        w6.loadUrl("https://accounts.google.com/ServiceLogin/webreauth?service=wise&passive=1209600&continue=https%3A%2F%2Fdrive.google.com%2F&followup=https%3A%2F%2Fdrive.google.com%2F&emr=1&authuser=0&flowName=GlifWebSignIn&flowEntry=ServiceLogin");    }
}