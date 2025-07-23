package com.springcore;

public class Car {
   private String carName;
   private int carModalYear;
   private String carColor;

   public Car() {
	super();
}

public Car(String carName, int carModalYear, String carColor) {
	super();
	this.carName = carName;
	this.carModalYear = carModalYear;
	this.carColor = carColor;
}

public String getCarName() {
	return carName;
}

public void setCarName(String carName) {
	this.carName = carName;
}

public int getCarModalYear() {
	return carModalYear;
}

public void setCarModalYear(int carModalYear) {
	this.carModalYear = carModalYear;
}

public String getCarColor() {
	return carColor;
}

public void setCarColor(String carColor) {
	this.carColor = carColor;
}

@Override
public String toString() {
	return "Car [carName=" + carName + ", carModalYear=" + carModalYear + ", carColor=" + carColor + "]";
}
     
}
