class Box { // Class names should start with an uppercase letter
    int width, height, depth;

    // Constructor should have the same name as the class
    Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    int volume() {
        return width * height * depth;
    }
}

public class Constructor {
    public static void main(String[] args) { // You need a main method to run your code
        Box b = new Box(10, 20, 30);
        System.out.println(b.volume());
    }
}
