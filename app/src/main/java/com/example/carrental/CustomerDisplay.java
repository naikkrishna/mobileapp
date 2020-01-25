package com.example.carrental;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class CustomerDisplay extends AppCompatActivity {
    RecyclerView rvcustomer;
    final CustomerRepo customerRepo=CustomerRepo.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_display);
        rvcustomer = findViewById(R.id.rvcustomer);
        rvcustomer.setLayoutManager((new LinearLayoutManager(this)));

        CustomerDisplayAdapter customerDisplayAdapter  = new CustomerDisplayAdapter(getApplicationContext());
        rvcustomer.setAdapter(customerDisplayAdapter);


    }
}
