import java.util.Scanner;

public class ex_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double aumento, novoSalario, salario;
        int cod;
        
        aumento = 0;
        novoSalario = 0;
        String cargo = "";

        System.out.print("C�digo --- Cargo"
        		+ "\n1 - Escritu�rio"
        		+ "\n2 - Secret�rio"
        		+ "\n3 - Caixa"
        		+ "\n4 - Gerente"
        		+ "\n5 - Diretor"
        		+ "\nInsira o c�digo do seu cargo: ");
        cod = sc.nextInt();
        System.out.print("Digite seu sal�rio atual: ");
        salario = sc.nextDouble();


        if(cod == 1){
            cargo = "Escritur�rio";
            novoSalario = salario * 1.5;
            aumento = novoSalario - salario;
        } else if(cod == 2){
            cargo = "Secret�rio";
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
            System.out.print("\nOs diretores n�o possuem aumento.");
        }

        System.out.print("\nCargo: " + cargo + "\nAumento: " + aumento + "\nNovo sal�rio: " + novoSalario);

        sc.close();
    }
}
