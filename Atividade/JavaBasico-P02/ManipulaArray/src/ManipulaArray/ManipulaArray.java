package ManipulaArray;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class ManipulaArray {

    public static int[] lerArrayDoUsuario() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Digite o tamanho da array: ");
			int tamanho = scanner.nextInt();

			int[] array = new int[tamanho];

			System.out.println("Digite os elementos da array:");

			for (int i = 0; i < tamanho; i++) {
			    System.out.println("Elemento " + (i + 1) + ": ");
			    array[i] = scanner.nextInt();
			}

			return array;
		}
    }

    public static int[] criarArrayAleatorio(int tamanho) {
        Random random = new Random();
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(100); 
        }

        return array;
    }

    public static int calcularSoma(int[] array) {
        int soma = 0;

        for (int numero : array) {
            soma += numero;
        }

        return soma;
    }

    public static int encontrarMaiorValor(int[] array) {
        int maior = array[0];

        for (int numero : array) {
            if (numero > maior) {
                maior = numero;
            }
        }

        return maior;
    }

    public static int encontrarMenorValor(int[] array) {
        int menor = array[0];

        for (int numero : array) {
            if (numero < menor) {
                menor = numero;
            }
        }

        return menor;
    }

    public static void main(String[] args) {
        int[] arrayUsuario = lerArrayDoUsuario();
        int[] arrayAleatorio = criarArrayAleatorio(5); 

        System.out.println("Array lida d@ usuári@: " + Arrays.toString(arrayUsuario));
        System.out.println("Array aleatória: " + Arrays.toString(arrayAleatorio));

        System.out.println("Soma do array lida d@ usuári@: " + calcularSoma(arrayUsuario));
        System.out.println("Maior valor da array lido d@ usuári@: " + encontrarMaiorValor(arrayUsuario));
        System.out.println("Menor valor da array lida d@ usuári@: " + encontrarMenorValor(arrayUsuario));
    }
}
