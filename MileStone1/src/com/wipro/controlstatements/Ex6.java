package com.wipro.controlstatements;

public class Ex6 {
	public static void main(String[] args) {
		String g=args[0];
		int a=Integer.parseInt(args[1]);
		if(g.equals("Male") && (a>=1 && a<=58)) {
				System.out.println("8.4%");
		}
		else if(g.equals("Male") && (a>=59 && a<=100)) {
				System.out.println("10.5%");
		}
		else if(g.equals("Female") && (a>=1 && a<=58)){
				System.out.println("8.2%");
		}
		else if(g.equals("Female") && (a>=59 && a<=100)) {
				System.out.println("9.2%");
			}
		}
	}
