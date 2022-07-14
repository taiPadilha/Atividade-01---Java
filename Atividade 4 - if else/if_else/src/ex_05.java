import java.util.Scanner;

public class ex_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double aumento, novoSalario, salario;
        int cod;
        
        aumento = 0;
        novoSalario = 0;
        String cargo = "";

        System.out.print("Código --- Cargo"
        		+ "\n1 - Escrituário"
        		+ "\n2 - Secretário"
        		+ "\n3 - Caixa"
        		+ "\n4 - Gerente"
        		+ "\n5 - Diretor"
        		+ "\nInsira o código do seu cargo: ");
        cod = sc.nextInt();
        System.out.print("Digite seu salário atual: ");
        salario = sc.nextDouble();


        if(cod == 1){
            cargo = "Escriturário";
            novoSalario = salario * 1.5;
            aumento = novoSalario - salario;
        } else if(cod == 2){
            cargo = "Secretério";
            novoSalario = salario * 1.35;
            aumento = novoSalario - salario;
        } else if(cod == 3){
            cargo = "Caixa";
            novoSalario = salario * 1.2;
            aumento = novoSalario - salario;
        } else if(cod == 4){
            cargo = "Gerente";
            novoSalario = salario * 1.1;
            aumento = novoSalario - salario;
        } else if(cod == 5){
            cargo = "Diretor";
            System.out.print("\nOs diretores não possuem aumento.");
        }

        System.out.print("\nCargo: " + cargo + "\nAumento: " + aumento + "\nNovo salário: " + novoSalario);

        sc.close();
    }
}
