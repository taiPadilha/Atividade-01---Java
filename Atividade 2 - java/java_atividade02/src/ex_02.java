import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
		
	int num1, num2, num3;
	
		System.out.print("Digite um n�mero: ");
		num1 = sc.nextInt();
				
		System.out.print("\nDigite outro n�mero: ");
		num2 = sc.nextInt();
		
		System.out.print("\nDigite o �ltimo n�mero: ");
		num3 = sc.nextInt();
		
		System.out.print("\nO resultado �: " +(num1 * num2 * num3));
		
		sc.close();
	}

}
