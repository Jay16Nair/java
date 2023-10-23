class NameChange implements Runnable {
    public void run() {
        try {
            Thread.sleep(1000);
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            System.out.println("Original Name: " + name);
            currentThread.setName("NewName");
            System.out.println("Modified Name: " + currentThread.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class thread2 {
    public static void main(String[] args) {
        Thread t = new Thread(new NameChange());
        t.start();
    }
}
