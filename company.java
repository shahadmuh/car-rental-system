import java.util.*;
public class company{
static Scanner console=new Scanner (System.in);
public static car[] allCars=new car[50];
public static void main (String[] args){
int choice;
do {
System.out.println("Enter the number you want :");
System.out.println("1. Add a new car. ");
System.out.println("2. lend a car.");
System.out.println("3. Return a car.");
System.out.println("4. Print number of all cars.");
System.out.println("5. Print number of rented cars.");
System.out.println("6. Print the info of a spicific car.");
System.out.println("7. Print the info of all cars.");
System.out.println("8. Print the info of all crs of a given color.");
System.out.println("9. Print the info of all the cars of a given price.");
System.out.println("10. Exit.");
choice=console.nextInt();

switch (choice){
case 1:{
System.out.println("Enter you ID number: ");
int id=console.nextInt();
System.out.println("Enter the Model: ");
String model=console.next();
System.out.println("Enter the Color: ");
String color=console.next();
System.out.println("Enter the Price: ");
double price=console.nextDouble();
System.out.println("Is it available(true) or rented(false)? ");
boolean ava=console.nextBoolean();

boolean check=addCar(id,model,color,price,ava);

if (check==true)
System.out.println("The car is added successfully");
else
System.out.println("The car in not added successfully");

break;}
case 2: {
System.out.println("Enter your ID number: ");
int id=console.nextInt();
boolean lend=isFound(id);

if (lend)
System.out.println("You can Lend a car.");
else
System.out.println("You can not Lend a car.");
break;}
case 3: {
System.out.println("Enter your ID number: ");
int id=console.nextInt();

boolean retun=isFound(id);
if (retun)
System.out.println("You can Return the car");
else
System.out.println("You can not Return the car");
break;}
case 4: {
System.out.println("The number of all Cars is: "+car.numAllCars);
break;}
case 5: {
System.out.println("The number of all Rented Cars is : "+car.numRented);
break;}
case 6: {
System.out.println("Enter your ID number: ");
int id=console.nextInt();
for (int f=0;f<allCars.length;f++)
if (allCars[f].getID()==(id))
allCars[f].printCar();
else 
System.out.println("The car is not found");
break;}
case 7: {
printAll();
break;}
case 8:{
System.out.println("Enter the color of the car: ");
String color=console.next();
print(color);
break;}
case 9: {
System.out.println("Enter the Price of the car: ");
double price=console.nextDouble();
print(price);
break;}
}
}while (choice!=10);


}





public static boolean isFound(int id){
for (int j=0;j<allCars.length;j++){
if (allCars[j].getID()==(id))
return true;}
return false; 
}



public static boolean addCar(int id, String model, String color, double price, boolean ava){

for (int i=0;i<allCars.length;i++){

if ((allCars[i].getID()==(id))&&(allCars[i].getColor().equals(color))&&(allCars[i].getPrice()==(price))&&(allCars[i].getAva()==(ava)))
{
car newCar= new car(id, color,price, ava);

if (ava==true)
car.numAllCars++;
else
car.numRented++;
allCars[car.numAllCars]=newCar;
return false;}


}
return true;}

public static void printAll(){
for (int s=0;s<allCars.length;s++)
allCars[s].printCar();
}

public static void print(String color){
for (int e=0;e<allCars.length;e++)
if (allCars[e].getColor().equals(color))
allCars[e].printCar();
}
public static void print(double price){
for (int q=0;q<allCars.length;q++)
if (allCars[q].getPrice()==(price))
allCars[q].printCar();}}