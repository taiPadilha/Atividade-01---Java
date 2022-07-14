import java.util.Scanner;

public class ex_08 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double salario, conta1, conta2, resto;
	
	System.out.print("Digite o valor do seu salário: R$");
	 salario = sc.nextDouble();
	
	System.out.print("\nDigite o valor da primeira conta atrasada: R$");
	 conta1 = sc.nextDouble();
			
	System.out.print("\nDigite o valor da segunda conta: R$");
	 conta2 = sc.nextDouble();
	
	
	 resto = salario - ((conta1 * 1.02) + (conta2 * 1.02));
	System.out.println("\nO restante do seu salário é de: R$ " +resto);
	
	sc.close();
	}

}
