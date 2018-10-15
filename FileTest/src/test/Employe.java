package test;

public class Employe {

	String nom;
	String prenom;
	int age;
	int numSecu;


	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNumSecu() {
		return numSecu;
	}
	public void setNumSecu(int numSecu) {
		this.numSecu = numSecu;
	}
	
	
	@Override
	public String toString() {
		return "Employe [Nom= " + nom + ", Prenom= " + prenom + ", Age= " + age + ", Numéro de Secu= " + numSecu + "]";
	}

	
	public Employe() {
		
	}
	
	//Constructor Employe
	public Employe(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}






}
