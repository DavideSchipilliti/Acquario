
public class Main {
	public static void main(String[] args) {
		Acquario acquario=new Acquario("vasca1", "vasca2");
		Esemplare pesce1=new Pesce(100, "AA100");
		Esemplare mammifero1=new Mammifero(30, "BB100");
		
		acquario.getVasca1().add(pesce1);
		acquario.getVasca1().add(mammifero1);
		
		System.out.println(acquario.getVasca1().toString());
		
		acquario.getVasca1().remove(mammifero1);
		
		System.out.println(acquario.getVasca1().toString());
	}
}
