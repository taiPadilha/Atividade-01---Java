import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quiloWatts = 1, consumidores = 0;
        double valorPagar = 0, total = 0;

        while (quiloWatts != 0) {
            System.out.print("Qual o valor do seu salário mínimo?\nR$ ");
            double salario = sc.nextDouble();

            System.out.print("Quantos QuiloWatts gastou?\nR: ");
            quiloWatts = sc.nextInt();

            if (quiloWatts == 0) {
                break;
            }
            ;

            System.out.print("Escolha seu tipo de consumidor:" + "\n1 - Residencial" + "\n2 - Comercial"
                    + "\n3 - Industrial" + "\nR: ");
            int tipoConsumidor = sc.nextInt();

            System.out.print("\nValor do QuiloWatt: R$" + (salario / 8));

            switch (tipoConsumidor) {
            case 1:
                valorPagar = (((salario / 8) * quiloWatts) + ((salario / 8) * quiloWatts) * 0.05);
                System.out.print("\nAcréscimo: 5% \nValor a ser pago: R$" + valorPagar + "\n\n");
                break;

            case 2:
                valorPagar = (((salario / 8) * quiloWatts) + ((salario / 8) * quiloWatts) * 0.10);
                System.out.print("\nAcréscimo: 10% \nValor a ser pago: R$" + valorPagar + "\n\n");
                break;

            case 3:
                valorPagar = (((salario / 8) * quiloWatts) + ((salario / 8) * quiloWatts) * 0.15);
                System.out.print("\nAcréscimo: 15% \nValor a ser pago: R$" + valorPagar + "\n\n");
                break;
            }

            if (valorPagar >= 500 && valorPagar <= 1000) {
                consumidores++;
            }

            total += valorPagar;
        }

        System.out.print("\nFaturamento geral da empresa: " + total
                + "\nQuantidade de consumidres que gastam de R$ 500,00 à R$ 1000,00: " + consumidores);

        sc.close();
    }
}
