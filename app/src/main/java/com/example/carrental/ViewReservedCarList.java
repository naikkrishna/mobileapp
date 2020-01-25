package com.example.carrental;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ViewReservedCarList extends AppCompatActivity {
    RecyclerView rvoreders;
    final ReservationRepo reservationRepo=ReservationRepo.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_reserved_car_list);

        rvoreders = findViewById(R.id.rvorders);
        rvoreders.setLayoutManager((new LinearLayoutManager(this)));

        OrderAdapter orderAdapter = new OrderAdapter(getApplicationContext());
        rvoreders.setAdapter(orderAdapter);


    }
}
