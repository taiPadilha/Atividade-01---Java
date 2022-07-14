import java.util.Scanner;

public class ex_10 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	double valorReal, valorEuro, valorDolar, valorLibra;
	
	System.out.print("Digite, em reais, o valor que você levará para a viagem:");
	valorReal = sc.nextDouble();
	
	valorEuro = (valorReal / 5.25);
	valorDolar = (valorReal / 4.99);
	valorLibra = (valorReal / 6.27);
	
	System.out.printf("\nO valor convertido em: \nEuro= R$ %.2f\nDolar= R$ %.2f\nLibra= R$ %.2f", valorEuro, valorDolar, valorLibra);
	
	sc.close();
	}

}
