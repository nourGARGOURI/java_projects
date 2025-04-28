package gestiondevehicule;

public class Voiture extends Vehicule {

	private int nb_roues;
	private String type_crb;
	
public Voiture(String marque,String modele,int annee,int nb_roues,String type_crb) {
		super(marque,modele,annee);
		this.nb_roues=nb_roues;
		this.type_crb=type_crb;
}
public int getNb_roues() {
	return nb_roues;
}
public void setNb_roues(int nb_roues) {
	this.nb_roues=nb_roues;
}
public String getType_crb() {
	return type_crb = type_crb;
}
public void setType_crb(String type_crb) {
	this.type_crb=type_crb;
}
public String toString() {
	return super.toString()+"\t"+nb_roues+"\t"+type_crb;
}
public String whoami() {
	return "i am Voiture";
}
	
	
}
