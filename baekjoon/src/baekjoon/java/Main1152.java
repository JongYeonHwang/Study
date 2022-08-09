package baekjoon.java;

import java.util.Scanner;

public class Main1152 {

	public static void main(String[] args) {
		String S = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("");
		S = scanner.nextLine();
		
		String str = S.substring(1, S.length());
		
		String[] sArr = str.split(" ");

		if(sArr[0] != " ") {
			System.out.println("0");
		}else {
			System.out.println(sArr.length);
		}
			

	}

}
