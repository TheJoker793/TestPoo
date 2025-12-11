package interfaces;

public class EnseignantMilitaire implements Militaire, Enseignant {

	@Override
	public void donnerCours(String matiere) {
        System.out.println("Je donne le cours " + matiere);

	}

	@Override
	public void preparerLecon(String chapitre) {
        System.out.println("Je prepare le chapitre " + chapitre);

	}

	@Override
	public void executerOrdre(String ordre) {
        System.out.println("J'execute l'ordre' " + ordre);

	}

	@Override
	public void porterUniforme() {
        System.out.println("Je porte la tenu combat");


    }

}
