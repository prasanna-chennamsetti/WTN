package com.wipro.collections;
import java.util.*;
public class Ex3 {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
		a.add("Hii");
		a.add("Hello");
		//printAll();
		//Iterator<String> i=a.iterator();
		printAll(a);
			
		}

		public static void printAll(List<String> list) {
			Iterator<String> it = list.iterator();
			
			while (it.hasNext())
				System.out.println(it.next());
		}
		
	}
