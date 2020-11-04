public class Divida {

	private double totalDivida;

	private String nomeCredor;
	private Cnpj cnpjCredor = new Cnpj();
	private Pagamentos pagamentos = new Pagamentos();

	public Cnpj getCnpjCredor() {
		return cnpjCredor;
	}
	
	public void setCnpjCredor(Cnpj cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
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

	public void registro(Pagamento pagamento) {
		pagamentos.registro(pagamento);
		
	}

	public double getValorPago() {
		return pagamentos.getValorPago();
	}

}
