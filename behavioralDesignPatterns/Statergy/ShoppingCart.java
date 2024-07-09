package behavioralDesignPatterns.Statergy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    private int totalAmount;

    public ShoppingCart() {
        items = new ArrayList<>();
        totalAmount = 0;
    }

    public void addItem(String name, int price) {
        items.add(new Item(name, price));
        totalAmount += price;
    }

    public void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(totalAmount);
    }
    
    private class Item {
        private String name;
        private int price;

        public Item(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }
    }
}
