package heritage;

public class Medicament extends ProduitMedical {
	private String forme;
	private int dosage;
	private boolean antibiotique;

	public Medicament(String code, String libelle, int stock, double prix,String forme,int dosage,boolean antibiotique) {
		super(code, libelle, stock, prix);
		this.forme=forme;
		this.dosage=dosage;
		this.antibiotique=antibiotique;
		
	}

	public String getForme() {
		return forme;
	}

	public void setForme(String forme) {
		this.forme = forme;
	}

	public int getDosage() {
		return dosage;
	}

	public void setDosage(int dosage) {
		this.dosage = dosage;
	}

	public boolean isAntibiotique() {
		return antibiotique;
	}

	public void setAntibiotique(boolean antibiotique) {
		this.antibiotique = antibiotique;
	}
	@Override
	public void afficher() {
		System.out.println("ce produit code: "+super.code+" /libelle:"+this.libelle+"/qte stock:"+this.stock+"/prix unitaire:"+this.prix);
		System.out.println("il est de forme :"+this.forme+" avec dosage "+this.dosage+" mg"+ (this.antibiotique?" il est antibiotique":" il n'est pas antibiotique ") );


	}

}
