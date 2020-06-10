import java.util.Scanner;
public class Salario {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		double salarioBase = 1;
		double valorReajuste;
		double novoSalario;
		
		final double PERC_FAIXA1 = 0.05;
		final double PERC_FAIXA2 = 0.03;		
		
		while (salarioBase > 0) {
		System.out.println("Informe Salário: ");
		salarioBase = sc.nextFloat();
		
		
			
		if (salarioBase <= 3000) {
			valorReajuste = salarioBase * PERC_FAIXA1;
			novoSalario = valorReajuste + salarioBase; 
						
		}else {
			valorReajuste = salarioBase * PERC_FAIXA2;
			novoSalario = valorReajuste + salarioBase;
				
			}
						
	System.out.println("Seu reajuste foi de: R$ " + String.format( "%.2f", valorReajuste) + " Seu novo salário é: R$ " + String.format("%.2f", novoSalario));
	System.out.println();
		}

	}
	
}
