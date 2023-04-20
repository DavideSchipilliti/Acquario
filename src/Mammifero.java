
public class Mammifero extends Esemplare{
	private int periodoGestazione;	//in giorni
	
	public Mammifero(int periodo, String id) {
		super(id);
		this.periodoGestazione=periodo;
	}

	public int getPeriodoGestazione() {
		return periodoGestazione;
	}

	public void setPeriodoGestazione(int periodoGestazione) {
		this.periodoGestazione = periodoGestazione;
	}

	@Override
	public String toString() {
		return "Mammifero [periodoGestazione=" + periodoGestazione + "]";
	}
}