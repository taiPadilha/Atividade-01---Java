import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int cod;
	double sal, salAtual, aumento;
	
		System.out.print("1 - Escrituário"
				+"\n2 - Secretário"
				+"\n3 - Caixa"
				+"\n4 - Gerente"
				+"\n5 - Diretor"
				+ "\nDigite o código correspondente ao seu cargo:");
		cod = sc.nextInt();
	
		System.out.print("Agora digite o valor do seu salário: ");
		sal = sc.nextDouble();
		
	switch(cod) {
	 case 1:
		 aumento = sal * 0.5;
		 salAtual = sal + aumento;
		 System.out.println("Você é escrituário e teve um aumento de 50% e seu salário atual é de: R$" +salAtual);
		 break;
	
	 case 2:
		 aumento = sal * 0.35;
		 salAtual = sal + aumento;
		 System.out.println("Você é secretário e teve um aumento de 35% e seu salário atual é de: R$" +salAtual);
		 break;
		 
	 case 3:
		 aumento = sal * 0.2;
		 salAtual = sal + aumento;
		 System.out.println("Você trabalha no caixa e teve um aumento de 20% e seu salário atual é de: R$" +salAtual);
		 break;
		 
	 case 4:
		 aumento = sal * 0.1;
		 salAtual = sal + aumento;
		 System.out.println("Você teve um aumento de 10% e seu salário atual é de: R$" +salAtual);
		 break;
		 
	 case 5:
		 System.out.println("Você não teve um aumento. Seu salário continua R$ " +sal);
		 break;
	}
	sc.close();
	}

}
