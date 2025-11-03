
public class DeliveryBoy extends Thread {
    private Cafe cafe;
    private String name;

    public DeliveryBoy(Cafe cafe, String name) {
        this.cafe = cafe;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            cafe.deliverOrder(name);
            try { Thread.sleep(600); } catch (Exception e) {}
        }
    }
}
