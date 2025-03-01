package package2;
import package1.A;

public class B extends A {
    public void testAccess() {
        // System.out.println("Private Variable: " + privateVar); ❌ Not accessible
        // System.out.println("Default Variable: " + defaultVar); ❌ Not accessible
        System.out.println("Protected Variable: " + protectedVar); // ✅ Accessible (via inheritance)
        System.out.println("Public Variable: " + publicVar); // ✅ Accessible

        // privateMethod(); ❌ Not accessible
        // defaultMethod(); ❌ Not accessible
        protectedMethod(); // ✅ Accessible (via inheritance)
        publicMethod(); // ✅ Accessible
    }
}
