package JeuDesSixCouleurs2;
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


	}

	//creationValeursGrille sert à attribuer à chaque case du de la grille une lettre
	public static Lettre[][] creationValeursGrille(Lettre[][] grille, int compteur1, int compteur2){

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
					grille[i][j].setLettre('n');
					grille[i][j].setControle(2);
				}
			}
		}
		return grille;
	}

	//dessineGrille permet d'afficher la grille via StdDraw
	//return grille
	public static Lettre[][] dessineGrille(Lettre[][] grille, int compteur1, int compteur2, int affichejoueur){
		for (int i=0; i<13; i++){
			for (int j=0; j<13; j++){

				StdDraw.setXscale(-9, grille[0].length+24);
				StdDraw.setYscale(-10, grille.length+6);

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
					StdDraw.setPenColor(StdDraw.MAGENTA);
				else if (grille[i][j].getLettre()=='j' || grille[i][j].getLettre()=='J')
					StdDraw.setPenColor(StdDraw.YELLOW);
				else if ((i==0 && j==0) || (i==12 && j==12))
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

				Font k = new Font("Verdana", 3, 40);

				if (i==0 && j==0 && affichejoueur<1){
					StdDraw.setFont(k);
					StdDraw.setPenColor(StdDraw.WHITE);
					StdDraw.text(j, 11-i, "J1");
				}

				else if (i==12 && j==12 && affichejoueur<2){
					StdDraw.setFont(k);
					StdDraw.setPenColor(StdDraw.WHITE);
					StdDraw.text(j, 11-i, "J2");
				}

				else {

				}

				StdDraw.setPenRadius(0.005);
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.square(6, 5, 6.5);
			}
		}

		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledCircle(14, 6, 0.4);

		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledCircle(14, 5, 0.4);

		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledCircle(14, 4, 0.4);

		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledCircle(14, 3, 0.4);

		StdDraw.setPenColor(StdDraw.MAGENTA);
		StdDraw.filledCircle(14, 2, 0.4);

		StdDraw.setPenColor(255, 150, 0);
		StdDraw.filledCircle(14, 1, 0.4);

		StdDraw.setPenColor(StdDraw.BLACK);

		return grille;
	}

	public static Lettre[][] stepJoueur1(Lettre[][] grille){
		//la couleur en haut à gauche est le premier choix du joueur 1
		char choix1=grille[0][0].getLettre();
		//la couleur en bas à droite est le premier choix du joueur 2
		char choix2=grille[12][12].getLettre();
		//		Scanner scan = new Scanner(System.in);
		//		System.out.println("Couleur joueur 1?");

		if (Character.toLowerCase(choix1)!='i'){
			System.out.print("violet     ");
		}
		if (Character.toLowerCase(choix1)!='r'){
			System.out.print("rouge     ");
		}
		if (Character.toLowerCase(choix1)!='j'){
			System.out.print("jaune     ");
		}
		if (Character.toLowerCase(choix1)!='b'){
			System.out.print("bleu     ");
		}
		if (Character.toLowerCase(choix1)!='v'){
			System.out.print("vert     ");
		}
		if (Character.toLowerCase(choix1)!='o'){
			System.out.print("orange     ");
		}
		//		do{
		//			String choixstring = scan.next();
		//			choix1 = choixstring.charAt(0);

		while(!StdDraw.mousePressed()){
			double x = StdDraw.mouseX();
			double y = StdDraw.mouseY();
		}
		final double x = StdDraw.mouseX();
		final double y = StdDraw.mouseY();

		if (y >=10.2 && y< 12) {
			choix1 = 'j';
		}
		else if (y >= 9.2 && y < 10.2) {
			choix1 = 'b';
		}
		else if (y >= 8.2 && y<9.2) {
			choix1 = 'r';
		}
		else if (y >= 7.2 && y < 8.2) {
			choix1 = 'v';
		}
		else if (y >= 6.2 && y < 7.2) {
			choix1 = 'i';
		}
		else {
			choix1 = 'o';
		}


		//Si ce n'est pas une lettre possible, on redemande au joueur
		//			if (choix1 != 'r' && choix1 != 'v' && choix1 != 'b' && choix1 != 'j' && choix1 != 'o' && choix1 != 'i'){
		//				System.out.println("Ceci nest pas une couleur proposée");
		//			}
		//		
		if (choix1 == Character.toLowerCase(choix2)){
			System.out.println("vous ne pouvez pas choisir la même couleur que l'adversaire");
		}

		else {
			for (int i=0;  i<13; i++){
				for (int j=0; j<13; j++){
					//Pour chaque case du tableau on vérifie si la case est controlée par le joueur 1
					boolean a = grille[i][j].getControle(1);
					if (a==true){
						//Si oui, la case devient de la couleur choisie
						grille[i][j].setLettre(choix1);

						if (j!=12){
							//Si ce n'est pas la derniere colonne, on regarde si la case à gauche est de la même couleur.
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
						if (j!=0){
							//pareil pour la case à droite
							char d = grille[i][j-1].getLettre();
							if (d==choix1){
								grille[i][j-1].setControle(1);
							}
						}
						if (i!=0){
							//pareil pour la case en haut
							char e = grille[i-1][j].getLettre();
							if (e==choix1){
								grille[i-1][j].setControle(1);
							}
						}
					}
				}
			}
		}		

		while(choix1 != 'r' && choix1 != 'v' && choix1 != 'b' && choix1 != 'j' && choix1 != 'o' && choix1 != 'i' && choix1==Character.toLowerCase(choix2));
		return grille;
	}

	public static Lettre[][] stepJoueur2(Lettre[][] grille){
		//la couleur en haut à gauche est le premier choix du joueur 1
		char choix1=grille[0][0].getLettre();
		//la couleur en bas à droite est le premier choix du joueur 2
		char choix2=grille[12][12].getLettre();
		Scanner scan = new Scanner(System.in);
		System.out.println("Couleur joueur 2?");
		if (Character.toLowerCase(choix1)!='i'){
			System.out.print("violet     ");
		}
		if (Character.toLowerCase(choix1)!='r'){
			System.out.print("rouge     ");
		}
		if (Character.toLowerCase(choix1)!='j'){
			System.out.print("jaune     ");
		}
		if (Character.toLowerCase(choix1)!='b'){
			System.out.print("bleu     ");
		}
		if (Character.toLowerCase(choix1)!='v'){
			System.out.print("vert     ");
		}
		if (Character.toLowerCase(choix1)!='o'){
			System.out.print("orange     ");
		}

		choix2='n';
		//while(choix2 != 'r' && choix2 != 'v' && choix2 != 'b' && choix2 != 'j' && choix2 != 'o' && choix2 != 'i' && choix2==Character.toLowerCase(choix1)){

		while(!StdDraw.mousePressed()){
			double x = StdDraw.mouseX();
			double y = StdDraw.mouseY();
		}
		final double x = StdDraw.mouseX();
		final double y = StdDraw.mouseY();
		System.out.println(x+" "+y);

		if (y >=10.2 && y< 12) {
			choix2 = 'j';
		}
		else if (y >= 9.2 && y < 10.2) {
			choix2 = 'b';
		}
		else if (y >= 8.2 && y<9.2) {
			choix2 = 'r';
		}
		else if (y >= 7.2 && y < 8.2) {
			choix2 = 'v';
		}
		else if (y >= 6.2 && y < 7.2) {
			choix2 = 'i';
		}
		else if (y >=6.2) {
			choix2 = 'o';
		} 
		else System.out.println("???????2");
		System.out.println(choix2);


		if (choix2 == Character.toLowerCase(choix1)){
			System.out.println("vous ne pouvez pas choisir la même couleur que l'adversaire");
		}
		//}


		//tour du joueur 2
		//m=m+1;


		//Si ce n'est pas une lettre possible, on redemande au joueur

		for (int i=12;  i>=0; i--){
			for (int j=12; j>=0; j--){
				//Pour chaque case du tableau on vérifie si la case est controlée par le joueur 2
				boolean a = grille[i][j].getControle(2);
				if (a==true){
					//Si oui, la case devient de la couleur choisie
					grille[i][j].setLettre(choix2);

					if (j!=12){
						//Si ce n'est pas la derniere colonne, on regarde si la case à gauche est de la même couleur.
						//Si oui, on la controle 
						char b = grille[i][j+1].getLettre();
						if (b==choix2){
							grille[i][j+1].setControle(2);
						}
					}
					if (i!=12){
						//pareil pour la case en dessous
						char c = grille[i+1][j].getLettre();
						if (c==choix2){
							grille[i+1][j].setControle(2);
						}
					}
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
				}
			}
		}

		return grille;
	}


	public static Lettre[][] step(Lettre[][] grille, int compteurControle1, int compteurControle2, int m){

		//la couleur en haut à gauche est le premier choix du joueur 1
		char choix1=grille[0][0].getLettre();
		//la couleur en bas à droite est le premier choix du joueur 2
		char choix2=grille[12][12].getLettre();

		//////////////////////////////tour du joueur 1///////////////////////////////////////

		if (m%2==0 && m!=2){
			//tour du joueur 1
			m=m+1;
			//demande au joueur quelle couleur il choisit et transforme le string en char
			//			Scanner scan = new Scanner(System.in);
			//			System.out.println("Couleur joueur 1?");
			//			String choixstring = scan.next();
			//			choix1 = choixstring.charAt(0);
			while(!StdDraw.mousePressed()){
				double x = StdDraw.mouseX();
				double y = StdDraw.mouseY();
			}
			final double x = StdDraw.mouseX();
			final double y = StdDraw.mouseY();
			System.out.println(x+" "+y);

			if (y >=10.2 && y< 12) {
				choix1 = 'j';
			}
			else if (y >= 9.2 && y < 10.2) {
				choix1 = 'b';
			}
			else if (y >= 8.2 && y<9.2) {
				choix1 = 'r';
			}
			else if (y >= 7.2 && y < 8.2) {
				choix1 = 'v';
			}
			else if (y >= 6.2 && y < 7.2) {
				choix1 = 'i';
			}
			else if (y >=6.2) {
				choix1 = 'o';
			} 
			else System.out.println("???????3");
			System.out.println(choix1);
			//Si ce n'est pas une lettre possible, on redemande au joueur
			if ((choix1 != 'r' && choix1 != 'v' && choix1 != 'b' && choix1 != 'j' && choix1 != 'o') || choix1 == Character.toLowerCase(choix2)){
				System.out.println("Ceci nest pas une couleur proposée");
				m=m-1;
			}

			else {
				for (int i=0;  i<13; i++){
					for (int j=0; j<13; j++){
						//Pour chaque case du tableau on vérifie si la case est controlée par le joueur 1
						boolean a = grille[i][j].getControle(1);
						if (a==true){
							//Si oui, la case devient de la couleur choisie
							grille[i][j].setLettre(choix1);

							if (j!=12){
								//Si ce n'est pas la derniere colonne, on regarde si la case à gauche est de la même couleur.
								//Si oui, on la controle 
								char b = grille[i][j+1].getLettre();
								if (b==choix1){
									grille[i][j+1].setControle(1);
									compteurControle1+=1;
								}
							}
							if (i!=12){
								//pareil pour la case en dessous
								char c = grille[i+1][j].getLettre();
								if (c==choix1){
									grille[i+1][j].setControle(1);
									compteurControle1+=1;
								}
							}
							if (j!=0){
								//pareil pour la case à droite
								char d = grille[i][j-1].getLettre();
								if (d==choix1){
									grille[i][j-1].setControle(1);
									compteurControle1+=1;
								}
							}
							if (i!=0){
								//pareil pour la case en haut
								char e = grille[i-1][j].getLettre();
								if (e==choix1){
									grille[i-1][j].setControle(1);
									compteurControle1+=1;
								}
							}
						}
					}
				}
			}
		}
		//////////////////////////////////////////tour du joueur 2//////////////////////////////////////////////////////////////////

		else {
			//tour du joueur 2
			//m=m+1;
			//demande au joueur quelle couleur il choisit et transforme le string en char
			//			Scanner scan = new Scanner(System.in);
			//			System.out.println("Couleur joueur 2?");
			//			String choixstring = scan.next();
			//			choix2 = choixstring.charAt(0);

			while(!StdDraw.mousePressed()){
				double x = StdDraw.mouseX();
				double y = StdDraw.mouseY();
			}
			final double x = StdDraw.mouseX();
			final double y = StdDraw.mouseY();
			System.out.println(x+" "+y);

			if (y >=10.2 && y< 12) {
				choix2 = 'j';
			}
			else if (y >= 9.2 && y < 10.2) {
				choix2 = 'b';
			}
			else if (y >= 8.2 && y<9.2) {
				choix2 = 'r';
			}
			else if (y >= 7.2 && y < 8.2) {
				choix2 = 'v';
			}
			else if (y >= 6.2 && y < 7.2) {
				choix2 = 'i';
			}
			else if (y >=6.2) {
				choix2 = 'o';
			} 
			else System.out.println("???????4");
			System.out.println(choix2);

			//Si ce n'est pas une lettre possible, on redemande au joueur
			if ((choix2 != 'r' && choix2 != 'v' && choix2 != 'b' && choix2 != 'j' && choix2 != 'o') || choix2 == Character.toLowerCase(choix1)){
				System.out.println("Ceci nest pas une couleur proposée");
				m=m-1;
			}

			else {
				for (int i=12;  i>=0; i--){
					for (int j=12; j>=0; j--){
						//Pour chaque case du tableau on vérifie si la case est controlée par le joueur 2
						boolean a = grille[i][j].getControle(2);
						if (a==true){
							//Si oui, la case devient de la couleur choisie
							grille[i][j].setLettre(choix2);

							if (j!=12){
								//Si ce n'est pas la derniere colonne, on regarde si la case à gauche est de la même couleur.
								//Si oui, on la controle 
								char b = grille[i][j+1].getLettre();
								if (b==choix2){
									grille[i][j+1].setControle(2);
									compteurControle2+=1;
								}
							}
							if (i!=12){
								//pareil pour la case en dessous
								char c = grille[i+1][j].getLettre();
								if (c==choix2){
									grille[i+1][j].setControle(2);
									compteurControle2+=1;
								}
							}
							if (j!=0){
								//pareil pour la case à droite
								char d = grille[i][j-1].getLettre();
								if (d==choix2){
									grille[i][j-1].setControle(2);
									compteurControle2+=1;
								}
							}
							if (i!=0){
								//pareil pour la case en haut
								char e = grille[i-1][j].getLettre();
								if (e==choix2){
									grille[i-1][j].setControle(2);
									compteurControle2+=1;
								}
							}
						}
					}
				}
			}
		}
		//}
		int calcul = compteurControle1 - compteurControle2;
		String vainqueur;
		if (calcul>0 && m==169){
			vainqueur= "joueur 1";
			System.out.println("Le vainqueur est le " + vainqueur);
		}
		else if (calcul<0 && m==169){
			vainqueur= "joueur 2";
			System.out.println("Le vainqueur est le " + vainqueur);
		}
		else {

		}
		return grille;
	}

	public static int checkControle1(Lettre[][] grille,int compteur1){
		Font k = new Font("Verdana", 3, 40);
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
		Font k = new Font("Verdana", 3, 40);
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

	public static boolean verifGagnant(Lettre[][] grille,int compteur1, int compteur2){
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
		Font t = new Font("Verdana", 3, 60);
		StdDraw.setFont(t);
		if (compteur1>84){
			StdDraw.text(18, 3, "le joueur 1 a gagné");
			return true;
		}
		else if (compteur2>84){
			StdDraw.text(18, 3, "le joueur 2 a gagné");
			return true;
		}
		else {
			return false;
		}
	}

	//---------------------------------TEST POUR LA FONCTION UPGRADE GRILLE-----------------------------------//

	public static Lettre[][] majGrille(Lettre[][] grille, int compteur1, int compteur2){
		Lettre[][] grille2 = grille;

		for (int i=0; i<13; i++){
			for (int j=0; j<13; j++){

				if (grille2[i][j].getLettre()!=grille[i][j].getLettre()){
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
						StdDraw.setPenColor(StdDraw.MAGENTA);
					else if (grille[i][j].getLettre()=='j' || grille[i][j].getLettre()=='J')
						StdDraw.setPenColor(StdDraw.YELLOW);
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

					Font k = new Font("Verdana", 3, 40);

					if (i==0 && j==0){
						StdDraw.setPenColor(StdDraw.BLACK);
						StdDraw.filledSquare(j, 11-i, 0.5);
						StdDraw.setFont(k);
						StdDraw.setPenColor(StdDraw.WHITE);
						StdDraw.text(j, 11-i, "J1");
					}

					else if (i==12 && j==12){
						StdDraw.setPenColor(StdDraw.BLACK);
						StdDraw.filledSquare(j, 11-i, 0.5);
						StdDraw.setFont(k);
						StdDraw.setPenColor(StdDraw.WHITE);
						StdDraw.text(j, 11-i, "J2");
					}

					StdDraw.setPenRadius(0.005);
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.square(6, 5, 6.5);
				} 
			}
		}
		return grille;
	}

	//---------------------------------TEST POUR LA FONCTION UPGRADE GRILLE-----------------------------------//
}