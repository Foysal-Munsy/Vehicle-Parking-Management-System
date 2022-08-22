package interfaces;
import classes.*;
public interface FeaturesOperation{
	void addToPark(Vehicle v);
	void removeFromPark(Vehicle v);
	Vehicle getVehicle (String vName);
	void showAllVehicles();
	
}