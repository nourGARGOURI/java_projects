package correctionDs;

public class Voiture {
	private int num_im , nbr;
	private String modele;
	private double prix_loc;

public Voiture(int num,int nbr,double prix ,String modele) { //constricteur
	num_im = num;
	this.nbr  =nbr;
	prix_loc= prix;
	this.modele=modele;
	//yebni l'instance

}

public double getPrix_loc() {
	return prix_loc;
}

public void setPrix_loc(double prix_loc) {
	this.prix_loc = prix_loc;
}

public String getModele() {
	return modele;
}

public void setModele(String modele) {
	this.modele = modele;
}

public int getNbr() {
	return nbr;
}

public void setNbr(int nbr) {
	this.nbr = nbr;
}

public int getNum_im() {
	return num_im;
}

public void setNum_im(int num_im) {
	this.num_im = num_im;
}
public double calculerRevenuTotale() {
	return(prix_loc*nbr);
	
}
public void afficherInformations() {
	System.out.println("le modele de la voiture est :"+modele+" le numero d'im:"+num_im+
			 " le prix de loc: "+prix_loc+" nombre: "+nbr);
	
}




	
	
	
	
	
	

}
