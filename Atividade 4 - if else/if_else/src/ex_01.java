import java.util.Scanner;

public class ex_01 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double raiz;
    int soma, num1, num2, num3, escolha;
    
    System.out.print("Menu de op��es:\r\n"
            + "1. Somar dois n�meros\r\n"
            + "2. Raiz quadrada de um n�mero.\r\n"
            + "Digite a op��o desejada:");
    escolha = sc.nextInt();
    
    if (escolha == 1) {
        
        System.out.print("\nDigite o primeiro n�mero: ");
        num1 = sc.nextInt();
        System.out.print("\nDigite o segundo n�mero: ");
        num2 = sc.nextInt(); 
        
        soma = num1 + num2;
        
        System.out.print("\nO resultado da soma �: " +soma);
    } else {
        System.out.print("\nDigite um n�mero:");
        num3 = sc.nextInt();
        raiz = Math.sqrt(num3);
        
        System.out.print("\nA raiz quadrada desse n�mero �: " +raiz);
    }
     sc.close();
    }

}