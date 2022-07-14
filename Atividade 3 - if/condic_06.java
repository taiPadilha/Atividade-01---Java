import java.util.Scanner;

public class condic_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.print("\nEsse número é par!");
		}
		if(num % 2 != 0) {
			System.out.print("\nEsse número é ímpar!");
		}
		
		sc.close();
	}

}
