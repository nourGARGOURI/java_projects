package appProduit;

public class TestProduit {

	public static void main(String[] args) {
//creations des objetes
		Produit p1= new Produit(123,"pasta",0.4,30);
		Produit p2= new Produit(456,"kosksi",0.6,80);
		Produit p3= new Produit(789,"rouz",0.8,20);
		
//affichage
		p1.afficherInformations();
		p2.afficherInformations();
		p3.afficherInformations();
//motification de la qauntite et le prix uni
	p1.setQuantite(50);
	p1.setPrix_un(0.5);
//affichage a nouveau de ce produit
	p1.afficherInformations();
		
		
		
		

	}

}
