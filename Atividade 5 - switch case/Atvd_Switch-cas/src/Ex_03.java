import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double A, B;
        int qntd;
        
        System.out.print("Qual a quantidade de livros que voc� deseja comprar?: ");
        qntd = sc.nextInt();
        
        A = (0.25 * qntd) + 7.5;
        
        B = (0.50 * qntd) + 2.5;
        
        if (A > B) {
            System.out.println("B � a op��o de desconto mais vantajosa: R$" +B);
        } else if (B > A) {
            System.out.println("A � a op��o de desconto mais vantajosa: R$" +A);
        }
        
        sc.close();
    }

}