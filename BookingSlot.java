package  classes;
import interfaces.*;

public class BookingSlot implements FeaturesOperation{
	protected Vehicle vehicles[] = new Vehicle [100];
		
	public void addToPark(Vehicle v){
		int flag = 0;
		for(int i=0; i<vehicles.length; i++){
			if(vehicles[i] == null){
				vehicles[i] = v;
				flag = 1;
				break;
			}
		}
		if(flag == 1){
			System.out.println("Added to Parking Spot");
		}
		else{
			System.out.println("Can Not Add to Parking Spot");
		}
	}
	
	public void removeFromPark(Vehicle v){
		int flag = 0;
		for(int i=0; i<vehicles.length; i++){
			if(vehicles[i] == v){
				vehicles[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){
			System.out.println("Leave from Spot");
		}
		else{
			System.out.println("Can Not Remove from Spot");
		}
	}
	public void showAllVehicles(){
		for(Vehicle v : vehicles){
			if(v != null){
				v.showInfo();
			}
		}
	}
	public Vehicle getVehicle(String vName){
		Vehicle v = null;
		
		for(int i=0; i<vehicles.length; i++){
			if(vehicles[i] != null){
				if(vehicles[i].getVname().equals(vName)){
					v = vehicles[i];
					break;
				}
			}
		}
		if(v != null){
			System.out.println("Vehicle Found");
		}
		else{
			System.out.println("Vehicle Not Found");
		}
		return v;
	} 
}
