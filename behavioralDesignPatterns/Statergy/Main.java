package behavioralDesignPatterns.Statergy;

public class Main {
    public static void main(String[] args) {
        // Create a shopping cart and add items
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop", 1000);
        cart.addItem("Headphones", 200);

        // Pay using different strategies
        PaymentStrategy creditCard = new CreditCardPayment("1234567890123456", "123", "12/24");
        PaymentStrategy paypal = new PayPalPayment("user@example.com");
        PaymentStrategy crypto = new CryptoPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");

        cart.pay(creditCard);
        cart.pay(paypal);
        cart.pay(crypto);
    }
}
