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
	        

	        // Tableau contenant des Medecins
//	        Medecin[] medecins = { chirurgien, psy };

	        // Tableau contenant des Enseignants
	//        Enseignant[] enseignants = { prof, ensMil, psyEnseignant };

	        // Tableau contenant des Militaires
	  //      Militaire[] militaires = { officier, ensMilitaire };

	        /*System.out.println("===== MÉDECINS =====");
	        for (Medecin m : medecins) {
	            m.consulterPatient("Ali");
	            m.prescrireTraitement("Opération");
	            System.out.println("------------------------");
	        }*/

	        /*System.out.println("\n===== ENSEIGNANTS =====");
	        for (Enseignant e : enseignants) {
	            e.donnerCours("Mathématiques");
	            e.preparerLecon("Chapitre 5");
	            System.out.println("------------------------");
	        }*/

	        /*System.out.println("\n===== MILITAIRES =====");
	        for (Militaire mil : militaires) {
	            mil.executerOrdre("Avancer");
	            mil.porterUniforme();
	            System.out.println("------------------------");
	        }*/


	}

}
