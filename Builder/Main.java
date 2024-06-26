package Builder;

public class Main {

    public static void main(String[] args) {
        Phone phone = new PhoneBuilder().setOS("Android").setRam(4).build();
        
        System.out.println(phone);
    }
    
}
