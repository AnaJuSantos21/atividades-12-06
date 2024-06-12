package curso12_06;

import java.util.Scanner;

public class ativ4_part2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double numero, i=1;
		int soma=0;
		
		while (i <= 10) {
		i++;
		System.out.print("informe o numero :");
		numero = ler.nextDouble();
		soma += numero;
		
		System.out.println("A soma é "+ soma);
		}
		
		System.out.println("| A soma dos numeros é "+ soma + " |");
		}
		
		

	}


