package backjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		
		for(int a=0; a<cnt; a++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.printf("%d\n", num1 + num2);
		}
	}
}

