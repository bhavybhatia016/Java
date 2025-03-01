package Day_1_FUNCTIONS;
import package1.A;
import package2.B;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inside Class A:");
        A objA = new A();
        objA.testAccess();
        
        System.out.println("\nInside Class B (Subclass):");
        B objB = new B();
        objB.testAccess();

        System.out.println("\nAccessing from Main:");
        // System.out.println(objA.privateVar); ❌ Not accessible
        // System.out.println(objA.defaultVar); ❌ Not accessible
        // System.out.println(objA.protectedVar); ❌ Not accessible
        System.out.println("Public Variable from A: " + objA.publicVar); // ✅ Accessible

        // objA.privateMethod(); ❌ Not accessible
        // objA.defaultMethod(); ❌ Not accessible
        // objA.protectedMethod(); ❌ Not accessible
        objA.publicMethod(); // ✅ Accessible
    }
}
