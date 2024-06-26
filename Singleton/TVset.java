package Singleton;

public class TVset {

    private static volatile TVset tvsetInstance = null;

    private TVset() {
        System.out.println("TV set instantiated");
    }

    public static TVset getTVsetInstance() {
        if (tvsetInstance == null) { //optimise
            synchronized(TVset.class){
                if(tvsetInstance == null){ //double checking
                    tvsetInstance = new TVset();
                }
            }
        }

        return tvsetInstance;
    }
}
