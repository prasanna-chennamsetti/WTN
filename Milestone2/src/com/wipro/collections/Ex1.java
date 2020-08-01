package com.wipro.collections;
import java.util.*;
public class Ex1 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("January");
		al.add("February");
		al.add("March");
		al.add("April");
		al.add("May");
		al.add("June");
		al.add("July");
		al.add("August");
		al.add("September");
		al.add("October");
		al.add("November");
		al.add("December");
		for(int s=0;s<al.size();s++) {
			System.out.println(al.get(s));
		}
	}
}
