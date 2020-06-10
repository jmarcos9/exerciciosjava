import java.util.Scanner;

//Swicth
public class Programa06swuitcc {

		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			int numero;
			System.out.println("Digite um Número: ");
			numero = entrada.nextInt();
			
				switch (numero) {
					case 1:
						System.out.println("O número 1 é o número da sorte!");
					break;
					
					case 3:
						System.out.println("O número 3 é o número da sorte!");
					break;
					
					case 5:
						System.out.println("O número 5 é o número da sorte!");
					break;
					
					default:
						System.out.println("O número " + numero + " não é número da sorte :-(");
					break;
			}
		
			
	
		}
}
