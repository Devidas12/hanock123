package com.Collection;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub 
		ArrayList<String> list=new ArrayList<String>(); 
		list.add("Ravi");  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		//Traversing list through Iterator  
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
	}

}
