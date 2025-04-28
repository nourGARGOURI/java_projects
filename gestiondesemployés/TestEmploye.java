package gestiondesemployés;

public class TestEmploye {

	public static void main(String[] args) {
		Employe D = new Developpeur("Muslim",3000,"java");
		Employe M = new Manager("Nour",2000,30);
		//System.out.println(D.whoami());
		//System.out.println(M.whoami());
		Employe[] tab={D,M};
		for(Employe employe:tab) {
			System.out.println(employe.whoami());
		}
		//thaaankkk youuuu salaamlaaaammmm
		

	}

}
