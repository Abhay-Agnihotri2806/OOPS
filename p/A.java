// File: p/A.java
package p;

public class A {
    public void publicMethod() {
        System.out.println("Public method of class A");
    }

    protected void protectedMethod() {
        System.out.println("Protected method of class A");
    }

    void defaultMethod() {
        System.out.println("Default method of class A");
    }

    private void privateMethod() {
        System.out.println("Private method of class A");
    }

    // Public method to indirectly access private method
    public void accessPrivateMethod() {
        privateMethod();
    }
}
