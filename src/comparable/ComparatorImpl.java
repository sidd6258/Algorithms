package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorImpl {
	private int age;
	private String name;
	
	public ComparatorImpl(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "ComparatorImpl [age=" + age + ", name=" + name + "]";
	}
	
	public static void main(String []args){
		List<ComparatorImpl> l=new ArrayList<ComparatorImpl>();
		l.add(new ComparatorImpl(29, "Siddharth"));
		l.add(new ComparatorImpl(27, "Ajay"));
		l.add(new ComparatorImpl(26, "Tanu"));
		l.add(new ComparatorImpl(23, "Ashay"));		
		Collections.sort(l, new Comparator<ComparatorImpl>() {
			@Override
			public int compare(ComparatorImpl o1, ComparatorImpl o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		System.out.println(l);
	}
	
	
}
