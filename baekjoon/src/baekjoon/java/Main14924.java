package baekjoon.java;

import java.util.Arrays;
import java.util.Scanner;

public class Main14924 {

	public static void main(String[] args) {
		int S = 0, T = 0, D = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("");
		S = scanner.nextInt();
		T = scanner.nextInt();
		D = scanner.nextInt();
		
		System.out.println(D/(S*2) * T);
		
		
	}

}