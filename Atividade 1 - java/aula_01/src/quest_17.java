import java.util.Scanner;

public class quest_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double raio;
        
        System.out.print("Raio: ");
        raio = sc.nextDouble();

        
        System.out.println("Per�metro: " + (2 * 3.14 * raio));
        System.out.println("�rea: " + (3.14 * (raio * raio)));
    }
}