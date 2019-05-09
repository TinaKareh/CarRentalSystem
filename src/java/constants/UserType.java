
package constants;


public enum UserType {
    
    AD("Admin"),
    CU("Customer");
    
    private final String uType;

    private UserType(String uType) {
        this.uType = uType;
    }

    public String getuType() {
        return uType;
    }
}
