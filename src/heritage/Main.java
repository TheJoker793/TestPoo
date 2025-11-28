package heritage;

public class Main {

	public static void main(String[] args) {
		ProduitMedical[] produits=new ProduitMedical[4];
		produits[0]=new Medicament("PCT","Paracytamol",50,5.2,"comprimé",20,false);
		produits[1]=new Dispositif("BVT","Bavette",300,0.7,"bavette",false);
		produits[2]=new Medicament("AMX","Amoxyl",30,7.8,"cirop",30,true);
		produits[3]=new Dispositif("TM","TensionMetre",400,2.5,"tension",true);
		for(ProduitMedical p:produits) {
			p.afficher();
		}


		

	}

}
