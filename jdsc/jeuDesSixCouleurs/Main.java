package jeuDesSixCouleurs;
import java.awt.Font;
import java.util.Scanner;
import edu.princeton.cs.introcs.StdDraw;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ____________________________\n|                            |\n|   Le Jeu des 6 Couleurs    |\n|____________________________| \n\n");
		
		char choix;
		System.out.println("Appuyez sur: \n\n (j) pour jouer au jeu \n (q) pour quitter l'application");
		choix = sc.nextLine().charAt(0);
		do {
			if (choix == 'j'){
				System.out.println("Veuillez maintenant renseigner le nombre de joueurs: \n\n(1) pour jouer contre l'ordinateur \n(2) pour un duel \n(3) jeu à 3 joueurs \n(4) melee générale !");
				int nbrjoueurs=5;
				while (nbrjoueurs!=1 && nbrjoueurs!=2 && nbrjoueurs!=3 && nbrjoueurs!=4){
					nbrjoueurs = sc.nextInt();
					if (nbrjoueurs==1){
						UnJoueur();
					}
					else if (nbrjoueurs==2){
						DeuxJoueurs();
					}
					else if (nbrjoueurs==3){
						//TroisJoueurs();
					}
					else if (nbrjoueurs==4){
						//QuatreJoueurs();
					}
					else{
					System.out.println(" ________________________________________________\n/                                                 \\\n|  Veuillez entrer un des chiffres demandés !      |\n\\_________________________________________________/" );
					}
					sc.nextLine();
				}
				System.out.println(" _________________\n|                 |\n| Partie terminée |\n|_________________|\n\nAppuyez sur: \n\n(j) pour recommencer une partie \n(q) pour quitter l'application" );
				choix = sc.nextLine().charAt(0);
			}
			else if (choix == 'q'){
				
			}
			else {
				System.out.println(" ________________________________________________\n/                                                 \\\n|  Veuillez entrer un des charactères demandés !  |\n\\_________________________________________________/" );
				choix = sc.nextLine().charAt(0);
			}
		} while (choix!= 'q');
		System.out.println("Au revoir !" );
		sc.close();
	}
	
	
	public static void UnJoueur(){
		//étape 1: création de la grille et de la fenetre StdDraw
		Lettre[][] couleurs = new Lettre[13][13];
		int compteurControle1 = 0;
		int compteurControle2 = 0;
		//Compteur qui permet de déterminer à qui c'est le tour de jouer
		int m=1;
		Font j = new Font("Verdana", 3, 28);
		Grille.creationValeursGrille(couleurs, compteurControle1, compteurControle2, 0, 0);
		StdDraw.setCanvasSize(1366, 768);
		StdDraw.setXscale(-1, 2*couleurs.length-0.0);
		StdDraw.setYscale(-2, couleurs.length-1);
		Grille.checkControle1(couleurs, compteurControle1);
		Grille.checkControle2(couleurs, compteurControle2);
		//étape 2: dessin de la grille dans la fenêtre
		Grille.dessineGrille(couleurs, compteurControle1, compteurControle2, 0, 0);
		boolean findujeu = false;
		char[][] grille2 = new char[13][13];
		//étape 3: boucle qui permet de changer la grille selon les choix faits par les joueurs et dessine la grille
		while (m<=169){
			for (int k=0; k<13; k++)
				for (int l=0; l<13; l++)
					grille2[k][l]=couleurs[k][l].getLettre();
			StdDraw.setFont(j);
			StdDraw.setPenColor(StdDraw.BLACK);
			if (m%2!=0 && m!=2){
				StdDraw.text(18, 7, "C'est au Joueur 1");
				Grille.stepJoueur1(couleurs);
			}
			else {
				StdDraw.text(18, 7, "C'est à l'ordinateur");
				Grille.stepIAHasard(couleurs);
			}
			Grille.majGrille(couleurs, grille2, compteurControle1, compteurControle2, 0, 0);
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledRectangle(20, 5, 5.9, 5);
			StdDraw.setPenColor(StdDraw.BLACK);
			//StdDraw.clear();
			//Grille.dessineGrille(couleurs, compteurControle1, compteurControle2);
			Grille.checkControle1(couleurs, compteurControle1);
			Grille.checkControle2(couleurs, compteurControle2);
			m+=1;
			if (Grille.verifGagnant(couleurs, compteurControle1, compteurControle2, 0, 0)==true){
				Font l = new Font("Verdana", 3, 120);
				StdDraw.setFont(l);
				StdDraw.text(13, 6.5, "Partie terminée", 20);
				m=170;		//on sort de la boucle
			}
		}
	}
	
	
	
	public static void DeuxJoueurs(){
		//étape 1: création de la grille et de la fenetre StdDraw
		Lettre[][] couleurs = new Lettre[13][13];
		int compteurControle1 = 0;
		int compteurControle2 = 0;
		//Compteur qui permet de déterminer à qui c'est le tour de jouer
		int m=1;
		Font j = new Font("Verdana", 3, 40);
		Grille.creationValeursGrille(couleurs, compteurControle1, compteurControle2, 0, 0);
		StdDraw.setCanvasSize(1920, 1080);
		StdDraw.setXscale(-1, 2*couleurs.length-0.0);
		StdDraw.setYscale(-2, couleurs.length-1);
		Grille.checkControle1(couleurs, compteurControle1);
		Grille.checkControle2(couleurs, compteurControle2);
		//étape 2: dessin de la grille dans la fenêtre
		Grille.dessineGrille(couleurs, compteurControle1, compteurControle2, 0, 0);
		boolean findujeu = false;
		char[][] grille2 = new char[13][13];
		//étape 3: boucle qui permet de changer la grille selon les choix faits par les joueurs et dessine la grille
		while (m<=169){
			for (int k=0; k<13; k++)
				for (int l=0; l<13; l++)
					grille2[k][l]=couleurs[k][l].getLettre();
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.setFont(j);
			if (m%2!=0 && m!=2){
				StdDraw.text(18, 7, "C'est au Joueur 1");
				Grille.stepJoueur1(couleurs);
			}
			else {
				StdDraw.text(18, 7, "C'est au Joueur 2");
				Grille.stepJoueur2(couleurs);
			}
			Grille.majGrille(couleurs, grille2, compteurControle1, compteurControle2, 0, 0);
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledRectangle(20, 5, 5.9, 5);
			StdDraw.setPenColor(StdDraw.BLACK);
			//StdDraw.clear();
			//Grille.dessineGrille(couleurs, compteurControle1, compteurControle2);
			Grille.checkControle1(couleurs, compteurControle1);
			Grille.checkControle2(couleurs, compteurControle2);
			m+=1;
			if (Grille.verifGagnant(couleurs, compteurControle1, compteurControle2, 0, 0)==true){
				Font l = new Font("Verdana", 3, 120);
				StdDraw.setFont(l);
				StdDraw.text(13, 6.5, "Partie terminée", 20);
				m=170;		//on sort de la boucle
			}
		}
	}
	
	//ajouter la fonction checkcontrole3
	//                    stepjoueur3
	//					  verifgagnant3
	//
	// l'idée serait de rajouter un parametre a chaque fonction qui serait le nombre de joueurs | permettrait de raccourcir le code en ne creant pas une fonction pr chaque nbr de joueurs
	//
	
	public static void TroisJoueurs(){
		//étape 1: création de la grille et de la fenetre StdDraw
		Lettre[][] couleurs = new Lettre[13][13];
		int compteurControle1 = 0;
		int compteurControle2 = 0;
		int compteurControle3 = 0;
		//Compteur qui permet de déterminer à qui c'est le tour de jouer
		int m=1;
		Grille.creationValeursGrille(couleurs, compteurControle1, compteurControle2, compteurControle3, 0);
		StdDraw.setCanvasSize(1920, 1080);
		StdDraw.setXscale(-1, 2*couleurs.length-0.0);
		StdDraw.setYscale(-2, couleurs.length-1);
		Grille.checkControle1(couleurs, compteurControle1);
		Grille.checkControle2(couleurs, compteurControle2);
		Grille.checkControle3(couleurs, compteurControle3);
		//étape 2: dessin de la grille dans la fenêtre
		Grille.dessineGrille(couleurs, compteurControle1, compteurControle2, compteurControle3, 0);
		boolean findujeu = false;
		char[][] grille2 = new char[13][13];
		//étape 3: boucle qui permet de changer la grille selon les choix faits par les joueurs et dessine la grille
		while (m<=169){
			for (int k=0; k<13; k++)
				for (int l=0; l<13; l++)
					grille2[k][l]=couleurs[k][l].getLettre();
			
			for (int i=1, j=0; j <100;i++, j++){
				if (i==1)
					Grille.stepJoueur1(couleurs);
				else if (i==2)
					Grille.stepJoueur2(couleurs);
				else {
					Grille.stepJoueur3(couleurs);
					i=0;
				}
				
			}
			
			
			Grille.majGrille(couleurs, grille2, compteurControle1, compteurControle2, compteurControle3, 0);
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledRectangle(18, 5, 4, 5);
			StdDraw.setPenColor(StdDraw.BLACK);
			//StdDraw.clear();
			//Grille.dessineGrille(couleurs, compteurControle1, compteurControle2);
			Grille.checkControle1(couleurs, compteurControle1);
			Grille.checkControle2(couleurs, compteurControle2);
			Grille.checkControle3(couleurs, compteurControle3);
			m+=1;
			if (Grille.verifGagnant(couleurs, compteurControle1, compteurControle2, compteurControle3, 0)==true){
				Font l = new Font("Verdana", 3, 120);
				StdDraw.setFont(l);
				StdDraw.text(13, 6.5, "Partie terminée", 20);
				m=170;		//on sort de la boucle
			}
		}
	}
	
}

//bugs : 

//à faire:
//ranger                                     x
//faire des boutons
//ne pas recharger a chaque fois             x
//jeu entierement graphique
//choix du nombre de joueurs  				 v
//choix de la forme du jeu
//choix de la taille du jeu
//IA hasard									 x
//IA qui capture le plus de cases
//
