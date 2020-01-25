package com.example.carrental;
import android.media.Image;
public class Reservation {

        private String Brand;
        private String Type;
        private String Model;
        private String Color;
        private String Year;
        private String LicensePlate;
        private String Price;
        private int Image;
        private String Startdate;
        private String Enddate;


        // public Car(String creta, String hyundai, String sx_diesel, String white, int i, String s) {
        // }

        public Reservation(String brand, String type, String model, String color, String year, String licensePlate,String price,int image,String startdate,String endddate) {
            Type = type;
            Brand = brand;
            Model = model;
            Color = color;
            Year = year;
            LicensePlate = licensePlate;
            Price = price;
            Image = image;
            Startdate=startdate;
            Enddate=endddate;
        }

        public String getType() {
            return Type;
        }

        public String getBrand() {
            return Brand;
        }

        public String getModel() {
            return Model;
        }

        public String getColor() {
            return Color;
        }

        public String getYear() {
            return Year;
        }

        public String getLicensePlate() {
            return LicensePlate;
        }

        public String getPrice(){
            return Price;
        }

        public int getImage() {
            return Image;
        }

         public String getStartdate() {
        return Startdate;
    }
        public String getEnddate() {
        return Enddate;
    }

        public void setType(String type) {
            Type = type;
        }

        public void setBrand(String brand) {
            Brand = brand;
        }

        public void setModel(String model) {
            Model = model;
        }

        public void setColor(String color) {
            Color = color;
        }

        public void setYear(String year) {
            Year = year;
        }

        public void setLicensePlate(String licensePlate) {
            LicensePlate = licensePlate;
        }

        public void setPrice(String price){
            Price = price;
        }

        public void setImage(int image) {
            Image = image;
        }

        public void setStartdate(String startdate) {
        Startdate = startdate;
    }
    public void setEnddate(String enddate) {
        Enddate= enddate
        ;
    }




}
