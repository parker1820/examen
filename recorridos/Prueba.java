package recorridos;
public class Prueba {
	public static void main(String[] args) {
		Arbol bonsai =new Arbol();
		bonsai.insertar(new Nodo(10));
		if (bonsai.buscar(new Nodo(10))) {
			System.out.println("El 10 si se encuentra");
		}
		Nodo AB;
		AB = new Nodo(0);
		if (bonsai.buscar(AB)) {
			System.out.println("El "+ AB+" si se encuentra");
		}else {
			System.out.println("El "+ AB+" no se encuentra");
		}
		///////////////////////////////////////////////////
		AB = new Nodo(5);
		bonsai.insertar(AB);
		if (bonsai.buscar(AB)) {
			System.out.println("El "+ AB+" si se encuentra");
		}else {
			System.out.println("El "+ AB+" no se encuentra");
		}
		//////////////////////////////////////////////////
		AB = new Nodo(15);
		bonsai.insertar(AB);
		if (bonsai.buscar(AB)) {
			System.out.println("El "+ AB+" si se encuentra");
		}else {
			System.out.println("El "+ AB+" no se encuentra");
		}
		//////////////////////////////////////////////////		
		AB = new Nodo(4);
		bonsai.insertar(AB);
		if (bonsai.buscar(AB)) {
			System.out.println("El "+ AB+" si se encuentra");
		}else {
			System.out.println("El "+ AB+" no se encuentra");
		}
		//////////////////////////////////////////////////		
		AB = new Nodo(16);
		bonsai.insertar(AB);
		if (bonsai.buscar(AB)) {
			System.out.println("El "+ AB+" si se encuentra");
		}else {
			System.out.println("El "+ AB+" no se encuentra");
		}
		//////////////////////////////////////////////////		
		AB = new Nodo(8);
		bonsai.insertar(AB);
		if (bonsai.buscar(AB)) {
			System.out.println("El "+ AB+" si se encuentra");
		}else {
			System.out.println("El "+ AB+" no se encuentra");
		}
		//////////////////////////////////////////////////		
		AB = new Nodo(11);
		bonsai.insertar(AB);
		if (bonsai.buscar(AB)) {
			System.out.println("El "+ AB+" si se encuentra");
		}else {
			System.out.println("El "+ AB+" no se encuentra");
		}
		//RECORRIDO PREORDER
		System.out.println("RECORRIDO PRE-ORDER");
		System.out.println(bonsai.toStringPreOrder());
		//RECORRIDO INORDER
		System.out.println("RECORRIDO IN-ORDER");
		System.out.println(bonsai.toStringInOrder());
		//RECORRIDO POSTORDER
		System.out.println("RECORRIDO POST-ORDER");
		System.out.println(bonsai.toStringPostOrder());
	}

}
