package Factory;
import java.util.Scanner;

interface vehicle{
    public void engine();
    public void tire();
    public void createVehicle();
}

class Car implements vehicle{

    public void engine(){
        System.out.println("add engine");
    }

    public void tire(){
        System.out.println("add tire");
    }

    public void createVehicle(){
        System.out.println("A car is created");
    }
}

class Bike implements vehicle{

    public void engine(){
        System.out.println("add engine");
    }

    public void tire(){
        System.out.println("add tire");
    }

    public void createVehicle(){
        System.out.println("A bike is created");
    }
}

class Auto implements vehicle{

    public void engine(){
        System.out.println("add engine");
    }

    public void tire(){
        System.out.println("add tire");
    }

    public void createVehicle(){
        System.out.println("A auto is created");
    }
}

class VehicalFactory{

    public static vehicle createFactory(String VehicleType){

        if(VehicleType.equals("car")){
            return new Car();
        }
        else if(VehicleType.equals("bike")){
            return new Bike();
        }
        else if(VehicleType.equals("auto")){
            return new Auto();
        }
        else{
            return new Auto();
        }

    }

}


public class Main{

    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);
        String vehicleType;

        System.out.println("Enter the vehicle");
        vehicleType = myObj.nextLine();

        vehicle newVehicle = VehicalFactory.createFactory(vehicleType);
        newVehicle.createVehicle();

    }
}