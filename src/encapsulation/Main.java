package encapsulation;

public class Main {

	public static void main(String[] args) {
		Personne p=new Personne("Salah","Channoufi");
		System.out.println("Hello im "+p.getPrenom()+" "+p.getNom());
		p.setNom("Ali");
		System.out.println("Hello im "+p.getPrenom()+" "+p.getNom());


	}

}
