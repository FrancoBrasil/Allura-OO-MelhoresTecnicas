public class Divida {

	private double totalDivida;

	private String nomeCredor;
	private Cnpj cnpjCredor = new Cnpj();
	private Pagamentos pagamentos = new Pagamentos();

	public Cnpj getCnpjCredor() {
		return cnpjCredor;
	}

	public Pagamentos getPagamentos() {
		return pagamentos;
	}

	public double getTotalDivida() {
		return totalDivida;
	}

	public void setTotalDivida(double totalDivida) {
		this.totalDivida = totalDivida;
	}

	public String getNomeCredor() {
		return nomeCredor;
	}

	public void setNomeCredor(String nomeCredor) {
		this.nomeCredor = nomeCredor;
	}

}
