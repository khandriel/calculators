package codigoBarras;
import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) { // Osmar Sadi Nether Filho Matrícula: 20103647-2
		
		Scanner in = new Scanner(System.in);
		System.out.println("Insira o código de barras para ser convertido em código postal: ");	//Requisição do código de barras para o usuário
										
		String codigoBarra = in.next();
				
		leCodigo(codigoBarra);
							
	}

	/**
	 * Identifica os digitos formados por ":" e "|" e devolve como strings com os números que representam
	 * @param barra string de 5 caractéres
	 * @return valor valor do digito  
	 * @return valor2 mensagem de erro
	 */
	
	public static String leDigito(String barra) {
		String digito1 = ":::||";	String digito2 = "::|:|"; //Identifica as sequências de "|" e ":"
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
	 * Transforma o código de barras em código postal e verifica o digito verificador
	 * @param codigoBarra
	 */
	
	public static void leCodigo(String codigoBarra) 
	{
		
		String codigoLimpo = codigoBarra.substring(1, 31); //Retirada das primeira e ultima barra 
				
		String subDigito1       = codigoLimpo.substring(0 , 5 ); //Divisão em strings de 5 caractéres
		String subDigito2       = codigoLimpo.substring(5 , 10);
		String subDigito3       = codigoLimpo.substring(10, 15);
		String subDigito4       = codigoLimpo.substring(15, 20);
		String subDigito5 	    = codigoLimpo.substring(20, 25);
		String subDigitoVerif   = codigoLimpo.substring(25, 30);
	
		
		String digito1     = leDigito(subDigito1);  //Chamada do método leDigito
	 	String digito2     = leDigito(subDigito2);
		String digito3     = leDigito(subDigito3);
		String digito4     = leDigito(subDigito4);
		String digito5     = leDigito(subDigito5);
		String digitoVerif = leDigito(subDigitoVerif);
		
		String zipCode = digito1.concat(digito2).concat(digito3).concat(digito4).concat(digito5); //Verificação de erro na escrita 
		if(digito1.contentEquals("x") || digito2.contentEquals("x")) {							 // no código de barras
				System.out.println("O código digitado está incorreto.");
		}
		
		if(digito3.contentEquals("x") || digito4.contentEquals("x")) {
			System.out.println("O código digitado está incorreto.");
		}
		if(digito5.contentEquals("x") || digitoVerif.contentEquals("x")) {
			System.out.println("O código digitado está incorreto.");
		}
				
		int zipCodeNum = Integer.parseInt(zipCode);   		//Transformação das strings em int
		int digitoVerifNum = Integer.parseInt(digitoVerif);	
		int somaVerif = zipCodeNum + digitoVerifNum;		//Verificação do digito verificador
		 
		
		
		if(somaVerif % 10 == 0) 
		{
			 System.out.println("O código digitado está incorreto.");
			 System.out.println("O digito verificador está errado.");
		}
		else {
		System.out.println("O códgigo de barras requisitado é: ");
		System.out.println(zipCode);		
	  }
	}

}
