package questao4;

class Carro extends Veiculo {
    public Carro(String modelo, String cor, int ano, boolean eletrico) {
        super(modelo, cor, ano, eletrico);
    }

    @Override
    public void ligar() {
        System.out.println("Carro ligado");
    }

    public void abrirCapota() {
        System.out.println("Capota do carro aberta");
    }
}
