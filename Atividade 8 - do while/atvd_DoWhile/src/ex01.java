import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, i = 2, resultado = 0;

		System.out.print("Digite um n�mero maior que 1:");
		num = sc.nextInt();

		do {
			if (num == 2) {
				resultado = 0;
			} else {
				if (num % i == 0) {
					resultado++;
				}
				i++;
			}

		} while (i < num);
		if (resultado == 0) {
			System.out.print("\nEsse n�mero � primo");
		} else {
			System.out.print("\nEsse n�mero n�o � primo");
		}

		sc.close();
	}

}