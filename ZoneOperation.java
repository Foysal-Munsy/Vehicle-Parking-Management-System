package interfaces;
import classes.*;
public interface ZoneOperation{
    void addToPark(Vehicle v);
	void removeFromPark(Vehicle v);
	Vehicle getVname(String vName);
	void showAllVehicles();
}