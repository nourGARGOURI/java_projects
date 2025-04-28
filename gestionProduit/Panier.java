package gestionProduit;

public class Panier {
	
	public  void ajouterProduit(Produit p, int quantite) throws StockInsuffisantException {
		if(p.getStock()<quantite) {
			throw new StockInsuffisantException();
		}
		
		
	}
	
	
}
