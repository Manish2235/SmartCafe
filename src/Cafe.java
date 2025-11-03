public class Cafe {
	 private int orders = 0;
	    public synchronized void newOrder() {
	        orders++;
	        System.out.println("[Cafe] New order placed! Total orders: " + orders);
	    }
	    public synchronized void deliverOrder(String name) {
	        if (orders > 0) {
	            orders--;
	            System.out.println("[Cafe] " + name + " delivered an order. Remaining: " + orders);
	        } else {
	            System.out.println("[Cafe] No orders to deliver for " + name);
	        }
	    }
	    public int getOrders() {
	        return orders;
	    }
}
