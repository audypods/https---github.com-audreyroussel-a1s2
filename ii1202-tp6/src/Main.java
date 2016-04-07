
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArbreBinaire arbre1 = new ArbreBinaire(null,null,null);
		ArbreBinaire nom_fils_gauche = new ArbreBinaire(null,null,null);
		int j=0;
		for (int i=0; i<4; i++){
			arbre1 = new ArbreBinaire(nom_fils_gauche,null,null);
			nom_fils_gauche = arbre1.getNom_fils_gauche();
			j=j+1;
		}
		System.out.println(j);
	}
}
