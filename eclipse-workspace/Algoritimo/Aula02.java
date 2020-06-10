import java.util.Locale;
import java.util.Scanner;

public class Aula02 {

	public static void main(String[] args) {
		
		float nota1, nota2, media;
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
				
		System.out.println("Digite nota1: ");
		nota1 = ler.nextFloat();
		System.out.println("Digite nota2: ");
		nota2 = ler.nextFloat();
		
		media = (nota1 + nota2) /2;
		
		if (media >= 6) {
			System.out.println("Aprovado");
			
		}else {
			System.out.println("Reprovado \n");
		}
			
		
		System.out.println("1ª nota foi " + nota1 + " sua segunda nota foi " + nota2 + " e sua média foi " + media);
		
		ler.close();

	}

}