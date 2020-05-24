package codigoBarras;
import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) { // Osmar Sadi Nether Filho Matr�cula: 20103647-2
		
		Scanner in = new Scanner(System.in);
		System.out.println("Insira o c�digo de barras para ser convertido em c�digo postal: ");	//Requisi��o do c�digo de barras para o usu�rio
										
		String codigoBarra = in.next();
				
		leCodigo(codigoBarra);
							
	}

	/**
	 * Identifica os digitos formados por ":" e "|" e devolve como strings com os n�meros que representam
	 * @param barra string de 5 caract�res
	 * @return valor valor do digito  
	 * @return valor2 mensagem de erro
	 */
	
	public static String leDigito(String barra) {
		String digito1 = ":::||";	String digito2 = "::|:|"; //Identifica as sequ�ncias de "|" e ":"
		String digito3 = "::||:";	String digito4 = ":|::|";
		String digito5 = ":|:|:";	String digito6 = ":||::";
		String digito7 = "|:::|";	String digito8 = "|::|:";
		String digito9 = "|:|::";	String digito0 = "||:::";
	
		String valor;
		String valor2 = "x";
		
		if( barra.contentEquals(digito1)) { //Testa o argumento utilizado
			
			valor = "1";
			return valor;
		}

		if( barra.contentEquals(digito2)) {
		
			valor = "2";
			return valor;
		}

		if( barra.contentEquals(digito3)) {
		
			valor = "3";
			return valor;
		}

		if( barra.contentEquals(digito4)) {
		
			valor = "4";
			return valor;
		}

		if( barra.contentEquals(digito5)) {
		
			valor = "5";
			return valor;
		}

		if( barra.contentEquals(digito6)) {
		
			valor = "6";
			return valor;
		}

		if( barra.contentEquals(digito7)) {
		
			valor = "7";
			return valor;
		}

		if( barra.contentEquals(digito8)) {
		
			valor = "8";
			return valor;
		}

		if( barra.contentEquals(digito9)) {
		
			valor = "9";
			return valor;
		}

		if( barra.contentEquals(digito0)) {
		
			valor = "0";
			return valor;
		}
		
		
		return  valor2;
		
	}	
	
	/**
	 * Transforma o c�digo de barras em c�digo postal e verifica o digito verificador
	 * @param codigoBarra
	 */
	
	public static void leCodigo(String codigoBarra) 
	{
		
		String codigoLimpo = codigoBarra.substring(1, 31); //Retirada das primeira e ultima barra 
				
		String subDigito1       = codigoLimpo.substring(0 , 5 ); //Divis�o em strings de 5 caract�res
		String subDigito2       = codigoLimpo.substring(5 , 10);
		String subDigito3       = codigoLimpo.substring(10, 15);
		String subDigito4       = codigoLimpo.substring(15, 20);
		String subDigito5 	    = codigoLimpo.substring(20, 25);
		String subDigitoVerif   = codigoLimpo.substring(25, 30);
	
		
		String digito1     = leDigito(subDigito1);  //Chamada do m�todo leDigito
	 	String digito2     = leDigito(subDigito2);
		String digito3     = leDigito(subDigito3);
		String digito4     = leDigito(subDigito4);
		String digito5     = leDigito(subDigito5);
		String digitoVerif = leDigito(subDigitoVerif);
		
		String zipCode = digito1.concat(digito2).concat(digito3).concat(digito4).concat(digito5); //Verifica��o de erro na escrita 
		if(digito1.contentEquals("x") || digito2.contentEquals("x")) {							 // no c�digo de barras
				System.out.println("O c�digo digitado est� incorreto.");
		}
		
		if(digito3.contentEquals("x") || digito4.contentEquals("x")) {
			System.out.println("O c�digo digitado est� incorreto.");
		}
		if(digito5.contentEquals("x") || digitoVerif.contentEquals("x")) {
			System.out.println("O c�digo digitado est� incorreto.");
		}
				
		int zipCodeNum = Integer.parseInt(zipCode);   		//Transforma��o das strings em int
		int digitoVerifNum = Integer.parseInt(digitoVerif);	
		int somaVerif = zipCodeNum + digitoVerifNum;		//Verifica��o do digito verificador
		 
		
		
		if(somaVerif % 10 == 0) 
		{
			 System.out.println("O c�digo digitado est� incorreto.");
			 System.out.println("O digito verificador est� errado.");
		}
		else {
		System.out.println("O c�dgigo de barras requisitado �: ");
		System.out.println(zipCode);		
	  }
	}

}
