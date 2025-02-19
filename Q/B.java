// File: Q/B.java
package Q;
import p.A;

public class B extends A {
    public static void main(String[] args) {
        A obj = new A();
        
        // Accessing public method - Allowed
        obj.publicMethod();

        // Accessing protected method - Allowed only through inheritance
        B objB = new B();
        objB.protectedMethod();  // Allowed because B extends A

        // Accessing default method - Not Allowed (Different package)
        // obj.defaultMethod();  // Uncommenting this will cause an error

        // Accessing private method - Not Allowed (Private methods are not accessible)
        // obj.privateMethod();  // Uncommenting this will cause an error

        // Accessing private method indirectly through public method
        obj.accessPrivateMethod();
    }
}
