import java.util.Scanner;

public class Condic_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2;

		System.out.print("Digite o primeiro número: ");
		num1 = sc.nextInt();

		System.out.print("Digite o segundo número: ");
		num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("\nO número " + num1 + " é maior.");
		}
		if (num2 > num1) {
			System.out.println("\nO número " + num2 + " é maior.");
		}

		sc.close();
	}

}
