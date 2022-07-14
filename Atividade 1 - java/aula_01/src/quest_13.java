import java.util.Scanner;

public class quest_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.print("Num 1: ");
        num1 = sc.nextInt();
        System.out.println("x");
        System.out.print("Num 2: ");
        num2 = sc.nextInt();
        
        System.out.println("Valor do produto: " + (num1 * num2));
    }
}