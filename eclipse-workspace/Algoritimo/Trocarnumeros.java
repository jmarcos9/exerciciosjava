import java.util.Scanner;

public class Trocarnumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int primeiroNumero;
		int segundoNumero;
		int modificador;
		
		
		System.out.println("Digite um n�mero: ");
		primeiroNumero = sc.nextInt();
		System.out.println("Digite outro n�mero");
		segundoNumero = sc.nextInt();
		
		if (primeiroNumero > segundoNumero) {
			modificador = primeiroNumero;
			primeiroNumero = segundoNumero;
			//segundoNumero = modificador
			
			//segundoNumero = modificador;
			
			System.out.println("Vari�vel: primeiroNumero, agora tem o menor valor: (" + primeiroNumero + ") e a vari�vel: segundoNumero, tem o valor maior: (" + modificador +").") ;
		} else {
			
			System.out.println("O Primeiro n�mero (" + primeiroNumero + ") n�o � maior que o Segundo n�mero(" + segundoNumero + " ).");
			
		
		
		}


	}

}
