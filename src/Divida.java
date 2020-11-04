import java.util.ArrayList;

public class Divida {
	
	private double totalDivida;
	private double valorPago;
	private String nomeCredor;
	private String cnpjCredor;
	
	private ArrayList<Pagamento> pagamentos = new ArrayList<>();
	
	public ArrayList<Pagamento> getPagamentos() {
		return pagamentos;
	}
	
	public double getTotalDivida() {
		return totalDivida;
	}
	public void setTotalDivida(double totalDivida) {
		this.totalDivida = totalDivida;
	}
	public double getValorPago() {
		return valorPago;
	}
	
	public String getNomeCredor() {
		return nomeCredor;
	}
	public void setNomeCredor(String nomeCredor) {
		this.nomeCredor = nomeCredor;
	}
	public String getCnpjCredor() {
		return cnpjCredor;
	}
	public void setCnpjCredor(String cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}	
	
	private void paga(double valor) {
		
		if (valor < 0) {
			throw new IllegalArgumentException("Valor inválido para pagamento");
		}
		if (valor > 100) {
			valor = valor - 8;
		}
		this.valorPago += valor;
	}
	
	public void registro(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
		this.paga(pagamento.getValor());
	}
}
