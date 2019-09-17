package com.example.Delivery_Section;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mybiz.R;

public class HOME extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }


    public void goCreditors(View view){
        Intent intent=new Intent(this, DelivereyHome.class);
        startActivity(intent);
    }

    




}
