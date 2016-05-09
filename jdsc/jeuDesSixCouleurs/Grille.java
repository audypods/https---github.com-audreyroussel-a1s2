package jeuDesSixCouleurs;
import java.util.Scanner;
import edu.princeton.cs.introcs.StdDraw;
import java.lang.Character;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Random;

public class Grille extends JFrame{

	char[][] couleurs;

	//Constructeur par défaut
	public Grille(){
		
	}
	
	//creationValeursGrille sert à attribuer à chaque case du de la grille une lettre
	public static Lettre[][] creationValeursGrille(Lettre[][] grille, int compteur1, int compteur2, int compteur3, int compteur4){
		
		for (int i=0; i<13; i++){
			for (int j=0; j<13; j++){
				//remplit chaque case d'une lettre au hasard
				Lettre lettre = new Lettre();
				grille[i][j]=lettre;

				//controle de la case en haut a gauche par le joueur 1
				if (i==0&&j==0){
					grille[i][j].setControle(1);
					grille[i][j].setLettre('n');

				}
				//controle de la case en bas à droite par le joueur 2
				if (i==12&&j==12){
					//Pour que les cases en haut à gauche et en bas à droite ne soient pas de la meme couleur
					grille[i][j].setControle(2);
					grille[i][j].setLettre('n');
					/*while (grille[0][0].getLettre()==grille[i][j].getLettre()){
						Lettre a = new Lettre();
						grille[i][j].setLettre(a.getLettre());;
					}*/
				}
				//controle de la case en haut à droite par le joueur 3
				if (i==0 && j==12 && compteur3!=0){
					grille[i][j].setControle(3);
					grille[i][j].setLettre('n');
				}
				//controle de la case en bas à gauche par le joueur 4
				if (i==12 && j==0 && compteur4!=0){
					grille[i][j].setControle(4);
					grille[i][j].setLettre('n');
				}
			}
		}
		return grille;
	}
	
	//dessineGrille permet d'afficher la grille via StdDraw
	//return grille
	public static Lettre[][] dessineGrille(Lettre[][] grille, int compteur1, int compteur2, int compteur3, int compteur4){
		for (int i=0; i<13; i++){
			for (int j=0; j<13; j++){
				
				if (grille[i][j].getLettre()=='r' || grille[i][j].getLettre()=='R')
					StdDraw.setPenColor(StdDraw.RED);
				else if (grille[i][j].getLettre()=='b' || grille[i][j].getLettre()=='B')
					StdDraw.setPenColor(StdDraw.BLUE);
				else if (grille[i][j].getLettre()=='v'|| grille[i][j].getLettre()=='V')
					StdDraw.setPenColor(StdDraw.GREEN);
				else if (grille[i][j].getLettre()=='j' || grille[i][j].getLettre()=='J')
					StdDraw.setPenColor(StdDraw.YELLOW);
				else if (grille[i][j].getLettre()=='o' || grille[i][j].getLettre()=='O')
					StdDraw.setPenColor(255, 150, 0);
				else if (grille[i][j].getLettre()=='i' || grille[i][j].getLettre()=='I')
					StdDraw.setPenColor(204,51,204);
				else if (grille[i][j].getLettre()=='n' || grille[i][j].getLettre()=='N')
					StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.setPenRadius(0.01);
				StdDraw.filledSquare(j, 11-i, 0.5);
				
				StdDraw.setPenColor(StdDraw.WHITE);
				StdDraw.square(j, 11-i, 0.5);
				
				if (grille[i][j].getControle(1)==true){
					StdDraw.setPenRadius(0.005);
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.filledSquare(j, 11-i, 0.1);
				}
				
				else if (grille[i][j].getControle(2)==true){
					StdDraw.setPenRadius(0.005);
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.filledCircle(j, 11-i, 0.1);
				}
				
				else if (grille[i][j].getControle(3)==true && compteur3!=0){
					StdDraw.setPenRadius(0.005);
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.square(j, 11-i, 0.1);
				}
				else if (grille[i][j].getControle(4)==true && compteur4!=0){
					StdDraw.setPenRadius(0.005);
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.circle(j, 11-i, 0.1);
				}
				
				Font k = new Font("Verdana", 3, 40);
				
				if (grille[i][j].getLettre()=='N' && i==0 && j==0){
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.filledSquare(j, 11-i, 0.5);
					StdDraw.setFont(k);
					StdDraw.setPenColor(StdDraw.WHITE);
					StdDraw.text(j, 11-i, "J1");
				}
				
				else if (grille[i][j].getLettre()=='N' && i==12 && j==12){
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.filledSquare(j, 11-i, 0.5);
					StdDraw.setFont(k);
					StdDraw.setPenColor(StdDraw.WHITE);
					StdDraw.text(j, 11-i, "J2");
				}
				
				else if (grille[i][j].getLettre()=='N' && i==0 && j==12){
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.filledSquare(j, 11-i, 0.5);
					StdDraw.setFont(k);
					StdDraw.setPenColor(StdDraw.WHITE);
					StdDraw.text(j, 11-i, "J3");
				}
				
				else if (grille[i][j].getLettre()=='N' && i==12 && j==0){
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.filledSquare(j, 11-i, 0.5);
					StdDraw.setFont(k);
					StdDraw.setPenColor(StdDraw.WHITE);
					StdDraw.text(j, 11-i, "J4");
				}
				
				else {
					
				}
				
				StdDraw.setPenRadius(0.005);
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.square(6, 5, 6.5);
				}
		}
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledCircle(13.5, 7, 0.5);

		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledCircle(13.5, 5.8, 0.5);

		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledCircle(13.5, 4.6, 0.5);

		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledCircle(13.5, 3.4, 0.5);

		StdDraw.setPenColor(204,51,204);
		StdDraw.filledCircle(13.5, 2.2, 0.5);

		StdDraw.setPenColor(255, 150, 0);
		StdDraw.filledCircle(13.5, 1, 0.5);
		return grille;
	}
	
	public static void dessinCouleurs(){
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledRectangle(13.5, 4, 0.5, 3.5);
		
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledCircle(13.5, 7, 0.5);

		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledCircle(13.5, 5.8, 0.5);

		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledCircle(13.5, 4.6, 0.5);

		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledCircle(13.5, 3.4, 0.5);

		StdDraw.setPenColor(204,51,204);
		StdDraw.filledCircle(13.5, 2.2, 0.5);

		StdDraw.setPenColor(255, 150, 0);
		StdDraw.filledCircle(13.5, 1, 0.5);
	}
	
	public static Lettre[][] stepJoueur1(Lettre[][] grille){
		//la couleur en haut à gauche est le premier choix du joueur 1
		char choix1=grille[0][0].getLettre();
		//la couleur en bas à droite est le premier choix du joueur 2
		char choix2=grille[12][12].getLettre();
		Scanner scan = new Scanner(System.in);
		System.out.println("Couleur joueur 1?");
		dessinCouleurs();
		StdDraw.setPenColor(StdDraw.BLACK);
		if (Character.toLowerCase(choix2)=='i'){
			StdDraw.line(13, 1.7, 14, 2.7);
			StdDraw.line(13, 2.7, 14, 1.7);
		}
		else{
		}
		if (Character.toLowerCase(choix2)=='r'){
			StdDraw.line(13, 4.1, 14, 5.1);
			StdDraw.line(13, 5.1, 14, 4.1);
		}
		else{
		}
		if (Character.toLowerCase(choix2)=='j'){
			StdDraw.line(13, 6.5, 14, 7.5);
			StdDraw.line(13, 7.5, 14, 6.5);
		}
		else{
		}
		if (Character.toLowerCase(choix2)=='b'){
			StdDraw.line(13, 5.3, 14, 6.3);
			StdDraw.line(13, 6.3, 14, 5.3);
		}
		else{
		}
		if (Character.toLowerCase(choix2)=='v'){
			StdDraw.line(13, 2.9, 14, 3.9);
			StdDraw.line(13, 3.9, 14, 2.9);
		}
		else{
		}
		if (Character.toLowerCase(choix2)=='o'){
			StdDraw.line(13, 0.5, 14, 1.5);
			StdDraw.line(13, 1.5, 14, 0.5);
		}
		else{
		}
		System.out.println();
		do{
			double x=1,y=1;
			while(!StdDraw.mousePressed()){
				x = StdDraw.mouseX();
				y = StdDraw.mouseY();
			}
			
			if (x>=13 && x<=14 && y>=6.5 && y<=7.5) {
				choix1 = 'j';
			}
			else if (x>=13 && x<=14 && y>=5.3 && y<=6.3){
				choix1= 'b';
			}
			else if (x>=13 && x<=14 && y>=4.1 && y<=5.1){
				choix1= 'r';
			}
			else if (x>=13 && x<=14 && y>=2.9 && y<=3.9){
				choix1= 'v';
			}
			else if (x>=13 && x<=14 && y>=1.7 && y<=2.7){
				choix1= 'i';
			}
			else if (x>=13 && x<=14 && y>=0.5 && y<=1.5){
				choix1 = 'o';
			}
			else {
				choix1='a';
			}
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledRectangle(19, 0.5, 5, 1);
		
			//Si ce n'est pas une lettre possible, on redemande au joueur
			if (Character.toLowerCase(choix1) != 'r' && Character.toLowerCase(choix1) != 'v' && Character.toLowerCase(choix1) != 'b' && Character.toLowerCase(choix1) != 'j' && Character.toLowerCase(choix1) != 'o' && Character.toLowerCase(choix1) != 'i'){
				System.out.println("veuillez cliquer sur une couleur proposée");
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.text(19, 1, "Ceci nest pas une");
				StdDraw.text(19, 0, "couleur proposée");
			}
		
			else if (Character.toLowerCase(choix1) == Character.toLowerCase(choix2)){
				System.out.println("vous ne pouvez pas choisir la même couleur que l'adversaire");
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.text(19, 1, "vous ne pouvez pas choisir la");
				StdDraw.text(19, 0, "même couleur que l'adversaire");
			}

			else {
				for (int i=0;  i<13; i++){
					for (int j=0; j<13; j++){
						//Pour chaque case du tableau on vérifie si la case est controlée par le joueur 1
						boolean a = grille[i][j].getControle(1);
						if (a==true){
							//Si oui, la case devient de la couleur choisie
							grille[i][j].setLettre(choix1);
							//-----------test erreur
							boolean test= false;
							//-----------
							if (j!=12){
								//Si ce n'est pas la derniere colonne, on regarde si la case à gauche (droite vincent) est de la même couleur.
								//Si oui, on la controle 
								char b = grille[i][j+1].getLettre();
								if (b==choix1){
									grille[i][j+1].setControle(1);
								}
							}
							if (i!=12){
								//pareil pour la case en dessous
								char c = grille[i+1][j].getLettre();
								if (c==choix1){
									grille[i+1][j].setControle(1);
								}
							}
							if (j!=0 && test!=true){
								//pareil pour la case à droite (gauche vincent)
								char d = grille[i][j-1].getLettre();
								if (d==choix1){
									grille[i][j-1].setControle(1);
									j-=2;
									test=true;
								}
							}
							if (i!=0 && test!=true){
								//pareil pour la case en haut
								char e = grille[i-1][j].getLettre();
								if (e==choix1){
									grille[i-1][j].setControle(1);
									i-=1;
									j-=1;
									test=true;
								}
							}
					}
				}
			}
		}
	}while(Character.toLowerCase(choix1) != 'r' && Character.toLowerCase(choix1) != 'v' && Character.toLowerCase(choix1) != 'b' && Character.toLowerCase(choix1) != 'j' && Character.toLowerCase(choix1) != 'o' && Character.toLowerCase(choix1) != 'i' || Character.toLowerCase(choix1) == Character.toLowerCase(choix2));
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledRectangle(19, 0.5, 5, 1);
		return grille;
	}
	
	public static Lettre[][] stepJoueur2(Lettre[][] grille){
		//la couleur en haut à gauche est le premier choix du joueur 1
		char choix1=grille[0][0].getLettre();
		//la couleur en bas à droite est le premier choix du joueur 2
		char choix2=grille[12][12].getLettre();
		Scanner scan = new Scanner(System.in);
		System.out.println("Couleur joueur 2?");
		dessinCouleurs();
		StdDraw.setPenColor(StdDraw.BLACK);
		if (Character.toLowerCase(choix1)=='i'){
			StdDraw.line(13, 1.7, 14, 2.7);
			StdDraw.line(13, 2.7, 14, 1.7);
		}
		else{
		}
		if (Character.toLowerCase(choix1)=='r'){
			StdDraw.line(13, 4.1, 14, 5.1);
			StdDraw.line(13, 5.1, 14, 4.1);
		}
		else{
		}
		if (Character.toLowerCase(choix1)=='j'){
			StdDraw.line(13, 6.5, 14, 7.5);
			StdDraw.line(13, 7.5, 14, 6.5);
		}
		else{
		}
		if (Character.toLowerCase(choix1)=='b'){
			StdDraw.line(13, 5.3, 14, 6.3);
			StdDraw.line(13, 6.3, 14, 5.3);
		}
		else{
		}
		if (Character.toLowerCase(choix1)=='v'){
			StdDraw.line(13, 2.9, 14, 3.9);
			StdDraw.line(13, 3.9, 14, 2.9);
		}
		else{
		}
		if (Character.toLowerCase(choix1)=='o'){
			StdDraw.line(13, 0.5, 14, 1.5);
			StdDraw.line(13, 1.5, 14, 0.5);
		}
		else{
		}
		System.out.println();
		do{
			//String choixstring = scan.next();
			//choix2 = choixstring.charAt(0);
			//----------------------------
			double x=1,y=1;
			while(!StdDraw.mousePressed()){
				x = StdDraw.mouseX();
				y = StdDraw.mouseY();
			}
			
			if (x>=13 && x<=14 && y>=6.5 && y<=7.5) {
				choix2 = 'j';
			}
			else if (x>=13 && x<=14 && y>=5.3 && y<=6.3){
				choix2= 'b';
			}
			else if (x>=13 && x<=14 && y>=4.1 && y<=5.1){
				choix2= 'r';
			}
			else if (x>=13 && x<=14 && y>=2.9 && y<=3.9){
				choix2= 'v';
			}
			else if (x>=13 && x<=14 && y>=1.7 && y<=2.7){
				choix2= 'i';
			}
			else if (x>=13 && x<=14 && y>=0.5 && y<=1.5){
				choix2 = 'o';
			}
			else {
				choix2='a';
			}
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledRectangle(19, 0.5, 5, 1);

			//Si ce n'est pas une lettre possible, on redemande au joueur
			if (Character.toLowerCase(choix2) != 'r' && Character.toLowerCase(choix2) != 'v' && Character.toLowerCase(choix2) != 'b' && Character.toLowerCase(choix2) != 'j' && Character.toLowerCase(choix2) != 'o' && Character.toLowerCase(choix2) != 'i'){
				System.out.println("Ceci nest pas une couleur proposée");
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.text(19, 1, "Ceci nest pas une");
				StdDraw.text(19, 0, "couleur proposée");
			}
		
			else if (Character.toLowerCase(choix2) == Character.toLowerCase(choix1)){
				System.out.println("vous ne pouvez pas choisir la même couleur que l'adversaire");
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.text(19, 1, "vous ne pouvez pas choisir la");
				StdDraw.text(19, 0, "même couleur que l'adversaire");
			}

			else {
				for (int i=12;  i>=0; i--){
					for (int j=12; j>=0; j--){
						//Pour chaque case du tableau on vérifie si la case est controlée par le joueur 2
						boolean a = grille[i][j].getControle(2);
						if (a==true){
							//Si oui, la case devient de la couleur choisie
							grille[i][j].setLettre(choix2);
							
							boolean test=false;
							
							if (j!=0){
								//pareil pour la case à droite
								char d = grille[i][j-1].getLettre();
								if (d==choix2){
									grille[i][j-1].setControle(2);
								}
							}
							if (i!=0){
								//pareil pour la case en haut
								char e = grille[i-1][j].getLettre();
								if (e==choix2){
									grille[i-1][j].setControle(2);
								}
							}
							if (j!=12 && test!=true){
								//Si ce n'est pas la derniere colonne, on regarde si la case à gauche (droite vincent) est de la même couleur.
								//Si oui, on la controle 
								char b = grille[i][j+1].getLettre();
								if (b==choix2){
									grille[i][j+1].setControle(2);
									j+=2;
									test=true;
								}
							}
							if (i!=12 && test!=true){
								//pareil pour la case en dessous
								char c = grille[i+1][j].getLettre();
								if (c==choix2){
									grille[i+1][j].setControle(2);
									i+=1;
									j+=1;
									test=true;
									//if (j!=12)
										//j+=1;
								}
							}
						}
					}
				}
			}
		}while(Character.toLowerCase(choix2) != 'r' && Character.toLowerCase(choix2) != 'v' && Character.toLowerCase(choix2) != 'b' && Character.toLowerCase(choix2) != 'j' && Character.toLowerCase(choix2) != 'o' && Character.toLowerCase(choix2) != 'i' || Character.toLowerCase(choix2) == Character.toLowerCase(choix1));
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledRectangle(19, 0.5, 5, 1);
		return grille;
	}
	
	public static Lettre[][] stepJoueur3(Lettre[][] grille){
		//la couleur en haut à gauche est le premier choix du joueur 1
		char choix1=grille[0][0].getLettre();
		//la couleur en bas à droite est le premier choix du joueur 2
		char choix2=grille[12][12].getLettre();
		
		char choix3=grille[0][12].getLettre();
		Scanner scan = new Scanner(System.in);
		System.out.println("Couleur joueur 2?");
		if (Character.toLowerCase(choix1)=='i' || Character.toLowerCase(choix2)=='i'){
			
		}
		else{
			System.out.print("violet     ");
		}
		if (Character.toLowerCase(choix1)=='r' || Character.toLowerCase(choix2)=='r'){
			
		}
		else{
			System.out.print("rouge     ");
		}
		if (Character.toLowerCase(choix1)=='j' || Character.toLowerCase(choix2)=='j'){
			
		}
		else{
			System.out.print("jaune     ");
		}
		if (Character.toLowerCase(choix1)=='b' || Character.toLowerCase(choix2)=='b'){
			
		}
		else{
			System.out.print("bleu     ");
		}
		if (Character.toLowerCase(choix1)=='v' || Character.toLowerCase(choix2)=='v'){
			
		}
		else{
			System.out.print("vert     ");
		}
		if (Character.toLowerCase(choix1)=='o' || Character.toLowerCase(choix2)=='o'){
			
		}
		else{
			System.out.print("orange     ");
		}
		System.out.println();
		do{
			String choixstring = scan.next();
			choix3 = choixstring.charAt(0);
			//tour du joueur 2
			//m=m+1;

			//Si ce n'est pas une lettre possible, on redemande au joueur
			if (Character.toLowerCase(choix3) != 'r' && Character.toLowerCase(choix3) != 'v' && Character.toLowerCase(choix3) != 'b' && Character.toLowerCase(choix3) != 'j' && Character.toLowerCase(choix3) != 'o' && Character.toLowerCase(choix3) != 'i'){
				System.out.println("Ceci nest pas une couleur proposée");
			}
		
			else if (Character.toLowerCase(choix3) == Character.toLowerCase(choix1) || Character.toLowerCase(choix3) == Character.toLowerCase(choix2)){
				System.out.println("vous ne pouvez pas choisir la même couleur que l'adversaire");
			}

			else {
				for (int i=0;  i<13; i++){
					for (int j=12; j>=0; j--){
						//Pour chaque case du tableau on vérifie si la case est controlée par le joueur 2
						boolean a = grille[i][j].getControle(3);
						if (a==true){
							//Si oui, la case devient de la couleur choisie
							grille[i][j].setLettre(choix3);
							
							//---------test
							boolean test=false;
							//---------
							
							
						}
					}
				}
			}
		}while(Character.toLowerCase(choix2) != 'r' && Character.toLowerCase(choix2) != 'v' && Character.toLowerCase(choix2) != 'b' && Character.toLowerCase(choix2) != 'j' && Character.toLowerCase(choix2) != 'o' && Character.toLowerCase(choix2) != 'i' || Character.toLowerCase(choix2) == Character.toLowerCase(choix1));
			return grille;
	}
//----------------------------------------------------------------//
	
	
//----------------------------------------------------------------//
	public static Lettre[][] stepIAHasard(Lettre[][] grille){
		//la couleur en haut à gauche est le premier choix du joueur 1
		char choix1=grille[0][0].getLettre();
		//la couleur en bas à droite est le premier choix du joueur 2
		char memechoix2=grille[12][12].getLettre();
		Scanner scan = new Scanner(System.in);
		System.out.println("Couleur de l'ordinateur ?");
		char[] couleurHasard = {'r','o','j','v','b','i'};
		Random rand = new Random();
		int z = rand.nextInt(6);
		char choix2 = couleurHasard[z];
		while (choix2==Character.toLowerCase(choix1) || choix2==memechoix2){
			z = rand.nextInt(6);
			choix2 = couleurHasard[z];
		}
		if (choix2=='r')
			System.out.println("rouge");
		else if (choix2=='o')
			System.out.println("orange");
		else if (choix2=='j')
			System.out.println("jaune");
		else if (choix2=='v')
			System.out.println("vert");
		else if (choix2=='b')
			System.out.println("bleu");
		else if (choix2=='i')
			System.out.println("violet");
		//tour de l'ordinateur
			
				for (int i=12;  i>=0; i--){
					for (int j=12; j>=0; j--){
						//Pour chaque case du tableau on vérifie si la case est controlée par le joueur 2
						boolean a = grille[i][j].getControle(2);
						if (a==true){
							//Si oui, la case devient de la couleur choisie
							grille[i][j].setLettre(choix2);
							
							//---------test
							boolean test=false;
							//---------
							
							if (j!=0){
								//pareil pour la case à droite
								char d = grille[i][j-1].getLettre();
								if (d==choix2){
									grille[i][j-1].setControle(2);
								}
							}
							if (i!=0){
								//pareil pour la case en haut
								char e = grille[i-1][j].getLettre();
								if (e==choix2){
									grille[i-1][j].setControle(2);
								}
							}
							if (j!=12 && test!=true){
								//Si ce n'est pas la derniere colonne, on regarde si la case à gauche (droite vincent) est de la même couleur.
								//Si oui, on la controle 
								char b = grille[i][j+1].getLettre();
								if (b==choix2){
									grille[i][j+1].setControle(2);
									j+=2;
									test=true;
								}
							}
							if (i!=12 && test!=true){
								//pareil pour la case en dessous
								char c = grille[i+1][j].getLettre();
								if (c==choix2){
									grille[i+1][j].setControle(2);
									i+=1;
									j+=1;
									test=true;
									//if (j!=12)
										//j+=1;
								}
							}
						}
					}
				}
		return grille;
	}
//----------------------------------------------------------------//
	
	public static int checkControle1(Lettre[][] grille,int compteur1){
		Font k = new Font("Verdana", 3, 26);
		for (int i=0; i<13; i++){
			for (int j=0; j<13; j++){
				if (grille[i][j].getControle(1)==true){
					compteur1+=1;
				}
				else {
					
				}
			}
		}
		StdDraw.setFont(k);
		if (compteur1>1)
			StdDraw.text(18, 5, "le joueur 1 a " + compteur1 + " cases");
		else
			StdDraw.text(18, 5, "le joueur 1 a " + compteur1 + " case");
		return compteur1;
	}
	public static int checkControle2(Lettre[][] grille,int compteur2){
		Font k = new Font("Verdana", 3, 26);
		for (int i=0; i<13; i++){
			for (int j=0; j<13; j++){
				if (grille[i][j].getControle(2)==true){
					compteur2+=1;
				}
				else {
					
				}
			}
		}
		StdDraw.setFont(k);
		if (compteur2>1)
			StdDraw.text(18, 4, "le joueur 2 a " + compteur2 + " cases");
		else
			StdDraw.text(18, 4, "le joueur 2 a " + compteur2 + " case");
		return compteur2;
	}
	
	public static int checkControle3(Lettre[][] grille,int compteur3){
		Font k = new Font("Verdana", 3, 26);
		for (int i=0; i<13; i++){
			for (int j=0; j<13; j++){
				if (grille[i][j].getControle(3)==true){
					compteur3+=1;
				}
				else {
					
				}
			}
		}
		StdDraw.setFont(k);
		if (compteur3>1)
			StdDraw.text(18, 4, "le joueur 2 a " + compteur3 + " cases");
		else
			StdDraw.text(18, 4, "le joueur 2 a " + compteur3 + " case");
		return compteur3;
	}
	
	public static boolean verifGagnant(Lettre[][] grille,int compteur1, int compteur2, int compteur3, int compteur4){
		for (int i=0; i<13; i++){
			for (int j=0; j<13; j++){
				if (grille[i][j].getControle(1)==true){
					compteur1+=1;
				}
				else {
					
				}
			}
		}
		for (int i=0; i<13; i++){
			for (int j=0; j<13; j++){
				if (grille[i][j].getControle(2)==true){
					compteur2+=1;
				}
				else {
					
				}
			}
		}
		
		if (compteur3!=0){
			for (int i=0; i<13; i++){
				for (int j=0; j<13; j++){
					if (grille[i][j].getControle(3)==true){
						compteur3+=1;
					}
					else {
						
					}
				}
			}
		}
		
		if (compteur4!=0){
			for (int i=0; i<13; i++){
				for (int j=0; j<13; j++){
					if (grille[i][j].getControle(4)==true){
						compteur4+=1;
					}
					else {
						
					}
				}
			}
		}
		
		Font t = new Font("Verdana", 3, 32);
		StdDraw.setFont(t);
		if (compteur1>84){
			StdDraw.text(18, 3, "le joueur 1 a gagné");
			return true;
		}
		else if (compteur2>84){
			StdDraw.text(18, 3, "le joueur 2 a gagné");
			return true;
		}
		else if (compteur3>84){
			StdDraw.text(18, 3, "le joueur 3 a gagné");
			return true;
		}
		else if (compteur4>84){
			StdDraw.text(18, 3, "le joueur 4 a gagné");
			return true;
		}
		else {
			return false;
		}
	}
	
	//---------------------------------FONCTION UPGRADE GRILLE-----------------------------------//
	
	public static void majGrille(Lettre[][] grille, char[][] grille2,  int compteur1, int compteur2, int compteur3, int compteur4){
		
		for (int i=0; i<13; i++){
			for (int j=0; j<13; j++){
				//System.out.print(" | " +grille2[i][j] + grille[i][j].getLettre() + " | ");
				if (grille2[i][j] != grille[i][j].getLettre()){
					if (grille[i][j].getLettre()=='r' || grille[i][j].getLettre()=='R')
						StdDraw.setPenColor(StdDraw.RED);
					else if (grille[i][j].getLettre()=='b' || grille[i][j].getLettre()=='B')
						StdDraw.setPenColor(StdDraw.BLUE);
					else if (grille[i][j].getLettre()=='v'|| grille[i][j].getLettre()=='V')
						StdDraw.setPenColor(StdDraw.GREEN);
					else if (grille[i][j].getLettre()=='j' || grille[i][j].getLettre()=='J')
						StdDraw.setPenColor(StdDraw.YELLOW);
					else if (grille[i][j].getLettre()=='o' || grille[i][j].getLettre()=='O')
						StdDraw.setPenColor(255, 150, 0);
					else if (grille[i][j].getLettre()=='i' || grille[i][j].getLettre()=='I')
						StdDraw.setPenColor(204,51,204);
					StdDraw.setPenRadius(0.01);
					StdDraw.filledSquare(j, 11-i, 0.5);
				
					StdDraw.setPenColor(StdDraw.WHITE);
					StdDraw.square(j, 11-i, 0.5);
				
					if (grille[i][j].getControle(1)==true){
						StdDraw.setPenRadius(0.005);
						StdDraw.setPenColor(StdDraw.BLACK);
						StdDraw.filledSquare(j, 11-i, 0.1);
					}
				
					else if (grille[i][j].getControle(2)==true){
						StdDraw.setPenRadius(0.005);
						StdDraw.setPenColor(StdDraw.BLACK);
						StdDraw.filledCircle(j, 11-i, 0.1);
					}
					
					else if (grille[i][j].getControle(3)==true){
						StdDraw.setPenRadius(0.005);
						StdDraw.setPenColor(StdDraw.BLACK);
						StdDraw.square(j, 11-i, 0.1);
					}
					
					else if (grille[i][j].getControle(4)==true){
						StdDraw.setPenRadius(0.005);
						StdDraw.setPenColor(StdDraw.BLACK);
						StdDraw.circle(j, 11-i, 0.1);
					}
					
					else {
						
					}
					StdDraw.setPenRadius(0.005);
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.square(6, 5, 6.5);
				} else{
					
				}
			}
			//System.out.println();
		}
		//return grille;
	}
	
	//---------------------------------FONCTION UPGRADE GRILLE-----------------------------------//
}