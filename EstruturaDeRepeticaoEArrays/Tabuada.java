package JavaGFT.EstruturaDeRepeticaoEArrays;
import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada;
        System.out.println("------TABUADA------");
        tabuada = scan.nextInt();
        System.out.println("|-----------------|");

        System.out.println("[TABUADA DE "  + tabuada);

        for(int i = 0 ; i <= 10 ; i++ ){
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }
        
    }
    
}
