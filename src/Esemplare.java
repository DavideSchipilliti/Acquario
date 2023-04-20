
public abstract class Esemplare {
	private String id;	//id alfanumerico
	
	public Esemplare(String id) {
		this.id=id;
	}

	public String getId() {
		return id;
	}
	
	@Override
	public abstract String toString();	//voglio che ogni esemplare implementa il metodo toString
}