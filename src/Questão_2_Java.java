
public class Questão_2_Java {
	
	public static void main(String[] args) {
		double A = 12.7;
		double B = 10.4;
		double C = 15.2;
		double PI = 3.14159 ;
		double areaT = (A * C) / 2;
		double areaC = PI * (C*C);
		double areaTR = (A + B) * C / 2 ; 
		double areaQ= B * B ;
		double areaR = A * B;
		System.out.println("area do triangulo: " + areaT);
		System.out.println("area do circulo: " + areaC);
		System.out.println("area do trapezio: " + areaTR);
		System.out.println("area do quadrado: " + areaQ);
		System.out.println("area do retãngulo: " + areaR);
		
	}

}
