package class1;

import java.util.Scanner;

public class Act12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type the number a :");
       Scanner Numa = new Scanner (System.in);
       int a = Numa.nextInt();
       System.out.println("Type the number b :");
       Scanner Numb = new Scanner (System.in);
       int b = Numb.nextInt();
       int c = a + b;
       System.out.println("a + b ="+ c);
	}
	

}
