package practice.twitter;

public class User implements Subscriber{
    
    private String name;
    private Channal myChannal;

    public User(String name){
        this.name = name;
    }

    public void subscribeChannel(Channal ch){
        this.myChannal = ch;
        ch.subscribe(this);
    }

    public void unsubscribeChannel(Channal ch){
        ch.unsubscribe(this);
    }

    @Override
    public void update(){
            System.out.println("Hi " + name + myChannal.getchannalName() + "uploaded new video = " + myChannal.getVideTitle());
    }
}
