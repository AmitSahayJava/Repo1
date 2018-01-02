package com.Java8;

public class CalculableImpl implements Calculable {
	public int add(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		CalculableImpl ref=new CalculableImpl();
		System.out.println(ref.add(10, 20));
		System.out.println(ref.sub(40, 20));
	}
}
