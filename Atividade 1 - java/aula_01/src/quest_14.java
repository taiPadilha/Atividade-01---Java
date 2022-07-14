import java.util.Scanner;

public class quest_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        
        System.out.print("Num 1: ");
        num1 = sc.nextInt();
        
        System.out.println("Terça parte de " + num1  + " é " + (num1 / 3));
    }
}