package interfaces;
import classes.*;
public interface SecurityOperation{
	void addSecurity(Security s);
	void removeSecurity(Security s);
	Security getSecurityId(int securityId);
	void showAllSecuirty();
}