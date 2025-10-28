public class BackgroundJob {
    public static void main(String[] args) {
        Runnable job = () -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Running task " + i);
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        };
        Thread t = new Thread(job);
        t.start();
    }
}
