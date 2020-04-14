import java.util.Locale;
import java.util.Scanner;

public class uri1009 {
	//uri1010
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1, codigoPeca2, numeroPecas1, numeroPecas2 ;
		double valorUnitario1, valorUnitario2, total;
		
		codigoPeca1 = sc.nextInt();
		numeroPecas1 = sc.nextInt();
		valorUnitario1 = sc.nextDouble();
		codigoPeca2 = sc.nextInt();
		numeroPecas2 = sc.nextInt();
		valorUnitario2 = sc.nextDouble();
		
		total = numeroPecas1 * valorUnitario1 + numeroPecas2 * valorUnitario2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
					
		sc.close();
	}

}