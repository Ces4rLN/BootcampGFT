package JavaGFT.Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ExemploList {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.5);
        notas.add(7.5);
        notas.add(8.0);
        notas.add(9.0);
        notas.add(10.0);
        System.out.println(notas);
// podemos imprimir tbm desta forma ->       System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 8.5: " + notas.lastIndexOf(8.5d));
    
        System.out.println("Adicione na lista a nota 6.9 na posição 4: ");
        notas.add(4,  6.9d);
        System.out.println(notas);

        System.out.println("Substitua a nota 9.5 pela nota 9.8: ");
        notas.set(notas.indexOf(9.5d), 9.8d);
        System.out.println(notas);

        System.out.println("Confira se a nota 10.0 está na lista: " + notas.contains(10.0d));

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota); 

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas);

        //  NÃO EXISTE UM MÉTODO ESPECÍFICO, MAS PODEMOS USAR:

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        // |SOMA:|
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

     //#############################################################################

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 6.9 ");
        notas.remove(6.9d);
        System.out.println(notas);

        System.out.println("Remova nota na posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 8.5 e exiba a lista: ");
        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()){
           Double next =  iterator2.next();
           if(next < 8.5) iterator2.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista ");
        notas.clear();
        System.out.println(notas);
        System.out.println("Confira se alista está vazia: " + notas.isEmpty());
    }

}
