package Generics;

import java.util.Scanner;

import GenericsService.PrintService;

public class GenericsExample {

	public static void main(String[] args) {
		int quantity;
		
		Scanner sc = new Scanner(System.in);
			System.out.println("How many values: ");
			quantity = sc.nextInt();
		
		PrintService ps = new PrintService();
		
		for (int i = 0; i < quantity; i++) {
			ps.add(sc.next());
		}
		sc.close();
		
		System.out.println("First Value:" + ps.first());
		
		ps.print();
	}

}
