public class App {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello Jenkins!");
        Thread.sleep(30_000);   // 30 秒
        System.out.println("30 s over, exiting");
    }
}