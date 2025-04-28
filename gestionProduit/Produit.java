package gestionProduit;

public class Produit {
	private String nom;
	private double prix;
	private int stock;
	public Produit(String nom, double prix, int stock)throws PrixInvalideException {
		this.nom=nom;
		
		if(prix>0) {  
			this.prix=prix;
		}
		else {
			throw new PrixInvalideException();
		}
		
		this.stock=stock;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom){
		this.nom=nom;
	} 
	public double getPrix() {
		return prix;
	}
	
	public void setPrix(double prix){
		this.prix=prix;
	} 
	public int getStock() {
		return stock;
	}
	public void setStock(int stock){
		this.stock=stock;
	} 
	public String toString() {
		return nom +":" +prix +":"+stock;
	}
		
	}
	
	
	
	
	


