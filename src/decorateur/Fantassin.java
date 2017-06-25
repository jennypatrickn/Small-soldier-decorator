package decorateur;

public class Fantassin implements SoldatInterface {
	private final int NB_VIE = 100;
	private int vie;

	public Fantassin() {
		vie = NB_VIE;
	}

	public int assener() {
		return 5;
	}

	public void parer(int coup) {
		vie = (vie > 0) ? vie - coup : 0;
	}

}
