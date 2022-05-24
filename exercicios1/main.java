package JavaGFT.exercicios1;

public class main {
    
    public static void main(String[] args){

        //CALCULADORA:
        System.out.println("Exercício CALCULADORA");  
        Calculadora.soma(10,37);
        Calculadora.subtraçao(125,156); 
        Calculadora.multiplicaçao(25, 5);
        Calculadora.divisao(50,5);
// ---------------------------------------------------------------
        System.out.println("###############################");
// ---------------------------------------------------------------

        //MENSAGEM:
        System.out.println("Exercício MENSAGEM");
        Mensagem.obterMensagem(7);
        Mensagem.obterMensagem(16);
        Mensagem.obterMensagem(21);
        Mensagem.obterMensagem(2);

// ---------------------------------------------------------------
        System.out.println("###############################");
// ---------------------------------------------------------------

        //EMPRESTIMO
        System.out.println("Exercício EMPRESTIMO");
        Emprestimo.calcular(1500, 3);
        Emprestimo.calcular(500, 2);
        Emprestimo.calcular(100, 4);
    }
}