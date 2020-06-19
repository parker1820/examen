package colas;
import java.io.*;
public class PruebaNodos {
	public static void main(String[] args)throws IOException {
		Nodo N1 = new Nodo(0);
		Nodo N2 = new Nodo(1);
		Nodo N3 = new Nodo(2);
		///funcionamiento de la referencia/////
		System.out.println(N1);
		System.out.println(N2);
		System.out.println(N3);
		////ENLAZAR NODO1 AL NODO2////
		System.out.println("##############");
		N1.Siguiente=N2;
		System.out.println(N1.Siguiente);
		N2.Siguiente=N3;
		System.out.println(N2.Siguiente);
		//////////////////////////////
		System.out.println("##############");
		System.out.println(N1);
		System.out.println(N1.Siguiente);
		System.out.println(N1.Siguiente.Siguiente);
		////////////////////////////
		N2 = null;
		N3 = null;
		//////////////////////////////
		System.out.println("---------------");
		System.out.println(N1);
		System.out.println(N1.Siguiente);
		System.out.println(N1.Siguiente.Siguiente);
		//////////////////////////////
		Nodo ref = N1;
		while(ref != null) {
			System.out.println("Valor "+ref);
			ref = ref.Siguiente;
		}
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader Teclado = new BufferedReader(r);
		String num ;
		String resp = "";
		Nodo Inicial = null;
		Nodo sigNod = null;
		Nodo Actual = null;
		System.out.println("Bienvenido vamos a guardar letras");
		do{
			System.out.println("Dame un valor");
			num =(Teclado.readLine());
			if(Inicial == null) {
				Inicial = new Nodo(num);
				Actual = Inicial;
			}else {
				sigNod = new Nodo(num);
				Actual.Siguiente = sigNod;
				Actual = sigNod;
			}
				
			System.out.println("Deseas agregar otro S/N");
			resp =Teclado.readLine();
		}while(resp.compareToIgnoreCase("S")==0);
		
		ref = Inicial;
		while(ref != null) {
			System.out.println("Valor "+ref);
			ref = ref.Siguiente;
		}
	}

}
