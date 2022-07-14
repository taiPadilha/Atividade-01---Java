import java.util.Scanner;

public class condic_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2, num3;

		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextInt();

		System.out.println("Digite o segundo número: ");
		num2 = sc.nextInt();

		System.out.println("Digite o último número: ");
		num3 = sc.nextInt();

		int primeiro = 0, segundo = 0, terceiro = 0;

		if (num1 > num2 && num1 > num3) {
			primeiro = num1;
		}

		if (num2 > num1 && num2 > num3) {
			primeiro = num2;
		}

		if (num3 > num1 && num3 > num2) {
			primeiro = num3;
		}

		if (num1 > num2 && num1 < num3 || num1 < num2 && num1 > num3) {
			segundo = num1;
		}

		if (num2 > num1 && num2 < num3 || num2 < num1 && num2 > num3) {
			segundo = num2;
		}

		if (num3 > num2 && num3 < num1 || num3 < num2 && num3 > num1) {
			segundo = num3;
		}

		if (num1 < num2 && num1 < num3) {
			terceiro = num1;
		}

		if (num2 < num1 && num2 < num3) {
			terceiro = num2;
		}

		if (num3 < num1 && num3 < num2) {
			terceiro = num3;
		}

		System.out.print("\nOrdem crescente: " + terceiro + ", " + segundo + ", " + primeiro);

	}

}
