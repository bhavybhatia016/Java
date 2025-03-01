package package1;

public class A {
    private int privateVar = 10;
    int defaultVar = 20;  // Default (No modifier)
    protected int protectedVar = 30;
    public int publicVar = 40;

    private void privateMethod() {
        System.out.println("Private Method: " + privateVar);
    }

    void defaultMethod() {
        System.out.println("Default Method: " + defaultVar);
    }

    protected void protectedMethod() {
        System.out.println("Protected Method: " + protectedVar);
    }

    public void publicMethod() {
        System.out.println("Public Method: " + publicVar);
    }

    public void testAccess() {
        // All members are accessible inside the same class
        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
    }
}
