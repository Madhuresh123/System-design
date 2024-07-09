package behavioralDesignPatterns.Statergy;

public class CryptoPayment implements PaymentStrategy {
    private String walletAddress;

    public CryptoPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Cryptocurrency wallet " + walletAddress + ".");
    }
}
