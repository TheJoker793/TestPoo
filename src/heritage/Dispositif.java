package heritage;

public class Dispositif extends ProduitMedical{
	private String type;
	private boolean usageUnique;
	

	public Dispositif(String code, String libelle, int stock, double prix,String type,boolean usageUnique) {
		super(code, libelle, stock, prix);
		this.type=type;
		this.usageUnique=usageUnique;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public boolean isUsageUnique() {
		return usageUnique;
	}


	public void setUsageUnique(boolean usageUnique) {
		this.usageUnique = usageUnique;
	}
	@Override
	public void afficher() {
		System.out.println("ce produit code: "+super.code+" /libelle:"+this.libelle+"/qte stock:"+this.stock+"/prix unitaire:"+this.prix);
		System.out.println("il est de type :"+this.type+ (this.usageUnique?" il est usage unique":" il n'est pas usage unique ") );


	}


}
