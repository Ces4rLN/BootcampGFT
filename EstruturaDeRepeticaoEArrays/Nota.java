package JavaGFT.EstruturaDeRepeticaoEArrays;
import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double nota;

        System.out.println("Informe a nota: ");
        nota = leitor.nextInt();

        while(nota < 0 || nota > 10){
            
        System.out.println("Informe um nota valida: ");
        nota = leitor.nextInt();

        }
    }
    
}
