
import edu.princeton.cs.introcs.StdDraw;
import java.lang.Character;
import java.awt.Font;

public class Grille{
	char[][] couleurs;
	
	/**
	 +	 * Methode qui cree la grille
	 +	 * @param grille
	 +	 * @param compteur1
	 +	 * @param compteur2
	 +	 * @return grille
	 +	 */
	public static Lettre[][] creationValeursGrille(Lettre[][] grille, int compteur1, int compteur2, int compteur3, int compteur4, int nbreJoueurs){
		
		for (int i=0; i<13; i++){
			for (int j=0; j<13; j++){
				Lettre lettre = new Lettre();
				grille[i][j]=lettre;
				if (i==0&&j==0){
					grille[i][j].setControle(1);
					grille[i][j].setControleChecked(true);
					grille[i][j].setLettre('n');

				}
				if (i==12&&j==12){
					if (nbreJoueurs>2){
						grille[i][j].setControle(3);
						grille[i][j].setControleChecked(true);
						grille[i][j].setLettre('n');
					}
					else {
						grille[i][j].setControle(2);
						grille[i][j].setControleChecked(true);
						grille[i][j].setLettre('n');
					}
				}
				if (i==0&&j==12){
					if (nbreJoueurs>2){
						grille[i][j].setControle(2);
						grille[i][j].setControleChecked(true);
						grille[i][j].setLettre('n');
					}
				}
				if (i==12&&j==0){
					if (nbreJoueurs==4){
						grille[i][j].setControle(4);
						grille[i][j].setControleChecked(true);
						grille[i][j].setLettre('n');
					}
				}
			}
		}
		return grille;
	}
	
	
	/**
	 +	 * Methode qui dessine la grille
	 +	 * @param grille
	 +	 * @param compteur1
	 +	 * @param compteur2
	 +	 * @return grille
	 +	 */
	public static Lettre[][] dessineGrille(Lettre[][] grille, int compteur1, int compteur2, int compteur3, int compteur4, int nbreJoueurs){
		StdDraw.show(0);
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
					StdDraw.filledSquare(j, 11-i, 0.05);
				}
				
				else if (grille[i][j].getControle(2)==true){
					StdDraw.setPenRadius(0.005);
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.filledCircle(j, 11-i, 0.05);
				}
				
				Font k = new Font("Verdana", 3, 40);
				
				if (grille[i][j].getLettre()=='N' && i==0 && j==0){
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.filledSquare(j, 11-i, 0.5);
					StdDraw.setFont(k);
					StdDraw.setPenColor(StdDraw.WHITE);
					StdDraw.text(j, 11-i, "J1");
				}
				
				else if (grille[i][j].getLettre()=='N' && i==0 && j==12){
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.filledSquare(j, 11-i, 0.5);
					StdDraw.setFont(k);
					StdDraw.setPenColor(StdDraw.WHITE);
					StdDraw.text(j, 11-i, "J2");
				}
				else if (grille[i][j].getLettre()=='N' && i==12 && j==12){
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.filledSquare(j, 11-i, 0.5);
					StdDraw.setFont(k);
					StdDraw.setPenColor(StdDraw.WHITE);
					if (nbreJoueurs==2){
						StdDraw.text(j, 11-i, "J2");
					}
					else{
						StdDraw.text(j, 11-i, "J3");
					}
				}
				else if (grille[i][j].getLettre()=='N' && i==12 && j==0){
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.filledSquare(j, 11-i, 0.5);
					StdDraw.setFont(k);
					StdDraw.setPenColor(StdDraw.WHITE);
					StdDraw.text(j, 11-i, "J4");
				}
				
				StdDraw.setPenRadius(0.01);
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.square(6, 5, 6.5);
				}
		}
		StdDraw.show(0);
		StdDraw.show();
		return grille;
	}
	/**
	 +	 * Methode qui dessine les boutons pour choisir la couleur
	 +	 */
	public static void dessinCouleurs(){
		StdDraw.show(0);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledRectangle(13.5, 4, 0.7, 3.7);
		StdDraw.picture(13.5, 4, "unecaseblanche.png", 1.4, 7.4);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.rectangle(13.5, 4, 0.7, 3.7);
		
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledSquare(13.5, 7, 0.5);

		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledSquare(13.5, 5.8, 0.5);

		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledSquare(13.5, 4.6, 0.5);

		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledSquare(13.5, 3.4, 0.5);

		StdDraw.setPenColor(204,51,204);
		StdDraw.filledSquare(13.5, 2.2, 0.5);

		StdDraw.setPenColor(255, 150, 0);
		StdDraw.filledSquare(13.5, 1, 0.5);
		
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.rectangle(13.5, 4, 0.7, 3.7);
		StdDraw.square(13.5, 7, 0.5);
		StdDraw.square(13.5, 5.8, 0.5);
		StdDraw.square(13.5, 4.6, 0.5);
		StdDraw.square(13.5, 3.4, 0.5);
		StdDraw.square(13.5, 2.2, 0.5);
		StdDraw.square(13.5, 1, 0.5);
		StdDraw.show(0);
	}
	/**
	 +	 * Methode qui demande au joueur le choix de sa couleur et modifie la grille ensuite
	 +	 * @param grille
	 +	 * @param compteur1
	 +	 * @param compteur2
	 +	 * @param joueur
	 +	 * @return grille
	 +	 */
	public static Lettre[][] stepJoueur(Lettre[][] grille, int compteur1, int compteur2, int compteur3, int compteur4, int joueur, int nbreJoueurs){
		StdDraw.show(0);
		char choix1=grille[0][0].getLettre();
		char choix2=grille[12][12].getLettre();
		char choix3=grille[0][12].getLettre();
		char choix4=grille[12][0].getLettre();
		
		char choix='p';
		char ancienChoix='p';
		char autreChoix1 = 'p';
		char autreChoix2 = 'p';
		char autreChoix3 = 'p';
		//joueur 1
		if (joueur==1){
			choix=choix1;
			ancienChoix=choix1;
			autreChoix1 = choix2;
			if (nbreJoueurs>2){
				autreChoix2=choix3;
			}
			if (nbreJoueurs>3){
				autreChoix3=choix4;
			}
		}
		
		//joueur 2
		if (joueur==2){
			choix = choix2;
			ancienChoix= choix2;
			autreChoix1=choix1;
			if (nbreJoueurs>2){
				autreChoix2=choix3;
			}
			if (nbreJoueurs>3){
				autreChoix3=choix4;
			}
		}
		//joueur3
		else if (joueur==3){
			if (nbreJoueurs>2){
				choix = choix3;
				ancienChoix= choix3;
				autreChoix1=choix1;
				autreChoix2=choix2;
				if (nbreJoueurs==4){
					autreChoix3=choix4;
				}
			}
		}
		//joueur4
		else {
			if (nbreJoueurs==4){
				choix = choix4;
				ancienChoix= choix4;
				autreChoix1=choix1;
				autreChoix2=choix2;
				autreChoix3=choix3;
			}
		}
		
		dessinCouleurs();
		StdDraw.show(0);
		StdDraw.show();
		croixCouleurs(choix1, choix2, choix3, choix4, nbreJoueurs);
		StdDraw.filledRectangle(23, -1.2, 2.5, 0.8);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledRectangle(23, -1.2, 2.4, 0.7);
		StdDraw.picture( 24.5, -1.2, "retour.png");
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.text(22.5, -0.8, "Retour");
		StdDraw.text(22.5, -1.3, "au menu");
		String retour="raté";
		do{
			double x=1,y=1;
			while(!StdDraw.mousePressed()){
				x = StdDraw.mouseX();
				y = StdDraw.mouseY();
			}
			
			if (x>=13 && x<=14 && y>=6.5 && y<=7.5) {
				choix = 'j';
			}
			else if (x>=13 && x<=14 && y>=5.3 && y<=6.3){
				choix= 'b';
			}
			else if (x>=13 && x<=14 && y>=4.1 && y<=5.1){
				choix= 'r';
			}
			else if (x>=13 && x<=14 && y>=2.9 && y<=3.9){
				choix= 'v';
			}
			else if (x>=13 && x<=14 && y>=1.7 && y<=2.7){
				choix= 'i';
			}
			else if (x>=13 && x<=14 && y>=0.5 && y<=1.5){
				choix = 'o';
			}
			else if (x>=20.5 && x<=25.5 && y>=-2 && y<=-0.4 ){
				retour="menu";
				choix='a';
			}
			else {
				choix='a';
			}
			
			if (retour=="menu"){
				Main.restartMenu(0, 13, grille, compteur1, compteur2, compteur3, compteur4, 1, nbreJoueurs);
				croixCouleurs(ancienChoix, autreChoix1, autreChoix2, autreChoix3, nbreJoueurs);
				retour="raté";
				StdDraw.filledRectangle(23, -1.2, 2.5, 0.8);
				StdDraw.setPenColor(StdDraw.WHITE);
				StdDraw.filledRectangle(23, -1.2, 2.4, 0.7);
				StdDraw.picture( 24.5, -1, "retour.png");
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.text(22.5, -0.8, "Retour");
				StdDraw.text(22.5, -1.3, "au menu");
			}
			if (Character.toLowerCase(choix) == Character.toLowerCase(autreChoix1)||Character.toLowerCase(choix) == Character.toLowerCase(autreChoix2)||Character.toLowerCase(choix) == Character.toLowerCase(autreChoix3)){
				StdDraw.picture(20, 0.5, "unecaseblanche.png", 10, 2);
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.text(20, 1, "vous ne pouvez pas choisir la");
				StdDraw.text(20, 0, "même couleur que l'adversaire");
			}
			
			else if (Character.toLowerCase(choix) == Character.toLowerCase(ancienChoix)){
				StdDraw.picture(20, 0.5, "unecaseblanche.png", 10, 2);
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.text(20, 1, "vous ne pouvez pas rechoisir");
				StdDraw.text(20, 0, "la même couleur !           ");
			}
			
			else {
				for (int i=0;  i<13; i++){
					for (int j=0; j<13; j++){
						boolean a = grille[i][j].getControle(joueur);
						if (a==true){
							grille[i][j].setLettre(choix);
							boolean test= false;
							
							if (j!=12){
								char b = grille[i][j+1].getLettre();
								if (b==choix){
									grille[i][j+1].setControle(joueur);
									grille[i][j+1].setControleChecked(true);
								}
							}
							if (i!=12){
								char c = grille[i+1][j].getLettre();
								if (c==choix){
									grille[i+1][j].setControle(joueur);
									grille[i+1][j].setControleChecked(true);
								}
							}
							if (j!=0 && test!=true){
								char d = grille[i][j-1].getLettre();
								if (d==choix){
									grille[i][j-1].setControle(joueur);
									grille[i][j-1].setControleChecked(true);
									j-=2;
									test=true;
								}
							}
							if (i!=0 && test!=true){
								char e = grille[i-1][j].getLettre();
								if (e==choix){
									grille[i-1][j].setControle(joueur);
									grille[i-1][j].setControleChecked(true);
									i-=1;
									j-=1;
									test=true;
								}
							}
					}
				}
			}
		}
	}
	while(Character.toLowerCase(choix) != 'r' && Character.toLowerCase(choix) != 'v' && Character.toLowerCase(choix) != 'b' && Character.toLowerCase(choix) != 'j' && Character.toLowerCase(choix) != 'o' && Character.toLowerCase(choix) != 'i' || Character.toLowerCase(choix)== Character.toLowerCase(ancienChoix) || Character.toLowerCase(choix) == Character.toLowerCase(autreChoix1)||Character.toLowerCase(choix) == Character.toLowerCase(autreChoix2)||Character.toLowerCase(choix) == Character.toLowerCase(autreChoix3));
		StdDraw.picture(20, 0.5, "unecaseblanche.png", 10, 2);
		reinitControleChecked(grille);
		return grille;
	}
	/**
	 +	 * Methode qui demande au joueur le choix de sa couleur et modifie la grille ensuite
	 +	 * @param grille
	 +	 * @param compteur1
	 +	 * @param compteur2
	 +	 * @param joueur
	 +	 * @return grille
	 +	 */
	public static void croixCouleurs(char choix1, char choix2, char choix3, char choix4, int nbreJoueurs){
		StdDraw.setPenColor(StdDraw.BLACK);
		if (nbreJoueurs<3){
			choix3='p';
		}
		if (nbreJoueurs!=4){
			choix4='p';
		}
		if (Character.toLowerCase(choix1)=='i' || Character.toLowerCase(choix2)=='i' || Character.toLowerCase(choix3)=='i' || Character.toLowerCase(choix4)=='i'){
			StdDraw.line(13, 1.7, 14, 2.7);
			StdDraw.line(13, 2.7, 14, 1.7);
		}
		if (Character.toLowerCase(choix1)=='r' || Character.toLowerCase(choix2)=='r'|| Character.toLowerCase(choix3)=='r' || Character.toLowerCase(choix4)=='r'){
			StdDraw.line(13, 4.1, 14, 5.1);
			StdDraw.line(13, 5.1, 14, 4.1);
		}
		if (Character.toLowerCase(choix1)=='j' || Character.toLowerCase(choix2)=='j'|| Character.toLowerCase(choix3)=='j' || Character.toLowerCase(choix4)=='j'){
			StdDraw.line(13, 6.5, 14, 7.5);
			StdDraw.line(13, 7.5, 14, 6.5);
		}
		if (Character.toLowerCase(choix1)=='b' || Character.toLowerCase(choix2)=='b'|| Character.toLowerCase(choix3)=='b' || Character.toLowerCase(choix4)=='b'){
			StdDraw.line(13, 5.3, 14, 6.3);
			StdDraw.line(13, 6.3, 14, 5.3);
		}
		if (Character.toLowerCase(choix1)=='v' || Character.toLowerCase(choix2)=='v'|| Character.toLowerCase(choix3)=='v' || Character.toLowerCase(choix4)=='v'){
			StdDraw.line(13, 2.9, 14, 3.9);
			StdDraw.line(13, 3.9, 14, 2.9);
		}
		if (Character.toLowerCase(choix1)=='o' || Character.toLowerCase(choix2)=='o'|| Character.toLowerCase(choix3)=='o' || Character.toLowerCase(choix4)=='o'){
			StdDraw.line(13, 0.5, 14, 1.5);
			StdDraw.line(13, 1.5, 14, 0.5);
		}
	}
	
	/**
	 +	 * Methode qui regarde si la case a gauche de la case de param i, j est de la meme couleur qu'elle
	 +	 * @param grille
	 +	 * @param i
	 +	 * @param j
	 +	 * @return true or false
	 +	 */
	public static boolean checkGauche(Lettre[][] grille, int i, int j){
		if (j!=0){
			if (grille[i][j].getLettre()==grille[i][j-1].getLettre() && grille[i][j-1].isControleChecked()==false){
				grille[i][j-1].setControleChecked(true);
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	/**
	 +	 * Methode qui regarde si la case a droite de la case de param i, j est de la meme couleur qu'elle
	 +	 * @param grille
	 +	 * @param i
	 +	 * @param j
	 +	 * @return true or false
	 +	 */
	public static boolean checkDroite(Lettre[][] grille, int i, int j){
		if (j!=12){
			if (grille[i][j].getLettre()==grille[i][j+1].getLettre() && grille[i][j+1].isControleChecked()==false){
				grille[i][j+1].setControleChecked(true);
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	/**
	 +	 * Methode qui regarde si la case au dessus de la case de param i, j est de la meme couleur qu'elle
	 +	 * @param grille
	 +	 * @param i
	 +	 * @param j
	 +	 * @return true or false
	 +	 */
	public static boolean checkHaut(Lettre[][] grille, int i, int j){
		if (i!=0){
			if (grille[i][j].getLettre()==grille[i-1][j].getLettre() && grille[i-1][j].isControleChecked()==false){
				grille[i-1][j].setControleChecked(true);
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	/**
	 +	 * Methode qui regarde si la case en dessous de la case de param i, j est de la meme couleur qu'elle
	 +	 * @param grille
	 +	 * @param i
	 +	 * @param j
	 +	 * @return true or false
	 +	 */
	public static boolean checkBas(Lettre[][] grille, int i, int j){
		if (i!=12){
			if (grille[i][j].getLettre()==grille[i+1][j].getLettre() && grille[i+1][j].isControleChecked()==false){
				grille[i+1][j].setControleChecked(true);
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	/**
	 +	 * Methode qui regarde si les cases a gauche/droite de la case de param i, j sont de la meme couleur et renvoit le nombre de cases du groupe
	 +	 * @param grille
	 +	 * @param i
	 +	 * @param j
	 +	 * @return valeur
	 +	 */
	public static int  horizontaleCheck(Lettre[][]grille, int i, int j){
		int valeur=0;
		int a = j;
		boolean v, w; 
		do{
			if (checkGauche(grille, i, j)==true){
				valeur+=1;
				v=true;
				j--;
				valeur+=verticalCheck(grille, i, j);
			}
			else {
				v=false;
			}
		}while (v == true);
		j=a;
		
		do{
			if (checkDroite(grille, i, j)==true){
				valeur+=1;
				w=true;
				j++;
				valeur+=verticalCheck(grille, i, j);
			}
			else {
				w=false;
			}
		}while (w == true);
		j=a;
		return valeur;
	}
	
	/**
	 +	 * Methode qui regarde si les cases en haut/bas de la case de param i, j sont de la meme couleur et renvoit le nombre de cases du groupe
	 +	 * @param grille
	 +	 * @param i
	 +	 * @param j
	 +	 * @return valeur
	 +	 */
	public static int  verticalCheck(Lettre[][]grille, int i, int j){
	int val=0;
	int a = i;
	boolean x, y;
	do{
		if (checkHaut(grille, i, j)==true){
			val+=1;
			x=true;
			i--;
			val+=horizontaleCheck(grille, i, j);
		}
		else {
			x=false;
		}
	}while (x == true);
	i=a;
	
	do{
		if (checkBas(grille, i, j)==true){
			val+=1;
			y=true;
			i++;
			val+=horizontaleCheck(grille, i, j);
		}
		else {
			y=false;
		}
	}while (y == true);
	i=a;
	return val;
	}
	
	/**
	 +	 * Methode qui remet le param controleChecked de toutes les cases non controlees a false
	 +	 * @param grille
	 +	 */
	public static void reinitControleChecked(Lettre[][] grille){
		for (int deb=0; deb<13; deb++){
			for (int fin=0; fin<13; fin++){
				if (grille[deb][fin].getControle(1)==true || grille[deb][fin].getControle(2)==true || grille[deb][fin].getControle(3)==true || grille[deb][fin].getControle(4)==true){
					
				}
				else{
					grille[deb][fin].setControleChecked(false);
				}
			}
		}
	}
	
	/**
	 +	 * Methode qui choisit la couleur de l'IA qui lui rapporte le plus de cases et renvoit a grille apres modification
	 +	 * @param grille
	 +	 * @return grille
	 +	 */
	public static Lettre[][] stepIABest(Lettre[][] grille){
		int choixCouleur[] = {0,0,0,0,0,0};
		char choix1=grille[0][0].getLettre();
		for (int a=0; a<=12; a++){
			for (int b=0; b<=12; b++){
				
				if (a==0 && b>0 && b<12){
					if ((grille[a+1][b].getControle(2)==true || grille[a][b-1].getControle(2)==true || grille[a][b+1].getControle(2)==true) && grille[a][b].isControleChecked()==false){
							if (grille[a][b].getLettre()=='r'){
								choixCouleur[0]+=1;
								grille[a][b].setControleChecked(true);
								choixCouleur[0]+=verticalCheck(grille, a, b);
								choixCouleur[0]+=horizontaleCheck(grille, a, b);
							}
							else if (grille[a][b].getLettre()=='o'){
								choixCouleur[1]+=1;
								grille[a][b].setControleChecked(true);
								choixCouleur[1]+=verticalCheck(grille, a, b);
								choixCouleur[1]+=horizontaleCheck(grille, a, b);
							}
							else if (grille[a][b].getLettre()=='j'){
								choixCouleur[2]+=1;
								grille[a][b].setControleChecked(true);
								choixCouleur[2]+=verticalCheck(grille, a, b);
								choixCouleur[2]+=horizontaleCheck(grille, a, b);
							}
							else if (grille[a][b].getLettre()=='v'){
								choixCouleur[3]+=1;
								grille[a][b].setControleChecked(true);
								choixCouleur[3]+=verticalCheck(grille, a, b);
								choixCouleur[3]+=horizontaleCheck(grille, a, b);
							}
							else if (grille[a][b].getLettre()=='b'){
								choixCouleur[4]+=1;
								grille[a][b].setControleChecked(true);
								choixCouleur[4]+=verticalCheck(grille, a, b);
								choixCouleur[4]+=horizontaleCheck(grille, a, b);
							}
							else if (grille[a][b].getLettre()=='i'){
								choixCouleur[5]+=1;
								grille[a][b].setControleChecked(true);
								choixCouleur[5]+=verticalCheck(grille, a, b);
								choixCouleur[5]+=horizontaleCheck(grille, a, b);
							}
							else{
							}
					}
				}
				else if (a==12 && b>0 && b<12){
					if ((grille[a-1][b].getControle(2)==true || grille[a][b-1].getControle(2)==true || grille[a][b+1].getControle(2)==true) && grille[a][b].isControleChecked()==false){
						if (grille[a][b].getLettre()=='r'){
							choixCouleur[0]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[0]+=verticalCheck(grille, a, b);
							choixCouleur[0]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='o'){
							choixCouleur[1]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[1]+=verticalCheck(grille, a, b);
							choixCouleur[1]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='j'){
							choixCouleur[2]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[2]+=verticalCheck(grille, a, b);
							choixCouleur[2]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='v'){
							choixCouleur[3]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[3]+=verticalCheck(grille, a, b);
							choixCouleur[3]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='b'){
							choixCouleur[4]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[4]+=verticalCheck(grille, a, b);
							choixCouleur[4]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='i'){
							choixCouleur[5]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[5]+=verticalCheck(grille, a, b);
							choixCouleur[5]+=horizontaleCheck(grille, a, b);
						}
						else{
						}
					}
				}
				else if (b==0 && a>0 && a<12){
					if ((grille[a-1][b].getControle(2)==true || grille[a+1][b].getControle(2)==true || grille[a][b+1].getControle(2)==true) && grille[a][b].isControleChecked()==false){
						if (grille[a][b].getLettre()=='r'){
							choixCouleur[0]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[0]+=verticalCheck(grille, a, b);
							choixCouleur[0]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='o'){
							choixCouleur[1]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[1]+=verticalCheck(grille, a, b);
							choixCouleur[1]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='j'){
							choixCouleur[2]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[2]+=verticalCheck(grille, a, b);
							choixCouleur[2]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='v'){
							choixCouleur[3]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[3]+=verticalCheck(grille, a, b);
							choixCouleur[3]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='b'){
							choixCouleur[4]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[4]+=verticalCheck(grille, a, b);
							choixCouleur[4]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='i'){
							choixCouleur[5]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[5]+=verticalCheck(grille, a, b);
							choixCouleur[5]+=horizontaleCheck(grille, a, b);
						}
						else{
						}
					}
				}
				else if (b==12 && a>0 && a<12){
					if ((grille[a-1][b].getControle(2)==true || grille[a+1][b].getControle(2)==true || grille[a][b-1].getControle(2)==true) && grille[a][b].isControleChecked()==false){
						if (grille[a][b].getLettre()=='r'){
							choixCouleur[0]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[0]+=verticalCheck(grille, a, b);
							choixCouleur[0]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='o'){
							choixCouleur[1]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[1]+=verticalCheck(grille, a, b);
							choixCouleur[1]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='j'){
							choixCouleur[2]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[2]+=verticalCheck(grille, a, b);
							choixCouleur[2]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='v'){
							choixCouleur[3]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[3]+=verticalCheck(grille, a, b);
							choixCouleur[3]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='b'){
							choixCouleur[4]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[4]+=verticalCheck(grille, a, b);
							choixCouleur[4]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='i'){
							choixCouleur[5]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[5]+=verticalCheck(grille, a, b);
							choixCouleur[5]+=horizontaleCheck(grille, a, b);
						}
						else{
						}
					}
				}
				else if (a>0 && a<12 && b>0 && b<12){
					if ((grille[a-1][b].getControle(2)==true || grille[a+1][b].getControle(2)==true || grille[a][b-1].getControle(2)==true || grille[a][b+1].getControle(2)==true) && grille[a][b].isControleChecked()==false){
						if (grille[a][b].getLettre()=='r'){
							choixCouleur[0]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[0]+=verticalCheck(grille, a, b);
							choixCouleur[0]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='o'){
							choixCouleur[1]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[1]+=verticalCheck(grille, a, b);
							choixCouleur[1]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='j'){
							choixCouleur[2]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[2]+=verticalCheck(grille, a, b);
							choixCouleur[2]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='v'){
							choixCouleur[3]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[3]+=verticalCheck(grille, a, b);
							choixCouleur[3]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='b'){
							choixCouleur[4]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[4]+=verticalCheck(grille, a, b);
							choixCouleur[4]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='i'){
							choixCouleur[5]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[5]+=verticalCheck(grille, a, b);
							choixCouleur[5]+=horizontaleCheck(grille, a, b);
						}
						else{
						}
					}
				}
				else if (a==0 && b==0){
					if ((grille[a+1][b].getControle(2)==true || grille[a][b+1].getControle(2)==true) && grille[a][b].isControleChecked()==false){
						if (grille[a][b].getLettre()=='r'){
							choixCouleur[0]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[0]+=verticalCheck(grille, a, b);
							choixCouleur[0]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='o'){
							choixCouleur[1]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[1]+=verticalCheck(grille, a, b);
							choixCouleur[1]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='j'){
							choixCouleur[2]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[2]+=verticalCheck(grille, a, b);
							choixCouleur[2]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='v'){
							choixCouleur[3]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[3]+=verticalCheck(grille, a, b);
							choixCouleur[3]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='b'){
							choixCouleur[4]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[4]+=verticalCheck(grille, a, b);
							choixCouleur[4]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='i'){
							choixCouleur[5]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[5]+=verticalCheck(grille, a, b);
							choixCouleur[5]+=horizontaleCheck(grille, a, b);
						}
							else{
							}
					}
				}
				else if (a==0 && b==12){
					if ((grille[a+1][b].getControle(2)==true || grille[a][b-1].getControle(2)==true) && grille[a][b].isControleChecked()==false){
						if (grille[a][b].getLettre()=='r'){
							choixCouleur[0]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[0]+=verticalCheck(grille, a, b);
							choixCouleur[0]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='o'){
							choixCouleur[1]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[1]+=verticalCheck(grille, a, b);
							choixCouleur[1]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='j'){
							choixCouleur[2]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[2]+=verticalCheck(grille, a, b);
							choixCouleur[2]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='v'){
							choixCouleur[3]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[3]+=verticalCheck(grille, a, b);
							choixCouleur[3]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='b'){
							choixCouleur[4]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[4]+=verticalCheck(grille, a, b);
							choixCouleur[4]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='i'){
							choixCouleur[5]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[5]+=verticalCheck(grille, a, b);
							choixCouleur[5]+=horizontaleCheck(grille, a, b);
						}
							else{
							}
					}
				}
				else if (a==12 && b==0){
					if ((grille[a-1][b].getControle(2)==true || grille[a][b+1].getControle(2)==true) && grille[a][b].isControleChecked()==false){
						if (grille[a][b].getLettre()=='r'){
							choixCouleur[0]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[0]+=verticalCheck(grille, a, b);
							choixCouleur[0]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='o'){
							choixCouleur[1]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[1]+=verticalCheck(grille, a, b);
							choixCouleur[1]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='j'){
							choixCouleur[2]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[2]+=verticalCheck(grille, a, b);
							choixCouleur[2]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='v'){
							choixCouleur[3]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[3]+=verticalCheck(grille, a, b);
							choixCouleur[3]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='b'){
							choixCouleur[4]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[4]+=verticalCheck(grille, a, b);
							choixCouleur[4]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='i'){
							choixCouleur[5]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[5]+=verticalCheck(grille, a, b);
							choixCouleur[5]+=horizontaleCheck(grille, a, b);
						}
							else{
							}
					}
				}
				else if (a==12 && b==12){
					if ((grille[a-1][b].getControle(2)==true || grille[a][b-1].getControle(2)==true) && grille[a][b].isControleChecked()==false){
						if (grille[a][b].getLettre()=='r'){
							choixCouleur[0]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[0]+=verticalCheck(grille, a, b);
							choixCouleur[0]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='o'){
							choixCouleur[1]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[1]+=verticalCheck(grille, a, b);
							choixCouleur[1]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='j'){
							choixCouleur[2]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[2]+=verticalCheck(grille, a, b);
							choixCouleur[2]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='v'){
							choixCouleur[3]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[3]+=verticalCheck(grille, a, b);
							choixCouleur[3]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='b'){
							choixCouleur[4]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[4]+=verticalCheck(grille, a, b);
							choixCouleur[4]+=horizontaleCheck(grille, a, b);
						}
						else if (grille[a][b].getLettre()=='i'){
							choixCouleur[5]+=1;
							grille[a][b].setControleChecked(true);
							choixCouleur[5]+=verticalCheck(grille, a, b);
							choixCouleur[5]+=horizontaleCheck(grille, a, b);
						}
							else{
							}
					}
				}
			}
		}
		reinitControleChecked(grille);
		int max = 0;
		int r=0;
		for (int ktr = 0; ktr < choixCouleur.length; ktr++) {
			if (choixCouleur[ktr] > max) {
				max = choixCouleur[ktr];
				r=ktr;
			}
		}
		char choix2=grille[12][12].getLettre();
		char lettreAvant=grille[12][12].getLettre();
		if (max==choixCouleur[0]){
			choix2='r';
		}
		else if (max==choixCouleur[1]){
			choix2='o';
		}
		else if (max==choixCouleur[2]){
			choix2='j';
		}
		else if (max==choixCouleur[3]){
			choix2='v';
		}
		else if (max==choixCouleur[4]){
			choix2='b';
		}
		else if (max==choixCouleur[5]){
			choix2='i';
		}
		
		if (choix2==Character.toLowerCase(choix1) || choix2==lettreAvant){
			choixCouleur[r]= -1;
			max=0;
			for (int ktr = 0; ktr < choixCouleur.length; ktr++) {
				if (choixCouleur[ktr] > max) {
					max = choixCouleur[ktr];
					r=ktr;
				}
			}
			if (max==choixCouleur[0]){
				choix2='r';
			}
			else if (max==choixCouleur[1]){
				choix2='o';
			}
			else if (max==choixCouleur[2]){
				choix2='j';
			}
			else if (max==choixCouleur[3]){
				choix2='v';
			}
			else if (max==choixCouleur[4]){
				choix2='b';
			}
			else if (max==choixCouleur[5]){
				choix2='i';
			}
			if (choix2==Character.toLowerCase(choix1) || choix2==lettreAvant){
				choixCouleur[r]=-1;
				max=0;
				for (int ktr = 0; ktr < choixCouleur.length; ktr++) {
					if (choixCouleur[ktr] > max) {
						max = choixCouleur[ktr];
						r=ktr;
					}
				}
				if (max==choixCouleur[0]){
					choix2='r';
				}
				else if (max==choixCouleur[1]){
					choix2='o';
				}
				else if (max==choixCouleur[2]){
					choix2='j';
				}
				else if (max==choixCouleur[3]){
					choix2='v';
				}
				else if (max==choixCouleur[4]){
					choix2='b';
				}
				else if (max==choixCouleur[5]){
					choix2='i';
				}
			}
		}
			for (int i=12;  i>=0; i--){
				for (int j=12; j>=0; j--){
					boolean a = grille[i][j].getControle(2);
					if (a==true){
						grille[i][j].setLettre(choix2);
						boolean test=false;
						if (j!=0){
							char d = grille[i][j-1].getLettre();
							if (d==choix2){
								grille[i][j-1].setControle(2);
								grille[i][j-1].setControleChecked(true);
							}
						}
						if (i!=0){
							char e = grille[i-1][j].getLettre();
							if (e==choix2){
								grille[i-1][j].setControle(2);
								grille[i-1][j].setControleChecked(true);
							}
						}
						if (j!=12 && test!=true){
							char b = grille[i][j+1].getLettre();
							if (b==choix2){
								grille[i][j+1].setControle(2);
								grille[i][j+1].setControleChecked(true);
								j+=2;
								test=true;
							}
						}
						if (i!=12 && test!=true){
							char c = grille[i+1][j].getLettre();
							if (c==choix2){
								grille[i+1][j].setControle(2);
								grille[i+1][j].setControleChecked(true);
								i+=1;
								j+=1;
								test=true;
							}
						}
					}
				}
			}
		return grille;
	}

	/**
	 +	 * Methode qui permet d'afficher le score du joueur pris en parametre
	 +	 * @param grille
	 +	 * @param compteur
	 +	 * @param joueur
	 +	 * @return compteur
	 +	 */
	public static int checkControle(Lettre[][] grille,int compteur, int joueur, int nbreJoueurs){
		Font k = new Font("Bookman Old Style", 3, 26);
		for (int i=0; i<13; i++){
			for (int j=0; j<13; j++){
				if (grille[i][j].getControle(joueur)==true){
					compteur+=1;
				}
				else if (joueur==5 && grille[i][j].getControle(2)==true){
					compteur+=1;
				}
			}
		}
		StdDraw.setFont(k);
		
			if (nbreJoueurs==1){
				if (joueur==5)
					StdDraw.text(20, 3.5, "L'ordinateur a " + compteur + " case(s)");
				if (joueur==1)
					StdDraw.text(20, 4.5, "Le joueur a " + compteur + " case(s)");
			}
			if (nbreJoueurs==2){
				if (joueur==1)
					StdDraw.text(20, 4.5, "Le joueur " + joueur + " a " + compteur + " case(s)");
				if (joueur==2)
					StdDraw.text(20, 3.5, "Le joueur " + joueur + " a " + compteur + " case(s)");
			}
			
			if (nbreJoueurs==3){
				if (joueur==1)
					StdDraw.text(20, 5, "Le joueur " + joueur + " a " + compteur + " case(s)");
				if (joueur==2)
					StdDraw.text(20, 4, "Le joueur " + joueur + " a " + compteur + " case(s)");
				if (joueur==3)
					StdDraw.text(20, 3, "Le joueur " + joueur + " a " + compteur + " case(s)");
			}
		
			if (nbreJoueurs==4){
				if (joueur==1)
					StdDraw.text(20, 5.5, "Le joueur " + joueur + " a " + compteur + " case(s)");
				if (joueur==2)
					StdDraw.text(20, 4.5, "Le joueur " + joueur + " a " + compteur + " case(s)");
				if (joueur==3)
					StdDraw.text(20, 3.5, "Le joueur " + joueur + " a " + compteur + " case(s)");
				if (joueur==4)
					StdDraw.text(20, 2.5, "Le joueur " + joueur + " a " + compteur + " case(s)");
			}
		return compteur;
	}
	
	/**
	 +	 * Methode qui verifie si un joueur possede plus de la moitie des cases du plateau
	 +	 * @param grille
	 +	 * @param compteur1
	 +	 * @param compteur2
	 +	 * @param ordi
	 +	 * @return true or false
	 +	 */
	public static boolean verifGagnant(Lettre[][] grille,int compteur1, int compteur2, int compteur3, int compteur4, int ordi, int nbreJoueurs){
		for (int i=0; i<13; i++){
			for (int j=0; j<13; j++){
				if (grille[i][j].getControle(1)==true){
					compteur1+=1;
				}
			}
		}
		for (int i=0; i<13; i++){
			for (int j=0; j<13; j++){
				if (grille[i][j].getControle(2)==true){
					compteur2+=1;
				}
			}
		}
		for (int i=0; i<13; i++){
			for (int j=0; j<13; j++){
				if (grille[i][j].getControle(3)==true){
					compteur3+=1;
				}
			}
		}
		for (int i=0; i<13; i++){
			for (int j=0; j<13; j++){
				if (grille[i][j].getControle(4)==true){
					compteur4+=1;
				}
			}
		}
		Font t = new Font("Bookman Old Style", 3, 32);
		StdDraw.setFont(t);
		if (compteur1>84){
			Main.finDuJeu("Le joueur 1", grille, compteur1, compteur2, compteur3, compteur4, nbreJoueurs);
			return true;
		}
		if (compteur2>84){
			if (ordi==0){
				Main.finDuJeu("Le joueur 2", grille, compteur1, compteur2, compteur3, compteur4, nbreJoueurs);
			}
			else {
				Main.finDuJeu("L'ordinateur", grille, compteur1, compteur2, compteur3, compteur4, nbreJoueurs);
			}
			return true;
		}
		if (compteur3>84){
			Main.finDuJeu("Le joueur 3", grille, compteur1, compteur2, compteur3, compteur4, nbreJoueurs);
			return true;
		}
		if (compteur4>84){
			Main.finDuJeu("Le joueur 4", grille, compteur1, compteur2, compteur3, compteur4, nbreJoueurs);
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 +	 * Methode qui affiche lque les cases qui ont changé de couleur sans refaire toute la grille
	 +	 * @param grille
	 +	 * @param grille2
	 +	 * @param compteur1
	 +	 * @param compteur2
	 +	 */
	public static void majGrille(Lettre[][] grille, char[][] grille2,  int compteur1, int compteur2, int compteur3, int compteur4){
		StdDraw.show(0);
		for (int i=0; i<13; i++){
			for (int j=0; j<13; j++){
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
				
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.square(j, 11-i, 0.5);
					
					if (grille[i][j].getControle(1)==true){
						StdDraw.setPenRadius(0.005);
						StdDraw.setPenColor(StdDraw.BLACK);
						StdDraw.filledSquare(j, 11-i, 0.05);
					}
				
					else if (grille[i][j].getControle(2)==true){
						StdDraw.setPenRadius(0.005);
						StdDraw.setPenColor(StdDraw.BLACK);
						StdDraw.filledCircle(j, 11-i, 0.05);
					}
					else if (grille[i][j].getControle(3)==true){
						StdDraw.setPenRadius(0.005);
						StdDraw.setPenColor(StdDraw.WHITE);
						StdDraw.filledSquare(j, 11-i, 0.05);
					}
					else if (grille[i][j].getControle(4)==true){
						StdDraw.setPenRadius(0.005);
						StdDraw.setPenColor(StdDraw.WHITE);
						StdDraw.filledCircle(j, 11-i, 0.05);
					}
					StdDraw.setPenRadius(0.005);
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.square(6, 5, 6.5);
				} else{
					
				}
			}
		}
		StdDraw.setPenRadius(0.01);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.square(6, 5, 6.5);
		StdDraw.show(0);
		StdDraw.show();
	}
}