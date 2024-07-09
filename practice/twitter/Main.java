package practice.twitter;

public class Main {
    
    public static void main(String[] args){

        Channal myChannal = new Channal("Carryminati");

        User user1 = new User("Sonal");
        User user2 = new User("Mayank");

        user1.subscribeChannel(myChannal);
        user2.subscribeChannel(myChannal);

        myChannal.upload("This is my singapor vlog");

        user1.unsubscribeChannel(myChannal);


        myChannal.upload("This is my America vlog");
    }

}
