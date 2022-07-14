import java.util.Scanner;

public class Condic_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double TL, AT, EF, MediaPonderada;

		System.out.print("Digite sua nota no Trabalho de Laboratório: ");
		TL = sc.nextDouble();

		System.out.print("Digite sua nota na Avaliação Trimestral: ");
		AT = sc.nextDouble();

		System.out.print("Digite sua nota no exame final: ");
		EF = sc.nextDouble();

		MediaPonderada = ((TL * 2) + (AT * 3) + (EF * 5)) / (2 + 3 + 5);

		if (MediaPonderada > 8) {
			System.out.print("\nSeu conceito final é: A");
		}
		if (MediaPonderada > 7 && MediaPonderada <= 7.9) {
			System.out.print("\nSeu conceito final é: B");
		}
		if (MediaPonderada > 6 && MediaPonderada <= 6.9) {
			System.out.print("\nSeu conceito final é: C");
		}
		if (MediaPonderada > 5 && MediaPonderada <= 5.9) {
			System.out.print("\nSeu conceito final é: D");
		}
		if (MediaPonderada > 0 && MediaPonderada <= 4.9) {
			System.out.print("\nSeu conceito final é: E");
		}
	}

}
