import interfaces.*;

public class Main {
    public static void main(String[] args) {

        // Création des objets
        Medecin chirurgien = new Chirurgien();
        Medecin psy = new PsyEnseignant();

        Enseignant prof = new Professeur();
        Enseignant ensMil = new EnseignantMilitaire();
        Enseignant psyEnseignant = new PsyEnseignant();

        Militaire officier = new Officier();
        Militaire ensMilitaire = new EnseignantMilitaire();

        // Tableau contenant des Medecins
        Medecin[] medecins = { chirurgien, psy };

        // Tableau contenant des Enseignants
        Enseignant[] enseignants = { prof, ensMil, psyEnseignant };

        // Tableau contenant des Militaires
        Militaire[] militaires = { officier, ensMilitaire };

        System.out.println("===== MÉDECINS =====");
        for (Medecin m : medecins) {
            m.consulterPatient("Ali");
            m.prescrireTraitement("Paracétamol");
            System.out.println("------------------------");
        }

        System.out.println("\n===== ENSEIGNANTS =====");
        for (Enseignant e : enseignants) {
            e.donnerCours("Mathématiques");
            e.preparerLecon("Chapitre 5");
            System.out.println("------------------------");
        }

        System.out.println("\n===== MILITAIRES =====");
        for (Militaire mil : militaires) {
            mil.executerOrdre("Avancer");
            mil.porterUniforme();
            System.out.println("------------------------");
        }
    }
}
