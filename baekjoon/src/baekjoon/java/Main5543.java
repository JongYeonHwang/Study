package baekjoon.java;

import java.util.Arrays;
import java.util.Scanner;

public class Main5543 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] food = new int[3];
		int[] drink = new int[2];
		
		System.out.println("");
		
		for(int i=0;i<food.length + drink.length;i++) {
			if(i<food.length) {
				food[i] = scanner.nextInt();
			} else {
				drink[i-food.length] = scanner.nextInt();
			}
		}
			
		Arrays.sort(food);
		Arrays.sort(drink);
		System.out.println(food[0] + drink[0] - 50);
	}

}
