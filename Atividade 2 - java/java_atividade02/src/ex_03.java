import java.util.Scanner;

public class ex_03 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	       
	int num1, num2;
		
        System.out.print("Digite um n�mero que n�o seja zero: ");
        num1 = sc.nextInt();
	                
	    System.out.print("\nDigite outro n�mero: ");
        num2 = sc.nextInt();        

        System.out.print("\nO resultado �: " +(num1 / num2));
	        
	    sc.close();
	}

}
