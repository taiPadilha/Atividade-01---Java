import java.util.Scanner;

public class quest_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double media1, media2, somaMedias, mediaMedias;
        
        media1 = (8+9+7)/3;
        media2 = (4+5+6)/3;
        somaMedias = media1 + media2;
        mediaMedias = (media1 + media2) / 2;
        
        System.out.println("M�dia 1: " + media1);
        System.out.println("M�dia 2: " + media2);
        System.out.println("Soma das m�dias: " + somaMedias);
        System.out.println("M�dia das medias: " + mediaMedias);
    }
}