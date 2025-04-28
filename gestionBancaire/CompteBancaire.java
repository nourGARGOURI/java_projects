package gestionBancaire;

public class CompteBancaire {
	
	private Client client;
	private double solde;
	
public CompteBancaire(Client client,double solde) {
	this.client=client;
	this.solde=solde;
}
public Client getClient() {
	return client;
}
public void setClient(Client client) {
	this.client=client;
}
public double getSolde() {
	return solde;
}
public void setSolde(double solde) {
	this.solde=solde;
}
public void deposer(double montant) {
	solde =solde +montant;
	System.out.println("solde bien ajouté");
}
public void retrait(double montant) {
	if(montant< solde) {
	solde = solde - montant;
	System.out.println("solde bien retiré");
	}
	else { System.out.println("solde insuffisant");
	}
	}
public String toString() {
	return client+"\t"+solde+"\t";

	}
public void transfert(CompteBancaire cbank, double montant) {
	if (montant<solde) {
	solde =solde- montant;
	cbank.setSolde(cbank.getSolde()+montant);
	System.out.println("solde bien transferé");
	}
	else {
		System.out.println("solde insuffisant");
	}
	
}
}


