package codigoBarras;
import java.util.Scanner;

public class exercicio1 { // Osmar Sadi Nether Filho Matrícula: 20103647-2
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insira o código postal: "); //Requisição do códgigo para o usuário
		
		String zipCode = in.next();
					imprimeCodigoBarra(zipCode);
       	
	
	}
	
	/**
	 * Método para identificação dos dígitos e trasnformação em strings dos respectivos números
	 * @param d
	 */
	public static void imprimeDigito(char d) { 
		
		if( d == '1') {			
		
			System.out.print(":::||");
		}

		if( d == '2') {
		
			System.out.print("::|:|");
		}

		if( d == '3') {
		
			System.out.print("::||:");
		}

		if( d == '4') {
		
			System.out.print(":|::|");
		}

		if( d == '5') {
		
			System.out.print(":|:|:");
		}

		if( d == '6') {
		
			System.out.print(":||::");
		}

		if( d == '7') {
		
			System.out.print("|:::|");
		}

		if( d == '8') {
		
			System.out.print("|::|:");
		}

		if( d == '9') {
		
			System.out.print("|:|::");
		}

		if( d == '0') {
		
			System.out.print("||:::");
		}
	 
	 	}
	 
	/**
	 *Método para impressão do código postal
	 * @param zipCode
	 */
	
	public static void imprimeCodigoBarra(String zipCode) { //Método para impressão do código postal
		 
		 if(zipCode.length() != 5) 					//verificação do tamanho do código digitado
		 {
			 
			 System.out.println("O código postal digitado é inválido.");
		 }
		 
		 else
		 {
			 System.out.println("O Código de Barras é: ");
			 
			 System.out.print('|');
		 
		 for(int n = 0; n < zipCode.length(); n++) //Chamada do método imprimeDigito(char d)
		 {
			 
			imprimeDigito(zipCode.charAt(n));
						
		 }
		
		 int digitoVerificador = Integer.parseInt(zipCode); //Cálculo do dígito verificador
		 int somaDigito = 0;
		 
		 while(digitoVerificador > 0) 
		 {
			 int moduloDigito = digitoVerificador % 10;
			 digitoVerificador /= 10;
		 }
		 
		 double multiploDigito = Math.round((somaDigito + 5)/ 10.0) * 10.0;
		 double diferencaDigito = multiploDigito - somaDigito;
		 System.out.println(diferencaDigito);
		 char digitoStr = (char) diferencaDigito; //Impressão do código de barras
		 imprimeDigito(digitoStr);
		 System.out.print('|');
		 
	 }
		 
   }
}
