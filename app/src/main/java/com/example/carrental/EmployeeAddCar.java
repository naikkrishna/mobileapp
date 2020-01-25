package com.example.carrental;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class EmployeeAddCar extends AppCompatActivity {
<<<<<<< HEAD
    Button btn;
    EditText brand,type,model,color,year,Lplate,price;
=======
>>>>>>> 89f82ab71ea2e2785e05bfb251933bd31be4b49e

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_add_car);
<<<<<<< HEAD
         brand=findViewById(R.id.etBrand);
         type=findViewById(R.id.etType);
        model=findViewById(R.id.etModel);
         color=findViewById(R.id.etColor);
         year=findViewById(R.id.etYear);
        Lplate= findViewById(R.id.etLP);
         price=findViewById(R.id.etprice);
         btn=findViewById(R.id.btnAdd);
          final CarListView carListView=new CarListView();
        btn.setOnClickListener(new View.OnClickListener() {

            final TextView msg=findViewById(R.id.txtmsg);
            final String Brand=brand.getText().toString();
            final String Type=type.getText().toString();
            final String Model=model.getText().toString();
            final String Color=color.getText().toString();
            final String Year=year.getText().toString();
            final String LPlate=Lplate.getText().toString();
            final String Price=price.getText().toString();
            final int image1=R.drawable.bmw;
            @Override
            public void onClick(View v) {
                Car car=new Car(Brand,Type,Model,Color,Year,LPlate,Price,image1);
                msg.setText("CAR SUCCESFULLY ADDED");

            }
        });

=======
        final EditText brand=findViewById(R.id.etBrand);
        final EditText type=findViewById(R.id.etType);
        final EditText model=findViewById(R.id.etModel);
        final EditText color=findViewById(R.id.etColor);
        final EditText year=findViewById(R.id.etYear);
        final EditText Lplate= findViewById(R.id.etLP);
        final Button btnadd=findViewById(R.id.btnaddcar);
        final TextView msg=findViewById(R.id.txtmsg);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Brand=brand.getText().toString();
                String Type=type.getText().toString();
                String Model=model.getText().toString();
                String Color=color.getText().toString();
                String Year=year.getText().toString();
                String LPlate=Lplate.getText().toString();
             // String image1="abc.jpg";

            }
        });
        msg.setText("CAR SUCCESFULLY ADDED");
>>>>>>> 89f82ab71ea2e2785e05bfb251933bd31be4b49e

    }
}
