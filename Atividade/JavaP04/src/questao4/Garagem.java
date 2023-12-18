package questao4;

import java.util.ArrayList;
import java.util.List;

class Garagem {
	private List<Veiculo> veiculos;
	private boolean tomadaEletrica;

	public Garagem(boolean tomadaEletrica) {
		if (tomadaEletrica) {
			this.veiculos = new ArrayList<>();
		} else {
			throw new IllegalArgumentException("A garagem elétrica deve ter uma lista de veículos inicializada.");
		}
		this.tomadaEletrica = tomadaEletrica;
	}

	public void estacionarVeiculo(Veiculo veiculo) {
		if (veiculo == null) {
			throw new NullPointerException("Veículo não pode ser nulo.");
		}

		veiculos.add(veiculo);
		System.out.println(veiculo.getClass().getSimpleName() + " estacionado(a)");

		if (tomadaEletrica && veiculo.isEletrico()) {
			System.out.println(veiculo.getClass().getSimpleName() + " carregando");
		}
	}

	public void removerVeiculo(Veiculo veiculo) {
		if (veiculos == null) {
			throw new UnsupportedOperationException("A lista de veículos não foi inicializada.");
		}

		veiculos.remove(veiculo);
		System.out.println(veiculo.getClass().getSimpleName() + " removido(a) da garagem");
	}
}
