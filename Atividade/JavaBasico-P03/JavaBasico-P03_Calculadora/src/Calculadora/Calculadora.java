package Calculadora;
import java.util.Scanner;

// Exceção personalizada para divisão por zero
class DivisionByZeroException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DivisionByZeroException(String message) {
        super(message);
    }
}

public class Calculadora {

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int subtracao(int a, int b) {
        return a - b;
    }

    public static int multiplicacao(int a, int b) {
        return a * b;
    }

    public static int divisaoInteira(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    public static float divisaoFloat(float a, float b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                System.out.print("Digite o primeiro número: ");
                int num1 = scanner.nextInt();

                System.out.print("Digite o segundo número: ");
                int num2 = scanner.nextInt();

                System.out.println("Escolha a operação:");
                System.out.println("1. Soma");
                System.out.println("2. Subtração");
                System.out.println("3. Multiplicação");
                System.out.println("4. Divisão");

                int escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.println("Resultado: " + soma(num1, num2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + subtracao(num1, num2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + multiplicacao(num1, num2));
                        break;
                    case 4:
                        try {
                            System.out.println("Resultado: " + divisaoInteira(num1, num2));
                        } catch (DivisionByZeroException e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                        break;
                    default:
                        System.out.println("Escolha inválida.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Erro: Digite números inteiros válidos.");
                scanner.next(); // Limpar o buffer do scanner
            }

            System.out.print("Deseja continuar? (S/N): ");
        } while (scanner.next().equalsIgnoreCase("S"));

        System.out.println("O Programa será encerrado. Obrigada!");
        scanner.close();
    }
}
