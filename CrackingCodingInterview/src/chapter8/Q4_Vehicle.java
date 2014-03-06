package chapter8;

import java.util.ArrayList;

public abstract class Q4_Vehicle {
	protected ArrayList<Q4_ParkingSpot> parkingSpots = new ArrayList<Q4_ParkingSpot>();
	protected String licensePlate;
	protected int spotsNeeded;
	protected VehicleSize size;
	
	public int getSpotsNeeded()	{
		return spotsNeeded;
	}
	
	public VehicleSize getSize(){
		return this.size;
	}
	
	public void parkingInSpot(Q4_ParkingSpot s){
		parkingSpots.add(s);
	}
	
	public void clearSpots(){
		
	}
	
	//abstract, needs every type be clear his responsibility.
	public abstract boolean canFitInSpot(Q4_ParkingSpot spot);
	
}







