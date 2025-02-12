public class SuperClass {
    private int privateVar = 42; // Private member

    public int getPrivateVar() { // Public getter
        return privateVar;
    }
}

class SubClass extends SuperClass {
    void show() {
        // System.out.println(privateVar); // ❌ Compilation error: private member not accessible
        System.out.println("Accessing privateVar via getter: " + getPrivateVar()); // ✅ Allowed
    }
}

public class Main {
    public static void main(String[] args) {
        SubClass obj = new SubClass(); // Object creation
        obj.show(); // Calls show() method in SubClass
    }
}
