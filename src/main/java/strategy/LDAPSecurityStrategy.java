package strategy;

public class LDAPSecurityStrategy implements SecurityStrategy {

    public void performOperation() {
        System.out.println("Performing LDAP security");
    }
}
