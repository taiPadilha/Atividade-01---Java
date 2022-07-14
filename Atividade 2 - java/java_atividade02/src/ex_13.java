import java.util.Scanner;

public class ex_13 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
		
	double salarioMin, qw, vqw,vp,vpd;

	System.out.print("Digite o valor do salário mínimo: ");
	salarioMin = sc.nextDouble();

	 System.out.print("\nDigite a quantidade de quilowatts consumida: ");
	 qw = sc.nextDouble();

	        vqw = salarioMin /5;
	        System.out.print("\nValor de cada quilowatts: " +vqw);
	        vp = qw * vqw;
	        System.out.print("\nValor a ser pago: " +vp);
	        vpd = vp - (vp*0.15);
	        System.out.println("\nValor a ser pago com desconto: " +vpd);

	        sc.close();

	}

}
