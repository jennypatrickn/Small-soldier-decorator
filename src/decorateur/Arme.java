package decorateur;

public class Arme implements SoldatInterface {
	protected SoldatInterface s;

	public Arme(SoldatInterface s) {
		this.s = s;
	}

	public int assener() {
		return s.assener();
	}

	public void parer(int coup) {
		s.parer(coup);

	}
}
