package heritage;

public class ProduitMedical {
	protected String code;
	protected String libelle;
	protected int stock;
	protected double prix;
	public ProduitMedical(String code, String libelle, int stock, double prix) {
		this.setCode(code);
		this.setLibelle(libelle);
		this.setStock(stock);
		this.setPrix(prix);
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void afficher() {
		System.out.println("ce produit code: "+this.code+" /libelle:"+this.libelle+"/qte stock:"+this.stock+"/prix unitaire:"+this.prix);
	}
	
	

}
