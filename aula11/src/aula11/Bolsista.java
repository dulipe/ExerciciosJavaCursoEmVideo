package aula11;

public class Bolsista extends Aluno {
	private int bolsa;

	public double getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
	
	public void renovarBolsa() {
		System.out.println("Renovaldo bolsa de " + this.getNome());
	}
	
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " é bolsista");
	}
	
}
