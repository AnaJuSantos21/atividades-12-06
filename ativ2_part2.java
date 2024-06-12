package curso12_06;

import java.util.Scanner;

public class ativ2_part2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i=0, soma=0;
		
		while (i < 15 ) {
		i++;
		soma=soma + i;
		
		System.out.println("A soma é: " + soma);
		
		}
		ler.close();
	}
		
}


	


