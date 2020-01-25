package com.example.carrental;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
public class ReservationRepo extends AppCompatActivity{
        private static ReservationRepo instace=null;
        private List<Reservation> reservationList=new ArrayList<>();

        private ReservationRepo()
        {
            reservationList.add(new Reservation("Hyundai","Creta","SX Diesel","White","2018",
                    "ABC146","$79/day",R.drawable.hyundaicreta,"02/22/2018","02/24/2018"));
        }


        public static ReservationRepo getInstance()
        {
            if(instace==null)
            {
                instace=new ReservationRepo();
            }
            return instace;
        }
        public void addReservation(Reservation reservation)
        {
            this.reservationList.add(reservation);
        }
        public  List<Reservation> getReservationList()
        {
            return this.reservationList;
        }

}
