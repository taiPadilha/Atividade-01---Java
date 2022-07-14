import java.util.Scanner;

public class ex_09 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int horas, horaExt;
	double salarioMin, salario, salarioExtra;
	
	System.out.print("Digite o número de horas trabalhadas: ");
	horas = sc.nextInt();
	
	System.out.print("\nDigite o valor do salário mínimo: R$");
	salarioMin = sc.nextDouble();
	 
	System.out.print("\nDigite o número de horas extras: ");
	horaExt = sc.nextInt();
	
	salario = (horas * (salarioMin / 8));
	salarioExtra = (horas * (salarioMin / 8)) + (horaExt * (salarioMin/4));
	
	System.out.printf("\nO valor do salário é de: R$ %.2f\nO valor do salário com horas extras é de: R$ %.2f", salario, salarioExtra);
	
	sc.close();
	}

}
