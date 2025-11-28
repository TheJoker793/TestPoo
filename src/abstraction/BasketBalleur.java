package abstraction;

public class BasketBalleur extends Sportif{
	private double pointsParMatch;
	private double reboundParMatch;
	private int titresNBA;
	private int mvpFinals;

	public BasketBalleur(String nom, String nationalite, int age, String club, int AnneeExperience,
			double pointsParMatch,double reboundParMatch,int titresNBA, int mvpFinals) {
		super(nom, nationalite, age, club, AnneeExperience);
		// TODO Auto-generated constructor stub
		this.pointsParMatch=pointsParMatch;
		this.reboundParMatch=reboundParMatch;
		this.titresNBA=titresNBA;
		this.mvpFinals=mvpFinals;
		
	}

	@Override
	public void afficherStatistique() {
		System.out.println("Statistiques: points/match: "+this.pointsParMatch +"/ rebounds des buts: "+this.reboundParMatch);
		
	}

	@Override
	public void presenterMetier() {
		System.out.println("je suis "+ super.nom+" basetballeur professionnel");
		
	}

	@Override
	public void afficherPalmares() {
		
		System.out.println("Palmares: titre mvp "+this.mvpFinals +" titres NBA :"+this.titresNBA);

	}

}
