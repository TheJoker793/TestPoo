package abstraction;

public class Footballeur extends Sportif{
	private int nombresBut;
	private int ballonOr;
	private String poste;
	private int ligueDesChampions;

	public Footballeur(String nom, String nationalite, int age, String club, int AnneeExperience,
			
			int nombresBut, int ballonOr,String poste,int ligueDesChampions) {
		super(nom, nationalite, age, club, AnneeExperience);
		this.nombresBut=nombresBut;
		this.ballonOr=ballonOr;
		this.poste=poste;
		this.ligueDesChampions=ligueDesChampions;
	}

	@Override
	public void afficherStatistique() {
		System.out.println("Statistiques: poste: "+this.poste +" Nombre des buts: "+this.nombresBut);
		
	}

	@Override
	public void presenterMetier() {
		System.out.println("je suis "+ super.nom+" footballeur professionnel");
		
	}

	@Override
	public void afficherPalmares() {
		
		System.out.println("Palmares: ballon d'or "+this.ballonOr +" ligue ds champions:"+this.ligueDesChampions);

	}

}
