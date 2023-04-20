import java.util.List;
import java.util.ArrayList;

public class Vasca {
	private String nome;
	private List<Esemplare> listaEsemplari;

	public Vasca(String nome) {
		this.nome=nome;
		this.listaEsemplari=new ArrayList<>();
	}
	
	public void add(Esemplare esemplare) {
		listaEsemplari.add(esemplare);
	}
	
	public void remove(Esemplare esemplare) {
		listaEsemplari.remove(esemplare);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {	//le vasche sono identificabili dal nome, possibile cambiarlo?
		this.nome = nome;
	}

	public int getNumeroEsemplari() {
		return this.listaEsemplari.size();
	}

	public List<Esemplare> getListaEsemplari() {
		return listaEsemplari;
	}
	
	public void setListaEsemplari(List<Esemplare> listaEsemplari) {
		this.listaEsemplari = listaEsemplari;
	}
	
	@Override
	public String toString() {
		return "Vasca [nome=" + nome + ", numeroEsemplari=" + this.listaEsemplari.size() + "]";
	}

}