import java.util.Scanner;

public class ex_01 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite um n�mero: ");
		int num1 = sc.nextInt();
				
		System.out.print("\nDigite outro n�mero: ");
		int num2 = sc.nextInt();		
		
		
		System.out.print("\nResultado= " +(num1 - num2));
		
		sc.close();

	}

}
