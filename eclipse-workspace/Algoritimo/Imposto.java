import java.util.Scanner;

public class Imposto {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double valorBruto;
	double valorImposto = 0;
	double valorDesconto = 0;
	int qtdeDependentes = 0;
		
	final double DESC_DEPENDENTE = 1000;
	
	
	//qtdeDependentes = (int) (valorBruto - DESC_DEPENDENTE);
	
	while (true) {
	System.out.println("####################################################################################################");
	System.out.println("ATENÇÃO!!! Será descontontado do valor bruto do imposto declarado R$ 1.000,00 para cada dependente. ");
	System.out.println("####################################################################################################");
	System.out.println("Informe Valor Bruto do Imposto R$: ");
	valorBruto = sc.nextDouble();
	System.out.println("Informe Quantidade de Dependetes: ");
	qtdeDependentes = sc.nextInt();
	
	valorDesconto = qtdeDependentes * DESC_DEPENDENTE;
	
	if (valorBruto > valorDesconto ) {
		
		valorDesconto = qtdeDependentes * DESC_DEPENDENTE;
		valorImposto = valorBruto - valorDesconto;
		System.out.println("Valor Imposto a pagar: R$ " +  String.format("%.2f", valorImposto));
		System.out.println();
		
		
	}else {
		
		System.out.println("Não foi gerado valor de imposto  a pagar.");
		
		
			}

		}

	}
}