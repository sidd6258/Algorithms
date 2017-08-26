package queue;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student{
   private int token;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

public class PriorityQueueSolution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalEvents = Integer.parseInt(in.nextLine());
        PriorityQueue<Student> pq = new PriorityQueue<Student>(new Comparator<Student>() {

  		@Override
  		public int compare(Student o1, Student o2) {
  			if(o1.getCgpa() <= o2.getCgpa()){
  				if(o1.getCgpa() == o2.getCgpa()){
                      if(o1.getFname().equals(o2.getFname())){
                         return o1.getToken()<o2.getToken() ? 1:-1;
                      }
  					return o1.getFname().compareTo(o2.getFname());
  				}
  				return 1;
  			}
  			else{
  				return -1;
  			}
  		}
  	});
        
        while(totalEvents>0){
           String event = in.next();        
           if(event.equals("ENTER")){
          	 String fname =  in.next();
               double cgpa = in.nextDouble();
               int token = in.nextInt();
          	 Student e=new Student(token, fname, cgpa);
          	 pq.add(e);
           }
           else if(event.equals("SERVED")){
          	 pq.poll();
           }                     
           totalEvents--;
        }
        
  if (pq.isEmpty()) {
  			System.out.println("EMPTY");
  		} else {
  			while (!pq.isEmpty()) {
  				System.out.println(pq.poll().getFname());
  			}
  }
      }
}
