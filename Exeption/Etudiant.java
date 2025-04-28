package Exeption;

public class Etudiant {
	    private String nom;
	    private int age;
	    public Etudiant(String nom, int age) throws AgeInvalidException {
	        this.nom = nom;
	        if(age > 0){
	        this.age = age;}
	        else{
	        //System.out.println("l'age ne peut etre negatif");
	        //haka version basique juste affichage simple//
	        //chwyy a5err and i will show you kifeh n5dmouha bl exceptions//
	        throw new AgeInvalidException();
	        }
	    }
	    public String toString(){
	        return nom+" "+age;
	    }
	}


