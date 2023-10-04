class A {
    void dikha() {
        System.out.println("This is class A");
    }
}

class B extends A {
    void dikha() {
        System.out.println("This is class B");
        super.dikha();
    }
}

public class Overriding {
    public static void main(String[] args) {
        B b = new B();
        b.dikha();
    }
}
