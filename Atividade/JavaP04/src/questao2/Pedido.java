package questao2;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	int numeroPedido;
	String cpfCliente;
	List<ItemPedido> itens = new ArrayList<>();

	public Pedido(int numeroPedido, String cpfCliente) {
		if (cpfCliente == null || cpfCliente.isEmpty()) {
			throw new IllegalArgumentException("CPF do cliente não pode ser nulo ou vazio.");
		}

		this.numeroPedido = numeroPedido;
		this.cpfCliente = cpfCliente;
	}

	public void adicionarItem(String produto, double preco, int quantidade) {
		if (produto == null || produto.isEmpty() || preco <= 0 || quantidade <= 0) {
			throw new IllegalArgumentException("Parâmetros inválidos para adicionarItem.");
		}

		ItemPedido item = new ItemPedido(produto, preco, quantidade);
		itens.add(item);
	}

	public void adicionarItem(List<ItemPedido> novosItens) {
		if (novosItens == null) {
			throw new IllegalArgumentException("A lista de novos itens não pode ser nula.");
		}

		itens.addAll(novosItens);
	}

	public double calcularTotal(double percentualDesconto) {
		if (percentualDesconto < 0) {
			throw new IllegalArgumentException("Percentual de desconto não pode ser negativo.");
		}

		double total = 0;
		for (ItemPedido item : itens) {
			total += item.preco * item.quantidade;
		}
		return total - (total * percentualDesconto / 100);
	}

	public double calcularTotal(int numeroPrestacoes, double juros) {
		if (numeroPrestacoes <= 0 || juros < 0) {
			throw new IllegalArgumentException("Número de prestações e juros devem ser não negativos.");
		}

		double total = 0;
		for (ItemPedido item : itens) {
			total += item.preco * item.quantidade;
		}
		return total + (total * juros / 100);
	}

	public void exibirInformacoes() {
		System.out.println("Número do Pedido: " + numeroPedido);
		System.out.println("CPF do Cliente: " + cpfCliente);
		System.out.println("Itens do Pedido:");
		for (ItemPedido item : itens) {
			System.out.println(
					"Produto: " + item.produto + ", Preço: " + item.preco + ", Quantidade: " + item.quantidade);
		}
	}

	public static void main(String[] args) {
		Pedido pedido1 = new Pedido(1, "123.456.789-01");

		pedido1.adicionarItem("Produto A", 50.0, 2);
		pedido1.adicionarItem("Produto B", 30.0, 1);

		pedido1.exibirInformacoes();

		double totalDesconto = pedido1.calcularTotal(10);
		System.out.println("Total com desconto à vista: " + totalDesconto);

		double totalPrazo = pedido1.calcularTotal(3, 5);
		System.out.println("Total a prazo: " + totalPrazo);
	}
}