
public class Pesce extends Esemplare{
	private int profondità;	//in metri
	
	public Pesce(int profondità, String id) {
		super(id);
		this.profondità=profondità;
	}
	
	public int getProfondità() {
		return profondità;
	}
	
	@Override
	public String toString() {
		return "Pesce [ID=" + getId() + " profondità=" + profondità + "]";
	}

	public void setProfondità(int profondità) {
		this.profondità = profondità;
	}

}
