package practice.twitter;

import java.util.ArrayList;
import java.util.List;


public class Channal {

    private String channalName;
    private String videoTitle;
    private List<Subscriber> subs = new ArrayList<>();

    public Channal(String channalName){
        this.channalName = channalName;
    }


    public void subscribe(Subscriber sub){  
        subs.add(sub);
    }

    public void unsubscribe(Subscriber sub){  
        subs.remove(sub);
    }

    public void notifySubscribers(){  
        for(Subscriber sub: subs){
            sub.update();
        }
    }

    public void upload(String videoTitle){
        this.videoTitle = videoTitle;
        notifySubscribers();
    }

    public String getVideTitle(){
        return videoTitle;
    }

    public String getchannalName(){
        return channalName;
    }

    
}
