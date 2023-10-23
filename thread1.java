import java.util.Random;

class RandomGen implements Runnable {
    public void run() {
        Random a = new Random();
        while (true) {
            int num = a.nextInt(50);
            System.out.println("Generated number: " + num);
            if (num % 2 == 0) {
                Thread t2 = new Thread(new Square(num));
                t2.start();
            } else {
                Thread t3 = new Thread(new Cube(num));
                t3.start();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace(System.err);
            }
        }
    }
}

class Square implements Runnable {
    int number;

    public Square(int number) {
        this.number = number;
    }

    public void run() {
        int square = number * number;
        System.out.println("Square number is " + square);
    }
}

class Cube implements Runnable {
    int number;

    public Cube(int number) {
        this.number = number;
    }

    public void run() {
        int square = number * number * number;
        System.out.println("Cubed number is " + square);
    }
}

public class thread1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RandomGen());
        t1.start();
    }
}