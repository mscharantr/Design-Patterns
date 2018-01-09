package structural.facade;

public class SecurityCodeCheck {

    static int sai = 2345;
    private int securityCode = 1234;

    public int getSecurityCode() {
        return securityCode;
    }

    public boolean isCodeCorrect(int secCodeToCheck) {

        return secCodeToCheck == getSecurityCode();

    }

}