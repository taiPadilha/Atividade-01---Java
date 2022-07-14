import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Digite um número para calcularmos a tabuada dele: ");
	int num= sc.nextInt();
	
	for (int tabuada = 0; tabuada < 10; tabuada++){
		System.out.println(num+ " x " +(tabuada + 1)+ " = " +(num * (tabuada + 1)));
        }
	
	sc.close();

	}

	}

