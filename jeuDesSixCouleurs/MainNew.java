package jeuDesSixCouleurs;
import java.awt.Font;
import java.util.Scanner;
import edu.princeton.cs.introcs.StdDraw;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ____________________________\n|                            |\n|   Le Jeu des 6 Couleurs    |\n|____________________________| \n\n");
		
		char choix;
		System.out.println("Appuyez sur: \n\n (1) pour jouer au jeu \n (q) pour quitter l'application");
		
		do {
			choix = sc.nextLine().charAt(0);
			
			if (choix == '1'){
				
				//étape 1: création de la grille et de la fenetre StdDraw
				Lettre[][] couleurs = new Lettre[13][13];
				int compteurControle1 = 0;
				int compteurControle2 = 0;
				//Compteur qui permet de déterminer à qui c'est le tour de jouer
				int m=1;
				Grille.creationValeursGrille(couleurs, compteurControle1, compteurControle2);
				StdDraw.setCanvasSize(1920, 1080);
				StdDraw.setXscale(-1, 2*couleurs.length-0.0);
				StdDraw.setYscale(-2, couleurs.length-1);
				Grille.checkControle1(couleurs, compteurControle1);
				Grille.checkControle2(couleurs, compteurControle2);
				//étape 2: dessin de la grille dans la fenêtre
				Grille.dessineGrille(couleurs, compteurControle1, compteurControle2);
				boolean findujeu = false;
				//étape 3: boucle qui permet de changer la grille selon les choix faits par les joueurs et dessine la grille
				while (m<=169){
					if (m%2!=0 && m!=2){
						Grille.stepJoueur1(couleurs);
					}
					else {
						Grille.stepJoueur2(couleurs);
					}
					StdDraw.clear();
					Grille.dessineGrille(couleurs, compteurControle1, compteurControle2);
					Grille.checkControle1(couleurs, compteurControle1);
					Grille.checkControle2(couleurs, compteurControle2);
					m+=1;
					//if (Grille.verifGagnant(couleurs, compteurControle1, compteurControle2)==true){
						Font l = new Font("Verdana", 3, 120);
						StdDraw.setFont(l);
						StdDraw.text(13, 6.5, "Partie terminée", 20);
						m=170;		//on sort de la boucle
					//}
				}
				
				choix = 'q';
				System.out.println("Au revoir !" );
			}
			else if (choix == 'q'){
				System.out.println("Au revoir !" );
			}
			else {
				System.out.println(" ________________________________________________\n/                                                 \\\n|  Veuillez entrer un des charactères demandés !  |\n\\_________________________________________________/" );
			}
		} while (choix!= 'q');
		
		
		
		
		
		
		Grille grille = new Grille();
	}

}

//bugs : 
//affichage dans fenetre
//couleurs qui touchent au debut ne sont pas controlées

//à faire:
//ranger
//faire des boutons
//ne pas recharger a chaque fois
//jeu entierement graphique
//choix du nombre de joueurs
//choix de la forme du jeu 
//choix de la taille du jeu
//IA hasard
//IA qui capture le plus de cases
//
