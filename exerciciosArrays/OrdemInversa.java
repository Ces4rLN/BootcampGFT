package JavaGFT.exerciciosArrays;

public class OrdemInversa {
    public static void main(String[] args) {
        
        int [] vetor = {20, -1, 8, 9, 100, 4};

        System.out.println("----VETOR:----");

        int count = 0;
        while(count < (vetor.length)){ //.length = retorna o tamnho do array
            System.out.println(vetor[count] + "");
            count++;
            
        }
        
        System.out.println("--ORDEM INVERSA:--");

        for(int i = (vetor.length - 1) ; i >= 0; i--){
            System.out.println(vetor[i] + "");
        }

        System.out.println("|------------|");

    }
}
