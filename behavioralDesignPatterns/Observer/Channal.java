package behavioralDesignPatterns.Observer;

import java.util.List;
import java.util.ArrayList;

public class Channal {

    private List<Subscriber> subs = new ArrayList<>();
    private String videoTitle;

    public void subscribe(Subscriber sub){
        subs.add(sub);
    }

    public void unsubscribe(Subscriber sub){
        subs.remove(sub);
    }

    public void notifyUsers(){
        for(Subscriber sub: subs){
            sub.update();
        }
    }

    public void upload(String videoTitle){
        this.videoTitle = videoTitle;
        notifyUsers();
    }

    public String getTitle(){
        return videoTitle;
    }

}