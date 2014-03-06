package chapter8;

public class Q4_Vehicle_Car extends Q4_Vehicle{
	public Q4_Vehicle_Car(){
		spotsNeeded = 1;
		size = VehicleSize.Compact;
	}

	@Override
	public boolean canFitInSpot(Q4_ParkingSpot spot) {
		// TODO Auto-generated method stub
		return false;
	}
}