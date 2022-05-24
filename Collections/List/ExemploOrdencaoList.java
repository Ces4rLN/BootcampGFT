package JavaGFT.Collections.List;
/* Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo :
(nome - idade - cor);

Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdencaoList {
    public static void main(String[] args) {
        List<Gatos> meusGatos = new ArrayList<>(){{
            add(new Gatos("Jon", 18, "Preto"));
            add(new Gatos("Simba", 6, "Tigrado"));
            add(new Gatos("Jon", 12, "Amarelo"));
        }};
        System.out.println("--\tOrdem de Inserção\t--");
        System.out.println(meusGatos);

        System.out.println("--\tOrdem aleatória\t--");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Natural (Nome)\t--");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Idade\t--");
       // Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem cor\t--");
       // Collections.sort(meusGatos, new ComparatorIdade());
       meusGatos.sort(new ComparatorCor()); 
       System.out.println(meusGatos);

       System.out.println("--\tOrdem Nome/Cor/Idade\t--");
       meusGatos.sort(new ComparatorNomeCorIdade()); 
       System.out.println(meusGatos);

    }
}

class Gatos implements Comparable<Gatos>{

    private String nome;
    private Integer idade;
    private String cor;

    public Gatos(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }


    public Integer getIdade() {
        return idade;
    }

   
    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gatos [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
    }

        @Override
    public int compareTo(Gatos gatos) {
        // TODO Auto-generated method stub
        return this.getNome().compareToIgnoreCase(gatos.getNome());
    }
    
}

class ComparatorIdade implements Comparator<Gatos>{
    @Override
    public int compare(Gatos g1, Gatos g2){
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gatos>{
    @Override
    public int compare(Gatos g1, Gatos g2){
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gatos>{
    @Override
    public int compare(Gatos g1, Gatos g2){
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}