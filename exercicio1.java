package codigoBarras;
import java.util.Scanner;

public class exercicio1 { // Osmar Sadi Nether Filho Matr�cula: 20103647-2
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insira o c�digo postal: "); //Requisi��o do c�dgigo para o usu�rio
		
		String zipCode = in.next();
					imprimeCodigoBarra(zipCode);
       	
	
	}
	
	/**
	 * M�todo para identifica��o dos d�gitos e trasnforma��o em strings dos respectivos n�meros
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
	 *M�todo para impress�o do c�digo postal
	 * @param zipCode
	 */
	
	public static void imprimeCodigoBarra(String zipCode) { //M�todo para impress�o do c�digo postal
		 
		 if(zipCode.length() != 5) 					//verifica��o do tamanho do c�digo digitado
		 {
			 
			 System.out.println("O c�digo postal digitado � inv�lido.");
		 }
		 
		 else
		 {
			 System.out.println("O C�digo de Barras �: ");
			 
			 System.out.print('|');
		 
		 for(int n = 0; n < zipCode.length(); n++) //Chamada do m�todo imprimeDigito(char d)
		 {
			 
			imprimeDigito(zipCode.charAt(n));
						
		 }
		
		 int digitoVerificador = Integer.parseInt(zipCode); //C�lculo do d�gito verificador
		 int somaDigito = 0;
		 
		 while(digitoVerificador > 0) 
		 {
			 int moduloDigito = digitoVerificador % 10;
			 digitoVerificador /= 10;
		 }
		 
		 double multiploDigito = Math.round((somaDigito + 5)/ 10.0) * 10.0;
		 double diferencaDigito = multiploDigito - somaDigito;
		 System.out.println(diferencaDigito);
		 char digitoStr = (char) diferencaDigito; //Impress�o do c�digo de barras
		 imprimeDigito(digitoStr);
		 System.out.print('|');
		 
	 }
		 
   }
}
