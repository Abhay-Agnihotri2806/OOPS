class SuperClass {
    private int privateVar = 42;  // Private member

    public int getPrivateVar() {
        return privateVar;  // Providing a public getter
    }
}

class SubClass extends SuperClass {
    void show() {
        // System.out.println(privateVar); // This will cause a compilation error
        System.out.println("Accessing private member via getter: " + getPrivateVar());
    }
}

public class PrivateMemberTest {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.show();
    }
}
