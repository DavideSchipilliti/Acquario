import java.util.List;
import java.util.ArrayList;

public class Vasca {
	private String nome;
	private List<Esemplare> listaEsemplari;
	private int numeroEsemplari;	//necessario?

	public Vasca(String nome) {
		this.nome=nome;
		this.listaEsemplari=new ArrayList<>();
	}
	
	public void add(Esemplare esemplare) {
		listaEsemplari.add(esemplare);
		this.numeroEsemplari++;
	}
	
	public void remove(Esemplare esemplare) {
		listaEsemplari.remove(esemplare);
		this.numeroEsemplari--;
	}

	@Override
	public String toString() {
		return "Vasca [nome=" + nome + ", listaEsemplari=" + listaEsemplari + ", numeroEsemplari=" + numeroEsemplari
				+ "]";
	}
	

}
