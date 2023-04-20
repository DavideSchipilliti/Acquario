import java.util.List;
import java.util.ArrayList;

public class Acquario {
	private List<Vasca> listaVasche;
	
	public Acquario() {
		this.listaVasche=new ArrayList<>();
	}

	public List<Vasca> getListaVasche() {
		return this.listaVasche;
	}

	public void setListaVasche(List<Vasca> lista) {
		this.listaVasche = lista;
	}

	public void addVasca(Vasca vasca) {
		this.listaVasche.add(vasca);
	}
	
	public void removeVasca(Vasca vasca) {
		this.listaVasche.remove(vasca);
	}

	@Override
	public String toString() {
		return "Acquario [listaVasche=" + listaVasche + "]";
	}


}