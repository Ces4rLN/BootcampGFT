package JavaGFT.Operadores;
public class operadoresRelacionais {
    
    public static void main(String[] args){

        int i1 = 10;        float f1 = 4.5f;           double d1 = 59.6d;
        int i2 = 20;        float f2 = 3.5f;

        char c1 = 'x';      String s1 = "Fulano";      String s3 = "Cicrano";
        char c2 = 'y';      String s2 = "Fulano";

        boolean b1 =  true;  long l1 = 1597l;
        boolean b2 = false;  long l2 = 8997l;

        byte  y1 =  1; 
        short h1 = 25;

//                      INT                                                 FLOAT
        System.out.println(" i1 == i2 " + (i1 == i2));        System.out.println(" f1 == f2 " + (f1 == f2));
        System.out.println(" i1 != i2 " + (i1 != i2));        System.out.println(" f1 != f2 " + (f1 != f2));  
        System.out.println(" i1 >  i2 " + (i1  > i1));        System.out.println(" f1 >  f2 " + (f1 >  f2));   
        System.out.println(" i1 <= i2 " + (i1 <= i2));        System.out.println(" f1 <= f2 " + (f1 <= f2));

//                      CHAR                                                STRING 
        System.out.println(" c1 == c2 " + (c1 == c2));        System.out.println(" s1 == s2 " + (s1 == s2));
        System.out.println(" c1 != c2 " + (c1 != c2));        System.out.println(" s1 != s3 " + (s1 != s3));
        System.out.println(" c1 >= c2 " + (c1 >= c2));       //                ERROR:
        System.out.println(" c1 <  c2 " + (c1 <  c2));      //System.out.println("s1 >  s2" + (s1 >  s2));
                                                            //System.out.println("s1 <= s2" + (s1 <= s2));

        System.out.println(" b1 == b2 " + (b1 == b2));        System.out.println(" l1 == l2 " + (l1 == l2));
        System.out.println(" b1 != b2 " + (b1 != b2));        System.out.println(" l1 != l2 " + (l1 != l2));
      /*           ERROR:                          */         System.out.println(" l1 >= l2 " + (l1 >= l2));
    /*  System.out.println(" b1 >  b2 " + (b1 >  b2)); */     System.out.println(" l1 <  l2 " + (l1 <  l2));
      //System.out.println(" b1 <= b2 " + (b1 <= b2));
   
   //                                BYTE |  SHORT | DOUBLE

                        System.out.println(" d1 == y1 " + (d1 == y1));
                        System.out.println(" y1 != h1 " + (y1 != h1));
                        System.out.println(" h1 >= y1 " + (h1 >= y1));
                        System.out.println(" h1 <  d1 " + (h1 <  d1));

    }

}
