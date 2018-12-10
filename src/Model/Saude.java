package Model;

public class Saude {
	private String saudeMental = "boa";
	private String saudeFisica = "boa";
	private String statusGeral = "";
	
	public Saude() {
	}
	
	public void defineSaudeMental(String valor) {
		this.saudeMental = valor;
	}
	
	public void defineSaudeFisica(String valor) {
		this.saudeFisica = valor;
	}
	
	public String statusGeral() {
		if(this.saudeFisica.equals("fraca") && this.saudeMental.equals("fraca")) {
			return this.statusGeral = "fraca";
		}
		else if(this.saudeFisica.equals("boa") && this.saudeMental.equals("boa")) {
			return this.statusGeral = "boa";
		}
		else{
			return this.statusGeral = "ok";
		}
	}

	public String getStatusGeral() {
		return statusGeral();
	}
}
