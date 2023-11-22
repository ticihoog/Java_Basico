package programs;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int option;
		int option2;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.printf("%n1 - Calculadora%n2 - Convers�o%n3 - Sair%n");
			System.out.print("Escolha uma op��o: ");

			option = scanner.nextInt();

			switch (option) {
			case 1: {
				do {
					float result;
					System.out.printf("%n1 - Soma%n2 - Subtra��o%n3 - Divis�o%n4 - Multiplica��o%n5 - Sair%n");
					System.out.print("Escolha uma op��o: ");

					option2 = scanner.nextInt();

					switch (option2) {
					case 1:
						System.out.print("Digite o primeiro valor: ");
						float value1 = scanner.nextFloat();
						System.out.print("Digite o segundo valor: ");
						float value2 = scanner.nextFloat();
						Calculadora newSum = new Calculadora(value1, value2);
						result = newSum.sum();
						System.out.printf("Resultado: %.2f%n%n", result);
						break;
					case 2:
						System.out.print("Digite o primeiro valor: ");
						value1 = scanner.nextFloat();
						System.out.print("Digite o segundo valor: ");
						value2 = scanner.nextFloat();
						Calculadora newSub = new Calculadora(value1, value2);
						result = newSub.sub();
						System.out.printf("Resultado: %.2f%n%n", result);
						break;
					case 3:
						System.out.print("Digite o primeiro valor: ");
						value1 = scanner.nextFloat();
						System.out.print("Digite o segundo valor: ");
						value2 = scanner.nextFloat();
						if (value2 == 0) {
							System.out.println("Erro: divis�o por zero%n");
						} else {
							Calculadora newDiv = new Calculadora(value1, value2);
							result = newDiv.div();
							System.out.printf("Resultado: %.2f%n%n", result);
						}
						break;
					case 4:
						System.out.print("Digite o primeiro valor: ");
						value1 = scanner.nextFloat();
						System.out.print("Digite o segundo valor: ");
						value2 = scanner.nextFloat();
						Calculadora newMult = new Calculadora(value1, value2);
						result = newMult.mult();
						System.out.printf("Resultado: %.2f%n%n", result);
						break;
					case 5:
						System.out.println("Saindo...");
						break;
					default:
						System.out.println("Op��o inv�lida%n");
						break;
					}

				} while (option2 != 5);

			}
				break;

			case 2:
				float temperature;
				char med;
				
				System.out.print("Digite a temperatura: ");
				temperature = scanner.nextFloat();

				System.out.print("Digite a medida (F ou C): ");
				med = scanner.next().charAt(0);
				
				CelToFar convert = new CelToFar(temperature, med);
				
				if(med == 'F') {
					System.out.println(temperature + "�C = " + convert.convertTemperature() + "�F");
				}else {
					System.out.println(temperature + "�F = " + convert.convertTemperature() + "�C");
				}
				
				break;
			case 3:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Op��o Inv�lida!!!");
				break;
			}

		} while (option != 3);
		scanner.close();
	}
}