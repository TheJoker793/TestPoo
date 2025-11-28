package abstraction;

public abstract class Star {
	protected String nom;
	protected String Nationalite;
	int age;
	public Star(String nom, String nationalite, int age) {
		this.nom = nom;
		Nationalite = nationalite;
		this.age = age;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNationalite() {
		return Nationalite;
	}
	public void setNationalite(String nationalite) {
		Nationalite = nationalite;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract void presenterMetier();
	public abstract void afficherPalmares();

	
	

}
