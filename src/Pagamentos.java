import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;

public class Pagamentos implements Iterable<Pagamento> {

	private double valorPago;
	private HashSet<Pagamento> pagamentos = new HashSet<>();

	public ArrayList<Pagamento> pagamentosAntesDe(Calendar data) {
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<>();
		for (Pagamento pagamento : this.pagamentos) {
			if (pagamento.getData().before(data))
				;
			{
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public ArrayList<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<>();
		for (Pagamento pagamento : this.pagamentos) {
			if (pagamento.getValor() > valorMinimo) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public ArrayList<Pagamento> pagamentosDo(String cnpjPagador) {
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<>();
		for (Pagamento pagamento : this.pagamentos) {
			if (pagamento.getCnpjPagador().equals(cnpjPagador)) {
				pagamentosFiltrados.add(pagamento);
			}
		}

		return pagamentosFiltrados;
	}

	public double getValorPago() {
		return valorPago;
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
		pagamentos.add(pagamento);
		this.paga(pagamento.getValor());
	}

	public boolean foiRealizado(Pagamento pagamento) {
		return pagamentos.contains(pagamento);
	}

	@Override
	public Iterator<Pagamento> iterator() {
		return null;
	}
}
