import java.util.Scanner;

public class ex_04 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
		
	double preco, precoNovo;
	
		System.out.print("Digite o pre�o de um produto: R$");
		preco = sc.nextDouble();
		
		precoNovo= + (preco -(preco * 0.1));
		
		System.out.printf("\nO novo pre�o �: R$ %.2f", precoNovo);		

		sc.close();
	}

}
