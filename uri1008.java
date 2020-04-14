import java.util.Locale;
import java.util.Scanner;

public class uri1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int func, horas;
		double valorHora;
		double salario;
		
		func = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salario = horas * valorHora;
		
		System.out.println("NUMBER = " + func);
		System.out.printf("SALARY = U$ %.2f%n", salario);
					
		sc.close();
	}

}