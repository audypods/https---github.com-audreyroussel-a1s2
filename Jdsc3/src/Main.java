import java.awt.Font;
import edu.princeton.cs.introcs.StdDraw;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		menu(0);
	}

	public static void choixJoueurs(){
		StdDraw.show(0);
		Font j = new Font("Bookman Old Style", 3, 70);
		Font k = new Font("Bookman Old Style", 2, 40);
		Font m = new Font("Bookman Old Style", 3, 28);
		StdDraw.picture(13, 5, "357653blanc.jpg");
		StdDraw.setPenColor(StdDraw.WHITE);
		double[] x = { 5.3, 20.5, 20, 5.8 };
		double[] y = { 12, 12, 10.5, 10.5 };
		StdDraw.filledPolygon(x, y);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.polygon(x, y);
		StdDraw.setFont(j);
		StdDraw.text(13, 11, "Jeu des 6 couleurs");
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.picture(13, 9, "unecaseblanche.png", 10, 2);
		StdDraw.setFont(k);
		StdDraw.filledRectangle(9, 6.5, 0.65, 0.6);
		StdDraw.filledRectangle(9, 4.5, 0.65, 0.6);
		StdDraw.filledRectangle(9, 2.5, 0.65, 0.6);
		StdDraw.filledRectangle(9, 0.5, 0.65, 0.6);
		StdDraw.text(13, 9, "Nombre de joueurs?");
		StdDraw.picture(9, 6.5, "unecaseblanche.png");
		StdDraw.picture(9, 4.5, "unecaseblanche.png");
		StdDraw.picture(9, 2.5, "unecaseblanche.png");
		StdDraw.picture(9, 0.5, "unecaseblanche.png");

		StdDraw.text(9, 6.5, "1");
		StdDraw.text(9, 4.5, "2");
		StdDraw.text(9, 2.5, "3");
		StdDraw.text(9, 0.5, "4");
		StdDraw.filledRectangle(13.9, 6.5, 4.25, 0.6);
		StdDraw.filledRectangle(13.9, 4.5, 4.25, 0.6);
		StdDraw.filledRectangle(13.9, 2.5, 4.25, 0.6);
		StdDraw.filledRectangle(13.9, 0.5, 4.25, 0.6);
		StdDraw.picture(13.9, 6.5, "unecaseblanche.png", 8.5, 1);
		StdDraw.picture(13.9, 4.5, "unecaseblanche.png", 8.5, 1);
		StdDraw.picture(13.9, 2.5, "unecaseblanche.png", 8.5, 1);
		StdDraw.picture(13.9, 0.5, "unecaseblanche.png", 8.5, 1);

		StdDraw.text(13.9, 6.5, "contre l'ordinateur");
		StdDraw.text(13.9, 4.5, "à deux");
		StdDraw.text(13.9, 2.5, "à trois");
		StdDraw.text(13.9, 0.5, "à quatre");
		boolean s = true;
		int g =0;
		int h =0;
		int e=0;
		int f=0;
		int nbr=0;
		String retour="joueurs";
		StdDraw.filledRectangle(23, -0.5, 2.5, 0.8);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledRectangle(23, -0.5, 2.4, 0.7);
		StdDraw.picture( 24.5, -0.5, "retour.png");
		StdDraw.setFont(m);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.text(22.5, -0.3, "Retour");
		StdDraw.text(22.5, -0.7, "au menu");
		StdDraw.setFont(k);
		StdDraw.show(0);
		StdDraw.show();
		while (s==true && nbr!=1 && nbr!=2 && retour!="menu"){


			if (StdDraw.mouseX()>=8.5 && StdDraw.mouseX()<=18.15 && StdDraw.mouseY()>=6 && StdDraw.mouseY()<=7){
				if (g==0){
					StdDraw.picture(9, 6.5, "unecasepickedblanche.png");
					StdDraw.text(9, 6.5, "1");
					StdDraw.picture(13.9, 6.5, "unecasepickedblanche.png", 8.5, 1);
					StdDraw.text(13.9, 6.5, "contre l'ordinateur");
					g=1;
				}
				if (StdDraw.mousePressed()){
					s= false;
					nbr = 1;
				}
			}
			else{
				if (g==1){
					StdDraw.picture(9, 6.5, "unecaseblanche.png");
					StdDraw.text(9, 6.5, "1");
					StdDraw.picture(13.9, 6.5, "unecaseblanche.png", 8.5, 1);
					StdDraw.text(13.9, 6.5, "contre l'ordinateur");
					g=0;
				}
			}


			if (StdDraw.mouseX()>=8.5 && StdDraw.mouseX()<=18.15 && StdDraw.mouseY()>=4 && StdDraw.mouseY()<=5){
				if (h==0){
					StdDraw.picture(9, 4.5, "unecasepickedblanche.png");
					StdDraw.text(9, 4.5, "2");
					StdDraw.picture(13.9, 4.5, "unecasepickedblanche.png", 8.5, 1);
					StdDraw.text(13.9, 4.5, "à deux");
					h=1;
				}
				if (StdDraw.mousePressed()){
					s= false;
					nbr = 2;
				}
			}
			else{
				if (h==1){
					StdDraw.picture(9, 4.5, "unecaseblanche.png");
					StdDraw.text(9, 4.5, "2");
					StdDraw.picture(13.9, 4.5, "unecaseblanche.png", 8.5, 1);
					StdDraw.text(13.9, 4.5, "à deux");
					h=0;
				}
			}


			if (StdDraw.mouseX()>=8.5 && StdDraw.mouseX()<=18.15 && StdDraw.mouseY()>=2 && StdDraw.mouseY()<=3){
				if (e==0){
					StdDraw.picture(9, 2.5, "unecasepickedblanche.png");
					StdDraw.text(9, 2.5, "3");
					StdDraw.picture(13.9, 2.5, "unecasepickedblanche.png", 8.5, 1);
					StdDraw.text(13.9, 2.5, "à trois");
					e=1;
				}
				if (StdDraw.mousePressed()){
					s= false;
					nbr = 3;
				}
			}
			else{
				if (e==1){
					StdDraw.picture(9, 2.5, "unecaseblanche.png");
					StdDraw.text(9, 2.5, "3");
					StdDraw.picture(13.9, 2.5, "unecaseblanche.png", 8.5, 1);
					StdDraw.text(13.9, 2.5, "à trois");
					e=0;
				}
			}

			if (StdDraw.mouseX()>=8.5 && StdDraw.mouseX()<=18.15 && StdDraw.mouseY()>=0 && StdDraw.mouseY()<=1){
				if (f==0){
					StdDraw.picture(9, 0.5, "unecasepickedblanche.png");
					StdDraw.text(9, 0.5, "4");
					StdDraw.picture(13.9, 0.5, "unecasepickedblanche.png", 8.5, 1);
					StdDraw.text(13.9, 0.5, "à quatre");
					f=1;
				}
				if (StdDraw.mousePressed()){
					s= false;
					nbr = 4;
				}
			}
			else{
				if (f==1){
					StdDraw.picture(9, 0.5, "unecaseblanche.png");
					StdDraw.text(9, 0.5, "4");
					StdDraw.picture(13.9, 0.5, "unecaseblanche.png", 8.5, 1);
					StdDraw.text(13.9, 0.5, "à quatre");
					f=0;
				}
			}
			if (StdDraw.mouseX()>=20.5 && StdDraw.mouseX()<=25.5 && StdDraw.mouseY()>=-1.3 && StdDraw.mouseY()<=0.3 ){
				if (StdDraw.mousePressed()){
					retour="menu";
				}
			}
		}

		if (retour=="menu"){
			menu(1);
		}
		else
			Joueur(nbr);
	}

	/**
	 +	 * Methode qui lance la partie en prenant comme parametre le nombre de joueurs
	 +	 * @param nbreJoueurs
	 +	 */
	public static void Joueur(int nbreJoueurs){
		Lettre[][] couleurs = new Lettre[13][13];
		int compteurControle1 = 0;
		int compteurControle2 = 0;
		int compteurControle3 = 0;
		int compteurControle4 = 0;
		int m=1;
		Font j = new Font("Bookman Old Style", 3, 28);
		Grille.creationValeursGrille(couleurs, compteurControle1, compteurControle2, compteurControle3, compteurControle4, nbreJoueurs);
		StdDraw.picture(13, 5, "357653blanc.jpg");
		if (nbreJoueurs<3){
			StdDraw.picture(20, 4.5, "unecaseblanche.png", 7, 1);
			StdDraw.picture(20, 3.5, "unecaseblanche.png", 7, 1);
		}
		if (nbreJoueurs==3){
			StdDraw.picture(20, 5, "unecaseblanche.png", 7, 1);
			StdDraw.picture(20, 4, "unecaseblanche.png", 7, 1);
			StdDraw.picture(20, 3, "unecaseblanche.png", 7, 1);
		}
		if (nbreJoueurs==4){
			StdDraw.picture(20, 5.5, "unecaseblanche.png", 7, 1);
			StdDraw.picture(20, 4.5, "unecaseblanche.png", 7, 1);
			StdDraw.picture(20, 3.5, "unecaseblanche.png", 7, 1);
			StdDraw.picture(20, 2.5, "unecaseblanche.png", 7, 1);
		}
		StdDraw.picture(20, 0.5, "unecaseblanche.png", 10, 2);
		Grille.checkControle(couleurs, compteurControle1, 1, nbreJoueurs);
		Grille.checkControle(couleurs, compteurControle2, 5, nbreJoueurs);
		Grille.checkControle(couleurs, compteurControle2, 2, nbreJoueurs);
		Grille.checkControle(couleurs, compteurControle3, 3, nbreJoueurs);
		Grille.checkControle(couleurs, compteurControle4, 4, nbreJoueurs);
		Grille.dessineGrille(couleurs, compteurControle1, compteurControle2, compteurControle3, compteurControle4, nbreJoueurs);
		char[][] grille2 = new char[13][13];
		while (m<=169){
			for (int k=0; k<13; k++)
				for (int l=0; l<13; l++)
					grille2[k][l]=couleurs[k][l].getLettre();
			StdDraw.setFont(j);
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.picture(20, 7, "unecaseblanche.png", 9, 1);
			if (nbreJoueurs==1){
				if (m%2!=0 && m!=2){
					StdDraw.text(20, 7, "C'est au Joueur 1");
					Grille.stepJoueur(couleurs, compteurControle1, compteurControle2, compteurControle3, compteurControle4, 1, nbreJoueurs);
				}
				else {
					StdDraw.text(20, 7, "C'est à l'ordinateur");
					Grille.stepIABest(couleurs);
				}
			}
			else{
				if (nbreJoueurs==2){
					if (m%2==1 || m==1){
						StdDraw.text(20, 7, "C'est au Joueur 1");
						Grille.stepJoueur(couleurs, compteurControle1, compteurControle2,  compteurControle3, compteurControle4, 1, nbreJoueurs);
					}
					else{
						StdDraw.text(20, 7, "C'est au Joueur 2");
						Grille.stepJoueur(couleurs, compteurControle1, compteurControle2,  compteurControle3, compteurControle4, 2, nbreJoueurs);
					}
				}
				if (nbreJoueurs==3){
					if(m%3==1||m==1){
						StdDraw.text(20, 7, "C'est au Joueur 1");
						Grille.stepJoueur(couleurs, compteurControle1, compteurControle2,  compteurControle3, compteurControle4, 1, nbreJoueurs);
					}
					if(m%3==2||m==2){
						StdDraw.text(20, 7, "C'est au Joueur 2");
						Grille.stepJoueur(couleurs, compteurControle1, compteurControle2,  compteurControle3, compteurControle4, 2, nbreJoueurs);
					}
					if (m%3==0||m==3){
						StdDraw.text(20, 7, "C'est au Joueur 3");
						Grille.stepJoueur(couleurs, compteurControle1, compteurControle2,  compteurControle3, compteurControle4, 3, nbreJoueurs);
					}
				}
				if (nbreJoueurs==4){
					if(m%4==1||m==1){
						StdDraw.text(20, 7, "C'est au Joueur 1");
						Grille.stepJoueur(couleurs, compteurControle1, compteurControle2,  compteurControle3, compteurControle4, 1, nbreJoueurs);
					}
					if(m%4==2||m==2){
						StdDraw.text(20, 7, "C'est au Joueur 2");
						Grille.stepJoueur(couleurs, compteurControle1, compteurControle2,  compteurControle3, compteurControle4, 2, nbreJoueurs);
					}
					if(m%4==3||m==3){
						StdDraw.text(20, 7, "C'est au Joueur 3");
						Grille.stepJoueur(couleurs, compteurControle1, compteurControle2,  compteurControle3, compteurControle4, 3,nbreJoueurs);
					}
					if (m%4==0||m==4) {
						StdDraw.text(20, 7, "C'est au Joueur 4");
						Grille.stepJoueur(couleurs, compteurControle1, compteurControle2,  compteurControle3, compteurControle4, 4, nbreJoueurs);
					}
				}

			}

			Grille.majGrille(couleurs, grille2, compteurControle1, compteurControle2, compteurControle3, compteurControle4);

			if (nbreJoueurs<3){
				StdDraw.picture(20, 4.5, "unecaseblanche.png", 7, 1);
				StdDraw.picture(20, 3.5, "unecaseblanche.png", 7, 1);
			}
			if (nbreJoueurs==3){
				StdDraw.picture(20, 5, "unecaseblanche.png", 7, 1);
				StdDraw.picture(20, 4, "unecaseblanche.png", 7, 1);
				StdDraw.picture(20, 3, "unecaseblanche.png", 7, 1);
			}
			if (nbreJoueurs==4){
				StdDraw.picture(20, 5.5, "unecaseblanche.png", 7, 1);
				StdDraw.picture(20, 4.5, "unecaseblanche.png", 7, 1);
				StdDraw.picture(20, 3.5, "unecaseblanche.png", 7, 1);
				StdDraw.picture(20, 2.5, "unecaseblanche.png", 7, 1);
			}
			StdDraw.setPenColor(StdDraw.BLACK);
			Grille.checkControle(couleurs, compteurControle1, 1, nbreJoueurs);
			Grille.checkControle(couleurs, compteurControle2, 2, nbreJoueurs);
			Grille.checkControle(couleurs, compteurControle3, 3, nbreJoueurs);
			Grille.checkControle(couleurs, compteurControle4, 4, nbreJoueurs);
			Grille.checkControle(couleurs, compteurControle2, 5, nbreJoueurs);
			m+=1;
			if (Grille.verifGagnant(couleurs, compteurControle1, compteurControle2, compteurControle3, compteurControle4, 1, nbreJoueurs)==true){
				m=170;
			}
		}
	}
	/**
	 +	 * Methode qui demarre le jeu et propose plusieurs choix a l'utilisateur
	 +	 * @param retour
	 +	 */
	public static void menu(int retour){
		StdDraw.setCanvasSize(1366, 768);
		StdDraw.setXscale(-1, 26);
		StdDraw.setYscale(-2, 12);
		StdDraw.show(0);
		StdDraw.setPenRadius(0.01);
		Font j = new Font("Bookman Old Style", 3, 70);
		Font k = new Font("Bookman Old Style", 2, 40);
		StdDraw.setFont(j);
		StdDraw.picture(13, 5, "357653blanc.jpg");
		StdDraw.setPenColor(StdDraw.WHITE);
		double[] x = { 5.3, 20.5, 20, 5.8 };
		double[] y = { 12, 12, 10.5, 10.5 };
		StdDraw.filledPolygon(x, y);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.polygon(x, y);
		StdDraw.text(13, 11, "Jeu des 6 couleurs");
		StdDraw.picture(13, 7, "unecaseblanche.png", 8, 2);
		StdDraw.picture(13, 4, "unecaseblanche.png", 8, 2);
		StdDraw.picture(13, 1, "unecaseblanche.png", 8, 2);
		StdDraw.setFont(k);
		StdDraw.rectangle(13, 7, 4, 1);
		StdDraw.rectangle(13, 4, 4, 1);
		StdDraw.rectangle(13, 1, 4, 1);
		StdDraw.text(13, 7, "Jouer");
		StdDraw.text(13, 4, "Connaitre les règles");
		StdDraw.text(13, 1, "Quitter l'application");
		boolean r = true;
		int e =0;
		int f =0;
		int g =0;
		int choix=4;
		StdDraw.show(0);
		StdDraw.show();
		
		while (r == true && choix!=0 && choix!=1 && choix!=2){
			if (StdDraw.mouseX()>=9 && StdDraw.mouseX()<=17 && StdDraw.mouseY()>=0 && StdDraw.mouseY()<=2){
				if (e==0){
					StdDraw.picture(13, 1, "unecasepickedblanche.png", 8, 2);
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.rectangle(13, 1, 4, 1);
					StdDraw.text(13, 1, "Quitter l'application");
					e=1;
				}
				if (retour==0){
					if (StdDraw.mousePressed()){
						r= false;
						choix = 1;
					}
				}
				else if (retour==1){
					if (!StdDraw.mousePressed()){
						r= false;
						choix = 1;
					}
				}
			}
			else {
				if (e==1){
					StdDraw.picture(13, 1, "unecaseblanche.png", 8, 2);
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.rectangle(13, 1, 4, 1);
					StdDraw.text(13, 1, "Quitter l'application");
					e=0;
				}
			}
			if (StdDraw.mouseX()>=9 && StdDraw.mouseX()<=17 && StdDraw.mouseY()>=3 && StdDraw.mouseY()<=5){
				if (f==0){
					StdDraw.picture(13, 4, "unecasepickedblanche.png", 8, 2);
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.rectangle(13, 4, 4, 1);
					StdDraw.text(13, 4, "Connaitre les règles");
					f=1;
				}
				if (retour==0){
					if (StdDraw.mousePressed()){
						r= false;
						choix = 2;
					}
				}
				if (retour==1){
					if (!StdDraw.mousePressed()){
						r= false;
						choix = 2;
					}
				}
			}
			else {
				if (f==1){
					StdDraw.picture(13, 4, "unecaseblanche.png", 8, 2);
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.rectangle(13, 4, 4, 1);
					StdDraw.text(13, 4, "Connaitre les règles");
					f=0;
				}
			}
			if (StdDraw.mouseX()>=9 && StdDraw.mouseX()<=17 && StdDraw.mouseY()>=6 && StdDraw.mouseY()<=8){
				if (g==0){
					StdDraw.picture(13, 7, "unecasepickedblanche.png", 8, 2);
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.rectangle(13, 7, 4, 1);
					StdDraw.text(13, 7, "Jouer");
					g=1;
				}
				else {

				}

				if (retour==0){
					if (StdDraw.mousePressed()){
						r= false;
						choix = 0;
					}
				}
				else if (retour==1){
					if (!StdDraw.mousePressed()){
						r= false;
						choix = 0;
					}
				}
			}
			else {
				if (g==1){
					StdDraw.picture(13, 7, "unecaseblanche.png", 8, 2);
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.rectangle(13, 7, 4, 1);
					StdDraw.text(13, 7, "Jouer");
					g=0;
				}
			}
		}
		if (choix==1){
			System.exit(0);
		}
		else if (choix==2){
			regles();
		}
		else if ( choix==0){
			choixJoueurs();
		}
	}

	/**
	 +	 * Methode qui affiche la partie regles du jeu du menu
	 +	 */
	public static void regles(){
		StdDraw.show(0);
		Font j = new Font("Bookman Old Style", 3, 70);
		Font k = new Font("Bookman Old Style", 2, 28);
		Font l = new Font("Bookman Old Style", 2, 46);
		Font m = new Font("Bookman Old Style", 3, 28);
		Font n = new Font("Bookman Old Style", 3, 22);
		StdDraw.setFont(j);
		StdDraw.picture(13, 5, "357653blanc.jpg");
		StdDraw.setPenColor(StdDraw.WHITE);
		double[] x = { 5.3, 20.5, 20, 5.8 };
		double[] y = { 12, 12, 10.5, 10.5 };
		StdDraw.filledPolygon(x, y);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.polygon(x, y);
		StdDraw.text(13, 11, "Jeu des 6 couleurs");
		StdDraw.setPenColor(130,130,130);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.picture(13, 9, "unecaseblanche.png", 10, 2);
		StdDraw.setFont(l);
		StdDraw.text(13, 9, "Règles du jeu");
		StdDraw.setFont(k);
		StdDraw.picture(13, 3.15, "unecaseblanche.png", 15, 9.5);
		StdDraw.text(13, 7, "Le jeu des 6 couleurs est un jeu de stratégie se dérou-");
		StdDraw.text(13, 6.5, "lant sur un plateau découpé en cases de 6 couleurs     ");
		StdDraw.text(13, 6, "différentes (rouge, orange, jaune, vert, bleu ou violet).");
		StdDraw.text(13, 5.5, "Le but du jeu est de contrôler plus de cases que son   ");
		StdDraw.text(7.8, 5, "adversaire.");
		StdDraw.text(13, 4.5, "Les joueurs commencent en contrôlant chacun une case");
		StdDraw.text(13, 4, "de la grille. Les joueurs jouent chacun à leur tour. A son ");
		StdDraw.text(13, 3.5, "tour, un joueur choisit une couleur différente de celle   ");
		StdDraw.text(13, 3, "qu'il a actuellement, et de celle utilisée par son adver-");
		StdDraw.text(7, 2.5, "saire.");
		StdDraw.text(13, 2, "		• Toutes les cases controllées par le joueur deviennent");
		StdDraw.text(10, 1.5, "alors de la couleur choisie.");
		StdDraw.text(13, 1, "		• Toutes les cases de la couleur choisie et qui touchent");
		StdDraw.text(13, 0.5, "une case controlée par le joueur passent sous son  ");
		StdDraw.text(7.7, 0, "controle.");
		StdDraw.setFont(n);
		StdDraw.text(13, -0.5, "La partie se termine quand il n'y a plus de case non-controllée");
		StdDraw.text(13, -1, "ou qu'un joueur controle plus de la moité du plateau.");
		StdDraw.filledRectangle(23, -0.5, 2.5, 0.8);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledRectangle(23, -0.5, 2.4, 0.7);
		StdDraw.picture( 24.5, -0.5, "retour.png");
		StdDraw.setFont(m);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.text(22.5, -0.3, "Retour");
		StdDraw.text(22.5, -0.7, "au menu");
		String retour="regles";
		StdDraw.show(0);
		StdDraw.show();
		while (retour!="menu"){
			if (StdDraw.mouseX()>=20.5 && StdDraw.mouseX()<=25.5 && StdDraw.mouseY()>=-1.3 && StdDraw.mouseY()<=0.3 ){
				if (StdDraw.mousePressed()){
					retour="menu";
				}
			}
		}
		menu(1);
		return;
	}

	/**
	 +	 * Methode qui affiche une fenetre lors de l'appuie sur le bouton "retour au menu"
	 +	 * @param retour
	 +	 * @param x
	 +	 * @param grille
	 +	 * @param compteur1
	 +	 * @param compteur2
	 +	 * @param joueur
	 +	 */
	public static void restartMenu(int retour, int x, Lettre[][] grille, int compteur1, int compteur2, int compteur3, int compteur4, int joueur, int nbreJoueurs){
		Font k = new Font("Bookman Old Style", 2, 40);
		Font l = new Font("Bookman Old Style", 3, 50);
		StdDraw.picture(x, 6.7, "unecaseblanche.png", 8.5, 8);
		StdDraw.picture(x, 8, "unecaseblanche.png", 8, 2);
		StdDraw.picture(x, 6, "unecaseblanche.png", 8, 2);
		StdDraw.picture(x, 4, "unecaseblanche.png", 8, 2);
		StdDraw.setFont(l);
		if (x==4)
			StdDraw.text(x, 9.5, "Menu");
		else
			StdDraw.text(x, 9.5, "Pause");
		StdDraw.setFont(k);
		if (x==4)
			StdDraw.text(x, 8, "Nouvelle partie");
		else
			StdDraw.text(x, 8, "Reprendre la partie");
		StdDraw.text(x, 6, "Menu principal");
		StdDraw.text(x, 4, "Quitter l'application");

		boolean r = true;
		int e =0;
		int f =0;
		int g =0;
		int choix=4;
		while (r == true && choix!=0 && choix!=1 && choix!=2){
			if (StdDraw.mouseX()>=x-4 && StdDraw.mouseX()<=x+4 && StdDraw.mouseY()>=7 && StdDraw.mouseY()<=9){
				if (e==0){
					StdDraw.picture(x, 8, "unecasepickedblanche.png", 8, 2);
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.rectangle(x, 8, 4, 1);
					if (x==4)
						StdDraw.text(x, 8, "Nouvelle partie");
					else
						StdDraw.text(x, 8, "Reprendre la partie");
					e=1;
				}
				else {

				}
				if (retour==0){
					if (StdDraw.mousePressed()){
						r= false;
						choix = 1;
					}
				}
				else if (retour==1){
					if (!StdDraw.mousePressed()){
						r= false;
						choix = 1;
					}
				}

				else {

				}
			}
			else {
				if (e==1){
					StdDraw.picture(x, 8, "unecaseblanche.png", 8, 2);
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.rectangle(x, 8, 4, 1);
					if (x==4)
						StdDraw.text(x, 8, "Nouvelle partie");
					else
						StdDraw.text(x, 8, "Reprendre la partie");
					e=0;
				}
				else{

				}

			}
			if (StdDraw.mouseX()>=x-4 && StdDraw.mouseX()<=x+4 && StdDraw.mouseY()>=5 && StdDraw.mouseY()<=7){
				if (f==0){
					StdDraw.picture(x, 6, "unecasepickedblanche.png", 8, 2);
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.rectangle(x, 6, 4, 1);
					StdDraw.text(x, 6, "Menu principal");
					f=1;
				}
				else {

				}
				if (retour==0){
					if (StdDraw.mousePressed()){
						r= false;
						choix = 2;
					}
				}
				if (retour==1){
					if (!StdDraw.mousePressed()){
						r= false;
						choix = 2;
					}
				}
				else {

				}
			}
			else {
				if (f==1){
					StdDraw.picture(x, 6, "unecaseblanche.png", 8, 2);
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.rectangle(x, 6, 4, 1);
					StdDraw.text(x, 6, "Menu principal");
					f=0;
				}
				else{

				}

			}
			if (StdDraw.mouseX()>=x-4 && StdDraw.mouseX()<=x+4 && StdDraw.mouseY()>=3 && StdDraw.mouseY()<=5){
				if (g==0){
					StdDraw.picture(x, 4, "unecasepickedblanche.png", 8, 2);
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.rectangle(x, 4, 4, 1);
					StdDraw.text(x, 4, "Quitter l'application");
					g=1;
				}
				else {

				}

				if (retour==0){
					if (StdDraw.mousePressed()){
						r= false;
						choix = 0;
					}
				}
				else if (retour==1){
					if (!StdDraw.mousePressed()){
						r= false;
						choix = 0;
					}
				}


				else {

				}
			}
			else {
				if (g==1){
					StdDraw.picture(x, 4, "unecaseblanche.png", 8, 2);
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.rectangle(x, 4, 4, 1);
					StdDraw.text(x, 4, "Quitter l'application");
					g=0;
				}
				else{

				}

			}
		}
		if (choix==1){
			if (x==13) {
				StdDraw.show(0);
				Font j = new Font("Bookman Old Style", 3, 28);
				StdDraw.picture(13, 5, "357653blanc.jpg");
				if (nbreJoueurs==1||nbreJoueurs==2){
					StdDraw.picture(20, 4.5, "unecaseblanche.png", 7, 1);
					StdDraw.picture(20, 3.5, "unecaseblanche.png", 7, 1);
				}
				else if (nbreJoueurs==3){
					StdDraw.picture(20, 5, "unecaseblanche.png", 7, 1);
					StdDraw.picture(20, 4, "unecaseblanche.png", 7, 1);
					StdDraw.picture(20, 3, "unecaseblanche.png", 7, 1);
				}
				else if (nbreJoueurs==4){
					StdDraw.picture(20, 5.5, "unecaseblanche.png", 7, 1);
					StdDraw.picture(20, 4.5, "unecaseblanche.png", 7, 1);
					StdDraw.picture(20, 3.5, "unecaseblanche.png", 7, 1);
					StdDraw.picture(20, 2.5, "unecaseblanche.png", 7, 1);
				}
				StdDraw.picture(20, 0.5, "unecaseblanche.png", 10, 2);
				Grille.checkControle(grille, compteur1, 1, nbreJoueurs);
				Grille.checkControle(grille, compteur2, 2, nbreJoueurs);
				Grille.checkControle(grille, compteur3, 3, nbreJoueurs);
				Grille.checkControle(grille, compteur4, 4, nbreJoueurs);
				Grille.checkControle(grille, compteur2, 5, nbreJoueurs);
				Grille.dessineGrille(grille, compteur1, compteur2, compteur3, compteur4, nbreJoueurs);
				Grille.casesControlee(grille);
				Grille.dessinCouleurs();
				StdDraw.setFont(j);
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.picture(20, 7, "unecaseblanche.png", 9, 1);
				StdDraw.text(20, 7, "C'est au Joueur "+ joueur);
				StdDraw.show(0);
				StdDraw.show();
			}
			else {
				choixJoueurs();
			}
		}
		else if (choix==2){
			menu(1);
		}
		else if ( choix==0){
			System.exit(0);
		}
	}

	/**
	 +	 * Methode qui fait l'animation apparaissant a la fin de la partie
	 +	 * @param joueur
	 +	 * @param grille
	 +	 * @param compteur1
	 +	 * @param compteur2
	 +	 */
	public static void finDuJeu(String joueur, Lettre[][] grille, int compteur1, int compteur2, int compteur3, int compteur4, int nbreJoueurs){
		if (nbreJoueurs!=1){
			if (compteur1 > compteur2 && compteur1 > compteur3 && compteur1 > compteur4) {
				joueur = "Le joueur 1";
			}
			if (compteur2 > compteur1 && compteur2 > compteur3 && compteur2 > compteur4) {
				joueur = "Le joueur 2";
			}
			if (compteur3 > compteur1 && compteur3 > compteur2 && compteur3 > compteur4) {
				joueur = "Le joueur 3";
			}
			if (compteur4 > compteur1 && compteur4 > compteur2 && compteur4 > compteur3) {
				joueur = "Le joueur 4";
			} 
		}
		for (double i=12; i>3; i-=0.16){
			double[] xx = { 9, 9, 13, 17, 17 };
			double[] yy = { 13, i, i-1, i, 13 };
			double[] xxx = { 9.5, 9.5, 13, 16.5, 16.5 };
			double[] yyy = { 13, i+0.4, i-0.5, i+0.4, 13 };
			double[] xxxx = { 9.8, 9.8, 13, 16.2, 16.2 };
			double[] yyyy = { 13, i+0.7, i-0.2, i+0.7, 13 };
			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.filledPolygon(xx, yy);
			StdDraw.setPenColor(StdDraw.YELLOW);
			StdDraw.filledPolygon(xxx, yyy);
			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.filledPolygon(xxxx, yyyy);
			StdDraw.setPenColor(StdDraw.YELLOW);
			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.text(13, i+3, "Partie terminée");
			StdDraw.text(13, i+2, joueur + " a gagné");
			StdDraw.show(5);
		}
		StdDraw.show();
		restartMenu(0, 4, grille, compteur1, compteur2, compteur3, compteur4, 0, nbreJoueurs);
	}
}