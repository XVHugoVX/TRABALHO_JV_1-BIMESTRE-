
public class Questão_3_Java {
	
	public static void main(String[] args) { 
		int A = 3;
		int B = -15;
		int C = 12;
		double delta = Math.pow(B, 2.0) - 4*A*C;
		double x1 = (- B + Math.sqrt(delta)) / (2.0 * A);
		double x2 = (- B - Math.sqrt(delta)) / (2.0 * A);
		System.out.println("Valor 1: " + x1 + "\n " + "Valor 2: " + x2);
	}
	
}
