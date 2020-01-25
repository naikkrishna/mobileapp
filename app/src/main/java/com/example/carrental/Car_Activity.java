package com.example.carrental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;

public class Car_Activity extends AppCompatActivity {

    public TextView tvBrand, tvType, tvModel, tvColor, tvYear,tvLicenseplate,tvPrice;
    public ImageView img;
    public Button book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_);

        tvBrand = (TextView) findViewById(R.id.tvBrand);
        tvType = (TextView) findViewById(R.id.tvType);
        tvModel = (TextView) findViewById(R.id.tvModel);
        tvColor = (TextView) findViewById(R.id.tvColor);
        tvYear = (TextView) findViewById(R.id.tvYear);
        tvLicenseplate = (TextView) findViewById(R.id.tvLicplt);
        tvPrice = (TextView) findViewById(R.id.Price);
        img = (ImageView) findViewById(R.id.Carimage);
        book=findViewById(R.id.btnbook);

        final Intent intent = getIntent();
        final Intent bookintent=new Intent(this,Book.class);
        final String Brand  = intent.getExtras().getString("Brand");
        final String Type = intent.getExtras().getString("Type");
        final String Model = intent.getExtras().getString("Model");
        final String Color = intent.getExtras().getString("Color");
       final String Year = intent.getExtras().getString("Year");
        final String LicensePlate = intent.getExtras().getString("License_Plate");
        final String Price = intent.getExtras().getString("Price");
        final int image = intent.getExtras().getInt("Image");

        tvBrand.setText(Brand);
        tvType.setText(Type);
        tvModel.setText(Model);
        tvColor.setText(Color);
        tvYear.setText(Year);
        tvLicenseplate.setText(LicensePlate);
        tvPrice.setText(Price);
        img.setImageResource(image);

       book.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
           /*   String Brand=tvBrand.getText().toString();
              String Type=tvType.getText().toString();
              String Model=tvModel.getText().toString();
              String Color=tvColor.getText().toString();
              String Year=tvColor.getText().toString();
              String Lplate=tvLicenseplate.getText().toString();*/

            bookintent.putExtra("Brand",Brand);
               bookintent.putExtra("Type",Type);
               bookintent.putExtra("Model",Model);
               bookintent.putExtra("Color",Color);
               bookintent.putExtra("Year",Year);
               bookintent.putExtra("Lplate",LicensePlate);
               bookintent.putExtra("Price",Price);
               bookintent.putExtra("image",image);
               startActivity(bookintent);


           }
       });
    };
    }
