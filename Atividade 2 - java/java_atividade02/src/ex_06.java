import java.util.Scanner;

public class ex_06 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	double salarioMin, salarioMax;
	int quantia;
	
	System.out.print("Digite o valor do salário mínimo: R$");
	 salarioMin = sc.nextDouble();
	
	System.out.print("\nDigite o valor do seu salário: R$");
	 salarioMax = sc.nextDouble();
	
	 quantia = (int) (salarioMax / salarioMin);
	
	 System.out.printf("\nA quantidade de salários mín. que você ganha é de: " +quantia);
	
	sc.close();
	}

}
