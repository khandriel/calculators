package briotRuffini;

import java.util.Scanner;
public class briotRuffiniCompleto {
	
	public static void main (String[] args) {
		
	Scanner in = new Scanner(System.in);
		//	Para calcular colocar os valores nas seguintes variáveis:
		
			int x00    =    in.nextInt();
			int x01    =    in.nextInt();
			int x02    =    in.nextInt();
			int x03    =    in.nextInt();
			int raiz   =    in.nextInt();
	  
	   //	
			int resto1     =   x00;
			int resto2     =   resto1  * raiz + x01;
	        int resto3     =   resto2  * raiz + x02;
	        int restoFinal =   resto3  * raiz + x03;
	       
	        if (x00 + x01 +x02 + x03 == 0) {
	        	
	        System.out.println("1 é uma das raízes do polinômio,");
	        
	        }	
	        
	        if (x00 + (-x01) + x02 + (-x03) == 0) {
	        		
	        		System.out.println("-1 é uma das raízes do polinômio,");
	        	}
	        
	        
	        else {
	        	
	        	System.out.println("1 e -1 não são raízes do polinômio,");
	        }
	        
	        	        
	    //    
	        if (restoFinal == 0) {
	        		
	        System.out.println(raiz + " é raiz do polinômio,");
	        System.out.println("o polinômio de grau rebaixado é " + resto1 + "x² " + resto2 + "x " + resto3);
	        
	        int a =  resto1;
			int b =  resto2;
			int c =  resto3;
			
	   //
			
			int delta     = b * b - 4 * a * c;
			int deltaRaiz = (int) Math.sqrt(delta);
			double x1     = (-(b) + deltaRaiz) / 2 * a;
			double x2     = (-(b) - deltaRaiz) / 2 * a;
			
			
			if (deltaRaiz == 0) {
				
				System.out.println("a equação não pode ser resolvida.");
				
					}
			else {
				
				System.out.println("as raízes da equação são " + x1 + " e " + x2);
				System.out.println("as três raízes do polinômio são " + raiz + ", " + x2 + " e " + x1 + ".");
				}
	        
	        }
	       
	        else {
	        	
	        	System.out.println(raiz + " não é raiz do polinômio.");
	        }        
	       	       	    

	}

}
