public class JobExecutor {
    public static void main(String[] args) {
        Runnable job = () -> {
            System.out.println("Background task is running...");
        };

        Thread t = new Thread(job);
        t.start();
    }
}
