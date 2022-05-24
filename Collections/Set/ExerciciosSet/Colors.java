package JavaGFT.Collections.Set.ExerciciosSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.plaf.synth.SynthSeparatorUI;

/*
[V] Crie uma conjunto contendo as cores do arco-íris e:
[V] a) Exiba todas as cores o arco-íris uma abaixo da outra;
[V] b) A quantidade de cores que o arco-íris tem;
[V] c) Exiba as cores em ordem alfabética;
[V] d) Exiba as cores na ordem inversa da que foi informada;
[V] e) Exiba todas as cores que começam com a letra ”v”;
[V] f) Remova todas as cores que não começam com a letra “v”;
[V] g) Limpe o conjunto;
[V] h) Confira se o conjunto está vazio;
 */

public class Colors {
   public static void main(String[] args) {
       System.out.println("_____________CORES DO ARCO-ÍRIS_____________");
       Set<String> cores = new HashSet<>();
       cores.add("Azul");
       cores.add("Verde");
       cores.add("Rosa");
       cores.add("Amarelo");
       cores.add("Vermelho");
       cores.add("Violeta");
       cores.add("Laranja");

       System.out.println(cores);
       System.out.println("");

       System.out.println("--\tExiba todas as cores o arco-íris uma abaixo da outra\t--");
        for (String cor : cores) {
            System.out.println(cor);
        }

        System.out.println("");
        System.out.println("--\tA quantidade de cores que o arco-íris tem\t--");
        System.out.println(cores.size());

        System.out.println("");
        System.out.println("--\tExiba as cores em ordem alfabética\t--");
        Set<String> cores2 = new TreeSet<>(cores);
        System.out.println(cores2);
        for (String cor : cores2) {
            System.out.println(cor);
        }

        System.out.println("");
        // peguei fila nessa heheheeh :) [OBS: Não mostrou o Collections.reverse]
        System.out.println("--\tExiba as cores na ordem inversa da que foi informada\t--");
        Set<String> cores3 = new LinkedHashSet<>(
            Arrays.asList("Azul ", "Verde ", "Rosa ", "Amarelo ", "Vermelho ", "Violeta ", "Laranja"));
        System.out.println(cores3);
        List<String> coresList = new ArrayList<>(cores3);
        Collections.reverse(coresList);
        System.out.println(coresList);

        // peguei fila nessa hehehe :) [OBS: Não mostrou o startsWith()]
        System.out.println("");
        System.out.println("--\tExiba todas as cores que começam com a letra - V - :\t--");
        for (String cor: cores) {
            if(cor.startsWith("V")) System.out.println(cor);
        }

        System.out.println("");
        System.out.println("--Remova todas as cores que não começam com a letra - V - : ");
        Iterator<String> iterator = cores.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            if(next.startsWith("V")) iterator.remove();
        }
        System.out.println(cores);

        System.out.println("");
        System.out.println("--\tLimpe o conjunto\t--");
        cores.clear();

        System.out.println("");
        System.out.println("--\tConfira se o conjunto está vazio: " + cores.isEmpty());
   } 
}
