import java.util.Scanner;

public class Trocarnumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int primeiroNumero;
		int segundoNumero;
		int modificador;
		
		
		System.out.println("Digite um número: ");
		primeiroNumero = sc.nextInt();
		System.out.println("Digite outro número");
		segundoNumero = sc.nextInt();
		
		if (primeiroNumero > segundoNumero) {
			modificador = primeiroNumero;
			primeiroNumero = segundoNumero;
			//segundoNumero = modificador
			
			//segundoNumero = modificador;
			
			System.out.println("Variável: primeiroNumero, agora tem o menor valor: (" + primeiroNumero + ") e a variável: segundoNumero, tem o valor maior: (" + modificador +").") ;
		} else {
			
			System.out.println("O Primeiro número (" + primeiroNumero + ") não é maior que o Segundo número(" + segundoNumero + " ).");
			
		
		
		}


	}

}
