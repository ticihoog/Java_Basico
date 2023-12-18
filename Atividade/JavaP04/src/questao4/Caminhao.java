package questao4;

class Caminhao extends Veiculo {
    public Caminhao(String modelo, String cor, int ano, boolean eletrico) {
        super(modelo, cor, ano, eletrico);
    }

    @Override
    public void ligar() {
        System.out.println("Caminhão ligado");
    }

    public void carga() {
        System.out.println("Caminhão carregando");
    }
}
