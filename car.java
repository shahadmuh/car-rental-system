public class car {
private int id;
private String model;
private String color;
private double price;
private boolean ava;
public static int numAllCars;
public static int numRented;
public car(){
id=0;
model="";
color="";
price=0;
ava=true;
numAllCars=0;
numRented=0;}
public car(int idd,String colorr,double pricee, boolean avaa){
id=idd;
color=colorr;
price=pricee;
ava=avaa;}
public void printCar(){
System.out.println("The Owner's ID is: "+id);
System.out.println("The Model of the car is: "+model);
System.out.println("The Color of the car is: "+color);
System.out.println("The Price of the car is: "+price);
System.out.println("The Availabiltilt of the car is: (true:available)(false:rented) "+ava);
}
public void setAva(boolean avaa){
ava=avaa;}
public boolean getAva(){
return ava;}
public String getColor(){
return color;}
public double getPrice(){
return price;}
public int getID(){
return id; }
}