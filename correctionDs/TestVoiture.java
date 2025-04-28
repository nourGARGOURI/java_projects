package correctionDs;

public class TestVoiture {

	public static void main(String[] args) {
		Voiture v1 = new Voiture(123,2,500,"BMW");
		Voiture v2 = new Voiture(456,6,200,"Mercedec");
		Voiture v3 = new Voiture(789,3,300,"porshe");
		//plusieurs objets
		v1.afficherInformations();
		v2.afficherInformations();
		v3.afficherInformations();
		//affichage
		v2.setModele("clio");
		//motification de modele
		v2.afficherInformations();
		//affichage apre motification
		v1.setPrix_loc(100);
		v1.setNbr(7);
		//motification de prix et nbr
		System.out.println(v1.calculerRevenuTotale());
		//affichage revenu totale de v1
		
		
		int x =0;
		Voiture v0=null;
		if (v1.getNbr()>x) {
			x=v1.getNbr();
			v0=v1;
		}
		if (v2.getNbr()>x) {
			x=v2.getNbr();
			v0=v2;
		}
		if (v3.getNbr()>x) {
			x=v3.getNbr();
			v0=v3;
		}
		System.out.println("La voiture qui a louée le plus grand nbr de jours "+v0.getModele());
		
		
		

	}

}
