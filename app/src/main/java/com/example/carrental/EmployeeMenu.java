package com.example.carrental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EmployeeMenu extends AppCompatActivity {

<<<<<<< HEAD

=======
>>>>>>> 89f82ab71ea2e2785e05bfb251933bd31be4b49e
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_menu);

        final Button btnaddcar=findViewById(R.id.btnaddcar);
        final Button btncustlist=findViewById((R.id.btnviewcustlist));
        final Button btnres_car_list=findViewById(R.id.btnviewcarlist);
<<<<<<< HEAD
        final Intent intent=new Intent(this,EmployeeAddCar.class);
        final Intent intent1=new Intent(this,CustomerDisplay.class);
        final Intent intent2=new Intent(this,ViewReservedCarList.class);


=======

        final Intent intent=new Intent(this,EmployeeAddCar.class);
       // final Intent intent1=new Intent(this,ViewCustomerList.class);
        final Intent intent2=new Intent(this,ViewReservedCarList.class);

>>>>>>> 89f82ab71ea2e2785e05bfb251933bd31be4b49e
       btnaddcar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
<<<<<<< HEAD
        btncustlist.setOnClickListener(new View.OnClickListener() {
=======
       /* btncustlist.setOnClickListener(new View.OnClickListener() {
>>>>>>> 89f82ab71ea2e2785e05bfb251933bd31be4b49e
            @Override
            public void onClick(View v) {
                startActivity(intent1);
            }
<<<<<<< HEAD
        });
=======
        });*/
>>>>>>> 89f82ab71ea2e2785e05bfb251933bd31be4b49e
        btnres_car_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2);
            }
        });
    }
}
