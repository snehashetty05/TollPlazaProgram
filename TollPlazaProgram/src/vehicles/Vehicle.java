package vehicles;

public class Vehicle {
	public int id;
	public String type;
	public int fare;
	Vehicle(){
		
	}
	public Vehicle(String type,int fare){
		this.type =type;
		this.fare=fare;
		System.out.println("Vehicle Type ="+ type +"\n" +"Vehicle Fare="+ fare);
	}
	
	
}
