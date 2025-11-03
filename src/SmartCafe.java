
public class SmartCafe {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();

        Thread orderTaker = new OrderTaker(cafe);
        Thread cook = new Cook();
        Thread deliveryBoy1 = new DeliveryBoy(cafe, "Ravi");
        Thread deliveryBoy2 = new DeliveryBoy(cafe, "Sohan");

        System.out.println("=== Smart Café Simulation Started ===");

        orderTaker.start();
        cook.start();
        deliveryBoy1.start();
        deliveryBoy2.start();
    }
}
