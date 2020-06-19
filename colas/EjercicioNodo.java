package colas;
public class EjercicioNodo {
    public static void main(String args[]){
   Nodo n1 = new Nodo("H");
   Nodo n2 = new Nodo("O");
   Nodo n3 =new Nodo("L");
   Nodo n4 = new Nodo("A");
   Nodo n5 = new Nodo("-");
   Nodo n6 = new Nodo("M");
   Nodo n7 = new Nodo("U"); 
   Nodo n8 = new Nodo("N");
   Nodo n9 = new Nodo("D");
   Nodo n10 = new Nodo("O");
    System.out.println(n1);
    n1.Siguiente=n2;
    System.out.println(n1.Siguiente);
    n2.Siguiente=n3;
    System.out.println(n2.Siguiente);
    n3.Siguiente=n4;
    System.out.println(n3.Siguiente);
    n4.Siguiente=n5;
    System.out.println(n4.Siguiente);
    n5.Siguiente=n6;
    System.out.println(n5.Siguiente);
    n6.Siguiente=n7;
    System.out.println(n6.Siguiente);
    n7.Siguiente=n8;
    System.out.println(n7.Siguiente);
    n8.Siguiente=n9;
    System.out.println(n8.Siguiente);
    n9.Siguiente=n10;
    System.out.println(n9.Siguiente);
    
    }
    
}
