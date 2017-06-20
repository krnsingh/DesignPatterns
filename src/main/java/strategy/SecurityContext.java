package strategy;

public class SecurityContext {

    SecurityStrategy securityStrategy;

    public void setSecurityStrategy(SecurityStrategy securityStrategy) {
        this.securityStrategy = securityStrategy;
    }

    public void performSecurityCheck() {
        securityStrategy.performOperation();
    }

}
