package bhaskara;

public class formula {

		public static void main(String[] args) {
						
		int a =   1;
		int b =  -4;
		int c =  -5;
		
		//
		
		int delta     = b * b - 4 * a * c;
		int deltaRaiz = (int) Math.sqrt(delta);
		double x1     = (-(b) + deltaRaiz) / 2 * a;
		double x2        = (-(b) - deltaRaiz) / 2 * a;
		
		
		if (deltaRaiz == 0) {
			
			System.out.println("a equa��o n�o pode ser resolvida.");
			
				}
		else {
			
			System.out.println("as ra�zes da equa��o s�o " + x1 + " e " + x2);
			
			}
		
		
		}
	  
	}
