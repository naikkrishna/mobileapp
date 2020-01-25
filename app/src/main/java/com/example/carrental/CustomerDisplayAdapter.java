package com.example.carrental;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

    public class CustomerDisplayAdapter extends RecyclerView.Adapter<com.example.carrental.CustomerDisplayAdapter.ViewHolder> {

        private LayoutInflater inflater;
        private android.view.View View;

        CustomerDisplayAdapter (Context context)
        {
            this.inflater=LayoutInflater.from(context);
        }
        @NonNull
        @Override
        public com.example.carrental.CustomerDisplayAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = inflater.inflate(R.layout.cardviewcustlist,parent,false);
            return new com.example.carrental.CustomerDisplayAdapter.ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull com.example.carrental.CustomerDisplayAdapter.ViewHolder holder, int position) {
            Customer customer=CustomerRepo.getInstance().getCustomers().get(position);

            holder.Firstname.setText(customer.firstname);
            holder.Username.setText((customer.username));

        }

        @Override
        public int getItemCount() {
            return CustomerRepo.getInstance().getCustomers().size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            public TextView Firstname;
            public TextView Username;

            public ViewHolder(@NonNull View itemView) {

                super(itemView);
                Firstname=itemView.findViewById(R.id.tvfname);
                Username=itemView.findViewById(R.id.tvemail);

            }
        }
    }

