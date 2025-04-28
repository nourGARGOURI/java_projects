package randoms;
import java.util.Scanner;

public class TestGame {

	public static void main(String[] args) {
	String[] mots= {"Muslim","Nour","Hiba","Aicha","Islem","Mahdi"}	;//3tito tableau
	
	Game g = new Game(mots,"Nour Gargouri"); //sna3na exemple eli howa model samineh g initialisation lel les variables lingne14 
	while (true) { // bech ywali dima ya3mil run
	g.choisirMot(); // l'ordinnateur ya3mel choix mt3 el mots
	Scanner sc = new Scanner(System.in);
		System.out.println("give an essay");
		String myChoise= sc.nextLine(); // 9belna choix mta3 l'user
	g.verifEssay(myChoise); // y9aren mabin el pc wel user
	System.out.println(g.result()); //y3tina resultat
	}

	}

}
