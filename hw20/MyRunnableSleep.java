package hw20;

public class MyRunnableSleep implements Runnable {
    public void run() {
        for (int i = 0; i < 101; i++) {
            if (i % 10 == 0) {
                System.out.printf("%-5d Run by %s\n", i, Thread.currentThread().getName());
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
