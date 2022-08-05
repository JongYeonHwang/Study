package baekjoon.java;

import java.util.Arrays;
import java.util.Scanner;

public class Main1546 {

	public static void main(String[] args) {
		int N = 0, M = 0;
		float result = 0, sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("");
		N = scanner.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr);
		M = arr[arr.length-1];
		
		for(int i=0; i<arr.length;i++) {
			result = ((arr[i] / (float) M) * 100);
			sum += result;
		}
		System.out.println(sum / arr.length);
	}

}
