
public class CarMain {
	public static void main(String[] args) {
		Car []cars = new Car[2];
		
		cars[0] = new Car("Toyota", "AE86", 1983, 17, 200000, 13, 8);
		cars[1] = new Car("Mazada", "RX-7 FD", 1991, 18, 89000, 18.5, 12);
		
		cars[0].drive(50);
        cars[0].fillTank(1);
        System.out.println("Fuel remaining in "+cars[0].getMake()+": " + cars[0].getFuelRemaining());
        System.out.println(cars[0].toString());
        
        cars[1].drive(100);
        cars[1].fillTank(5);
        System.out.println("Fuel remaining in "+cars[1].getMake()+": " + cars[1].getFuelRemaining());
        System.out.println(cars[1].toString());

	}

}
