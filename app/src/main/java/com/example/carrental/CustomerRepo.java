package com.example.carrental;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CustomerRepo {
    //SINGLETON PATTERN
    private static  CustomerRepo instance = null;
    private List<Customer> customers = new ArrayList<>();

    private CustomerRepo() //constructor
    {
        Customer cust = new Customer();
        cust.firstname = "Lilu";
        cust.lastname= "Odedra";
        cust.username = "Liluodedra13@gmail.com";
        cust.Password = "LLL";
        this.customers.add(cust);
    }


    public static CustomerRepo getInstance() //Method
    {
        if (instance == null) {
            instance = new CustomerRepo();
        }
        return instance;
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public List<Customer> getCustomers() {
        return this.customers;
    }

}
