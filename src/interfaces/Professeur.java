package interfaces;

public class Professeur implements Enseignant {

	@Override
	public void donnerCours(String matiere) {
		System.out.println("je donne le cours "+matiere);

	}

	@Override
	public void preparerLecon(String chapitre) {
		System.out.println("prapare le chapitre "+chapitre);

	}

}
