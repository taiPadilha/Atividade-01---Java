import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hora, minutos, DD, MM, AA, horaEmMin;

		System.out.print("Digite a hora atual: ");
		hora = sc.nextInt();

		System.out.print("Digite o minuto:");
		minutos = sc.nextInt();

		System.out.print("Digite o dia de hoje: ");
		DD = sc.nextInt();

		System.out.print("Digite, em numeral, o m�s de atual: ");
		MM = sc.nextInt();

		System.out.print("Digite o ano de atual: ");
		AA = sc.nextInt();

		horaEmMin = (hora * 60) + minutos;

		if (MM == 1) {
			System.out.print("A data �: " + DD + "/Janeiro/" + AA + " e a hora em minutos �: " + horaEmMin);
		} else if (MM == 2) {
			System.out.print("A data �: " + DD + "/Fevereiro/" + AA + " e a hora em minutos �: " + horaEmMin);
		} else if (MM == 3) {
			System.out.print("A data �: " + DD + "/Mar�o/" + AA + " e a hora em minutos �: " + horaEmMin);
		} else if (MM == 4) {
			System.out.print("A data �: " + DD + "/Abril/" + AA + " e a hora em minutos �: " + horaEmMin);
		} else if (MM == 5) {
			System.out.print("A data �: " + DD + "/Mar�o/" + AA + " e a hora em minutos �: " + horaEmMin);
		} else if (MM == 6) {
			System.out.println("A data �: " + DD + "/Junho/" + AA + " e a hora em minutos �: " + horaEmMin);
		} else if (MM == 7) {
			System.out.println("A data �: " + DD + "/Julho/" + AA + " e a hora em minutos �: " + horaEmMin);
		} else if (MM == 8) {
			System.out.println("A data �: " + DD + "/Agosto/" + AA + " e a hora em minutos �: " + horaEmMin);
		} else if (MM == 9) {
			System.out.println("A data �: " + DD + "/Setembro/" + AA + " e a hora em minutos �: " + horaEmMin);
		} else if (MM == 10) {
			System.out.println("A data �: " + DD + "/Outubro/" + AA + " e a hora em minutos �: " + horaEmMin);
		} else if (MM == 11) {
			System.out.println("A data �: " + DD + "/Novembro/" + AA + " e a hora em minutos �: " + horaEmMin);
		} else if (MM == 12) {
			System.out.println("A data �: " + DD + "/Dezembro/" + AA + " e a hora em minutos �: " + horaEmMin);
		}
	}
}