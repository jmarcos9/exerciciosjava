import java.util.Scanner;
public class Multalivro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner(System.in);
		
		float aluguel, juros, tPagar;
		int dias;
		
		System.out.println("Digite dias de Atraso: ");
		dias = entrada.nextInt();
		
		if (dias > 0) {
			System.out.printf("Multa de R$ "+ "%.2f", "tPagar");
		
		}else {
			System.out.println("Sem Multa");
		
		
		/*/System.out.println("Digite o valor do Aluguel do Livro: ");
		aluguel = entrada.nextFloat();
		System.out.print("Digite percentual do juros: ");
		juros = (entrada.nextFloat())/100;
		
		tPagar = (dias * juros) * aluguel;
		
		/*if (dias > 0) {
			System.out.printf("Multa de R$ "+ "%.2f", tPagar);
		
		}else {
			System.out.println("Sem Multa");*/
		}
		
	}

}
