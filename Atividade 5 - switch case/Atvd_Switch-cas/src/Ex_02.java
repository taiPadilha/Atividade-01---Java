import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int codProd, codPais;
	double kg, peso, precoTot = 0;
	
	System.out.print("Digite o código do produto comprado: ");
	codProd = sc.nextInt();
	
	System.out.print("O valor do peso do produto: ");
	kg = sc.nextDouble();
	
	System.out.print("E por último, o código do páis do produto: ");
	codPais = sc.nextInt();

	peso = kg * 1000;
	
	switch (codProd) {
    case 1:
        precoTot = peso * 10;
        break;

    case 2:
    	precoTot = peso * 10;
        break;

    case 3:
    	precoTot = peso  * 10;
        break;

    case 4:
    	precoTot = peso * 10;
        break;

    case 5:
    	precoTot = peso * 25;
        break;

    case 6:
    	precoTot = peso * 25;
        break;

    case 7:
    	precoTot = peso * 25;
        break;

    case 8:
    	precoTot = peso * 35;
        break;

    case 9:
    	precoTot = peso * 35;
        break;

    case 10:
    	precoTot = peso * 35;
        break;
        
    default:
    	System.out.print("Código inválido.");
    	break;
    }
    
    double imposto = 0;
    
    switch(codPais) {
    case 1:
        imposto = 0;
        break;
        
    case 2:
       imposto = (precoTot * 0.15) + precoTot;
        break;
        
    case 3:
        imposto = (precoTot * 0.25) + precoTot;
        break;
    }
    
    System.out.print("\nPeso do produto: " +peso+ "\nPreço total do produto: " +precoTot+ "\n Preço com imposto: " +imposto );

    sc.close();
	}
	
}