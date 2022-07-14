import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int dia1, mes1, ano1, numDias1, dia2, mes2, ano2, numDias2;
        
        System.out.println("Digite a primeira data: ");
        System.out.print("O dia: ");
        dia1 = sc.nextInt();
        
        System.out.print("O mês: ");
        mes1 = sc.nextInt();
        
        System.out.print("O ano: ");
        ano1 = sc.nextInt();
        
        numDias1 = (ano1 * 365) + (mes1 * 30) + dia1;

        System.out.println("Digite a segunda data: ");
        System.out.print("O dia: ");
        dia2 = sc.nextInt();
        
        System.out.print("O mês: ");
        mes2 = sc.nextInt();
        
        System.out.print("O ano: ");
        ano2 = sc.nextInt();
        
        numDias2 = (ano2 * 365) + (mes2 * 30) + dia2;

        if(numDias1 < numDias2){
            System.out.print("\nA primeira data vem antes");
        } else if(numDias2 < numDias1){
            System.out.print("\nA segunda data vem antes");
        } else {
            System.out.print("\nAs duas datas são iguais");
        }
        
        sc.close();
    }
}