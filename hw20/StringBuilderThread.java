package hw20;

public class StringBuilderThread extends Thread {
    private StringBuilder sb = new StringBuilder();

    public StringBuilderThread(StringBuilder sb) {
        this.sb = sb;
    }

    public void run() {
        synchronized (sb) {
            for (int i = 0; i < 100; i++) {
                System.out.print(sb);
            }
            System.out.println();
            char letter = sb.charAt(0);
            sb.setCharAt(0, ++letter);
        }
    }
}
