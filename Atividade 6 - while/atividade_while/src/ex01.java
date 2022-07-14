import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double salC, salJ;
		int meses = 0;

		System.out.println("Digite o valor do salário de seu Carlos: ");
		salC = sc.nextInt();

		salJ = salC / 3;

		System.out.println("O valor do salário de seu João é de: " + salJ);

		while (salJ < salC) {
			salJ += salJ * 0.05;
			salC += salC * 0.02;

			meses++;
		}

		System.out.println("\nA quantidade de meses pare o salário de João igualar ou ultrapassar é de: " + meses + " meses");

		sc.close();
	}
}