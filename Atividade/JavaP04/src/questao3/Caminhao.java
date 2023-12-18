package questao3;

class Caminhao extends Veiculo {
	public Caminhao(String modelo, String cor, int ano) {
		super(modelo, cor, ano);
	}

	@Override
	public void ligar() {
		System.out.println("Caminhão ligado");
	}

	public void carga() {
		System.out.println("Caminhão carregando");
	}
}
