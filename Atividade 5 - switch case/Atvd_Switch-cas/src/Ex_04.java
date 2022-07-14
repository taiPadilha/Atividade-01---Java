import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

    double valorProd = 5000, valorFinal = 0, valorParcela = 0, diferenca;
    int opcaoPag = sc.nextInt();
    
    System.out.print("Opções de pagamento:"
            + "\n1 - Pagamento à vista - 15% de desconto sobre o valor total da compra"
            + "\n2 - Pagamento com cheque pré-datado para 30 dias - 10% de desconto sobre o valor total da compra"
            + "\n3 - Pagamento parcelado em 6 vezes - não tem desconto"
            + "\n4 - Pagamento parcelado em 12 vezes - 8% de acréscimo sobre o valor da compra"
            + "\nDigite a opção desejada: ");

    switch (opcaoPag) {
    case 1:
        valorFinal = valorProd - (valorProd * 0.15);
        break;

    case 2:
        valorFinal = valorProd - (valorProd * 0.1);
        break;

    case 3:
        valorFinal = valorProd;
        valorParcela = valorFinal / 6;
        System.out.print("\nQuantidade de parcelas: 6");
        System.out.print("\nValor das parcelas: " + valorParcela);
        break;

    case 4:
        valorFinal = valorProd + (valorProd * 0.08);
        valorParcela = valorFinal / 12;
        System.out.print("\nQuantidade de parcelas: 12");
        System.out.print("\nValor das parcelas: " + valorParcela);
        break;
    }

    diferenca = valorFinal - valorProd;

    System.out.print("\nValor da compra: " + valorProd + "\nValor final: " + valorFinal);

    if (diferenca > 0) {
        System.out.print("\nJuros: " + diferenca);
    } else {
        System.out.print("\nDesconto: " + diferenca);
    }

    sc.close();
	}

}
