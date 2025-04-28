package gestiondevehicule;

public class TestVoiture {

	public static void main(String[] args) {
		Vehicule ve = new Vehicule("porshe","cayenne",2025);
		Voiture v = new Voiture("BMW","X4",2025,4,"essence");
		System.out.println(ve);
		System.out.println(v);
		Vehicule ve1 = new Voiture("BMW","X4",2025,4,"essence");
		//Vehicule ve2 = (Vehicule)ve1;
		//System.out.println(ve2.whoami());
//MEEEERCIIIII SALAAAAMLAAAAMMMMM
	}

}
