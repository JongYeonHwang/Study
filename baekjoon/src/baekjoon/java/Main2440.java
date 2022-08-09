package baekjoon.java;

import java.util.Scanner;

public class Main2440 {

	public static void main(String[] args) {
		int N = 0;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("");
		N = scanner.nextInt();
		
		for(int i=0;i<N;i++) {
			for(int j=N;j>i;j--) {
				System.out.print("*");
			}
			if(i!=N-1)
			System.out.println("");
		}
	}

}
