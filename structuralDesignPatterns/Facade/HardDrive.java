package Facade;

// HardDrive class
public class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("Reading " + size + " bytes from position " + lba);
        return new byte[size]; // Simulating data read
    }
}
