package decorateur;

public class Epee extends Arme {

	public Epee(SoldatInterface s) {
		super(s);
	}

	public void parer(int coup) {
		s.parer(coup);
	}

	public int assener() {
		return 2 * (s.assener());
	}
}
