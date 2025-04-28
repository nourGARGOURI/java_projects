package gestionProduit;


public class TestGestionProduit {
	public static void main (String[] args){

	 try {
		 Produit P1 = new Produit("pull",50,10);
		 System.out.println(P1);
		 Panier pn = new Panier();
		 pn.ajouterProduit(P1, 1567);
	 }
	 catch(PrixInvalideException | StockInsuffisantException e) {
		 System.out.println(e.getMessage());
		 
	 }
	
	}}

