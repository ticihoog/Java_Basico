package hello;

import java.util.Scanner;

public class Helloworld {
		public static void main (String[] args) {
			int idade = 32;
			String nome = "Daniel Coutinho Neto";
			
			System.out.println("Meu nome é " + nome + " e tenho " + 32 + " anos de idade");
			Scanner ler = new Scanner(System.in);
			String string = ler.nextLine();
			System.out.println(string + " foi o dado digitado");
			
		}
}


 