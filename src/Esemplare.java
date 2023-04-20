
public abstract class Esemplare {
	private String id;	//id alfanumerico
	
	public Esemplare(String id) {
		this.id=id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}