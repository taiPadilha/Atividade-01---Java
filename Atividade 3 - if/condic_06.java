import java.util.Scanner;

public class condic_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.print("\nEsse n�mero � par!");
		}
		if(num % 2 != 0) {
			System.out.print("\nEsse n�mero � �mpar!");
		}
		
		sc.close();
	}

}
