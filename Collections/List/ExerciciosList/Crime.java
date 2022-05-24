package JavaGFT.Collections.List.ExerciciosList;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Crime {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> perguntas = new ArrayList();
        
        String resposta;
        

        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");

        System.out.println("-----\tPERGUNTAS:\t-----");
        System.out.println(perguntas.get(0));
        resposta = scan.nextLine();
        System.out.println(perguntas.get(1));
        resposta = scan.nextLine();
        System.out.println(perguntas.get(2));
        resposta = scan.nextLine();
        System.out.println(perguntas.get(3));
        resposta = scan.nextLine();
        System.out.println(perguntas.get(4));
        resposta = scan.nextLine();
        
        int count = 0;
        while(true){
            if(resposta == "sim"){
                count++;
            }
            switch(count){
            case 2:
                System.out.println("!!! SUSPEITO !!!");
                break;

            case 3:
            case 4:
                System.out.println("!!! CÚMPLICE !!!");
                break;
            case 5:
                System.out.println("!!! ASSASSINO !!!");
                break;
            default:
                System.out.println("!!! INOCENTE !!!");
                break;
        }
        break;
    }

        
       

    }
}
