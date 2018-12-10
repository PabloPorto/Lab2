package Model;

public class ContaLaboratorio {
	private String nome;
	private int cota = 2000;
	private int cotaConsumida;
	
	public ContaLaboratorio(String nome, int cota) {
		super();
		this.nome = nome;
		this.cota = cota;
	}

	public ContaLaboratorio(String nome) {
		super();
		this.nome = nome;
	}
	
	public void consomeEspaco(int mbytes) {
		this.cotaConsumida += mbytes;
	}
	
	public void liberaEspaco(int mbytes) {
		this.cotaConsumida -= mbytes;
	}
	
	public boolean atingiuCota() {
		if ((this.cota - this.cotaConsumida > 0)) {
			return false;
		}
		return true;
	}
	
	public String toString() {
		return this.nome + " " + this.cotaConsumida + "/" + this.cota;
	}
	
	
	

}
