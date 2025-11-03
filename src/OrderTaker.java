
public class OrderTaker extends Thread {
    private Cafe cafe;

    public OrderTaker(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            cafe.newOrder();
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}