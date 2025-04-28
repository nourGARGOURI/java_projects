package gestionBancaire;

public class TestClient {

	public static void main(String[] args) {
		Client c = new Client(123,"nour",19,1.66);
		Client c1 = new Client(456,"Muslim",21,1.79);
		CompteBancaire cp = new CompteBancaire(c,1000);
		CompteBancaire cp1 = new CompteBancaire(c1,3000);
		
		/*cp.deposer(200);
		*System.out.println(cp);
		*cp.retrait(100);
		*System.out.println(cp);
		*cp.retrait(1200);
		*/ 
		System.out.println(cp+"\n"+cp1);
		cp1.transfert(cp, 500);
		System.out.println(cp+"\n"+cp1);
		cp.transfert(cp1, 2000);
		
		
		
		
		
		

	}

}
