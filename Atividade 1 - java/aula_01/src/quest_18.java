import java.util.Scanner;

public class quest_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double base, altura;
        
        System.out.print("Base Tri�ngulo: ");
        base = sc.nextDouble();
        System.out.print("Altura: ");
        altura = sc.nextDouble();
        
        System.out.println("Valor a �rea: " + ((base * altura)/2));
    }
}