package abstraction;

public class Main {

	public static void main(String[] args) {
		Star[] stars=new Star[4];
		stars[0]=new Footballeur("Cristiano ronaldo","Portugal",40,"Real Madrid",25,1000,5,"AC",5);
		stars[1]=new BasketBalleur("Michael Jordan","USA",60,"Chikago bulls",20,50,20,6,12);
		stars[2]=new Chanteur("Michael Jackson","USA",60,"Pop",100,13,400);
		stars[3]=new Acteur("Tom Cruise","USA",62, "cinema",10,3,"Mission Impossible");
		for(Star star:stars) {
			star.presenterMetier();
			star.afficherPalmares();
		}

	}

}
