package gestiondesemployés;

public class Developpeur extends Employe {
	private String langage;
	public Developpeur(String nom,double salaire,String langage) {
		super(nom,salaire);
		this.langage=langage;
	}
	public String getLangage() {
		return langage;
	}
	public void setLangage(String langage) {
		this.langage=langage;
	}
	@Override
	public String whoami() {
		return"I am a developpeur"+"\t"+super.getNom()+"\t"+super.getSalaire()+"\t"+langage;
		
	}
	
}
