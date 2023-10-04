class A {
    void print() {
        System.out.println("Hi");
    }
}

class B extends A {
    void print() {
        System.out.println("Hello");
    }
}

public class Over {
    public static void main(String[] args) {
        B b = new B();
        b.print();
    }
}
