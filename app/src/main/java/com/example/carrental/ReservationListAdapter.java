package com.example.carrental;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ReservationListAdapter extends RecyclerView.Adapter<ReservationListAdapter.ViewHolder> {

    private LayoutInflater inflater;
    private View View;

    ReservationListAdapter (Context context)
    {
        this.inflater=LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public ReservationListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.cardviewreslist,parent,false);
        return new ViewHolder(View);
    }

    @Override
    public void onBindViewHolder(@NonNull ReservationListAdapter.ViewHolder holder, int position) {
        Reservation reservation=ReservationRepo.getInstance().getReservationList().get(position);

        holder.Brand.setText(reservation.getBrand());
        holder.Model.setText((reservation.getModel()));
        holder.image.setImageResource(reservation.getImage());
    }

    @Override
    public int getItemCount() {
        return ReservationRepo.getInstance().getReservationList().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView Brand;
        public TextView Model;
        public ImageView image;
        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            Brand=itemView.findViewById(R.id.tvBrand);
            Model=itemView.findViewById(R.id.tvModel);
            image=itemView.findViewById(R.id.imagecar);
        }
    }
}
