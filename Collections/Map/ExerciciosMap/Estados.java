package JavaGFT.Collections.Map.ExerciciosMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;



/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265

 [V]- Crie um dicionário que relacione os estados e suas respectivas populações
 [V]- Substitua a população do estado RN por : 3.534.165
 [V]- Confira se o estado da Paraíba (PB) está no dicionário, caso não, adicione 
 [V]- Exiba a população do estado PE
 [V]- Exiba todos os estados e suas populaçãos na ordem em que foram informados
 [V]- Exiba todos os estados e suas populações na ordem alfabética
 [V]- Exiba o estado com o menor população e seu respectivo valor 
 [V]- Exiba a soma da população desses estados
 [V]- Exiba a média da população deste dicionário de estados
 [V]- Remova os estados com a população menor que 4.000.000
 [V]- Apague o dicionario de estados com suas respectivas populações estimadas
 []- Confira se a lista está vazia: 
 */

public class Estados {
    public static void main(String[] args) {
        System.out.println("--\tCrie um dicionário que relacione os estados e suas respectivas populações\t--");
        Map<String, Double> estadosNE = new HashMap<>();
        estadosNE.put("PE", 9616621d);
        estadosNE.put("AL", 3351543d);
        estadosNE.put("CE", 9187103d);
        estadosNE.put("RN", 3534265d);
    
    System.out.println(estadosNE);

    System.out.println("");
    System.out.println("--\tSubstitua a população do estado RN por : 3.534.165\t--");
    estadosNE.put("RN", 3534165d);
    System.out.println(estadosNE);

    System.out.println("");
    System.out.println("--\tConfira se o estado da Paraíba (PB) está no dicionário, caso não, adicione: " + estadosNE.containsKey("PB"));
    estadosNE.put("PB",  403927d);

    System.out.println("");
    System.out.println("--\tExiba a população do estado PE\t--");
    System.out.println("População de PE: " + estadosNE.get("PE"));

    System.out.println("");
    System.out.println("--\tExiba todos os estados e suas populaçãos na ordem em que foram informados\t--");
    Map<String, Double> estadosNE2 = new LinkedHashMap<>(){{
        put("PE", 9616621d);
        put("AL", 3351543d);
        put("CE", 9187103d);
        put("RN", 3534165d);
        put("PB",  403927d);
    }};
    System.out.println(estadosNE2);

    System.out.println("");
    System.out.println("--\tExiba todos os estados e suas populações na ordem alfabética\t--");
    Map<String, Double> estadosNE3 = new TreeMap<>(estadosNE);
        System.out.println(estadosNE3);
    

        System.out.println("");
        System.out.println("--\tExiba o estado com o menor população e seu respectivo valor\t--" );
        Double menorPoupulacao = Collections.min(estadosNE3.values());
        String estadoMenorPopu = "";
        for (Map.Entry<String,Double> entry : estadosNE3.entrySet()) {
            if(entry.getValue().equals(menorPoupulacao)) 
            estadoMenorPopu = entry.getKey();
        }

        System.out.println(estadoMenorPopu + " - " + menorPoupulacao);

        System.out.println("");
        System.out.println("--\tExiba a soma da população desses estados\t--");
        Iterator<Double> iterator = estadosNE3.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("");
        System.out.println("--\tExiba a média da população deste dicionário de estados\t--");
        System.out.println(soma/estadosNE3.size());

        System.out.println("");
        System.out.println("--\tRemova os estados com a população menor que 4.000.000\t--");
        Iterator<Double> iterator2 = estadosNE3.values().iterator();
        while(iterator2.hasNext()){
            if(iterator2.next() <= 4000000){
                iterator2.remove();
            }
        }
        System.out.println(estadosNE3);

        System.out.println("");
        System.out.println("--\tApague o dicionario de estados com suas respectivas populações estimadas\t--");
        estadosNE3.clear();

        System.out.println("");
        System.out.println("--\tConfira se a lista está vazia:  " + estadosNE3.isEmpty());
    }
     
    

}
  