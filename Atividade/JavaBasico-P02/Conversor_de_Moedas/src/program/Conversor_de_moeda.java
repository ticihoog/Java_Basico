package program;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Conversor_de_moeda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            System.out.println("Escolha a moeda para sua conversão:");
            System.out.println("1. Real (R$)");
            System.out.println("2. Euro (€)");
            System.out.println("0. Encerrar o programa");
            System.out.println("-------------------------------------");

            
            int escolhaMoeda = scanner.nextInt();

            
            if (escolhaMoeda == 0) {
                System.out.println("O programa será encerrado. Obrigada!");
                break;
            } else if (escolhaMoeda == 1) {
                realizarConversao("Real", "R$", scanner);
            } else if (escolhaMoeda == 2) {
                realizarConversao("Euro", "€", scanner);
            } else {
                System.out.println("Escolha inválida. Por favor, escolha uma opção válida.");
            }

            
            System.out.println("----------------------------------------");
            System.out.println("Deseja fazer outra conversão? (S/N): ");
            String continuar = scanner.next().toUpperCase();
            if (!continuar.equals("S")) {
                System.out.println("O programa será encerrado. Obrigada!");
                break;
            }
        }

        
        scanner.close();
    }

    private static void realizarConversao(String nomeMoeda, String codigoMoeda, Scanner scanner) {
        
        System.out.println("Digite a taxa de câmbio ($ para " + codigoMoeda + "): ");
        double taxaCambio = scanner.nextDouble();

        
        System.out.println("Digite a quantidade em dólares: ");
        double quantidadeDolares = scanner.nextDouble();

        
        double valorConvertido = quantidadeDolares * taxaCambio;

        
        DecimalFormat df = new DecimalFormat(codigoMoeda + " #,##0.00 ");
        String resultadoFormatado = df.format(valorConvertido);

        
        System.out.println("O valor convertido para " + nomeMoeda + " é: " + resultadoFormatado);
    }
}
