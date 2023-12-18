package questao4;

class Moto extends Veiculo {
    public Moto(String modelo, String cor, int ano, boolean eletrico) {
        super(modelo, cor, ano, eletrico);
    }

    @Override
    public void ligar() {
        System.out.println("Moto ligada");
    }

    public void usarCavalete() {
        System.out.println("Cavalete da moto em uso");
    }
}