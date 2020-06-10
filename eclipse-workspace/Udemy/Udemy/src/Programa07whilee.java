import java.util.Scanner;

public class Programa07whilee {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1, num2, soma, operador = 1;
		
		while (operador > 0) {
		
			System.out.println("Digite um número: ");
			num1 = entrada.nextInt();
			System.out.println("Digie outro número: ");
			num2 = entrada.nextInt();
			System.out.println("Digite o Operador(1 = +, 2 = -, 3 = *, 4 = / e para sair digite 0): " );
			operador = entrada.nextInt();
			
				switch (operador) {
					case 1:
						System.out.println(num1 + num2);
					break;
					case 2:
						System.out.println(num1 - num2);
					break;
					case 3:
						System.out.println(num1 * num2);
					break;
					case 4:
						System.out.println(num1 / num2);
	
					default:
						System.out.println("Caluladora desligada");
						
					break;
				}
			/*soma = (num1 + num2);
			System.out.println(soma);*/
		}
	}

}
