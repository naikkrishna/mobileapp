package com.example.carrental;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RadioGroup radioGroup;
    RadioButton Customer;
    RadioButton Employee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText username = findViewById(R.id.Email);
        final TextView message=findViewById(R.id.message);
        final EditText password = findViewById(R.id.Password);
        final Button login = findViewById(R.id.SignIn);
        final Button signup=findViewById(R.id.signUp);

         radioGroup = (RadioGroup) findViewById(R.id.radioGroup);


        final Intent myIntent =new Intent(MainActivity.this,LoginPage.class);
        final Intent myIntent2=new Intent(MainActivity.this,CustomerSignUp.class);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String value = ((RadioButton)findViewById(radioGroup.getCheckedRadioButtonId())).getText().toString();
                String inputid = username.getText().toString();
                String inputpassword = password.getText().toString();

                if(value.equals("Employee"))
                {
                    List<Employee> employees = EmployeeRepo.getInstance().getEmployees();
                    for (int i = 0; i < employees.size(); i++) {
                        Employee emp = employees.get(i);
                        if (emp.username.equals(inputid) && emp.Password.equals(inputpassword)) {
                            Intent intent = new Intent(MainActivity.this,EmployeeMenu.class);
                            startActivity(intent);

                        }
                        else
                        {
                            message.setText("incorrect username or password");
                        }

                    }

                }
                else if(value.equals("Customer")) {
                List<Customer> customers=CustomerRepo.getInstance().getCustomers();
                for (int i = 0; i < customers.size(); i++)
                {
                    Customer customer = customers.get(i);

                    if (customer.username.equals(inputid) && customer.Password.equals(inputpassword)) {
                        Intent intent = new Intent(MainActivity.this,CarListView.class );
                        startActivity(intent);

                    }
                    else
                    {
                        message.setText("incorrect username or password");
                    }


                }
                }
                else
                {
                    message.setText("incorrect username or password");
                }


            }

        }


        );
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(myIntent2);
            }
        });
    }
}



