package com.example.carrental;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.MyViewHolder> {


    private Context mContext;
    private List<Car> mData;

    public CarAdapter(Context mContext, List<Car> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        final Intent intent = new Intent(mContext,Car_Activity.class);
        holder.tvCarBrand.setText(mData.get(position).getBrand());
        holder.tvCarName.setText(mData.get(position).getType());
        holder.tvPrice.setText(mData.get(position).getPrice());
        holder.CarImg.setImageResource(mData.get(position).getImage());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                intent.putExtra("Brand",mData.get(position).getBrand());
                intent.putExtra("Type",mData.get(position).getType());
                intent.putExtra("Model",mData.get(position).getModel());
                intent.putExtra("Color",mData.get(position).getColor());
                intent.putExtra("Year",mData.get(position).getYear());
                intent.putExtra("License_Plate",mData.get(position).getLicensePlate());
                intent.putExtra("Price",mData.get(position).getPrice());
                intent.putExtra("Image",mData.get(position).getImage());
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends  RecyclerView.ViewHolder{

        TextView tvCarBrand;
        TextView tvCarName;
        TextView tvPrice;
        ImageView CarImg;
        CardView cardView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvCarBrand = (TextView) itemView.findViewById(R.id.Car_brand);
            tvCarName = (TextView) itemView.findViewById(R.id.Car_type);
            tvPrice = (TextView) itemView.findViewById(R.id.Price);
            CarImg = (ImageView) itemView.findViewById(R.id.Car_img);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);
        }
    }
}

