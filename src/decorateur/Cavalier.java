package decorateur;

public class Cavalier implements SoldatInterface{
	private final int NB_VIE = 100;
	private int vie;
	public Cavalier() {
		vie = NB_VIE;
	}

	public int assener() {
		
		return 10;
	}

	public void parer(int coup) {
		vie = (vie > 0) ? vie - (coup / 2) : 0;
	}

}
