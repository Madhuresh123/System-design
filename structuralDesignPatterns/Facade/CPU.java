package Facade;

// CPU class
public class CPU {
    public void freeze() {
        System.out.println("CPU is frozen");
    }

    public void jump(long position) {
        System.out.println("CPU is jumping to position " + position);
    }

    public void execute() {
        System.out.println("CPU is executing");
    }
}
