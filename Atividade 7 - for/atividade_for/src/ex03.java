

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double salarioTot = 0, pecasHom=0, pecasMul=0, salario, maiorSal = 0;
    int cod, quantiaPecas, codOpMaiorSal = 0, contadorHomem = 0, contadorMulher = 0, pecaTotal = 0;
    String genero;

    System.out.print("Digite o sal�rio m�nimo: ");
    double salarioMinimo = sc.nextDouble();

    System.out.print("\n");
    
    for (int i = 1; i <= 3; i++){
        System.out.print("Digite seu c�digo: ");
        cod = sc.nextInt();

        System.out.print("Digite a quantidade de pe�as que voc� fez: ");
        quantiaPecas = sc.nextInt();

        System.out.print("Digite seu g�nero: ");
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
        System.out.print("C�digo: " + cod);
        System.out.print("\nSal�rio: " + salario + "\n----------\n\n");
    }

    System.out.print("Total de sal�rios: " + salarioTot);
    System.out.print("\nTotal de pe�as produzidas: " + pecaTotal);
    System.out.print("\nM�dia de pe�as fabricadas por homens: " + (pecasHom / contadorHomem));
    System.out.print("\nM�dia de pe�as fabricada por mulheres: " + (pecasMul / contadorMulher));

    System.out.print("\n\nC�digo do oper�rio com maior sal�rio: " +codOpMaiorSal);
    
    sc.close();
}
}