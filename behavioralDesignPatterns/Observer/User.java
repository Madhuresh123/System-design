package behavioralDesignPatterns.Observer;

public class User implements Subscriber{


    private String name;
    private Channal channal;

    public User(String name){
        this.name = name;
    }

    public void subscribeChannel(Channal ch){
        this.channal = ch;
        ch.subscribe(this);
    }

    public void unsubscribeChannel(Channal ch){
        ch.unsubscribe(this);
    }

    @Override
    public void update(){
        System.out.println("Hi " + name + "new video is uploaded = " + channal.getTitle());
    }
    
}