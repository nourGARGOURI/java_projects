package Exeption;

public class Test {
	    public static void main(String[] args) {
	        try {
	            Etudiant e = new Etudiant("Nour Gargouri", 19);
	            System.out.println(e);
	        }
	        catch (AgeInvalidException e) {
	            System.err.println(e.getMessage());
	        }
	    }

}
