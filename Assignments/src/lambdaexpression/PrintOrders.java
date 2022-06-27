package lambdaexpression;

import java.util.*;
import java.util.stream.Collectors;

class Order {
    int orderprice;
    String ordername;
    String orderStatus;

    public Order(int orderprice, String ordername, String orderStatus) {
        this.orderprice = orderprice;
        this.ordername = ordername;
        this.orderStatus = orderStatus;
    }

    public int getOrderprice() {
        return orderprice;
    }

    public String getOrdername() {
        return ordername;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    @Override
    public String toString() {
        return "Order [orderprice=" + orderprice + ", ordername=" + ordername + ", orderStatus=" + orderStatus + "]";
    }
}

public class PrintOrders {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(17000, "Mobile", "Accepted"));
        orders.add(new Order(2000, "HeadPhone", "Completed"));
        orders.add(new Order(130000, "Laptop", "Completed"));
        orders.add(new Order(2000, "Shirt", "Accepted"));
        orders.add(new Order(2000, "Shoes", "Completed"));

        List<Order> orderbyname = orders.stream()
                .filter(a -> a.orderprice > 10000)
                .filter(b -> b.getOrderStatus().equals("Accepted") || b.getOrderStatus().equals("Completed"))
                .collect(Collectors.toList());
        System.out.println(orderbyname);
    }
}