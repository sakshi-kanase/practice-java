package assignment;

import java.io.*;
import java.util.*;

public class Test9 {

	public static void main(String[] args) throws IOException {
	
		//using scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name:");
		String x =sc.nextLine();

		System.out.println("scanner input:"+x);
		
		// using bufferedReader
	BufferedReader br = new	BufferedReader (new InputStreamReader (System.in));
	System.out.println("enter name:");
	String y = br.readLine();
	System.out.println("bufferedReader input:"+y);
	
		
		
	}

}
