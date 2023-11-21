package verbo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String radical;
		String sufixo;
		String palavra;
		
		System.out.println("Digite um verbo:");
		
		Scanner ler = new Scanner(System.in);
		
		palavra = ler.nextLine ();
		
		radical = palavra.substring(0,palavra.length()-2);
		sufixo = palavra.substring(palavra.length()-2);
		
		ler.close();
		
		Verbos verbo = new Verbos(radical, sufixo);
		verbo.conjugar();
		
	}

}
