package ii1202;

import java.util.Scanner;

public class puissance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("a ?");
		int a = scan.nextInt();
		System.out.println("n ?");
		int n = scan.nextInt();
		puissance (a,n);
	}
	public static void puissance(int a, int n){
		int b=1;
		for (int i=0; i<n; i++){
			b=b*a;
		}
		System.out.println(b);
	}
}
