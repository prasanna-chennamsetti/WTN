package com.wipro.collections;
import java.util.*;
public class Ex5 {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("January");
		ll.add("February");
		ll.add("March");
		ll.add("April");
		ll.add("May");
		ll.add("June");
		ll.add("July");
		ll.add("August");
		ll.add("September");
		ll.add("October");
		ll.add("November");
		ll.add("December");
		for(int s=0;s<ll.size();s++) {
			System.out.println(ll.get(s));
		}
	}
}
