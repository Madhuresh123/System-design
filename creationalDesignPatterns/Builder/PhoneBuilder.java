package Builder;

public class PhoneBuilder {
    
    private String OS;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

    public PhoneBuilder setOS(String OS){
        this.OS = OS;
        return this;
    }

    public PhoneBuilder setRam(int ram){
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setProcessor(String processor){
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize){
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setBattery(int battery){
        this.battery = battery;
        return this;
    }

    public Phone build(){
        return new Phone(OS, ram, processor, screenSize, battery);
    }
}
