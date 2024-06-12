package curso12_06;

import java.util.Scanner;

public class ativ5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade, soma=0, i=1;
		
		for ( i = 1; i <=20; i++) {
			System.out.print("informe sua idade :");
			idade = ler.nextInt();
		    soma += idade;
		System.out.println("A soma é "+ soma);
		}
		
		System.out.println("| A soma das idades é "+ soma + " |");
		}

	

	}


