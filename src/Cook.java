
public class Cook extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("[Cook] Preparing order #" + i);
            try { Thread.sleep(700); } catch (Exception e) {}
        }
    }
}
