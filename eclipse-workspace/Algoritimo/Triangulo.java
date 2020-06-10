import java.util.Scanner;

public class Triangulo {

		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			float base, altura, area;
			
			System.out.println("Digite a Base: ");
			base = entrada.nextFloat();
			System.out.println("Digite a Altura: ");
			altura = entrada.nextFloat();
			
			area = ((base * altura) / 2);
			
			System.out.println("A área do triangulo é: " + area);
		}
}
