package jeuDesSixCouleurs;
import java.util.Random;
import java.lang.Character;

public class Lettre implements Cloneable{
	
	char lettre;
	boolean controle;
	int joueur;
	boolean controleChecked=false;
	
	public Lettre(){
		
		//couleur random
		char[] couleurHasard = {'r','o','j','v','b','i','n'};
		
		Random rand = new Random();
		int a = rand.nextInt(6);
		lettre = couleurHasard[a];
		controle = false;
		joueur=0;
	}

	public Lettre clone() throws CloneNotSupportedException{
		return (Lettre)super.clone();
	}
	
	public char getLettre(){
		if (controle == false){
			return lettre;
		}
		else 
			lettre = Character.toUpperCase(lettre);
			return lettre;
		}
	public boolean getControle(int player){
		if (player==joueur){
			return controle;
		}
		else{
			return false;
		}
	}
	
	public void setControle(int player){
		controle = true;
		joueur = player;
	}
	
	public void setLettre(char newletter){
		lettre=newletter;
	}

	public boolean isControleChecked() {
		return controleChecked;
	}

	public void setControleChecked(boolean controleChecked) {
		this.controleChecked = controleChecked;
	}
	
	
}
