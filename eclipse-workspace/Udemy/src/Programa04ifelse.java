import java.util.Scanner;

public class Programa04ifelse {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num;
		System.out.println("Digite um número :");
		num = entrada.nextInt();
		
		if (num > 5) {
			System.out.println("Número " + num + " maior que 5 \n");
		}else if (num == 5) {
			System.out.println("Numero " + num + " é igual a 5 \n");
		
		}else if (num % 2 == 0) {
			System.out.println("Número " + num + " é par");
		
		}else {
			System.out.println("Número " + num + " menor que 5 \n");
				}
	}

}
