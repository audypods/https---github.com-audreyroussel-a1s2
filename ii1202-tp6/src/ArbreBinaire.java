public class ArbreBinaire {
	
	//attributs
	public ArbreBinaire nom_sommet;
	public ArbreBinaire nom_fils_gauche;
	public ArbreBinaire nom_fils_droite;
	
	//constructeur
	
	public ArbreBinaire (ArbreBinaire nom_sommet, ArbreBinaire nom_fils_droite, ArbreBinaire nom_fils_gauche){
		this.nom_sommet=nom_sommet;
		this.nom_fils_droite=nom_fils_droite;
		this.nom_fils_gauche=nom_fils_gauche;
	}
	
	//getters
	public ArbreBinaire getNom_sommet(){
		return nom_sommet;
	}

	public void affiche_nom_sommet(){
		System.out.println(getNom_sommet());
	}
	public ArbreBinaire getNom_fils_gauche(){
		return nom_fils_gauche;
	}
}