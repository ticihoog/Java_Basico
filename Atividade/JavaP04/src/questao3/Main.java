package questao3;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Fusca", "Azul", 1980);
        Moto moto = new Moto("Harley Davidson", "Prata", 2021);
        Caminhao caminhao = new Caminhao("Volvo", "Branco", 2019);

        carro.ligar();
        carro.acelerar();
        carro.abrirCapota();
        carro.parar();

        System.out.println();

        moto.ligar();
        moto.acelerar();
        moto.usarCavalete();
        moto.parar();

        System.out.println();

        caminhao.ligar();
        caminhao.acelerar();
        caminhao.carga();
        caminhao.parar();
    }
}