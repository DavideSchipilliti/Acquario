
public class Acquario {
	private Vasca vasca1;
	private Vasca vasca2;
	
	public Acquario(String nomeVasca1, String nomeVasca2) {
		this.vasca1=new Vasca(nomeVasca1);
		this.vasca2=new Vasca(nomeVasca2);
	}

	public Vasca getVasca1() {
		return vasca1;
	}

	public Vasca getVasca2() {
		return vasca2;
	}

	@Override
	public String toString() {
		return "Acquario\nVasca 1=" + vasca1 + "\nVasca 2=" + vasca2;
	}

	public void setVasca1(Vasca vasca1) {
		this.vasca1 = vasca1;
	}

	public void setVasca2(Vasca vasca2) {
		this.vasca2 = vasca2;
	}

}
