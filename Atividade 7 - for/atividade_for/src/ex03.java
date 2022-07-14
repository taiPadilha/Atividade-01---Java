

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double salarioTot = 0, pecasHom=0, pecasMul=0, salario, maiorSal = 0;
    int cod, quantiaPecas, codOpMaiorSal = 0, contadorHomem = 0, contadorMulher = 0, pecaTotal = 0;
    String genero;

    System.out.print("Digite o salário mínimo: ");
    double salarioMinimo = sc.nextDouble();

    System.out.print("\n");
    
    for (int i = 1; i <= 3; i++){
        System.out.print("Digite seu código: ");
        cod = sc.nextInt();

        System.out.print("Digite a quantidade de peças que você fez: ");
        quantiaPecas = sc.nextInt();

        System.out.print("Digite seu gênero: ");
        genero = sc.next();

        if(quantiaPecas <= 30){
            salario = salarioMinimo;
        } else if(quantiaPecas <= 50){
            salario = salarioMinimo + ((salarioMinimo * 0.03) * (quantiaPecas-30));
        } else {
            salario = salarioMinimo + ((salarioMinimo * 0.05) * (quantiaPecas-30));
        }

        if(i == 1){
            maiorSal = salario;
            codOpMaiorSal = cod;
        } else {
            if(salario > maiorSal){
                maiorSal = salario;
                codOpMaiorSal = cod;
            }
        }

        if(genero.equals("homem")){
            contadorHomem++;
            pecasHom += quantiaPecas;
        } else {
            contadorMulher++;
            pecasMul += quantiaPecas;
        }

        salarioTot += salario;
        pecaTotal += quantiaPecas;

        System.out.print("------------\n");
        System.out.print("Código: " + cod);
        System.out.print("\nSalário: " + salario + "\n----------\n\n");
    }

    System.out.print("Total de salários: " + salarioTot);
    System.out.print("\nTotal de peças produzidas: " + pecaTotal);
    System.out.print("\nMédia de peças fabricadas por homens: " + (pecasHom / contadorHomem));
    System.out.print("\nMédia de peças fabricada por mulheres: " + (pecasMul / contadorMulher));

    System.out.print("\n\nCódigo do operário com maior salário: " +codOpMaiorSal);
    
    sc.close();
}
}