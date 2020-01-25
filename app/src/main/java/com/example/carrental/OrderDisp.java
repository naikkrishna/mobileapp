package com.example.carrental;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class OrderDisp extends AppCompatActivity {
    RecyclerView rvoreders;
    final ReservationRepo reservationRepo=ReservationRepo.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_disp);
        rvoreders = findViewById(R.id.rvorders);
        rvoreders.setLayoutManager((new LinearLayoutManager(this)));

        OrderAdapter orderAdapter = new OrderAdapter(getApplicationContext());
        rvoreders.setAdapter(orderAdapter);


    }


}




