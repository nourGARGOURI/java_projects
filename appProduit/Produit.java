package appProduit;

public class Produit {
	private int id;
	private String nom;
	private double prix_un;
	private int quantite;
	
//constructeur
public Produit(int id,String nom, double prix,int quant) {
	this.id=id;
	this.nom=nom;
	prix_un=prix;
	quantite=quant;
}

public int getQuantite() {
	return quantite;
}

public void setQuantite(int quantite) {
	this.quantite = quantite;
}

public double getPrix_un() {
	return prix_un;
}

public void setPrix_un(double prix_un) {
	this.prix_un = prix_un;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
//methode calculer prix totale
public double calculerPrixTotal() {
	double prix_tot= prix_un *quantite;
	return prix_tot;
}
public void afficherInformations() {
	System.out.println("le identifiant unique est: "+id+" le nom est: "+nom+" le prix unitaire: "
			+prix_un+" la quantite en stock: "+quantite);
}
	
	
	
	
	

}
