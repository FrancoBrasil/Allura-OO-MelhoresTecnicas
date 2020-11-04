import java.text.NumberFormat;
import java.util.Locale;

public class RelatorioDeDivida {
	
	private final Divida divida;
	
	public RelatorioDeDivida(Divida divida) {
		this.divida = divida;
	}
	
	public void geraRelatorio(NumberFormat formatador) {
		System.out.println("Cnpj credor: " + divida.getCnpjCredor());
		System.out.println("Credor: " + divida.getNomeCredor());
		System.out.println("Valor da divida: " + formatador.format(divida.getTotalDivida()));
		System.out.println("Valor pago: " + formatador.format(divida.getValorPago()));
	}
	
	public static void main(String[] args) {
		Divida divida = new Divida();
		divida.setNomeCredor("UNIODONTO");
		divida.setTotalDivida(500);
		divida.getCnpjCredor().setCnpjCredor("00.000.001/0001-01");	
		
		Pagamento pgto = new Pagamento();
		pgto.setCnpjPagador("00.000.002/0002-02");
		pgto.setNome("SOUZA CRUZ");
		pgto.setValor(100);
		divida.registro(pgto);
		
		RelatorioDeDivida relatorio = new RelatorioDeDivida(divida);
		NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt","BR"));
		relatorio.geraRelatorio(formatador);
		}
}
