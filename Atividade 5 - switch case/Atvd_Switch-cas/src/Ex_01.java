import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int cod;
	double sal, salAtual, aumento;
	
		System.out.print("1 - Escritu�rio"
				+"\n2 - Secret�rio"
				+"\n3 - Caixa"
				+"\n4 - Gerente"
				+"\n5 - Diretor"
				+ "\nDigite o c�digo correspondente ao seu cargo:");
		cod = sc.nextInt();
	
		System.out.print("Agora digite o valor do seu sal�rio: ");
		sal = sc.nextDouble();
		
	switch(cod) {
	 case 1:
		 aumento = sal * 0.5;
		 salAtual = sal + aumento;
		 System.out.println("Voc� � escritu�rio e teve um aumento de 50% e seu sal�rio atual � de: R$" +salAtual);
		 break;
	
	 case 2:
		 aumento = sal * 0.35;
		 salAtual = sal + aumento;
		 System.out.println("Voc� � secret�rio e teve um aumento de 35% e seu sal�rio atual � de: R$" +salAtual);
		 break;
		 
	 case 3:
		 aumento = sal * 0.2;
		 salAtual = sal + aumento;
		 System.out.println("Voc� trabalha no caixa e teve um aumento de 20% e seu sal�rio atual � de: R$" +salAtual);
		 break;
		 
	 case 4:
		 aumento = sal * 0.1;
		 salAtual = sal + aumento;
		 System.out.println("Voc� teve um aumento de 10% e seu sal�rio atual � de: R$" +salAtual);
		 break;
		 
	 case 5:
		 System.out.println("Voc� n�o teve um aumento. Seu sal�rio continua R$ " +sal);
		 break;
	}
	sc.close();
	}

}
