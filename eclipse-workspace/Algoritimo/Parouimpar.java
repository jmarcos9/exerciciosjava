import java.util.Scanner;

public class Parouimpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int parImpar;
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			
			System.out.println("O número "+ numero + " é PAR.");
			
		}else {
			System.out.println("O número " + numero + " é IMPAR.");
		}

	}

}
