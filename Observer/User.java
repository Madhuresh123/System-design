package Observer;

public class User implements Subscriber {

    private String name;
    private Channal channel;

    public User(String name) {
        this.name = name;
    }

    public void subscribeChannel(Channal ch) {
        this.channel = ch;
        ch.subscribe(this);
    }

    public void unsubscribeChannel(Channal ch) {
        ch.unsubscribe(this);
    }

    @Override
    public void update() {
        System.out.println("Hey " + name + ", New video uploaded: " + channel.getTitle());
    }
}
