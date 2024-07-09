package Singleton;

public class TVset {

    private static volatile TVset objInstance = null;

    private TVset(){
        System.out.println("Object is created");
    }

    public static TVset getInstance(){

        if(objInstance == null){

            synchronized(TVset.class){

                if(objInstance == null){

                    objInstance = new TVset();
                }
            }

        }

        return objInstance;

    }

}