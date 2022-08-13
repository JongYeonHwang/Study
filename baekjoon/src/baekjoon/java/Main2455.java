package baekjoon.java;

import java.util.Arrays;
import java.util.Scanner;

public class Main2455 {

	public static void main(String[] args) {
		int result = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		int[] before = new int[4];
		int[] after = new int[4];
		int[] resultArr = new int[4];
		
		System.out.println("");
		for(int i=0;i<before.length;i++) {
			before[i] = scanner.nextInt();
			after[i] = scanner.nextInt();
		}
		for(int i=0;i<before.length;i++) {
			result += after[i];
			result -= before[i];
			resultArr[i] = result;
		}
		Arrays.sort(resultArr);
		System.out.println(resultArr[3]);
	}

}