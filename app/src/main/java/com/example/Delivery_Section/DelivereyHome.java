package com.example.Delivery_Section;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mybiz.R;

public class DelivereyHome extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delivery_home);


    }

    public void add_w(View view){
        Intent intent = new Intent(this, AddDeliverer.class);
        startActivity(intent);

    }

    public void view_w(View view){
        Intent intent = new Intent(this, ListCreditors.class);
        startActivity(intent);
    }


    public void search_w(View view){
        Intent intent = new Intent(this, SearchDeliverer.class);
        startActivity(intent);
    }

    public void remove_w(View view) {
        Intent intent = new Intent(this, assign_delivery.class);
        startActivity(intent);
    }

    public void update_w(View view) {
        Intent intent = new Intent(this, UpdateDeliverer.class);
        startActivity(intent);
    }


}
