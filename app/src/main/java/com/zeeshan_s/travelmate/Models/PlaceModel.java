package com.zeeshan_s.travelmate.Models;

public class PlaceModel {
   public String name,location;
   public int placeImg;


   public PlaceModel(String name, String location, int placeImg) {
      this.name = name;
      this.location = location;
      this.placeImg = placeImg;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getLocation() {
      return location;
   }

   public void setLocation(String location) {
      this.location = location;
   }

   public int getPlaceImg() {
      return placeImg;
   }

   public void setPlaceImg(int placeImg) {
      this.placeImg = placeImg;
   }
}
