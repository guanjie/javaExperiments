package chapter8;

public class Q4_Vehicle_Bus extends Q4_Vehicle{
	public Q4_Vehicle_Bus(){
		spotsNeeded = 5;
		size = VehicleSize.Large;
	}
	
	
	@Override 
	//Checking whether the spot is compact or large
	public boolean canFitInSpot(Q4_ParkingSpot spot) {
		if(this.size!=(VehicleSize.Large)){
			return false;
		} return true;
	}
	
}