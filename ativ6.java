package curso12_06;

import java.util.Scanner;

public class ativ6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade, media=0, soma=0, i=1;
		
		for ( i = 1; i <=20; i++) {
			System.out.print("informe sua idade :");
			idade = ler.nextInt();
		    soma += idade;
		    media =(soma)/20;
		    System.out.println("A soma é "+ soma);
		}
		
		System.out.println("| A média das idades é "+ media + " |");
		}

	}


