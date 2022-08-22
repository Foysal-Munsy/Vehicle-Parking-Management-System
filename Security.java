package  classes;

public class Security{
	private int securityId;
	private String securityName;
	
	public void setSecurityId(int securityId){
        this.securityId = securityId;
    }
	public void setSecurityName(String securityName){
        this.securityName = securityName;
    }
	
	public int getSecurityId(){
        return securityId;
    } 
	public String getSecurityName(){
        return securityName;
    }

    public void showInfo(){
		System.out.println("Security ID: " + getSecurityId());
		System.out.println("Security Name: " + getSecurityName());
	}
}