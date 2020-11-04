
public class Cnpj {
	
	private String valor;
	
	public boolean cnpjValido() {
		return primeiroDigitoVerificador() == primeiroDigitoCorreto() &&
				segundoDigitoVerificador() == segundoDigitoCorreto();
	}
	
	private Object segundoDigitoCorreto() {
		return 2;
	}

	private Object segundoDigitoVerificador() {
		return 2;
	}

	private Object primeiroDigitoCorreto() {
		return 1;
	}

	private Object primeiroDigitoVerificador() {
		return 1;
	}
	
	public String getCnpjCredor() {
		return valor;
	}
	public void setCnpjCredor(String novoValor) {
		this.valor = novoValor;
	}
}
