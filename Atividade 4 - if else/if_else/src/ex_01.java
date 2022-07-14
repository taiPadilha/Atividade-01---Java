import java.util.Scanner;

public class ex_01 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double raiz;
    int soma, num1, num2, num3, escolha;
    
    System.out.print("Menu de opções:\r\n"
            + "1. Somar dois números\r\n"
            + "2. Raiz quadrada de um número.\r\n"
            + "Digite a opção desejada:");
    escolha = sc.nextInt();
    
    if (escolha == 1) {
        
        System.out.print("\nDigite o primeiro número: ");
        num1 = sc.nextInt();
        System.out.print("\nDigite o segundo número: ");
        num2 = sc.nextInt(); 
        
        soma = num1 + num2;
        
        System.out.print("\nO resultado da soma é: " +soma);
    } else {
        System.out.print("\nDigite um número:");
        num3 = sc.nextInt();
        raiz = Math.sqrt(num3);
        
        System.out.print("\nA raiz quadrada desse número é: " +raiz);
    }
     sc.close();
    }

}