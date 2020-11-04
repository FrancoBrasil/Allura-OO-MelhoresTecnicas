import java.util.Calendar;

public class Pagamento {
	
	private String nome;
	private String cnpjPagador;
	private double valor;
	private Calendar data;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpjPagador() {
		return cnpjPagador;
	}
	public void setCnpjPagador(String cnpjPagador) {
		this.cnpjPagador = cnpjPagador;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Calendar getData() {
		return data;
	}
}
