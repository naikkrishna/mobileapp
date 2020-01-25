package com.example.carrental;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class CustomerSignUp extends AppCompatActivity {
        private RadioGroup radioGroup;
        RadioButton customer;
        RadioButton Employee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_sign_up);
         final EditText fname=findViewById(R.id.Cfname);
        final EditText lname=findViewById(R.id.Clname);
        final EditText uname=findViewById(R.id.Cuname);
        final EditText password =findViewById(R.id.Cpassword);
        final Button signup=findViewById(R.id.btnsignup);
        radioGroup=findViewById(R.id.radioGroup);
        final TextView msg=findViewById(R.id.tvmsg);
        customer=findViewById(R.id.Customer);
        Employee=findViewById(R.id.Employee);

        final EmployeeRepo employeeRepo=EmployeeRepo.getInstance();
        final CustomerRepo customerRepo=CustomerRepo.getInstance();
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = ((RadioButton)findViewById(radioGroup.getCheckedRadioButtonId())).getText().toString();
                if(value.equals("Employee"))
                {
                    String firstname=fname.getText().toString();
                    String lastname=lname.getText().toString();
                    String email=uname.getText().toString();
                    String pass=password.getText().toString();

                    Employee employee=new Employee();
                    employee.firstname=firstname;
                   employee.lastname=lastname;
                    employee.username=email;
                    employee.Password=pass;
                    employeeRepo.addEmployee(employee);
                    msg.setText("EMPLOYEE REGISTRATION SUCCESSFUL....!!!!");

                }
                else if(value.equals("Customer"))
                {
                    String firstname1=fname.getText().toString();
                    String lastname1=lname.getText().toString();
                    String email1=uname.getText().toString();
                    String pass1=password.getText().toString();

                    Customer customer=new Customer();
                    customer.firstname=firstname1;
                    customer.lastname=lastname1;
                    customer.username=email1;
                    customer.Password=pass1;
                    customerRepo.addCustomer(customer);
                    msg.setText("CUSTOMER REGISTRATION SUCCESSFUL....!!!!");
               }
            }
        });

    }
}
