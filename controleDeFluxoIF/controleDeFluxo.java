package JavaGFT.controleDeFluxoIF;

public class controleDeFluxo{

    public static void main(String[] args) {
                            
        ifSemFlecha(); 
           ifFerias();    
       switchSemana(); 
       switchFerias();
       switchNumero();
    }

    private static void ifSemFlecha(){

        int mes = 15;

        if(mes == 1){
            System.out.println("JANEIRO");
        }  else if(mes == 2){
            System.out.println("FEVEREIRO");
        }

        if(mes == 3){
            System.out.println("MARÇO");
        }   else if(mes == 4){
            System.out.println("ABRIL");
        }

        if(mes == 5){
            System.out.println("MAIO");
        }   else if(mes == 6){
            System.out.println("JUNHO");
        }

        if(mes == 7){
            System.out.println("JULHO");
        }   else if(mes == 8){
            System.out.println("AGOSTO");
        }

        if(mes == 9){
            System.out.println("SETEMBRO");
        }   else if(mes == 10){
        System.out.println("OUTUBRO");        
        }

        if(mes == 11){
            System.out.println("NOVEMBRO");
        }   else if(mes == 12){
            System.out.println("DEZEMBRO");
        }

         else if ((mes <= 0) || (mes >= 13)){
            System.out.println("MÊS NÃO IDENTIFICADO");
        }
     }
     
    private static void ifFerias(){

        String mes = "dezembro";
        if((mes == "janeiro") || (mes == "julho") || (mes == "dezembro")){
            System.out.println("FERIAS!");
        }
        
    }

    private static void switchSemana(){

        String dia = "sexta";

        switch(dia){
            case "segunda":
            System.out.println(2);
            break;

            case "terça":
            System.out.println(3);
            break;

            case "quarta":
            System.out.println(4);
            break;

            case "quinta":
            System.out.println(5);
            break;

            case "sexta":
            System.out.println(6);
            break;

            case "sabado":
            System.out.println(7);
            break;

            case "domingo":
            System.out.println(1);
            break;

            default:
            System.out.println("DIA NÃO IDENTIFICADO");
            break;

        }
    }
    
    private static void switchFerias(){
        String mes = "julho";
        
        switch(mes){

            case    "julho":
            case "dezembro":
            case  "janeiro":
            System.out.println("FERIAS!");
            break;

            default:
            System.out.println("MêS INVALIDO!");
            break;
        }
    }

    private static void switchNumero(){
        int numero = 3;

        switch(numero){
        
            case 1:
            case 2:
            case 3:
            System.out.println("CERTO!");
            break;

            case 4:
            System.out.println("ERRADO!");
            break;

            case 5:
            System.out.println("TALVEZ!");
            break;

            default:
            System.out.println("VALOR INDEFINIDO!");
            break;

        }
            
    }

}
