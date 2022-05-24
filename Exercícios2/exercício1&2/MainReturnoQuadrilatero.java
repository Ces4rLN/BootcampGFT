public class MainReturnoQuadrilatero {
    
    public static void main(String[] args) {
        
        //RETORNOS:

        System.out.println("Exercícios retorno");

        double areaQuadrado = QuadrilateroReturn.area(20);
        System.out.println("A área do quadrado é : " + areaQuadrado);

        double areaRetangulo = QuadrilateroReturn.area(30, 25);
        System.out.println("A área do retângulo é : " + areaRetangulo);

        double areaTrapezio = QuadrilateroReturn.area(25, 15, 20);
        System.out.println("A área do trapézio é: " + areaTrapezio);

        float areaLosangulo = QuadrilateroReturn.area(10, 8);
        System.out.println("A área do losângulo é: " + areaLosangulo);
    }
}
