package Singleton;

public class Main {

    public static void main(String[] args) {

        TVset obj1 = TVset.getTVsetInstance();
        TVset obj2 = TVset.getTVsetInstance();

        System.out.println(obj1);
        System.out.println(obj2);
    }
}
