package google;

///////////////////////// the factory
public class ConcreteCarFactory implements CarFactory{
	
	public ConcreteCarFactory(){
	
	}
	
	public Car getCar(Class class1) {
		if(class1.equals(Mustang.class))
			return new Mustang();
		else if(class1.equals(Ferrari.class)){
			return new Ferrari();
		}
		else{
			return null;
		}
	}
	
	public Car2 getCar2(Class class1) {
		if(class1.equals(Mclaren.class))
			return new Mclaren();
		else if(class1.equals(Ford.class)){
			return new Ford();
		}
		else{
			return null;
		}
	}
}
