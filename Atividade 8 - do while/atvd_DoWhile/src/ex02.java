import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	 int contadorCidade = 0, cod, veiculos, acidentes, somaVeiculos = 0, veiculosMenos2000 = 0,
             cidadeMenos2000 = 0, maiorAcid = 0, menorAcid = 999999999, somaAcid = 0, codMenor = 0, codMaior = 0;

     do {
         System.out.print("Digite o código da cidade(1-5): ");
         cod = sc.nextInt();
         System.out.print("Digite o números de veiculos de passeio: ");
         veiculos = sc.nextInt();
         System.out.print("Digite o número de acidentes envolvendo vítimas: ");
         acidentes = sc.nextInt();
         System.out.println("-------------\n");

         if (veiculos < 2000) {
             cidadeMenos2000++;
             veiculosMenos2000 += acidentes;
         }
         if (acidentes < menorAcid) {
             codMenor = cod;
             menorAcid = acidentes;
         }
         if (acidentes > maiorAcid) {
             codMaior = cod;
             maiorAcid = acidentes;
         }
         somaAcid += acidentes;
         somaVeiculos += veiculos;
         contadorCidade++;
     } while (contadorCidade <= 4);

     System.out.print("Codigo cidade: " +codMaior);
     System.out.print("\nMaior indice de acidente: " + (maiorAcid * 100)/somaAcid);
     System.out.print("\nCodigo cidade: " +codMenor);
     System.out.print("\nMenor indice de acidente: " + (menorAcid * 100)/somaAcid);
     System.out.print("\nMédia de veiculos das cidades: " +(somaVeiculos / 5));
     System.out.print("\nMédia de acidentes de transito com cidades com menos de 2000 veiculos: " +(veiculosMenos2000 / cidadeMenos2000));
 }
}