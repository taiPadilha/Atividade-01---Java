import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hrInicio, minInicio, hrTermino, minTermino, duracaoHr, duracaoMin;
        
        System.out.print("Digite o hor�rio de in�cio do jogo: ");
        System.out.print("\nHora: ");
        hrInicio = sc.nextInt();
        
        System.out.print("O minuto: ");
        minInicio = sc.nextInt();
        
        System.out.print("\nDigite o hor�rio de t�rmino do jogo: ");
        System.out.print("\nHora: ");
        hrTermino = sc.nextInt();
        
        System.out.print("O minuto: ");
        minTermino = sc.nextInt();

        duracaoHr = hrTermino - hrInicio;
        
        duracaoMin = minTermino - minInicio;

        if(duracaoHr < 0){
        	duracaoHr = 24 + duracaoHr;
        }else if(duracaoMin < 0){
        	duracaoHr = duracaoHr - 1;
        	duracaoMin = 60 + duracaoMin;
        }

        System.out.print("\nA dura��o da partida foi de: " + duracaoHr + ":" + duracaoMin);

        sc.close();
    }
}
