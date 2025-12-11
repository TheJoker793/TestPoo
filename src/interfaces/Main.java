package interfaces;

public class Main {

	public static void main(String[] args) {
		
			Chirurgien chirurgien = new Chirurgien();
		 	PsyEnseignant psy = new PsyEnseignant();
		 	Professeur prof = new Professeur();
	        Militaire officier = new Officier();
	        EnseignantMilitaire ensMilitaire = new EnseignantMilitaire();
	        System.out.println("Pour le chirurgien");
	        chirurgien.consulterPatient("Mr Eric");
	        chirurgien.prescrireTraitement("Opération");
	        System.out.println("*****************************************************************");
	        System.out.println("Pour le Psy enseignant: ");
	        psy.consulterPatient("Madame Brigitte");
	        psy.prescrireTraitement("Hypnose");
	        psy.preparerLecon("Le psychanalyse");
	        psy.donnerCours("Chapitre 5");
	        System.out.println("*****************************************************************");
	        System.out.println("Pour le professeur");
	        prof.donnerCours("Mathématique");
	        prof.preparerLecon("Le nombre complexe");
	        System.out.println("*****************************************************************");
	        System.out.println("Pour l'officier");
	        officier.executerOrdre("Participer à une seance de tir");
	        officier.porterUniforme();
	        System.out.println("*****************************************************************");
	        System.out.println("Pour l'enseignant militaire");
	        ensMilitaire.executerOrdre("Former les étudiants");
	        ensMilitaire.porterUniforme();
	        ensMilitaire.preparerLecon("POO");
	        ensMilitaire.donnerCours("Heritage et polimorphisme");
	        System.out.println("*****************************************************************");
	        

	}

}
