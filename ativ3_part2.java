package curso12_06;

import java.util.Scanner;

public class ativ3_part2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		int i=0;
		
		System.out.println("Informe seu nome: ");
		nome = ler.next();
		
		while (i <= 10) {
	    i++;
			 System.out.println("Seu nome é: " +nome);
		}
        ler.close();
	}

}
