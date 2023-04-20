
public class Acquario {
	private Vasca vasca1;
	private Vasca vasca2;
	
	public Acquario(String vasca1, String vasca2) {
		this.vasca1=new Vasca(vasca1);
		this.vasca2=new Vasca(vasca2);
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

}
