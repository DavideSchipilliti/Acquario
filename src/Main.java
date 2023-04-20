
public class Main {
	public static void main(String[] args) {
		Acquario acquario=new Acquario();
		Vasca vasca1=new Vasca("vasca1");
		Vasca vasca2=new Vasca("vasca2");
		
		acquario.addVasca(vasca1);
		acquario.addVasca(vasca2);
		
		Esemplare pesce=new Pesce(100, "AA100");
		Esemplare mammifero=new Mammifero(30, "BB100");
		
		vasca1.add(pesce);
		vasca1.add(mammifero);
		
		System.out.println(vasca1);
		System.out.println(vasca1.getListaEsemplari());	//stampo gli esemplari presenti nella vasca
		
		System.out.println();
		
		vasca1.remove(mammifero);
		
		System.out.println(vasca1);
		System.out.println(vasca1.getListaEsemplari());
		
		System.out.println();
		
		System.out.println(vasca2);
		System.out.println(vasca2.getListaEsemplari());
		
		System.out.println();
		
		System.out.println(acquario);
	}
}