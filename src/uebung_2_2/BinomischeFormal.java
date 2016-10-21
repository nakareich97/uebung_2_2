package uebung_2_2;

public class BinomischeFormal {

	public static void main(String[] args) {
		double a = 8;
		double b = 3;
		
		double inDerKlammer = a + b;
		
		double loesung1 = Math.pow(inDerKlammer,2);
		double loesung2 = Math.pow(a, 2) + 2*a*b+ Math.pow(b, 2);
		
		System.out.println(loesung1);
		System.out.println(loesung2);

	}

}
