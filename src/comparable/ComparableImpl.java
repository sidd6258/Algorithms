package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableImpl implements Comparable<ComparableImpl>{
	private int age;
	private String name;
	
	public ComparableImpl(int age, String name) {
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
	public int compareTo(ComparableImpl o) {
		return name.compareTo(o.getName());
	}
	
	
	@Override
	public String toString() {
		return "ComparableImpl [age=" + age + ", name=" + name + "]";
	}
	public static void main(String []args){
		List<ComparableImpl> l=new ArrayList<ComparableImpl>();
		l.add(new ComparableImpl(29, "Siddharth"));
		l.add(new ComparableImpl(27, "Ajay"));
		l.add(new ComparableImpl(26, "Tanu"));
		l.add(new ComparableImpl(23, "Ashay"));		
		Collections.sort(l);
		System.out.println(l);
	}
}
