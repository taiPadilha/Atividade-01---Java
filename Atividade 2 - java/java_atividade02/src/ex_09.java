import java.util.Scanner;

public class ex_09 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int horas, horaExt;
	double salarioMin, salario, salarioExtra;
	
	System.out.print("Digite o n�mero de horas trabalhadas: ");
	horas = sc.nextInt();
	
	System.out.print("\nDigite o valor do sal�rio m�nimo: R$");
	salarioMin = sc.nextDouble();
	 
	System.out.print("\nDigite o n�mero de horas extras: ");
	horaExt = sc.nextInt();
	
	salario = (horas * (salarioMin / 8));
	salarioExtra = (horas * (salarioMin / 8)) + (horaExt * (salarioMin/4));
	
	System.out.printf("\nO valor do sal�rio � de: R$ %.2f\nO valor do sal�rio com horas extras � de: R$ %.2f", salario, salarioExtra);
	
	sc.close();
	}

}
