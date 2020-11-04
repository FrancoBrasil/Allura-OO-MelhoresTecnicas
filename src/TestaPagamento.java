public class TestaPagamento {

	public static void main(String[] args) {

		Pagamentos pagamentos = new Pagamentos();
		Pagamento p1 = new Pagamento();
		Pagamento p2 = new Pagamento();
		p1.setNome("Uniodonto");
		p1.setValor(105);
		p2.setNome("Souza Cruz S/A");
		p2.setValor(1005.45);

		pagamentos.registro(p1);
		pagamentos.registro(p2);

		System.out.println(pagamentos.getValorPago());

	}

}
