import java.util.Scanner;

public class Condic_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe um n�mero: ");
        int a = sc.nextInt();
                
        System.out.print("Informe outro n�mero: ");
        int b = sc.nextInt();
        
        System.out.print("Informe o �ltimo n�mero: ");
        int c = sc.nextInt();
        
        System.out.println("\n---- ESCOLHA ----"
                + "\n1 - Ordem crescente"
                + "\n2 - Ordem decrescente"
                + "\n3 - Maior n�mero no meio"
                + "R: ");
        int escolha = sc.nextInt();
        
        if(escolha == 1) {
            if(a > b && a < c) {
                System.out.print("\n" + b + " - " + a + " - " + c);
            }
            
            if(a > c && a < b) {
                System.out.print("\n" + c + " - " + a + " - " + b);
            }
            
            if(b > a && b < c) {
                System.out.print("\n" + a + " - " + b + " - " + c);
            }
            
            if(b > c && b < a) {
                System.out.print("\n" + c + " - " + b + " - " + a);
            }
            
            if(c > b && c < a) {
                System.out.print("\n" + b + " - " + c + " - " + a);
            }
            
            if(c > a && c < b) {
                System.out.print("\n" + a + " - " + c + " - " + b);
            }
        }
        
        if(escolha == 2) {
            if(a < b && a > c) {
                System.out.print("\n" + b + " - " + a + " - " + c);
            }
            
            if(a < c && a > b) {
                System.out.print("\n" + c + " - " + a + " - " + b);
            }
            
            if(b < a && b > c) {
                System.out.print("\n" + a + " - " + b + " - " + c);
            }
            
            if(b < c && b > a) {
                System.out.print("\n" + c + " - " + b + " - " + a);
            }
            
            if(c < b && c > a) {
                System.out.print("\n" + b + " - " + c + " - " + a);
            }
            
            if(c < a && c > b) {
                System.out.print("\n" + a + " - " + c + " - " + b);
            }
        }
        
        if(escolha == 3) {
            if(a > b && a > c) {
                System.out.print("\n" + b + " - " + a + " - " + c);
            }
            
            if(b > a && b > c) {
                System.out.print("\n" + a + " - " + b + " - " + c);
            }
            
            if(c > a && c > b) {
                System.out.print("\n" + a + " - " + c + " - " + b);
            }
        }
        
        sc.close();
    }

}

	


