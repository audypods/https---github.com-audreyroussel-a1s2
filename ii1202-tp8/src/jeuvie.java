/*2.2 G2 aura la meme forme que G0
Si n est pair, Gn aura la forme de GO, si n est impair, Gn aura la forme de G1.

3.1.1 La cellule peut prendre 2 valeurs, le plus judicieux serait donc d'utiliser une variable booleenne.
La grille de cellule pourra être un tableau de booleens

3.1.2 L'état d'une cellule dépend de la quantité de TRUE autour de lui
On prend 2 compteurs k et l de 0 à 2 et un autre a. On regarde si les cases G(i-1+k)(j-1+l)sont vivantes. Si une de ces cellule est vivante, m s'incrémente de 1.

pseudo-code:
a=0
for (k=0; k<3; k++)
	for (l=0; l<3, l++)
		if G(i-1+k)(j-1+l)==TRUE && k!=0 && l!=0
			a=a+1
		end if
	end for
end for
 	
Pour la cellule G(0)(0);
a=0
for (k=0; k<3; k++)
	for (l=0; l<3, l++)
		if G(i-1+k)(j-1+l)==TRUE && k!=0 && l!=0 && i+k>=0 && i+k<=n && j+l>=0 && j+l<=m
			a=a+1
		end if
	end for
end for
*/

import java.awt.Color;

public class jeuvie {
	
	public static void main(String [] args){
		
			
		
		
		int[][] tableau = new int[20][20];
		
		
		
		randomCellule(tableau);
		
		afficher_tableau(tableau);
		
		
		while(true){
			
			StdDraw.setXscale(-0.5, tableau[0].length-0.5);
			StdDraw.setYscale(-0.5, tableau.length-0.5);
			StdDraw.clear(Color.pink);
			StdDraw.setPenColor(Color.white);
			
		
			tableau = bouge(tableau);
		
			afficher_tableau(tableau);
			
			StdDraw.show(1);
		}
		
	}
	
	public static void randomCellule(int[][] tableau){
		for(int i=0; i<tableau.length; i++){
			for(int j=0; j<tableau[i].length; j++){
				tableau[i][j] = random01();
			}
		}
	}
	
	
	public static int random01(){
		double i = Math.random();
		if(i>0.5){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	
	public static int[][] bouge(int [][] tableau){
		
		int[][] tableau2 = new int[tableau.length][tableau[0].length];
		for(int i=0; i<tableau.length; i++){
			for(int j=0; j<tableau[0].length; j++){
				System.out.println("(" + i + " " + j +")");
				System.out.println("");
				tableau2[i][j] = bougeCellule(tableau, i, j);
				System.out.println("		pro : " + tableau2[i][j]);
				System.out.println("________________________");
				
			}
		}
		
		return tableau2;
	}
	
	
	public static int bougeCellule(int[][] tableau, int X, int Y){
		
		int compteur = 0;
		
		for(int i=X-1; i<X+2; i++){
			for(int j=Y-1; j<Y+2; j++){
				if( !(i<0 || i>tableau.length-1 || j<0 || j>tableau[0].length-1 || (i == X && j == Y)) ){
					System.out.println("	(" + i + " " + j +")");
					compteur = compteur + tableau[i][j];
				}
			}
		}
		
		System.out.println("");
		
		if(compteur == 2){
			if(tableau[X][Y] == 1){
				StdDraw.filledCircle(X, Y, 0.5);
				return 1;
			}
			else{
				return 0;
			}
		}
		else if(compteur == 3){
			StdDraw.filledCircle(X, Y, 0.5);
			return 1;
		}
		else{
			return 0;
		}
	}
	
	
	
	
	public static void afficher_tableau(int [][] tableau){
		for(int i=0; i<tableau.length; i++){
			System.out.println("");
			for(int j=0; j<tableau[i].length; j++){
				System.out.print(" " + tableau[i][j]);
			}
		}
	}
	
}