import java.util.Scanner;

public class ex_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        double custo, ingresso, alcance;

        System.out.println("Digite o valor do custo do espetáculo: ");
        custo = sc.nextDouble();

        System.out.println("Digite o valor do ingresso: ");
        ingresso = sc.nextDouble();

        alcance = custo / ingresso;
        System.out.printf("Quantidade de ingressos vendidos para que o custo seja alcançado: %.2f", alcance);

sc.close();	
	}

}
