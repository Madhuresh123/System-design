package Singleton;

public class Main {

    public static void main(String[] args){

        TVset obj1 = TVset.getInstance();
        TVset obj2 = TVset.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);
    }
}