import java.util.Scanner;

public class quest_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        
        System.out.print("Num 1: ");
        num1 = sc.nextInt();
        
        System.out.println("Ter�a parte de " + num1  + " � " + (num1 / 3));
    }
}