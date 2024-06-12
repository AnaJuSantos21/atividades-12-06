package curso12_06;
 
import java.util.Scanner;
public class ativ2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int soma = 0;
		
		for(int i = 0; i<=15; i++ ) {
			soma = soma+i;
			
			System.out.println("A soma dos números é: " +soma);
			
		}

	}

}
