package chapter8;

public class Q4_Level {

	private int floor;
	private Q4_ParkingSpot[] spots;
	private int availableSpots = 0;
	private static final int SPOTS_PER_ROW = 10;
	
	public Q4_Level(int flr, int numberSpots){
		this.floor = flr;
		this.availableSpots = numberSpots;
	}
	
	public int availableSpots(){
		return availableSpots;
	}
	
	public boolean parkVehicle(Q4_Vehicle vehicle){
		return false;
		//Find a place to park this vehicle. 
	}
	
	private int findAvailableSpots(Q4_Vehicle vehicle){
		return availableSpots;
		
	}
	
	public void spotFreed(){
		
	}
}
