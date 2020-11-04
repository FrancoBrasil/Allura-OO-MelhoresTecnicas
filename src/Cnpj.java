
public class Cnpj {

	private String valor;

	public boolean cnpjValido() {
		return primeiroDigitoVerificador() == primeiroDigitoCorreto()
				&& segundoDigitoVerificador() == segundoDigitoCorreto();
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

	public String getValor() {
		return valor;
	}

	public void setCnpjCredor(String novoValor) {
		this.valor = novoValor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cnpj other = (Cnpj) obj;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}

}
