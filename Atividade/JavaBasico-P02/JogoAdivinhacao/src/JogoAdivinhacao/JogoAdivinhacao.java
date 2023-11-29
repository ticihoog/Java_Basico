package JogoAdivinhacao;
import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        do {
            int numeroAleatorio = random.nextInt(100) + 1;
            int tentativas = 0;
            int palpite;

            System.out.println("Bem-vinde ao Jogo de Adivinhação! Tente adivinhar o número entre 1 e 100.");

            do {
                System.out.print("Digite seu palpite: ");
                palpite = scanner.nextInt();
                tentativas++;

                if (palpite > numeroAleatorio) {
                    System.out.println("Muito alto. Tente novamente.");
                } else if (palpite < numeroAleatorio) {
                    System.out.println("Muito baixo. Tente novamente.");
                } else {
                    System.out.println("PARABÉNS! Você acertou em " + tentativas + " tentativas!");
                }
            } while (palpite != numeroAleatorio);

            System.out.print("Deseja jogar novamente? (S/N): ");
        } while (scanner.next().equalsIgnoreCase("S"));

        System.out.println("Obrigade por jogar! Até mais!");
        scanner.close();
    }
}
