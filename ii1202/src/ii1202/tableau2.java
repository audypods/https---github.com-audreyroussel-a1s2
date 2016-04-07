package ii1202;

import java.util.Scanner;

public class tableau2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("nb ?");
		int nb = scan.nextInt();
		System.out.println("max ?");
		int max = scan.nextInt();
		table(nb,max);
	}
	public static void table(int nb, int max){
		int n=nb;
		int i=0;
		System.out.print(n);
		System.out.print(" ");
		while (n<max){
			n=n+nb;
			System.out.print(n);
			System.out.print(" ");
		}
	}
}
