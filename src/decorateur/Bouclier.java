package decorateur;



public class Bouclier extends Arme {

	
	public Bouclier(SoldatInterface s) {
		super(s);
	}

	public void parer(int coup) {
		s.parer(coup / 2);
	}
}
