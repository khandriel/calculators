package briotRuffini;

public class briotRuffiniCompleto {
	
	public static void main (String[] args) {
		
		
		//	Para calcular colocar os valores nas seguintes vari�veis:
		
			int x00    =    1;
			int x01    =   -6;
			int x02    =    3;
			int x03    =   10;
			int raiz   =    2;
	  
	   //	
			int resto1     =   x00;
			int resto2     =   resto1  * raiz + x01;
	        int resto3     =   resto2  * raiz + x02;
	        int restoFinal =   resto3  * raiz + x03;
	       
	        if (x00 + x01 +x02 + x03 == 0) {
	        	
	        System.out.println("1 � uma das ra�zes do polin�mio,");
	        
	        }	
	        
	        if (x00 + (-x01) + x02 + (-x03) == 0) {
	        		
	        		System.out.println("-1 � uma das ra�zes do polin�mio,");
	        	}
	        
	        
	        else {
	        	
	        	System.out.println("1 e -1 n�o s�o ra�zes do polin�mio,");
	        }
	        
	        	        
	    //    
	        if (restoFinal == 0) {
	        		
	        System.out.println(raiz + " � raiz do polin�mio,");
	        System.out.println("o polin�mio de grau rebaixado � " + resto1 + "x� " + resto2 + "x " + resto3);
	        
	        int a =  resto1;
			int b =  resto2;
			int c =  resto3;
			
	   //
			
			int delta     = b * b - 4 * a * c;
			int deltaRaiz = (int) Math.sqrt(delta);
			double x1     = (-(b) + deltaRaiz) / 2 * a;
			double x2     = (-(b) - deltaRaiz) / 2 * a;
			
			
			if (deltaRaiz == 0) {
				
				System.out.println("a equa��o n�o pode ser resolvida.");
				
					}
			else {
				
				System.out.println("as ra�zes da equa��o s�o " + x1 + " e " + x2);
				System.out.println("as tr�s ra�zes do polin�mio s�o " + raiz + ", " + x2 + " e " + x1 + ".");
				}
	        
	        }
	       
	        else {
	        	
	        	System.out.println(raiz + " n�o � raiz do polin�mio.");
	        }        
	       	       	    

	}

}
