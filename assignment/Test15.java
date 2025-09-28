package assignment;
 import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter the size of array:");
int n = sc.nextInt();
int arr[]=new int[n];
System.out.println("enter element:");
for(int i =0; i<n;i++) {
	arr[i]=sc.nextInt();
}


for(int i=0; i<n;i++) {
	if(arr[i] % 2 == 0) {
		System.out.println("even number:"+arr[i]);
	}
}

for (int i=0;i<n;i++) {
	if(arr[i] % 2 != 0) {
		System.out.println("odd number:"+arr[i]);
	}
}
	}

}
