package JavaGFT.Debugging;

import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Augusto", "Vitor" , "Bruno", "Kauã"};

        int media = calculaMediaDaTurma(alunos, scan);

        System.out.printf("Media da turma:  %.1f", media);
    }

    public static int calculaMediaDaTurma(String[] alunos, Scanner scanner){

        int soma = 0;
        for(String aluno : alunos){
            System.out.printf("Nota do aluno:  %s ", aluno);
            int nota = scanner.nextInt();
            soma += nota;
        }

        return soma / alunos.length;
    }
}
