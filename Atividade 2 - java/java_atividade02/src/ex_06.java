import java.util.Scanner;

public class ex_06 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	double salarioMin, salarioMax;
	int quantia;
	
	System.out.print("Digite o valor do sal�rio m�nimo: R$");
	 salarioMin = sc.nextDouble();
	
	System.out.print("\nDigite o valor do seu sal�rio: R$");
	 salarioMax = sc.nextDouble();
	
	 quantia = (int) (salarioMax / salarioMin);
	
	 System.out.printf("\nA quantidade de sal�rios m�n. que voc� ganha � de: " +quantia);
	
	sc.close();
	}

}
