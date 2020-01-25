package com.example.carrental;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class CarListView extends AppCompatActivity {

    List<Car> carList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_list_view);

        carList = new ArrayList<>();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 89f82ab71ea2e2785e05bfb251933bd31be4b49e
        carList.add(new Car("Volkswagen","Jetta","Bora A4","Grey","2018","ABC146","$79/day",R.drawable.volkswagenjetta));
        carList.add(new Car("Nissan","Rouge","SL AWD","Red","2017","XYZ596","$65/day",R.drawable.nissanslawd));
        carList.add(new Car("Hyundai","Venue","SX+","Blue","2019","ABC146","$75/day",R.drawable.venue));
        carList.add(new Car("Hyundai","Elantra","SEL","White","2019","SUB146","$88/day",R.drawable.hyundaiielantra));
        carList.add(new Car("Subaru","Legacy","Sedan AWD","Green","2018","ALU146","$70/day",R.drawable.subarulegacy));
        carList.add(new Car("Toyota","Corolla","XLE","Black","2018","FAL146","$80/day",R.drawable.toyotacorolla));
        carList.add(new Car("Ford","Ranger","XLT Super cab","White","2018","XYZ566","$78/day",R.drawable.fordranger));
        carList.add(new Car("BMW","2 series","S5","White","2018","AWD546","$115/day",R.drawable.bmw5series));
        carList.add(new Car("BMW","3 series","I8","White","2018","YGD876","$120/day",R.drawable.bmwi8));
        carList.add(new Car("BMW","Creta","SX Diesel","White","2018","WDC646","$79/day",R.drawable.bmw));
        carList.add(new Car("Mercedes","Benz","SX Diesel","Silver","2018","KJY346","$150/day",R.drawable.mercedesbenz));
        carList.add(new Car("Alfa","Romeo","Romeo 4C","Black","2019","BGJ846","$100/day",R.drawable.alfa));
        carList.add(new Car("Mercedes","Benz","Benz S1","white","2017","XUL746","$129/day",R.drawable.mercedessl));
        carList.add(new Car("BMW","2 Series","C ClassX Diesel","Red","2015","KUL646","$110/day",R.drawable.bmwx5));
        carList.add(new Car("Mercedes","Benz","C Class","Blue","2018","GUA746","$145/day",R.drawable.mbenzcclass));
        carList.add(new Car("Infiniti","Coupe","SX Diesel","White","2017","FAZ346","$67/day",R.drawable.infiiticpoupe));
        carList.add(new Car("Nissan","Rouge","SL AWD","Black","2019","TAT156","$77/day",R.drawable.nissanslawd));
<<<<<<< HEAD
=======
=======
        carList.add(new Car("Volkswagen","Jetta","Bora A4","Grey","2018","ABC146",R.drawable.volkswagenjetta));
        carList.add(new Car("Nissan","Rouge","SL AWD","Red","2017","XYZ596",R.drawable.nissanslawd));
        carList.add(new Car("Hyundai","Venue","SX+","Blue","2019","ABC146",R.drawable.venue));
        carList.add(new Car("Hyundai","Elantra","SEL","White","2019","SUB146",R.drawable.hyundaiielantra));
        carList.add(new Car("Subaru","Legacy","Sedan AWD","Green","2018","ALU146",R.drawable.subarulegacy));
        carList.add(new Car("Toyota","Corolla","XLE","Black","2018","FAL146",R.drawable.toyotacorolla));
        carList.add(new Car("Ford","Ranger","XLT Super cab","White","2018","XYZ566",R.drawable.fordranger));
        carList.add(new Car("BMW","2 series","S5","White","2018","AWD546",R.drawable.bmw5series));
        carList.add(new Car("BMW","3 series","I8","White","2018","YGD876",R.drawable.bmwi8));
        carList.add(new Car("BMW","Creta","SX Diesel","White","2018","WDC646",R.drawable.bmw));
        carList.add(new Car("Mercedes","Benz","SX Diesel","Silver","2018","KJY346",R.drawable.mercedesbenz));
        carList.add(new Car("Alfa","Romeo","Romeo 4C","Black","2019","BGJ846",R.drawable.alfa));
        carList.add(new Car("Mercedes","Benz","Benz S1","white","2017","XUL746",R.drawable.mercedessl));
        carList.add(new Car("BMW","2 Series","C ClassX Diesel","Red","2015","KUL646",R.drawable.bmwx5));
        carList.add(new Car("Mercedes","Benz","C Class","Blue","2018","GUA746",R.drawable.mbenzcclass));
        carList.add(new Car("Infiniti","Coupe","SX Diesel","White","2017","FAZ346",R.drawable.infiiticpoupe));
        carList.add(new Car("Nissan","Rouge","SL AWD","Black","2019","TAT156",R.drawable.nissanslawd));
>>>>>>> 536c863dffefa4a0aceedbc22dddef878cfbf28e
>>>>>>> 89f82ab71ea2e2785e05bfb251933bd31be4b49e


        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        CarAdapter mAdapter = new CarAdapter(this,carList);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(mAdapter);



    }
}
