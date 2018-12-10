package Model;

public class ContaCantina {
	private String nomeDaCantina;
	private int qtdItens;
	private int valorTotal;
	private int faltaPagar;

	public ContaCantina(String nomeDaCantina) {
		this.nomeDaCantina = nomeDaCantina;
	}
	
	public void cadastraLanche(int qtdItens, int valorCentavos){
		this.qtdItens += qtdItens;
		this.valorTotal += valorCentavos;
	}
	
	public void pagaConta(int valorCentavos) {
		this.faltaPagar = valorTotal - valorCentavos;
	}

	public int getFaltaPagar() {
		return faltaPagar;
	}
	
	public String toString() {
		return this.nomeDaCantina + " " +
				this.qtdItens + " " +
				this.valorTotal;
	}
	
}
