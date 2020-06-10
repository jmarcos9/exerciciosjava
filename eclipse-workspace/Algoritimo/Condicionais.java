import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Informe sua Idade: ");
		idade = entrada.nextInt();
		
		if (idade <= 16) {
			System.out.println("Você não pode votar");
			
		}else if (idade > 18) {
			System.out.println("Voto opcional");
		
		}else if (idade > 65) {
			System.out.println("Voto Opcional");
			
		}else {
			System.out.println("Voto obrigatorio");
		}
		
	}
}
