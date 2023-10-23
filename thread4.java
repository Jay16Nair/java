public class thread4 {

    public static void main(String[] args) {
        Thread thread1 = new PriorityThread("Thread 1", Thread.MAX_PRIORITY);
        Thread thread2 = new PriorityThread("Thread 2", Thread.MIN_PRIORITY);
        Thread thread3 = new PriorityThread("Thread 3", Thread.NORM_PRIORITY);
        Thread thread4 = new PriorityThread("Thread 4", 8);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

    static class PriorityThread extends Thread {
        public PriorityThread(String name, int priority) {
            super(name);
            setPriority(priority);
        }

        @Override
        public void run() {
            System.out.println(getName() + " is running with priority " + getPriority());
        }
    }
}
