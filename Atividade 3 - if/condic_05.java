import java.util.Scanner;

public class condic_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double prim, seg, terc, quart;
		
		System.out.print("Digite o primeiro n�mero: ");
		prim = sc.nextDouble();
		
		System.out.print("Digite o segundo n�mero: ");
		seg = sc.nextDouble();
		
		System.out.print("Digite o terceiro n�mero: ");
		terc = sc.nextDouble();
		
		System.out.print("Digite o quarto n�mero: ");
		quart = sc.nextDouble();
		
		if (quart > terc) {
			System.out.println(quart + "\n" + terc + "\n" + seg + "\n" + prim );
		}
		
		if (quart > seg && quart < terc) {
			System.out.println(terc + "\n" + quart + "\n" + seg + "\n" + prim);
		}
		if ( quart > prim && quart < seg) {
			System.out.println(terc + "\n" + seg + "\n" + quart + "\n" + prim);
		}
		if (quart < prim ) {
			System.out.println(terc + "\n" + seg + "\n" + prim + "\n" + quart);
		}
		
	}

}
