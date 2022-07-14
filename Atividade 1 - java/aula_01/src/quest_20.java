import java.util.Scanner;

public class quest_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int dia, mes, ano;
        
        System.out.println("Insira seu tempo de vida atual: ");
        System.out.print("Dia: ");
        dia = sc.nextInt();
        System.out.print("Mês: ");
        mes = sc.nextInt();
        System.out.print("Ano: ");
        ano = sc.nextInt();
        
        System.out.println("Sua idade: " + ((ano * 365) + (mes * 30) + dia));
    }
}