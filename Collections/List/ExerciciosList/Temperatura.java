package JavaGFT.Collections.List.ExerciciosList;
/* 
Faça um programa que receba1 a temperatura média dos 6
primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e
mostre todas as temperaturas acima desta média, e em que
mês elas ocorreram (mostrar o mês por extenso: 1- Janeiro, 
2- Fevereiro e etc).
*/

import java.util.Scanner;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperatura = new ArrayList<Double>();

        int count = 0;
        while(true) {
            if(count == 6) break;
            
                System.out.print("Digite a temperatura: ");
                Double temp = scan.nextDouble();
                count++;
                temperatura.add(temp);
            } 

            Iterator<Double> iterator = temperatura.iterator();
            Double soma = 0d;
            while (iterator.hasNext()) {
                 Double next = iterator.next();
                 soma += next;
            }
            Double media = soma/temperatura.size();
            System.out.println("A média semestral das temperaturas é: " + media);

            System.out.println("\n\nMeses das temperaturas acima da média: ");
                for(Double temp : temperatura){
                    if(temp > media){
                        int index = temperatura.indexOf(temp);
                    switch (index) {
                        case (0):
                            System.out.println("1- Janeiro a temperatura estava acima da média " + temp);
                            break;

                        case (1):
                            System.out.println("2- Fevereiro a temperatura estava acima da média " + temp);
                            break;

                        case (2):
                            System.out.println("3- Março a temperatura estava acima da média " + temp);
                                break;
                        
                        case (3):
                            System.out.println("4- Abril a temperatura estava acima da média " + temp);
                            break;

                        case (4):
                            System.out.println("5- Maio a temperatura estava acima da média " + temp);
                            break;
                        
                        case (5):
                            System.out.println("6- Junho a temperatura estava acima da média " + temp);
                        break;

                        default:
                            System.out.println("Nenhum mês relatado teve temperatura acima da média");
                            
                    }
                
                }
                
                count++;
            }

        }
    }
