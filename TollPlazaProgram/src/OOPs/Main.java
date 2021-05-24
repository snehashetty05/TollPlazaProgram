package OOPs;

import java.util.Scanner;

import vehicles.*;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Please choose the option:");
		System.out.println("1.Toll Collector \n3.Toll Operator");
		Scanner sc=new Scanner(System.in);
		int UserIn = sc.nextInt();
		switch(UserIn) {
		 	case 1:
		        tollCollector();
		        break;
		      case 2:
		        System.out.println("Tuesday");
		        break;
		      
		}
		
	}
	static void tollCollector() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Toll Booth id:");
		int tollId = sc.nextInt();
		System.out.println("1.Collect Vehicle Fare \n2.Total Fare");
		int option = sc.nextInt();
		switch(option) {
		  case 1:
	        vehicleCollector(tollId);
	        break;
	      case 2:
	        System.out.println("Tuesday");
	        break;
		}
	}
	private static void vehicleCollector(int id) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Toll Booth " + id );
		System.out.println("Choose the Vehicle type:");
		System.out.println("1.Bus\n2.Truck\n3.Car\n4.Bike\n5.Scooter");
		int vehicleId = sc.nextInt();
		switch(vehicleId) {
		  case 1:
			  Bus bus =new Bus();
	        break;
	      case 2:
	    	  Truck truck =new Truck();
	        break;
	      case 3:
			  Car car =new Car();
	        break;
	      case 4:
	    	  Bike bike =new Bike();
	        break;
	      case 5:
			  Scooter scooter =new Scooter();
	        break;
		}
	}

}
