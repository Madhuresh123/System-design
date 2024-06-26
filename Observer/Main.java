package Observer;

public class Main {
    public static void main(String[] args) {
        Channal myChannel = new Channal();

        User user1 = new User("Alice");
        User user2 = new User("Bob");

        user1.subscribeChannel(myChannel);
        user2.subscribeChannel(myChannel);

        myChannel.upload("Design Patterns in Java");

        user1.unsubscribeChannel(myChannel);

        myChannel.upload("Observer Pattern Example");
    }
}
