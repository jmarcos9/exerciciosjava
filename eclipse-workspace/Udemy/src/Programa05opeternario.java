
// só funciona se não houver mais de um else
public class Programa05opeternario {

	public static void main(String[] args) {
		int valor = 3, numero;
		
		/*
		if (valor > 0) {
			numero = valor;
		}else {
			numero = 7;
		}
		*/
		//operador ternario
		numero = (valor >0) ? valor : 7;
		System.out.println(numero);
		
	}
}
