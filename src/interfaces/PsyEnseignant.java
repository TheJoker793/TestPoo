package interfaces;

public class PsyEnseignant implements Medecin, Enseignant {

	@Override
	public void donnerCours(String matiere) {
        System.out.println("Je donne le cours  " + matiere);


    }

	@Override
	public void preparerLecon(String chapitre) {
        System.out.println("Je prepare le chapitre  " + chapitre);

	}

	@Override
	public void consulterPatient(String patient) {
        System.out.println("Je consuulte le patient  " + patient);

	}

	@Override
	public void prescrireTraitement(String traitement) {
        System.out.println("je prescrit le traitement  " + traitement);

	}

}
