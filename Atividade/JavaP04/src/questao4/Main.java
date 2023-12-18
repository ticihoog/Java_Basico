package questao4;

public class Main {
    public static void main(String[] args) {
        Garagem garagem = new Garagem(true);
        
        Carro carro = new Carro("Fusca", "Azul", 1980, false);
        Moto moto = new Moto("Harley Davidson", "Prata", 2021, true);
        Caminhao caminhao = new Caminhao("Volvo", "Branco", 2019, true);

        carro.estacionar(garagem);
        moto.estacionar(garagem);
        caminhao.estacionar(garagem);

        System.out.println();

        garagem.removerVeiculo(carro);
        garagem.removerVeiculo(moto);
    }
}
