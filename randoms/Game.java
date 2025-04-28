package randoms;

import java.util.Random;

public class Game {
	//Attributes//
	
String[] mots;
String username;
String choix;
boolean iswin;

   //methods=function//
public Game(String[] mots,String username) {   //constructeur bech ynedih l'utilisateur
	this.mots=mots;
	this.username=username;
}
public void choisirMot() {  // void matrja3lik chay
	Random r =new Random();
	int i = r.nextInt(mots.length);
	choix = mots[i];
}
public void verifEssay(String essay) {   //y9aren essay l'utilisateur b choix mt3 l'ordinnateur
	if (choix.equals(essay)) {
		iswin=true;
		return; // ken ykmel y5dem ma8ir return ywli iswin false
	}
	iswin = false;
}
public String result() { // y9olina rba7 wala la
	if (iswin == true)
		return username+","+"you are a winner";
	else
		return username+","+"you are a loser";
	
}

}
