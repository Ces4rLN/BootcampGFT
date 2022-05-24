package JavaGFT.EstruturaDeRepeticaoEArrays;

import java.util.Scanner;

public class NomeIdade {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        String nome;
        int   idade;

        

        while (true){
            System.out.println("Digite o nome: ");
            nome = leitor.next();

            if(nome.equals("0"))  break;

            System.out.println("Digite a idade: ");
            idade = leitor.nextInt();
        }

         System.out.println("Continua aqui...");

    }
}
