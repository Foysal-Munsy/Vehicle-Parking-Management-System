import classes.*;
import java.util.Scanner; 
import fileio.*;

public class Start{
	public static void main(String args[]){

		System.out.println("/////__Welcome to Aiub Vehicle Parking Management System__/////");
		boolean choice = true;
		Scanner sc = new Scanner(System.in);
		Parking p = new Parking(); 
        BookingSlot b = new BookingSlot();  
		MyFile myFile = new MyFile();

		while(choice){
			System.out.println("**********Main Menu**********");
		    System.out.println("    1. Admin");
		    System.out.println("    2. Parking Holder");
		    System.out.println("    3. Exit");
			System.out.print("Select option: ");
			
			int mainOption = sc.nextInt();
			
			switch(mainOption){
				case 1:
					System.out.println("Admin Login: ");
				    System.out.println("Username: "); 
				    String username = sc.next();
				    System.out.println("Password: "); 
				    String password = sc.next(); 

				    if(username.equals("admin") && password.equals("admin")){
                        System.out.println("    Available options for you: \n");
					    System.out.println("	1. Add New security");
					    System.out.println("	2. Remove Existing security");
					    System.out.println("	3. See All security");
                        System.out.println("	4. Add New Vehicle");
                        System.out.println("	5. Remove Existing Vehicle");
                        System.out.println("	6. See All Vehicle");
					    System.out.println("	7. Go Back\n");
					    System.out.print("Select option: ");
					    int adminOption = sc.nextInt();
					
					    switch(adminOption){
						    case 1:
							    System.out.println("Add New security\n");
							    System.out.println("Enter security Id: ");
							    int securityId = sc.nextInt();
							    System.out.println("Enter security Name: ");
							    String securityName = sc.next();
							
							    Security s = new Security();
								s.setSecurityId(securityId);
							    s.setSecurityName(securityName);
								p.addSecurity(s);
								
							break;
							
						    case 2:
							    System.out.println("Remove An Existing Security");
							    System.out.print("Enter Security Id: ");
								p.removeSecurity(p.getSecurityId(sc.nextInt()));
						    break;
							
						    case 3:
							    System.out.println("See All Security");
							    p.showAllSecuirty();	
						    break;
						
                            case 4: 
                                System.out.println("Add New Vehicle\n");
							    System.out.println("Enter Vehicle Number: ");
							    int vNumber = sc.nextInt();
							    System.out.println("Enter Vehicle Name: ");
							    String vName = sc.next();
								System.out.println("Enter Vehicle Color: ");
							    String vehicleColor = sc.next();

							    Vehicle v = new Vehicle();
							    v.setVehicleNumber(vNumber);
							    v.setVname(vName);
								v.setVehicleColor(vehicleColor);
					
							
							    p.addToPark(v);
						    break;

                            case 5: 
                                System.out.println("Remove An Existing Vehicle");
							    System.out.print("Enter Vehicle Name: "); 
							    p.removeFromPark(p.getVname(sc.next()));
						    break;

                            case 6: 
                                System.out.println("See All Vehicles");
								p.showAllVehicles();
						    break;

						    case 7:
							    System.out.println("Going Back.....");
						    break;
						
						    default:
							    System.out.println("Invalid Input");
						    break;
					    }
			        }
				    else{
				        System.out.println("Invalid Credentials!");
				    }            
				break;	
					
				case 2:
				
					System.out.println("<<<<<Welcome to Our Parking>>>>>");
					
					System.out.println("Find Your option :) \n");
					System.out.println("	1. Add to Park");
					System.out.println("	2. Remove from Park");
					System.out.println("	3. Check Car On parking Spot");
					System.out.println("	4. Go Back");
					System.out.println("Select Option: ");
					int bookingOption = sc.nextInt();
					
					switch(bookingOption){
						case 1:
							System.out.println("Add to park");
							System.out.println("Enter vehicle Name: "); 
							String vName = sc.next();
							
							Vehicle v1 = new Vehicle();
							v1.setVname(vName);
							b.addToPark(v1); 
							myFile.writeInFile(vName);
						break;
						
						case 2:
							
							System.out.println("Enter Vehicle Name: ");
							myFile.removeFromFile();
							
						break;
						
						case 3:
							System.out.println("-----Memo-----"); 
							myFile.readFromFile();
							System.out.println("--------------------"); 
							System.out.println("Thank you for Parking here.");
						break;

						case 4:
							System.out.println("Going Back . . .");
						break;
							
						default:
							System.out.println("Invalid Input");
						break;
					}
					
				break;
					
				case 3:
					System.out.println("Thank You!");
					choice = false;
				break;
					
				default:
				
					System.out.println("Invalid Input");
				break;
			}
		}
	}
}
