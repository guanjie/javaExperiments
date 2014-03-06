package chapter8;

public class Q4_ParkingSpot {

	private Q4_Vehicle vehicle;
	private VehicleSize spotSize;
	private int row;
	private int spotNumber;
	private Q4_Level level;
	
	public Q4_ParkingSpot(Q4_Level lv1, int r, int n, VehicleSize s){
		
	}
	
	public boolean isAvailable(){
		return this.vehicle == null;
	}
	
	public boolean canFitVehicle(Q4_Vehicle vehicle){
		return false;
		
	}
	
	public boolean park(Q4_Vehicle v){
		return false;
		
	}
	
	public int getRow(){
		return row;
	}
	
	public int getSpotNumber(){
		return spotNumber;
	}
	
	//Remove vehicle from spots, and notify level that a new spot is available.
	public void removeVehicle(){
		
	}
}
