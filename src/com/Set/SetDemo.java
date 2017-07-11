package com.Set;
import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaring set 1
		Set<String> set1=new HashSet<String>();
		
		//Addong elements to  set1
		set1.add("Babu");
		set1.add("Pradyut");
		set1.add("Bapa");
		set1.add("Maa");
		
		Set<String> set2=new HashSet<String>();
		
		//Addong elements to  set1set2.add("Jena");
		set2.add("Pravin");
		set2.add("Hemant");
		set2.add("Ravi");
		
		set1.addAll(set2); //This will copy all the elements from set 2 to set1 hence forming the union
		
		System.out.println(set1);   //Printing the values of Set1

	

	
	}
}