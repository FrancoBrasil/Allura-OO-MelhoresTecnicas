import java.util.HashMap;

public class BalancoEmpresa {
	private HashMap<String, Divida> dividas = new HashMap<>();

	public void registraDivida(String nomeCredor, String cnpjCredor, double valorDivida) {
		Divida divida = new Divida();
		divida.setNomeCredor(nomeCredor);
		divida.setCnpjCredor(cnpjCredor);
		divida.setTotalDivida(valorDivida);

		dividas.put(cnpjCredor, divida);
	}

	public void pagaDivida(String cnpjCredor, double valorDivida, String nome, String cnpjPagador) {
		Divida divida = dividas.get(cnpjCredor);
		if (divida != null) {
			Pagamento pagamento = new Pagamento();
			pagamento.setCnpjPagador(cnpjPagador);
			pagamento.setNome(nome);
			pagamento.setValor(valorDivida);
			divida.registro(pagamento);
		}
	}
}
