import java.util.Scanner;

public class ex_14 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
    
    double racaoKg, racaoGato, racaoRestante;
    
    System.out.print("Quantidade da ração comprada em Kg: ");
     racaoKg = sc.nextDouble();
    
    System.out.print("Quantidade da ração fornecida aos gatos em gramas: ");
     racaoGato = sc.nextDouble();
    
     racaoRestante = racaoKg - ((racaoGato / 1000) * 5);
    
    System.out.println("Ração restante no pacote: " + racaoRestante + "Kg");
    
    sc.close();
	}

}
