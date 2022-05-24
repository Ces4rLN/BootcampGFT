package JavaGFT.EstruturaDeRepeticaoEArrays;
import java.util.Scanner;

public class ParEimpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;       int count = 0;
        int    par = 0;
        int  impar = 0;

        while (count < 5){

            System.out.println("Entre com o número: ");
            numero = scan.nextInt();

            if(numero % 2 == 0){
                par++;
            } else if(numero % 2 != 0){
                impar++;
            }
            count++;
            
        }

        System.out.println("A quantidade de números PAR é: " + par);
        System.out.println("A quantidade de números IMPAR é: " + impar);


    }

}
