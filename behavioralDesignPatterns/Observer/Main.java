package behavioralDesignPatterns.Observer;

public class Main {

    public static void main(String[] args){

        Channal myChannal = new Channal();

        User user1 = new User("Sonal");
        User user2 = new User("Viresh");

        user1.subscribeChannel(myChannal);
        user2.subscribeChannel(myChannal);

        myChannal.upload("This is my First vlog");

        user2.unsubscribeChannel(myChannal);

        myChannal.upload("this is my second vlog");
    }
}