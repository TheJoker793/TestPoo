package interfaces;

public class Chirurgien implements Medecin {
	
	

	@Override
	public void consulterPatient(String patient) {
		System.out.println("je consulte le patient "+patient);

	}

	@Override
	public void prescrireTraitement(String traitement) {
		System.out.println("Prescription "+traitement);

	}

}
