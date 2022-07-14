import java.util.Scanner;

public class ex_11 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int hora, minutos, hrConvertida, minTotais, segTotais;
	
	System.out.print("Digite uma hora: ");
	hora = sc.nextInt();
	
	System.out.print("\nDigite os minutos: ");
	minutos = sc.nextInt();
	
	hrConvertida = (hora * 60);
	minTotais = ((hora * 60) + minutos);
	segTotais = (((hora * 60) + minutos ) * 60);
	
	System.out.printf("\nA hora digitada convertida em minutos: %d\nO total de minutos: %d\nO total de segundos: %d", hrConvertida, minTotais, segTotais);
	
	sc.close();
	}

}
