package strategy;

public class Client {

    public static void main(String[] args) {
        SecurityContext securityContext = new SecurityContext();
        SecurityStrategy securityStrategy;
        if (true) {
            securityStrategy = new OauthSecurityStrategy();
        } else {
            securityStrategy = new LDAPSecurityStrategy();
        }
        securityContext.setSecurityStrategy(securityStrategy);
        securityContext.performSecurityCheck();
    }
}
