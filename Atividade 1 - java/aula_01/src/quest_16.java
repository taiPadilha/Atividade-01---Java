import java.util.Scanner;

public class quest_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double base, altura;
        
        System.out.print("Base: ");
        base = sc.nextDouble();
        System.out.print("Altura: ");
        altura = sc.nextDouble();
        
        System.out.println("Perímetro: " + ((base * 2) + (altura*2)));
        System.out.println("Área: " + (base * altura));
    }
}