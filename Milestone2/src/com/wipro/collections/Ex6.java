package com.wipro.collections;
import java.util.*;
public class Ex6 {
	public static void main(String[] args) {
		Vector<String> v=new Vector<>();
		v.add("January");
		v.add("February");
		v.add("March");
		v.add("April");
		v.add("May");
		v.add("June");
		v.add("July");
		v.add("August");
		v.add("September");
		v.add("October");
		v.add("November");
		v.add("December");
		for(int s=0;s<v.size();s++) {
			System.out.println(v.get(s));
		}
	}
}
