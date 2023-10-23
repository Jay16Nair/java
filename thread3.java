public class thread3 {

    public static void main(String[] args) {
        Thread nameChangingThread = new Thread(new NameChanger());
        nameChangingThread.start();
    }

    static class NameChanger implements Runnable {
        @Override
        public void run() {
            Thread currentThread = Thread.currentThread();

            for (int i = 5; i >= 1; i--) {
                try {
                    System.out.println("Thread " + currentThread.getName() + " sleeping for " + i + " seconds.");
                    Thread.sleep(6000); // Sleep for 6 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                currentThread.setName("Thread_" + i);
                System.out.println("Changed thread name to " + currentThread.getName());
            }
        }
    }
}
