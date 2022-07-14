import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 1;
        int todosNumeros = 0;
        int contador = 0;
        int maior = 0;
        int menor = 30000;
        int numerosPares = 0;
        int contadorNumerosPares = 0;
        int contadorNumeroImpares = 0;

        while (numero != 30000) {
            System.out.print("Informe um número: ");
            numero = sc.nextInt();

            if (numero == 30000) {
                break;
            }

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }

            if (numero % 2 == 0) {
                numerosPares += numero;

                contadorNumerosPares++;
            } else {
                contadorNumeroImpares++;
            }

            todosNumeros += numero;

            contador++;
        }

        System.out.print("\nSoma dos números: " + todosNumeros
                + "\nQuantidade de números digitados: " + contador
                + "\nMaior número: " + maior
                + "\nMenor número: " + menor
                + "\nMédia dos número pares: " + (numerosPares / contadorNumerosPares)
                + "\nPorcentagem de números ímpares: " + ((contadorNumeroImpares * 100) / contador) + "%");

        sc.close();
    }
}