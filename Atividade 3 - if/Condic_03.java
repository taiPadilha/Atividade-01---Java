import java.util.Scanner;

public class Condic_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2;

		System.out.print("Digite o primeiro n�mero: ");
		num1 = sc.nextInt();

		System.out.print("Digite o segundo n�mero: ");
		num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("\nO n�mero " + num1 + " � maior.");
		}
		if (num2 > num1) {
			System.out.println("\nO n�mero " + num2 + " � maior.");
		}

		sc.close();
	}

}
