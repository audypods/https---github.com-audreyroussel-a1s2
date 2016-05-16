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

	public Grille(){
		
	}
	
	
	public static Lettre[][] creationValeursGrille(Lettre[][] grille, int compteur1, int compteur2, int compteur3, int compteur4){
		
		for (int i=0; i<13; i++){
			for (int j=0; j<13; j++){
				Lettre lettre = new Lettre();
				grille[i][j]=lettre;
				if (i==0&&j==0){
					grille[i][j].setControle(1);
					grille[i][j].setLettre('n');

				}
				if (i==12&&j==12){
					grille[i][j].setControle(2);
					grille[i][j].setLettre('n');
				}
				if (i==0 && j==12 && compteur3!=0){
					grille[i][j].setControle(3);
					grille[i][j].setLettre('n');
				}
				if (i==12 && j==0 && compteur4!=0){
					grille[i][j].setControle(4);
					grille[i][j].setLettre('n');
				}
			}
		}
		return grille;
	}
	
	
	
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
				
				StdDraw.setPenRadius(0.01);
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.square(6, 5, 6.5);
				}
		}
		//dessinCouleurs();
		return grille;
	}
	
	public static void dessinCouleurs(){
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledRectangle(13.5, 4, 0.7, 3.7);
		StdDraw.picture(13.5, 4, "unecaseblanche.png", 1.4, 7.4);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.rectangle(13.5, 4, 0.7, 3.7);
		
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
		
		char choix1=grille[0][0].getLettre();
		char choix2=grille[12][12].getLettre();
		char ancienChoix1= grille[0][0].getLettre();
		Scanner scan = new Scanner(System.in);
		System.out.println("Couleur joueur 1?");
		dessinCouleurs();
		StdDraw.setPenColor(StdDraw.BLACK);
		if (Character.toLowerCase(choix2)=='i' || Character.toLowerCase(choix1)=='i'){
			StdDraw.line(13, 1.7, 14, 2.7);
			StdDraw.line(13, 2.7, 14, 1.7);
		}
		if (Character.toLowerCase(choix2)=='r' || Character.toLowerCase(choix1)=='r'){
			StdDraw.line(13, 4.1, 14, 5.1);
			StdDraw.line(13, 5.1, 14, 4.1);
		}
		if (Character.toLowerCase(choix2)=='j' || Character.toLowerCase(choix1)=='j'){
			StdDraw.line(13, 6.5, 14, 7.5);
			StdDraw.line(13, 7.5, 14, 6.5);
		}
		if (Character.toLowerCase(choix2)=='b' || Character.toLowerCase(choix1)=='b'){
			StdDraw.line(13, 5.3, 14, 6.3);
			StdDraw.line(13, 6.3, 14, 5.3);
		}
		if (Character.toLowerCase(choix2)=='v' || Character.toLowerCase(choix1)=='v'){
			StdDraw.line(13, 2.9, 14, 3.9);
			StdDraw.line(13, 3.9, 14, 2.9);
		}
		if (Character.toLowerCase(choix2)=='o' || Character.toLowerCase(choix1)=='o'){
			StdDraw.line(13, 0.5, 14, 1.5);
			StdDraw.line(13, 1.5, 14, 0.5);
		}
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
			
		
			if (Character.toLowerCase(choix1) == Character.toLowerCase(choix2)){
				StdDraw.picture(20, 0.5, "unecaseblanche.png", 10, 2);
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.text(20, 1, "vous ne pouvez pas choisir la");
				StdDraw.text(20, 0, "même couleur que l'adversaire");
				System.out.println(choix1);
			}
			
			else if (Character.toLowerCase(choix1) != 'r' && Character.toLowerCase(choix1) != 'v' && Character.toLowerCase(choix1) != 'b' && Character.toLowerCase(choix1) != 'j' && Character.toLowerCase(choix1) != 'o' && Character.toLowerCase(choix1) != 'i'){
					StdDraw.setPenColor(StdDraw.BLACK);
					/*StdDraw.text(20, 1, "Ceci nest pas une");
					StdDraw.text(20, 0, "couleur proposée");*/
					System.out.println(choix1 + " ceci n'est pas une couleur proposée");
			}
			
			else if (Character.toLowerCase(choix1) == Character.toLowerCase(ancienChoix1)){
				StdDraw.picture(20, 0.5, "unecaseblanche.png", 10, 2);
				System.out.println("vous ne pouvez pas rechoisir la même couleur");
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.text(20, 1, "vous ne pouvez pas rechoisir");
				StdDraw.text(20, 0, "la même couleur !           ");
				System.out.println(choix1);
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
								}
							}
							if (i!=12){
								char c = grille[i+1][j].getLettre();
								if (c==choix1){
									grille[i+1][j].setControle(1);
								}
							}
							if (j!=0 && test!=true){
								char d = grille[i][j-1].getLettre();
								if (d==choix1){
									grille[i][j-1].setControle(1);
									j-=2;
									test=true;
								}
							}
							if (i!=0 && test!=true){
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
	}while(Character.toLowerCase(choix1) != 'r' && Character.toLowerCase(choix1) != 'v' && Character.toLowerCase(choix1) != 'b' && Character.toLowerCase(choix1) != 'j' && Character.toLowerCase(choix1) != 'o' && Character.toLowerCase(choix1) != 'i' || Character.toLowerCase(choix1)== Character.toLowerCase(ancienChoix1) || Character.toLowerCase(choix1) == Character.toLowerCase(choix2));
		StdDraw.picture(20, 0.5, "unecaseblanche.png", 10, 2);
		//StdDraw.setPenColor(StdDraw.WHITE);
		//StdDraw.filledRectangle(19, 0.5, 5, 1);
		return grille;
	}
	
	public static Lettre[][] stepJoueur2(Lettre[][] grille){
		char choix1=grille[0][0].getLettre();
		char choix2=grille[12][12].getLettre();
		char ancienChoix2=grille[12][12].getLettre();
		Scanner scan = new Scanner(System.in);
		System.out.println("Couleur joueur 2?");
		dessinCouleurs();
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
		System.out.println();
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
			else {
				choix2='a';
			}
			//StdDraw.setPenColor(StdDraw.WHITE);
			//StdDraw.filledRectangle(19, 0.5, 5, 1);

			if (Character.toLowerCase(choix2) != 'r' && Character.toLowerCase(choix2) != 'v' && Character.toLowerCase(choix2) != 'b' && Character.toLowerCase(choix2) != 'j' && Character.toLowerCase(choix2) != 'o' && Character.toLowerCase(choix2) != 'i'){
				System.out.println("Ceci nest pas une couleur proposée");
				StdDraw.setPenColor(StdDraw.BLACK);
				//StdDraw.text(19, 1, "Ceci nest pas une");
				//StdDraw.text(19, 0, "couleur proposée");
			}
		
			else if (Character.toLowerCase(choix2) == Character.toLowerCase(choix1)){
				System.out.println("vous ne pouvez pas choisir la même couleur que l'adversaire");
				StdDraw.picture(20, 0.5, "unecaseblanche.png", 10, 2);
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.text(20, 1, "vous ne pouvez pas choisir la");
				StdDraw.text(20, 0, "même couleur que l'adversaire");
			}
			
			else if (Character.toLowerCase(choix2) == Character.toLowerCase(ancienChoix2)){
				System.out.println("vous ne pouvez pas rechoisir la même couleur");
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
								}
							}
							if (i!=0){
								char e = grille[i-1][j].getLettre();
								if (e==choix2){
									grille[i-1][j].setControle(2);
								}
							}
							if (j!=12 && test!=true){
								char b = grille[i][j+1].getLettre();
								if (b==choix2){
									grille[i][j+1].setControle(2);
									j+=2;
									test=true;
								}
							}
							if (i!=12 && test!=true){
								char c = grille[i+1][j].getLettre();
								if (c==choix2){
									grille[i+1][j].setControle(2);
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
		//StdDraw.setPenColor(StdDraw.WHITE);
		//StdDraw.filledRectangle(19, 0.5, 5, 1);
		return grille;
	}
//----------------------------------------------------------------//
	
	
//----------------------------------------------------------------//
	public static Lettre[][] stepIAHasard(Lettre[][] grille){
		
		char choix1=grille[0][0].getLettre();
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
			
				for (int i=12;  i>=0; i--){
					for (int j=12; j>=0; j--){
						boolean a = grille[i][j].getControle(2);
						if (a==true){
							grille[i][j].setLettre(choix2);
							
							//---------test
							boolean test=false;
							//---------
							
							if (j!=0){
								char d = grille[i][j-1].getLettre();
								if (d==choix2){
									grille[i][j-1].setControle(2);
								}
							}
							if (i!=0){
								char e = grille[i-1][j].getLettre();
								if (e==choix2){
									grille[i-1][j].setControle(2);
								}
							}
							if (j!=12 && test!=true){
								char b = grille[i][j+1].getLettre();
								if (b==choix2){
									grille[i][j+1].setControle(2);
									j+=2;
									test=true;
								}
							}
							if (i!=12 && test!=true){
								char c = grille[i+1][j].getLettre();
								if (c==choix2){
									grille[i+1][j].setControle(2);
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
	//***************************************************
public static Lettre[][] stepIABest(Lettre[][] grille){
		int choixCouleur[] = {0,0,0,0,0,0};
		char choix1=grille[0][0].getLettre();
		for (int a=0; a<13; a++){
			for (int b=0; b<13; b++){
				if (a==0 && b>0 && b<12){
					if (grille[a+1][b].getControle(2)==true || grille[a][b-1].getControle(2)==true || grille[a][b+1].getControle(2)==true){
							if (grille[a][b].getLettre()=='r')
								choixCouleur[0]+=1;
							else if (grille[a][b].getLettre()=='o')
								choixCouleur[1]+=1;
							else if (grille[a][b].getLettre()=='j')
								choixCouleur[2]+=1;
							else if (grille[a][b].getLettre()=='v')
								choixCouleur[3]+=1;
							else if (grille[a][b].getLettre()=='b')
								choixCouleur[4]+=1;
							else if (grille[a][b].getLettre()=='i')
								choixCouleur[5]+=1;
							else{
							}
					}
				}
				else if (a==12 && b>0 && b<12){
					if (grille[a-1][b].getControle(2)==true || grille[a][b-1].getControle(2)==true || grille[a][b+1].getControle(2)==true){
						if (grille[a][b].getLettre()=='r')
							choixCouleur[0]+=1;
						else if (grille[a][b].getLettre()=='o')
							choixCouleur[1]+=1;
						else if (grille[a][b].getLettre()=='j')
							choixCouleur[2]+=1;
						else if (grille[a][b].getLettre()=='v')
							choixCouleur[3]+=1;
						else if (grille[a][b].getLettre()=='b')
							choixCouleur[4]+=1;
						else if (grille[a][b].getLettre()=='i')
							choixCouleur[5]+=1;
						else{
						}
					}
				}
				else if (b==0 && a>0 && a<12){
					if (grille[a-1][b].getControle(2)==true || grille[a+1][b].getControle(2)==true || grille[a][b+1].getControle(2)==true){
						if (grille[a][b].getLettre()=='r')
							choixCouleur[0]+=1;
						else if (grille[a][b].getLettre()=='o')
							choixCouleur[1]+=1;
						else if (grille[a][b].getLettre()=='j')
							choixCouleur[2]+=1;
						else if (grille[a][b].getLettre()=='v')
							choixCouleur[3]+=1;
						else if (grille[a][b].getLettre()=='b')
							choixCouleur[4]+=1;
						else if (grille[a][b].getLettre()=='i')
							choixCouleur[5]+=1;
						else{
						}
					}
				}
				else if (b==12 && a>0 && a<12){
					if (grille[a-1][b].getControle(2)==true || grille[a+1][b].getControle(2)==true || grille[a][b-1].getControle(2)==true){
						if (grille[a][b].getLettre()=='r')
							choixCouleur[0]+=1;
						else if (grille[a][b].getLettre()=='o')
							choixCouleur[1]+=1;
						else if (grille[a][b].getLettre()=='j')
							choixCouleur[2]+=1;
						else if (grille[a][b].getLettre()=='v')
							choixCouleur[3]+=1;
						else if (grille[a][b].getLettre()=='b')
							choixCouleur[4]+=1;
						else if (grille[a][b].getLettre()=='i')
							choixCouleur[5]+=1;
						else{
						}
					}
				}
				else if (a>0 && a<12 && b>0 && b<12){
					if (grille[a-1][b].getControle(2)==true || grille[a+1][b].getControle(2)==true || grille[a][b-1].getControle(2)==true || grille[a][b+1].getControle(2)==true){
						if (grille[a][b].getLettre()=='r')
							choixCouleur[0]+=1;
						else if (grille[a][b].getLettre()=='o')
							choixCouleur[1]+=1;
						else if (grille[a][b].getLettre()=='j')
							choixCouleur[2]+=1;
						else if (grille[a][b].getLettre()=='v')
							choixCouleur[3]+=1;
						else if (grille[a][b].getLettre()=='b')
							choixCouleur[4]+=1;
						else if (grille[a][b].getLettre()=='i')
							choixCouleur[5]+=1;
						else{
						}
					}
				}
				else if (a==0 && b==0){
					if (grille[a+1][b].getControle(2)==true || grille[a][b+1].getControle(2)==true){
							if (grille[a][b].getLettre()=='r')
								choixCouleur[0]+=1;
							else if (grille[a][b].getLettre()=='o')
								choixCouleur[1]+=1;
							else if (grille[a][b].getLettre()=='j')
								choixCouleur[2]+=1;
							else if (grille[a][b].getLettre()=='v')
								choixCouleur[3]+=1;
							else if (grille[a][b].getLettre()=='b')
								choixCouleur[4]+=1;
							else if (grille[a][b].getLettre()=='i')
								choixCouleur[5]+=1;
							else{
							}
					}
				}
				else if (a==0 && b==12){
					if (grille[a+1][b].getControle(2)==true || grille[a][b-1].getControle(2)==true){
							if (grille[a][b].getLettre()=='r')
								choixCouleur[0]+=1;
							else if (grille[a][b].getLettre()=='o')
								choixCouleur[1]+=1;
							else if (grille[a][b].getLettre()=='j')
								choixCouleur[2]+=1;
							else if (grille[a][b].getLettre()=='v')
								choixCouleur[3]+=1;
							else if (grille[a][b].getLettre()=='b')
								choixCouleur[4]+=1;
							else if (grille[a][b].getLettre()=='i')
								choixCouleur[5]+=1;
							else{
							}
					}
				}
				else if (a==12 && b==0){
					if (grille[a-1][b].getControle(2)==true || grille[a][b+1].getControle(2)==true){
							if (grille[a][b].getLettre()=='r')
								choixCouleur[0]+=1;
							else if (grille[a][b].getLettre()=='o')
								choixCouleur[1]+=1;
							else if (grille[a][b].getLettre()=='j')
								choixCouleur[2]+=1;
							else if (grille[a][b].getLettre()=='v')
								choixCouleur[3]+=1;
							else if (grille[a][b].getLettre()=='b')
								choixCouleur[4]+=1;
							else if (grille[a][b].getLettre()=='i')
								choixCouleur[5]+=1;
							else{
							}
					}
				}
				else if (a==12 && b==12){
					if (grille[a-1][b].getControle(2)==true || grille[a][b-1].getControle(2)==true){
							if (grille[a][b].getLettre()=='r')
								choixCouleur[0]+=1;
							else if (grille[a][b].getLettre()=='o')
								choixCouleur[1]+=1;
							else if (grille[a][b].getLettre()=='j')
								choixCouleur[2]+=1;
							else if (grille[a][b].getLettre()=='v')
								choixCouleur[3]+=1;
							else if (grille[a][b].getLettre()=='b')
								choixCouleur[4]+=1;
							else if (grille[a][b].getLettre()=='i')
								choixCouleur[5]+=1;
							else{
							}
					}
				}
			}
		}  // on vient de calculer pour chaque couleur le nbr de case a recuperer
		System.out.println(choixCouleur[0] +" "+ choixCouleur[1] +" "+choixCouleur[2] +" "+choixCouleur[3] +" "+ choixCouleur[4]+" "+ choixCouleur[5]);
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
			choixCouleur[r]=0;
			System.out.println(choixCouleur[0] +" "+ choixCouleur[1] +" "+choixCouleur[2] +" "+choixCouleur[3] +" "+ choixCouleur[4]+" "+ choixCouleur[5]);
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
				choixCouleur[r]=0;
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
		
		
		//char memechoix2=grille[12][12].getLettre();
		//Scanner scan = new Scanner(System.in);
		System.out.println("Couleur de l'ordinateur ?");
		//char[] couleurHasard = {'r','o','j','v','b','i'};
		//Random rand = new Random();
		//int z = rand.nextInt(6);
		//choix2 = couleurHasard[z];
		//while (choix2==Character.toLowerCase(choix1) || choix2==memechoix2){
			//z = rand.nextInt(6);
			//choix2 = couleurHasard[z];
		//}
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
			
				for (int i=12;  i>=0; i--){
					for (int j=12; j>=0; j--){
						boolean a = grille[i][j].getControle(2);
						if (a==true){
							grille[i][j].setLettre(choix2);
							
							//---------test
							boolean test=false;
							//---------
							
							if (j!=0){
								char d = grille[i][j-1].getLettre();
								if (d==choix2){
									grille[i][j-1].setControle(2);
								}
							}
							if (i!=0){
								char e = grille[i-1][j].getLettre();
								if (e==choix2){
									grille[i-1][j].setControle(2);
								}
							}
							if (j!=12 && test!=true){
								char b = grille[i][j+1].getLettre();
								if (b==choix2){
									grille[i][j+1].setControle(2);
									j+=2;
									test=true;
								}
							}
							if (i!=12 && test!=true){
								char c = grille[i+1][j].getLettre();
								if (c==choix2){
									grille[i+1][j].setControle(2);
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
	//***************************************************
//----------------------------------------------------------------//
	
	public static int checkControle(Lettre[][] grille,int compteur, int joueur){
		Font k = new Font("Bookman Old Style", 3, 26);
		for (int i=0; i<13; i++){
			for (int j=0; j<13; j++){
				if (grille[i][j].getControle(joueur)==true){
					compteur+=1;
				}
				else {
					
				}
			}
		}
		StdDraw.setFont(k);
		if (compteur>1)
			if (joueur==1)
				StdDraw.text(20, 5, "le joueur " + joueur + " a " + compteur + " cases");
			else
				StdDraw.text(20, 4, "le joueur " + joueur + " a " + compteur + " cases");
		else
			if (joueur==1)
				StdDraw.text(20, 5, "le joueur "+ joueur+" a " + compteur + " case");
			else 
				StdDraw.text(20, 4, "le joueur "+ joueur+" a " + compteur + " case");
		return compteur;
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
		
		Font t = new Font("Bookman Old Style", 3, 32);
		StdDraw.setFont(t);
		if (compteur1>84){
			Main.finDuJeu("joueur 1");
			StdDraw.text(20, 0.5, "le joueur 1 a gagné");
			return true;
		}
		else if (compteur2>84){
			Main.finDuJeu("joueur 2");
			StdDraw.text(20, 0.5, "le joueur 2 a gagné");
			return true;
		}
		else if (compteur3>84){
			StdDraw.text(20, 0.5, "le joueur 3 a gagné");
			return true;
		}
		else if (compteur4>84){
			StdDraw.text(20, 0.5, "le joueur 4 a gagné");
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
		}
		StdDraw.setPenRadius(0.01);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.square(6, 5, 6.5);
	}
	//---------------------------------FONCTION UPGRADE GRILLE-----------------------------------//
}