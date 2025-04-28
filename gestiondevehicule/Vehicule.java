package gestiondevehicule;

public class Vehicule {
	private String marque;
	private String modele;
	private int annee;
	
public Vehicule(String marque,String modele,int annee) {
		this.marque=marque;
		this.modele=modele;
		this.annee=annee;
}
public String getMarque() {
		return marque;
}
public void setMarque(String marque) {
	this.marque=marque;
}
public String getModele() {
	return modele;
}
public void setModele(String modele) {
	this.modele=modele;
}
public int getAnnee() {
	return annee;
}
public void setAnnee(int annee) {
	this.annee=annee;
}
public String toString() {
	return modele+"\t"+marque+"\t"+annee;
}
public String whoami() {
	return "i am Vehicule";
}



}
