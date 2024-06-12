package curso12_06;

import java.util.Scanner;

public class ativ6_part2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade, soma=0, media=1, i=1;
       
		
		while (i <= 20) {
		i++;
		System.out.print("informe a idade :");
		idade = ler.nextInt();
		soma += idade;
		media = (soma)/4;
		
		System.out.println("A soma é "+ soma);
		}
		
		System.out.println("| A media das idades é "+ media + " |");
		}
		

	}


