package JavaGFT.Collections.Set.ExerciciosSet;// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class desafio {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numTotal = scan.nextInt();
    int numFigCompradas = scan.nextInt();
    int[] setFig = new int [150];
//TODO: Complete os espaços em branco com uma solução possível para o problema
    for (int i = 1 ; i <= numTotal ; i++) {
        setFig[i] = 0;
    }
    
    for( int i = 0 ; i < numFigCompradas ; i++){
      int possuiFig =scan.nextInt();
      setFig[possuiFig] = 1;
    }
    int resposta = 0;
    for(int i = 1 ; i <= numTotal ; i++){
      if(setFig[i] == 0){
        resposta++;
      }
    }
    System.out.println(resposta);
  }
}

