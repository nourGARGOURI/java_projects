package gestiondesemployés;

public class Manager extends Employe {
	private int nbr;
	public Manager(String nom,double salaire,int nbr) {
		super(nom,salaire);
		this.nbr=nbr;
	}
	public int getNbr() {
		return nbr;
	}
	public void setNbr(int nbr) {
		this.nbr=nbr;
	}
	@Override
	public String whoami() {
		return"I am a manager"+"\t"+super.getNom()+"\t"+super.getSalaire()+"\t"+nbr;
		
	}
	
}
