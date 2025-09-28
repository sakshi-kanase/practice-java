package assignment;

import java.util.*;

public class Test10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("enter count the number:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("enter the number"+i+":");
			sum += sc.nextInt();
		}
		double avg = sum/n;
		System.out.println("aveage:"+avg);
		

	}

}

