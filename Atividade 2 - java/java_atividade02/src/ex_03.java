import java.util.Scanner;

public class ex_03 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	       
	int num1, num2;
		
        System.out.print("Digite um número que não seja zero: ");
        num1 = sc.nextInt();
	                
	    System.out.print("\nDigite outro número: ");
        num2 = sc.nextInt();        

        System.out.print("\nO resultado é: " +(num1 / num2));
	        
	    sc.close();
	}

}
