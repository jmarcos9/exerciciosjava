import java.util.Scanner;

public class programa09forr {

	public static void main(String[] args) {
		
		int idade;
		String nome;
		
		Scanner entrada = new Scanner(System.in);
		    // var de controle ; condição de parada ; forma de encremento
		for (int i = 0; i < 2; i++) {
			System.out.println("Digite seu nome: ");
			nome = entrada.nextLine();
			System.out.println("Digite sua idade: ");
			idade = Integer.parseInt(entrada.nextLine());
		
			System.out.println(nome + " tem " + idade);
		
		}
	}

}
