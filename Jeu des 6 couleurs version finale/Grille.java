package jeuDesSixCouleurs;
import edu.princeton.cs.introcs.StdDraw;
import java.lang.Character;
import java.awt.Font;

public class Grille{
	char[][] couleurs;

	public Grille(){
		
	}
	
	
	public static Lettre[][] creationValeursGrille(Lettre[][] grille, int compteur1, int compteur2){
		
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
					grille[i][j].setControle(2);
					grille[i][j].setControleChecked(true);
					grille[i][j].setLettre('n');
				}
			}
		}
		return grille;
	}
	
	
	
	public static Lettre[][] dessineGrille(Lettre[][] grille, int compteur1, int compteur2){
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
				
				else if (grille[i][j].getLettre()=='N' && i==12 && j==12){
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.filledSquare(j, 11-i, 0.5);
					StdDraw.setFont(k);
					StdDraw.setPenColor(StdDraw.WHITE);
					StdDraw.text(j, 11-i, "J2");
				}
				
				else {
					
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
	
	public static Lettre[][] stepJoueur1(Lettre[][] grille, int compteur1, int compteur2){
		StdDraw.show(0);
		char choix1=grille[0][0].getLettre();
		char choix2=grille[12][12].getLettre();
		char ancienChoix1= grille[0][0].getLettre();
		dessinCouleurs();
		StdDraw.show(0);
		StdDraw.show();
		croixCouleurs(choix1, choix2);
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
			else if (x>=20.5 && x<=25.5 && y>=-2 && y<=-0.4 ){
				retour="menu";
				choix1='a';
			}
			else {
				choix1='a';
			}
			
			if (retour=="menu"){
				Main.restartMenu(0, 13, grille, compteur1, compteur2, 1);
				croixCouleurs(ancienChoix1, choix2);
				retour="raté";
				StdDraw.filledRectangle(23, -1.2, 2.5, 0.8);
				StdDraw.setPenColor(StdDraw.WHITE);
				StdDraw.filledRectangle(23, -1.2, 2.4, 0.7);
				StdDraw.picture( 24.5, -1, "retour.png");
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.text(22.5, -0.8, "Retour");
				StdDraw.text(22.5, -1.3, "au menu");
			}
			if (Character.toLowerCase(choix1) == Character.toLowerCase(choix2)){
				StdDraw.picture(20, 0.5, "unecaseblanche.png", 10, 2);
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.text(20, 1, "vous ne pouvez pas choisir la");
				StdDraw.text(20, 0, "même couleur que l'adversaire");
			}
			
			else if (Character.toLowerCase(choix1) == Character.toLowerCase(ancienChoix1)){
				StdDraw.picture(20, 0.5, "unecaseblanche.png", 10, 2);
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.text(20, 1, "vous ne pouvez pas rechoisir");
				StdDraw.text(20, 0, "la même couleur !           ");
			}
			
			else {
				for (int i=0;  i<13; i++){
					for (int j=0; j<13; j++){
						boolean a = grille[i][j].getControle(1);
						if (a==true){
							grille[i][j].setLettre(choix1);
							boolean test= false;
							
							if (j!=12){
								char b = grille[i][j+1].getLettre();
								if (b==choix1){
									grille[i][j+1].setControle(1);
									grille[i][j+1].setControleChecked(true);
								}
							}
							if (i!=12){
								char c = grille[i+1][j].getLettre();
								if (c==choix1){
									grille[i+1][j].setControle(1);
									grille[i+1][j].setControleChecked(true);
								}
							}
							if (j!=0 && test!=true){
								char d = grille[i][j-1].getLettre();
								if (d==choix1){
									grille[i][j-1].setControle(1);
									grille[i][j-1].setControleChecked(true);
									j-=2;
									test=true;
								}
							}
							if (i!=0 && test!=true){
								char e = grille[i-1][j].getLettre();
								if (e==choix1){
									grille[i-1][j].setControle(1);
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
	}while(Character.toLowerCase(choix1) != 'r' && Character.toLowerCase(choix1) != 'v' && Character.toLowerCase(choix1) != 'b' && Character.toLowerCase(choix1) != 'j' && Character.toLowerCase(choix1) != 'o' && Character.toLowerCase(choix1) != 'i' || Character.toLowerCase(choix1)== Character.toLowerCase(ancienChoix1) || Character.toLowerCase(choix1) == Character.toLowerCase(choix2));
		StdDraw.picture(20, 0.5, "unecaseblanche.png", 10, 2);
		reinitControleChecked(grille);
		return grille;
	}
	
	public static void croixCouleurs(char choix1, char choix2){
		StdDraw.setPenColor(StdDraw.BLACK);
		if (Character.toLowerCase(choix1)=='i' || Character.toLowerCase(choix2)=='i'){
			StdDraw.line(13, 1.7, 14, 2.7);
			StdDraw.line(13, 2.7, 14, 1.7);
		}
		if (Character.toLowerCase(choix1)=='r' || Character.toLowerCase(choix2)=='r'){
			StdDraw.line(13, 4.1, 14, 5.1);
			StdDraw.line(13, 5.1, 14, 4.1);
		}
		if (Character.toLowerCase(choix1)=='j' || Character.toLowerCase(choix2)=='j'){
			StdDraw.line(13, 6.5, 14, 7.5);
			StdDraw.line(13, 7.5, 14, 6.5);
		}
		if (Character.toLowerCase(choix1)=='b' || Character.toLowerCase(choix2)=='b'){
			StdDraw.line(13, 5.3, 14, 6.3);
			StdDraw.line(13, 6.3, 14, 5.3);
		}
		if (Character.toLowerCase(choix1)=='v' || Character.toLowerCase(choix2)=='v'){
			StdDraw.line(13, 2.9, 14, 3.9);
			StdDraw.line(13, 3.9, 14, 2.9);
		}
		if (Character.toLowerCase(choix1)=='o' || Character.toLowerCase(choix2)=='o'){
			StdDraw.line(13, 0.5, 14, 1.5);
			StdDraw.line(13, 1.5, 14, 0.5);
		}
	}
	
	public static Lettre[][] stepJoueur2(Lettre[][] grille, int compteur1, int compteur2){
		StdDraw.show(0);
		char choix1=grille[0][0].getLettre();
		char choix2=grille[12][12].getLettre();
		char ancienChoix2=grille[12][12].getLettre();
		dessinCouleurs();
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.show(0);
		StdDraw.show();
		croixCouleurs(ancienChoix2, choix1);
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
			else if (x>=20.5 && x<=25.5 && y>=-2 && y<=-0.4 ){
				retour="menu";
			}
			else {
				choix2='a';
			}
			if (retour=="menu"){
				Main.restartMenu(0, 13, grille, compteur1, compteur2, 2);
				croixCouleurs(ancienChoix2, choix1);
				retour="raté";
				StdDraw.filledRectangle(23, -1.2, 2.5, 0.8);
				StdDraw.setPenColor(StdDraw.WHITE);
				StdDraw.filledRectangle(23, -1.2, 2.4, 0.7);
				StdDraw.picture( 24.5, -1, "retour.png");
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.text(22.5, -0.8, "Retour");
				StdDraw.text(22.5, -1.3, "au menu");
			}
			
		
			else if (Character.toLowerCase(choix2) == Character.toLowerCase(choix1)){
				StdDraw.picture(20, 0.5, "unecaseblanche.png", 10, 2);
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.text(20, 1, "vous ne pouvez pas choisir la");
				StdDraw.text(20, 0, "même couleur que l'adversaire");
			}
			
			else if (Character.toLowerCase(choix2) == Character.toLowerCase(ancienChoix2)){
				StdDraw.picture(20, 0.5, "unecaseblanche.png", 10, 2);
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.text(20, 1, "vous ne pouvez pas rechoisir");
				StdDraw.text(20, 0, "la même couleur !           ");
			}

			else {
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
			}
		}while(Character.toLowerCase(choix2) != 'r' && Character.toLowerCase(choix2) != 'v' && Character.toLowerCase(choix2) != 'b' && Character.toLowerCase(choix2) != 'j' && Character.toLowerCase(choix2) != 'o' && Character.toLowerCase(choix2) != 'i' || Character.toLowerCase(choix2) == Character.toLowerCase(choix1) || Character.toLowerCase(choix2) == Character.toLowerCase(ancienChoix2));
		StdDraw.picture(20, 0.5, "unecaseblanche.png", 10, 2);
		return grille;
	}
	
	
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
	
	public static void reinitControleChecked(Lettre[][] grille){
		for (int deb=0; deb<13; deb++){
			for (int fin=0; fin<13; fin++){
				if (grille[deb][fin].getControle(1)==true || grille[deb][fin].getControle(2)==true){
					
				}
				else{
					grille[deb][fin].setControleChecked(false);
				}
			}
		}
	}
	
	
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
		int max = -1;
		int r=0;
		for (int ktr = 0; ktr < choixCouleur.length; ktr++) {
			if (choixCouleur[ktr] > max) {
				max = choixCouleur[ktr];
				r=ktr;
			}
		}
		char choix2=grille[12][12].getLettre();
		char lettreAvant=Character.toLowerCase(grille[12][12].getLettre());
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
		choixCouleur[r]= -1;
		if (choix2==Character.toLowerCase(choix1) || choix2==lettreAvant){
			max=-1;
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
			choixCouleur[r]=-1;
			if (choix2==Character.toLowerCase(choix1) || choix2==lettreAvant){
				
				max=-1;
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

	
	public static int checkControle(Lettre[][] grille,int compteur, int joueur){
		Font k = new Font("Bookman Old Style", 3, 26);
		for (int i=0; i<13; i++){
			for (int j=0; j<13; j++){
				if (grille[i][j].getControle(joueur)==true){
					compteur+=1;
				}
				else if (joueur==3 && grille[i][j].getControle(2)==true){
					compteur+=1;
				}
				else {
				}
			}
		}
		StdDraw.setFont(k);
		if (compteur>1)
			if (joueur==1)
				StdDraw.text(20, 5, "Le joueur " + joueur + " a " + compteur + " cases");
			else if (joueur==3)
				StdDraw.text(20, 4, "L'ordinateur a " + compteur + " cases");
			else
				StdDraw.text(20, 4, "Le joueur " + joueur + " a " + compteur + " cases");
		else
			if (joueur==1)
				StdDraw.text(20, 5, "Le joueur "+ joueur+" a " + compteur + " case");
			else if (joueur==3)
				StdDraw.text(20, 4, "L'ordinateur a " + compteur + " case");
			else 
				StdDraw.text(20, 4, "lLe joueur "+ joueur+" a " + compteur + " case");
		return compteur;
	}
	
	public static boolean verifGagnant(Lettre[][] grille,int compteur1, int compteur2, int ordi){
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
		Font t = new Font("Bookman Old Style", 3, 32);
		StdDraw.setFont(t);
		if (compteur1>84){
			Main.finDuJeu("Le joueur 1", grille, compteur1, compteur2);
			return true;
		}
		else if (compteur2>84){
			if (ordi==0){
				Main.finDuJeu("Le joueur 2", grille, compteur1, compteur2);
			}
			else {
				Main.finDuJeu("L'ordinateur", grille, compteur1, compteur2);
			}
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public static void majGrille(Lettre[][] grille, char[][] grille2,  int compteur1, int compteur2){
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
					
					else {
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