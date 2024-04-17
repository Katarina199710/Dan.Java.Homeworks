package hw8.task1;

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        computer1.setBrand("Mac");
        computer1.setPrice(40000);
        computer1.setRamCapacity(8);
        computer1.setVideoCardCapacity(512);
        System.out.println(computer1.getBrand());
        System.out.println(computer1.getPrice());
        System.out.println(computer1.getRamCapacity());
        System.out.println(computer1.getVideoCardCapacity());
        Computer computer2 = new Computer();
        computer2.setBrand("Windows");
        computer2.setPrice(40000);
        computer2.setRamCapacity(8);
        computer2.setVideoCardCapacity(512);
        System.out.println();
        System.out.println(computer1);
        System.out.println();
        System.out.println(computer2);
        System.out.println();
        System.out.println(computer1.equals(computer2));
    }

}
