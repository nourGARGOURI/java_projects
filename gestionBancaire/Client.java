package gestionBancaire;

public class Client {
	
	private int id;
	private String nom;
	private int age;
	private double height; 
	
public Client(int id , String nom,int age,double height) {
	this.id =id;
	this.nom=nom;
	this.age=age;
	this.height=height;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id =id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom=nom;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age=age;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height=height;
}
public String toString() {
	return id+"\t" +nom+"\t"+age+"\t"+height+"\t";
			
	}
	
	
	

}
