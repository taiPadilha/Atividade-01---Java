import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 1;

		while (num > 0) {
			System.out.print("Informe um n�mero: ");
			num = sc.nextInt();
			
			System.out.print("\nN�mero: " + num
					+ "\nQuadrado do n�mero: " + Math.pow(num, 2)
					+ "\nCubo do n�mero: " + Math.pow(num,  3)
					+ "\nRa�z quadrada do n�mero: " + Math.sqrt(num) + "\n\n");
		}

		sc.close();
	}
}
