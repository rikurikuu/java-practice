import java.util.HashMap;

public class OrderManager {
    HashMap<String, Order> orderManager = new HashMap<>();


    public void add(String address, Order order){
        orderManager.put(address,order);
    }
    public RestaurantOrder get(String address){
        return (RestaurantOrder) orderManager.get(address);
    }
    public void remove(String address){
        orderManager.remove(address);
    }
    public void add(String address,MenuItem item) throws OrderAlreadyAddedException {
        if(orderManager.containsKey(address)) throw new OrderAlreadyAddedException();
        orderManager.get(address).add(item);
    }
    public Order getOrders(String address){
        Order[] orders = new Order[orderManager.size()];
        return orderManager.get(address);
    }
    public int size(){
        return orderManager.size();
    }

    public static void main(String[] args) {
        OrderManager orderManager1 = new OrderManager();
        RestaurantOrder restaurantOrder = new RestaurantOrder();
        restaurantOrder.add(new MenuItem(72,"Lasagna","food"));
        restaurantOrder.add(new MenuItem(45,"Tortilla","food"));
        orderManager1.add("Moscow", restaurantOrder);
        RestaurantOrder restaurantOrder1 = new RestaurantOrder();
        restaurantOrder1.add(new MenuItem(56,"Apple Juice","drink"));
        restaurantOrder1.add(new MenuItem(53,"Yebisu Bear","drink"));
        orderManager1.add("Ekaterinburg", restaurantOrder1);
        orderManager1.get("Moscow").display();
        orderManager1.get("Ekaterinburg").display();
    }

}
