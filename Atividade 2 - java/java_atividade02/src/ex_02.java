import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
		
	int num1, num2, num3;
	
		System.out.print("Digite um número: ");
		num1 = sc.nextInt();
				
		System.out.print("\nDigite outro número: ");
		num2 = sc.nextInt();
		
		System.out.print("\nDigite o último número: ");
		num3 = sc.nextInt();
		
		System.out.print("\nO resultado é: " +(num1 * num2 * num3));
		
		sc.close();
	}

}
