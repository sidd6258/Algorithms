package google;

public class CarFactoryImpl {
	public static void main(String[] args) {
		ConcreteCarFactory carFactory = new ConcreteCarFactory();
		Car myCar=carFactory.getCar(Mustang.class);
		myCar.drive();
		Car2 myCar2=carFactory.getCar2(Ford.class);
		myCar2.drive();
	}

}