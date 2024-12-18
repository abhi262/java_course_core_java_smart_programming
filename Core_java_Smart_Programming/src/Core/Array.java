package Core;
import java.util.Scanner;
//Array-object//heap//
public class Array {

	public static void main(String[] args) {
		int a[]=new int[10];
		int b[]= {10,20,30};//initialization
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array");
		for( i=0;i<10;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("array is");
		for(i=0;i<10;i++) {
			System.out.println(a[i]);
		}
 for(i=0;i<3;i++) {
	 System.out.println("b is "+b[i]);
 }
	}

}
