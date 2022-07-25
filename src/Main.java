public class Main {
    public static void main(String[] args) {
        int count = 0;
        MyThread myThread = new MyThread();
        myThread.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello from Main Thread!");
        }
    }
}
