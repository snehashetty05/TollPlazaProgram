package OOPs;

import java.util.*;

import vehicles.*;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> intFare = new ArrayList<Integer>();
		ArrayList<Integer> tollBooth = new ArrayList<Integer>();
		tollBooth.add(0);
		tollBooth.add(0);
		tollBooth.add(0);
		tollBooth.add(0);
		while (true) {
			System.out.println("Please choose the option:");
			System.out.println("1.Toll Collector \n2.Toll Operator\n3.Exit");
			Scanner sc = new Scanner(System.in);
			int UserIn = sc.nextInt();
			switch (UserIn) {
			case 1:
				intFare = tollCollector(tollBooth);
				break;
			case 2:
				int finalFare = getTotalFare(intFare,4);
				System.out.println("Total Fare collected from all tollbooth : " + finalFare);
				break;
			case 3:
				System.out.println("Program terminated ...");
				return;
			}
		}

	}

	private static int getTotalFare(ArrayList<Integer> intFare,int n) {
		int sum =0;
		for(int i=0;i<n;i++) {
			sum = sum + intFare.get(i);
		}
		return sum;
	}

	private static ArrayList<Integer> tollCollector(ArrayList<Integer> tollBooth) {
		Scanner sc = new Scanner(System.in);
		int intFare = 0;
		System.out.println("Choose your tollbooth:");
		System.out.println("1.Tollbooth 1\n2.Tollbooth 2\n3.Tollbooth 3\n4.Tollbooth 4");
		int fare =0;
		int tollId = sc.nextInt();
		while (true) {
			System.out.println("1.Collect Vehicle Fare \n2.Total Fare\n3.Exit");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				intFare = vehicleCollector(tollId,tollBooth ,fare);
				tollBooth.set(tollId-1,intFare);
				break;
			case 2:
				System.out.println("Total fare collected :" + tollBooth.get(tollId-1));
				break;
			case 3:
				System.out.println("Out from Tollbooth " + tollId);
				
				return tollBooth;
			}
		}
	}

	private static int vehicleCollector(int id, ArrayList<Integer> tollBooth,int fare) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Toll Booth " + id);
		while (true) {
			System.out.println("Choose the Vehicle type:");
			System.out.println("1.Bus\n2.Truck\n3.Car\n4.Bike\n5.Scooter\n6.Exit");
			int vehicleId = sc.nextInt();
			switch (vehicleId) {
			case 1:
				Bus bus = new Bus();
				fare = fare + bus.fare;
				tollBooth.set(id - 1, fare);
				System.out.println("Total fare collected :" + tollBooth.get(id - 1));
				break;
			case 2:
				Truck truck = new Truck();
				fare = fare + truck.fare;
				tollBooth.set(id - 1, fare);
				System.out.println("Total fare collected :" + tollBooth.get(id - 1));
				break;
			case 3:
				Car car = new Car();
				fare = fare + car.fare;
				tollBooth.set(id - 1, fare);
				System.out.println("Total fare collected :" + tollBooth.get(id - 1));
				break;
			case 4:
				Bike bike = new Bike();
				fare = fare + bike.fare;
				tollBooth.set(id - 1, fare);
				System.out.println("Total fare collected :" + tollBooth.get(id - 1));
				break;
			case 5:
				Scooter scooter = new Scooter();
				fare = fare + scooter.fare;
				tollBooth.set(id - 1, fare);
				System.out.println("Total fare collected :" + tollBooth.get(id - 1));
				break;
			case 6:
				System.out.println("Out from Taking fare from Vehicle");
				return tollBooth.get(id - 1);
			}
		}
	}

}
