import java.util.Scanner;

public class Pave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Longueur?");
		double longueur = scan.nextDouble();
		if (longueur<0){
			System.out.println("La longueur ne peut pas �tre n�gative");
			longueur = scan.nextDouble();
		}
		System.out.println("Largeur?");
		double largeur = scan.nextDouble();
		if (largeur<0){
			System.out.println("La largeur ne peut pas �tre n�gative");
			largeur = scan.nextDouble();
		}
		System.out.println("hauteur?");
		double hauteur = scan.nextDouble();
		if (hauteur<0){
			System.out.println("La hauteur ne peut pas �tre n�gative");
			hauteur = scan.nextDouble();
		}
		double volume = longueur * largeur * hauteur;
		System.out.println("Volume:");
		System.out.println(volume);
	}

}
