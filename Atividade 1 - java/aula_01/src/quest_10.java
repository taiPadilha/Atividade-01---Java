import java.util.Scanner;

public class quest_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		
		int num = sc.nextInt();
		System.out.println("Antecessor: " +(num -1));
		System.out.println("Sucessor: " +(num +1));

	}

}
