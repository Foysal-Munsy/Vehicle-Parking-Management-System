package  classes;
import interfaces.*;

public class Parking implements ZoneOperation,SecurityOperation {
	private Vehicle vehicles[] = new Vehicle [100];
	private Security securitys[] = new Security [10];
	
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
			System.out.println("added");
		}
		else{
			System.out.println("Can not add");
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
            System.out.println("removed");
        }
		else{
            System.out.println("Can Not Remove");
        }
	}
	public void showAllVehicles(){
		System.out.println("--------------------");
		for(int i=0; i<vehicles.length; i++){
			if(vehicles[i] != null){
				System.out.println("------------------");
				vehicles[i].showInfo();
				System.out.println("------------------");
				System.out.println();
			}
			else{
				System.out.println("------------------");
				System.out.println("There is no vehicles in parking["+i+"]");
			
		}
		System.out.println("--------------------");
	}
}
	public Vehicle getVname(String vName){
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
			System.out.println("vehicles Found");
		}
		else{
			System.out.println("vehicle Not Found");
		}
		return v;
	}
	
	public void addSecurity(Security s){
		int flag = 0;
		for( int i=0; i<securitys.length; i++){
			if(securitys[i] == null){
				securitys[i] = s;
				flag = 1;
				break;
			}
		}
		if(flag == 1){
			System.out.println("Security added");
		}
		else{
			System.out.println("Can Not add");
		}
	}
	
	public void removeSecurity(Security s){
		int flag = 0;
		for(int i=0; i<securitys.length; i++){
			if(securitys[i] == s){
				securitys[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){
            System.out.println("Security removed");
        }
		else{
            System.out.println("Can Not remove");
        }
	}
	public void showAllSecuirty()
	{
		System.out.println();
		for(int i=0; i<vehicles.length; i++){
			if(securitys[i] != null){
				System.out.println("------------------");
				securitys[i].showInfo();
				System.out.println("------------------");
				System.out.println();
			}
			else{
				System.out.println("------------------");
				System.out.println("There is no Security in Securitys["+i+"]");
			
		}
		System.out.println();
	}
}
	public Security getSecurityId(int securityId){
		Security s = null;
		
		for(int i=0; i<securitys.length; i++){
			if(securitys[i] != null){
				if(securitys[i].getSecurityId() == securityId){
					s = securitys[i];
					break;
				}
			}
		}
		if(s != null){
			System.out.println("Security Found");
		}
		else{
			System.out.println("Security Not Found");
		}
		return s;
	}
}
