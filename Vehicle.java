package  classes;

public class Vehicle{
	private int VehicleNumber;
	private String vName;
    private String vehicleColor;
	
	public void setVehicleNumber(int VehicleNumber)
    {
        this.VehicleNumber=VehicleNumber;
    }
    public void setVname(String vName)
    {
        this.vName=vName;
    }
    public void setVehicleColor(String vehicleColor)
    {
        this.vehicleColor=vehicleColor;
    }
    public int getVehicleNumber()
    {
        return VehicleNumber;
    }
    public String getVname()
    {
        return vName;
    }
    public String getVehicleColor()
    {
        return vehicleColor;
    }

    public void showInfo(){
		System.out.println("Vehicle Number: " + getVehicleNumber());
		System.out.println("Vehicle Name: " + getVname());
		System.out.println("Vehicle Color: " + getVehicleColor());
	}
}