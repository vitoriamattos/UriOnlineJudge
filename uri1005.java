import java.util.Locale;
import java.util.Scanner;

public class uri1005 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		
		media = (nota1 * 3.5 + nota2 * 7.5) / 11.0;
		
		System.out.printf("MEDIA = %.5f%n", media);
					
		sc.close();
	}

}