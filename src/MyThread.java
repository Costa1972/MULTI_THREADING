public class MyThread extends Thread{
    int count = 0;
    @Override
    public void run() {
        while (count < 1000) {
        System.out.println("Hello from My Thread");
        count++;
        }
    }
}
