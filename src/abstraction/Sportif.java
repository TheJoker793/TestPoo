package abstraction;

public abstract class Sportif extends Star{
	String club;
	int AnneeExperience;
	

	public Sportif(String nom, String nationalite, int age,String club,int AnneeExperience) {
		super(nom, nationalite, age);
		this.club=club;
		this.AnneeExperience=AnneeExperience;
	}
	public abstract void afficherStatistique();

}
