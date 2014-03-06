package chapter8;

public class Q4_Vehicle_Motorcycle extends Q4_Vehicle {
	public Q4_Vehicle_Motorcycle(){
		spotsNeeded = 1;
		size = VehicleSize.Motorcycle;
	}

	@Override
	public boolean canFitInSpot(Q4_ParkingSpot spot) {
		// TODO Auto-generated method stub
		return false;
	}
	
}