import java.util.Scanner;

public class ex_07 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int num1;
	
	System.out.print("\nDigite a tabuada que deseja ver: ");
	 num1 = sc.nextInt();
	
	for (int i = 1; i <= 10; i++) {
		
		System.out.println(i +  "x" + num1 + "=" + (i * num1));
	}
	
	sc.close();
	}

}
