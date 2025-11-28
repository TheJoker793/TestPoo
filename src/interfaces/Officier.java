package interfaces;

public class Officier implements Militaire {

	@Override
	public void executerOrdre(String ordre) {
		System.out.println("Executer ordre: "+ordre);
	}

	@Override
	public void porterUniforme() {
		System.out.println("je porte uniforme de armee tunisien");

	}

}
