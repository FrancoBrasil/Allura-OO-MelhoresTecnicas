
public class GerenciadorDeDividas {
	
	public void efetuaPagamento(Divida divida, String nome, String cnpjPagador, double valor) {
		Pagamento pagamento = new Pagamento();
		pagamento.setCnpjPagador(cnpjPagador);
		pagamento.setNome(nome);
		pagamento.setValor(valor);
		divida.registro(pagamento);
	}
}
