public class OneToHundred {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            } else {
                System.out.println("Odd: " + i);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }
    }
}
