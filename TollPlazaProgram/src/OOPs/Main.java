package OOPs;

import java.util.*;

import vehicles.*;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("************** TOLL PLAZA PROGRAM **************");
		
		ArrayList<Integer> intFare = new ArrayList<Integer>();
		ArrayList<Integer> tollBooth = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		//considering 4 tollbooths and initializing it
		
		tollBooth.add(0);
		tollBooth.add(0);
		tollBooth.add(0);
		tollBooth.add(0);
		
		while (true) {
			System.out.println();
			System.out.println("Please choose your Role:");
			System.out.println();
			
			System.out.println("1.Toll Collector \n2.Toll Operator\n3.Exit");
			int UserIn = sc.nextInt();
			
			switch (UserIn) {
			case 1:
				intFare = tollCollector(tollBooth);      //call the function of toll collector who can collect the fare in tollbooth 
				break;
			case 2:
				int finalFare = getTotalFare(intFare,4);            //call the function for toll operator who can view the total sum from all the tollbooths. 
				System.out.println("\nTotal Fare collected from all TollBooth : " + finalFare);
				break;
			case 3:
				System.out.println("\n**********Program terminated ...**********\n");  
				return;
			default:
				System.out.println("\n invalid response \n");
				break;
			}
		}

	}
	
	// Method to return the total Fare collected from all the toll booths
	
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
		int fare =0;
		
		System.out.println("\nIn this toll plaza, there are total 4 Toll Booths!!!\n");
		System.out.println("Choose your tollbooth:");
		System.out.println("1.Tollbooth 1\n2.Tollbooth 2\n3.Tollbooth 3\n4.Tollbooth 4");
		int tollId = sc.nextInt();
		
		while (true) {
			System.out.println("\n*********** Welcome to Toll Booth " + tollId + " **********");
			System.out.println("\n Choose your option:\n");
			System.out.println("1.To Collect Vehicle Fare \n2.To View the Total Fare Collected \n3.Exit");
			int option = sc.nextInt();
			
			switch (option) {
			case 1:
				intFare = vehicleCollector(tollId,tollBooth ,fare);
				tollBooth.set(tollId-1,intFare);
				break;
			case 2:
				System.out.println("\nTotal fare collected in Toll Booth " + tollId +" :" + tollBooth.get(tollId-1));
				break;
			case 3:
				System.out.println("\n*********** Log Out from Tollbooth " + tollId + " ***********");
				return tollBooth;
			default:
				System.out.println("\n invalid response \n");
				break;
			}
		}
	}

	private static int vehicleCollector(int id, ArrayList<Integer> tollBooth,int fare) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nToll Booth " + id);
		while (true) {
			System.out.println("\nChoose the Vehicle type:\n");
			System.out.println("1.Bus\n2.Truck\n3.Car\n4.Bike\n5.Scooter\n6.Exit");
			int vehicleId = sc.nextInt();
			switch (vehicleId) {
			case 1:
				Bus bus = new Bus();
				fare = fare + bus.fare;
				tollBooth.set(id - 1, fare);
				System.out.println("\nTotal fare collected :" + tollBooth.get(id - 1));
				break;
			case 2:
				Truck truck = new Truck();
				fare = fare + truck.fare;
				tollBooth.set(id - 1, fare);
				System.out.println("\nTotal fare collected :" + tollBooth.get(id - 1));
				break;
			case 3:
				Car car = new Car();
				fare = fare + car.fare;
				tollBooth.set(id - 1, fare);
				System.out.println("\nTotal fare collected :" + tollBooth.get(id - 1));
				break;
			case 4:
				Bike bike = new Bike();
				fare = fare + bike.fare;
				tollBooth.set(id - 1, fare);
				System.out.println("\nTotal fare collected :" + tollBooth.get(id - 1));
				break;
			case 5:
				Scooter scooter = new Scooter();
				fare = fare + scooter.fare;
				tollBooth.set(id - 1, fare);
				System.out.println("\nTotal fare collected :" + tollBooth.get(id - 1));
				break;
			case 6:
				System.out.println("\n*********** Out from collecting fare from Vehicle ************\n");
				return tollBooth.get(id - 1);
			default:
				System.out.println("\n invalid response \n");
				break;
			}
		}
	}

}
