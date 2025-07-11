package vehicle;                //package
import java.util.Scanner;      //import java scanner

class car{
private String model;        //private variables
private int year;
private double price;

{  //initializer block
System.out.println("Initializing");
}

public car(String model, int year, double price){         //parameterized constructor that initializes the variables
this.model = model;
this.year = year;
this.price = price;
}

public void displayDetails(){       //method to show car details

int wholePrice = (int)price;        //cast the price to int

System.out.println("Car model " + model);
System.out.println("Car year " + year);
System.out.println("Car price: R" + wholePrice);
}

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);      //crreating an instance of the scanner class

System.out.println("Enter car model:");
String model = scanner.nextLine();           //using the scanner object to ask the user details about their car

System.out.println("Enter car year");
int year = scanner.nextInt();

System.out.println("Enter car price");
double price = scanner.nextDouble();

car mycar = new car(model,year,price);              //creating an instance of class car
mycar.displayDetails();                            //calling the displayDetails method

scanner.close();               //closing the scanner  
}
}
