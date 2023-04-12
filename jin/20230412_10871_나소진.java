package backjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int large = sc.nextInt();
		int arr[] = new int[cnt];
		
		for(int a=0; a<cnt; a++) {
			arr[a] = sc.nextInt();
		}
		
		for(int b=0; b<cnt; b++) {
			if(arr[b]<large) {
				System.out.printf("%d ", arr[b]);
			}
		}
	}
}

