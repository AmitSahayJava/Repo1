package sumit.bauaa.polimorphism;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Factory factory = new Factory();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.next();
		Parent ref = factory.getInstance(name);
		ref.getName();
        ref.display();
	}

}
