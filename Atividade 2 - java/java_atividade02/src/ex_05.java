import java.util.Scanner;

public class ex_05 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	double salario, comissao, valorVenda;
	int num;
	
	System.out.print("Digite o valor fixo do seu salário: R$");
	salario = sc.nextDouble();
	
	System.out.print("\nDigite o número de vendas realizadas no mês: R$");
	num = sc.nextInt();
	
	comissao = 0;
	
	for(int i = 0; i < num; i++) {
		System.out.print("\nQual o valor da" +( i + 1)+ "° venda? \nR$");
		
		valorVenda = sc.nextDouble();
	
		comissao += (valorVenda * 0.04);
	}
	
	System.out.printf("\nO seu salário desse mês é: R$ %.2f", (salario + comissao));
	
	sc.close();
	}

}
