import java.util.Scanner;

public class Condic_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double nota1, nota2, nota3, Media;

		System.out.print("Digite sua primeira nota: ");
		nota1 = sc.nextDouble();

		System.out.print("Digite sua segunda nota: ");
		nota2 = sc.nextDouble();

		System.out.print("Digite sua terceira nota: ");
		nota3 = sc.nextDouble();

		Media = (nota1 + nota2 + nota3) / (3);

		if (Media >= 7) {
			System.out.println("\nAprovado!");
		}
		if (Media >= 3 && Media <= 6.9) {
			System.out.println("\nVocê está em exame!");

			double falta = 6 - Media;
			System.out.printf("Falta %.1f pontos para você ser aprovado.", Media);
		}
		if (Media > 0 && Media <= 2.9) {
			System.out.println("\nReprovado!");
		}

	}

}
