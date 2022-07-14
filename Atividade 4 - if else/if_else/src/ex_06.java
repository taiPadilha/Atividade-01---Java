import java.util.Scanner;

public class ex_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double salario;
		int opcaoEscolhida;

		System.out.print("Menu de op��es:" + "\n1- Imposto" + "\n2- Novo sal�rio" + "\n3- Classifica��o" + "\nResposta: ");
		opcaoEscolhida = sc.nextInt();

		if (opcaoEscolhida == 1) {
			System.out.print("\nDigite seu sal�rio atual: ");
			salario = sc.nextDouble();

			if (salario < 500) {
				System.out.print("\nValor de imposto a pagar: " + (salario * 0.05));
			} else if (salario <= 850) {
				System.out.print("\nValor de imposto a pagar: " + (salario * 0.10));
			} else {
				System.out.print("\nValor de imposto a pagar: " + (salario * 0.15));
			}
			
		} else if (opcaoEscolhida == 2) {
			System.out.print("\nDigite seu sal�rio atual: ");
			salario = sc.nextDouble();

			if (salario < 400) {
				salario = salario + 100;
			} else if (salario < 750) {
				salario = salario + 75;
			} else if (salario < 1500) {
				salario = salario + 50;
			} else {
				salario = salario + 25;
			}
			
			System.out.print("\nSeu novo sal�rio ser�: " + salario);
			
		} else if (opcaoEscolhida == 3) {
			System.out.print("\nDigite seu sal�rio atual: ");
			salario = sc.nextDouble();

			if (salario <= 700) {
				System.out.print("\nVoc� � mal remunerado!");
			} else {
				System.out.print("\nVoc� � bem remunerado!");
			}
		}

		sc.close();
	}
}
