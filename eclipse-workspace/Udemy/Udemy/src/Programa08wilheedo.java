import java.util.Scanner;

public class Programa08wilheedo {

	public static void main(String[] args) {
		int idade = 1;
		String nome;
		
		Scanner entrada = new Scanner (System.in);
		
		do {			
			System.out.println("Digite seu nome: ");
			nome = entrada.nextLine();
			System.out.println("Digite sua idade: ");
			idade = Integer.parseInt(entrada.nextLine());
			
			if (idade > 0)// serve para não imprimir a ultima linha				
			System.out.println(nome + " tem " + idade + "\n");
			
		}while (idade > 0);
		

	}

}
