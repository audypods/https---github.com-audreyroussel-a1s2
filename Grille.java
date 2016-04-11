package projet;

import java.util.Scanner;
import edu.princeton.cs.introcs.StdDraw;
import java.lang.Character;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grille extends JFrame{

	char[][] couleurs;

	//Constructeur par défaut
	public Grille(){
		
		/*JPanel pan = new JPanel();
		JButton bouton = new JButton("Mon bouton");
		setTitle("Animation");
		setSize(300,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		pan.add(bouton);
		setContentPane(pan);
		setVisible(true);*/
		
		//Pour compter combien de cases sont controlees par les joueurs 1 et 2
		int compteurControle1 = 0;
		int compteurControle2 = 0;

		//creation du tableau avec les couleurs
		Lettre[][] couleurs = new Lettre[13][13];
		System.out.println("-----------------------------------------------------");
		for (int i=0; i<13; i++){
			System.out.print("| ");
			for (int j=0; j<13; j++){
				//remplit chaque case d'une lettre au hasard
				Lettre lettre = new Lettre();
				couleurs[i][j]=lettre;

				//controle de la case en haut a gauche par le joueur 1
				if (i==0&&j==0){
					couleurs[i][j].setControle(1);
					compteurControle1+=1;

				}
				//controle de la case en bas à droite par le joueur 2
				if (i==12&&j==12){
					//Pour que les cases en haut à gauche et en bas à droite ne soient pas de la meme couleur
					couleurs[i][j].setControle(2);
					while (couleurs[0][0].getLettre()==couleurs[i][j].getLettre()){
						Lettre a = new Lettre();
						couleurs[i][j].setLettre(a.getLettre());;
					}
					couleurs[i][j].setControle(2);
					compteurControle2+=1;
				}
				
				
				System.out.print(lettre.getLettre()+" | ");
			}
			System.out.println();
			System.out.println("-----------------------------------------------------");
			
		}
		dessinerGrille(couleurs);

		//début du jeu

		//Compteur qui permet de déterminer à qui le tour
		int m=0;

		//Lorsque toutes les cases sont controlées, fin du jeu
		while (compteurControle1+compteurControle2!=169){
			//la couleur en haut à gauche est le premier choix du joueur 1
			char choix1=couleurs[0][0].getLettre();
			//la couleur en bas à droite est le premier choix du joueur 2
			char choix2=couleurs[12][12].getLettre();

			//////////////////////////////tour du joueur 1///////////////////////////////////////

			if (m%2==0){
				//tour du joueur 1
				m=m+1;
				//demande au joueur quelle couleur il choisit et transforme le string en char
				Scanner scan = new Scanner(System.in);
				System.out.println("Couleur joueur 1?");
				String choixstring = scan.next();
				choix1 = choixstring.charAt(0);

				//Si ce n'est pas une lettre possible, on redemande au joueur
				if ((choix1 != 'r' && choix1 != 'v' && choix1 != 'b' && choix1 != 'j' && choix1 != 'o') || choix1 == Character.toLowerCase(choix2)){
					System.out.println("Ceci nest pas une couleur proposée");
					m=m-1;
				}

				else {
					for (int i=0;  i<13; i++){
						for (int j=0; j<13; j++){
							//Pour chaque case du tableau on vérifie si la case est controlée par le joueur 1
							boolean a = couleurs[i][j].getControle(1);
							if (a==true){
								//Si oui, la case devient de la couleur choisie
								couleurs[i][j].setLettre(choix1);

								if (j!=12){
									//Si ce n'est pas la derniere colonne, on regarde si la case à gauche est de la même couleur.
									//Si oui, on la controle 
									char b = couleurs[i][j+1].getLettre();
									if (b==choix1){
										couleurs[i][j+1].setControle(1);
										compteurControle1+=1;
									}
								}
								if (i!=12){
									//pareil pour la case en dessous
									char c = couleurs[i+1][j].getLettre();
									if (c==choix1){
										couleurs[i+1][j].setControle(1);
										compteurControle1+=1;
									}
								}
								if (j!=0){
									//pareil pour la case à droite
									char d = couleurs[i][j-1].getLettre();
									if (d==choix1){
										couleurs[i][j-1].setControle(1);
										compteurControle1+=1;
									}
								}
								if (i!=0){
									//pareil pour la case en haut
									char e = couleurs[i-1][j].getLettre();
									if (e==choix1){
										couleurs[i-1][j].setControle(1);
										compteurControle1+=1;
									}
								}
							}
						}
					}
				}

				//tracé du tableau avec les valeurs du tableau
				System.out.println("-----------------------------------------------------");
				for (int i=0; i<13; i++){
					System.out.print("| ");
					for (int j=0;j<13; j++){
						System.out.print(couleurs[i][j].getLettre()+" | ");

					}
					System.out.println();
					System.out.println("-----------------------------------------------------");
				}
				dessinerGrille(couleurs);
				
			}

			//////////////////////////////////////////tour du joueur 2//////////////////////////////////////////////////////////////////

			else {
				//tour du joueur 2
				m=m+1;
				//demande au joueur quelle couleur il choisit et transforme le string en char
				Scanner scan = new Scanner(System.in);
				System.out.println("Couleur joueur 2?");
				String choixstring = scan.next();
				choix2 = choixstring.charAt(0);

				//Si ce n'est pas une lettre possible, on redemande au joueur
				if ((choix2 != 'r' && choix2 != 'v' && choix2 != 'b' && choix2 != 'j' && choix2 != 'o') || choix2 == Character.toLowerCase(choix1)){
					System.out.println("Ceci nest pas une couleur proposée");
					m=m-1;
				}

				else {
					for (int i=12;  i>=0; i--){
						for (int j=12; j>=0; j--){
							//Pour chaque case du tableau on vérifie si la case est controlée par le joueur 2
							boolean a = couleurs[i][j].getControle(2);
							if (a==true){
								//Si oui, la case devient de la couleur choisie
								couleurs[i][j].setLettre(choix2);

								if (j!=12){
									//Si ce n'est pas la derniere colonne, on regarde si la case à gauche est de la même couleur.
									//Si oui, on la controle 
									char b = couleurs[i][j+1].getLettre();
									if (b==choix2){
										couleurs[i][j+1].setControle(2);
										compteurControle2+=1;
									}
								}
								if (i!=12){
									//pareil pour la case en dessous
									char c = couleurs[i+1][j].getLettre();
									if (c==choix2){
										couleurs[i+1][j].setControle(2);
										compteurControle2+=1;
									}
								}
								if (j!=0){
									//pareil pour la case à droite
									char d = couleurs[i][j-1].getLettre();
									if (d==choix2){
										couleurs[i][j-1].setControle(2);
										compteurControle2+=1;
									}
								}
								if (i!=0){
									//pareil pour la case en haut
									char e = couleurs[i-1][j].getLettre();
									if (e==choix2){
										couleurs[i-1][j].setControle(2);
										compteurControle2+=1;
									}
								}
							}
						}
					}
				}

				//tracé du tableau avec les valeurs du tableau
				System.out.println("-----------------------------------------------------");
				for (int i=0; i<13; i++){
					System.out.print("| ");
					for (int j=0;j<13; j++){
						System.out.print(couleurs[i][j].getLettre()+" | ");

					}
					System.out.println();
					System.out.println("-----------------------------------------------------");
				}
				dessinerGrille(couleurs);
			}
			if (compteurControle1>169/2 || compteurControle2>169/2){
				break;
			}
		}
		System.out.println("-----------------------------------------------------");
		for (int i=0; i<13; i++){
			System.out.print("| ");
			for (int j=0; j<13; j++){
				System.out.print(couleurs[i][j].getLettre()+" | ");

			}
			System.out.println();
			System.out.println("-----------------------------------------------------");
		}

		//////////////////fin du jeu/////////////////////
		if (compteurControle1>compteurControle2){
			System.out.println("Le joueur 1 a gagné!");
		}
		else{
			System.out.println("Le joueur 2 a gagné!");
		}
		
	}
	public static void dessinerGrille (Lettre[][] couleurs1){
		

		/*Font k = new Font("Verdana", 3, 40);
		Font l = new Font("Verdana", 2, 30);*/
		
		
		StdDraw.setXscale(-1, couleurs1.length-0.0);
		StdDraw.setYscale(-2, couleurs1.length-1);
		StdDraw.clear(Color.white);
		StdDraw.setPenColor(StdDraw.BLACK);
		
		/*StdDraw.setFont(k);
		StdDraw.text(10, 11, "Jeu des 6 Couleurs");
		StdDraw.setFont(l);*/

		for (int i=0; i<13; i++){
			for (int j=0; j<13; j++){
				if (couleurs1[i][j].getLettre()=='r' || couleurs1[i][j].getLettre()=='R')
					StdDraw.setPenColor(StdDraw.RED);
				else if (couleurs1[i][j].getLettre()=='b' || couleurs1[i][j].getLettre()=='B')
					StdDraw.setPenColor(StdDraw.BLUE);
				else if (couleurs1[i][j].getLettre()=='v'|| couleurs1[i][j].getLettre()=='V')
					StdDraw.setPenColor(StdDraw.GREEN);
				else if (couleurs1[i][j].getLettre()=='j' || couleurs1[i][j].getLettre()=='J')
					StdDraw.setPenColor(StdDraw.YELLOW);
				else if (couleurs1[i][j].getLettre()=='o' || couleurs1[i][j].getLettre()=='O')
					StdDraw.setPenColor(255, 150, 0);
				
				StdDraw.setPenRadius(0.01);
				
				StdDraw.filledSquare(j, 11-i, 0.5);
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.square(j, 11-i, 0.5);
			}
		}
	}
}


