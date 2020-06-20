package recorridos;
public class Arbol {
	private Nodo raiz;
	private String Recorrido;
	public Arbol() {
		raiz = null;
		Recorrido = "";
	}
	//metodo a envolver
	private void insertarDesde(Nodo noda,Nodo Desde) {
		if (Desde.obtenerData() == noda.obtenerData()){
			return;
		}
		if (noda.obtenerData() > Desde.obtenerData()){
			//colocar a la derecha
			if(Desde.Der == null) {
				Desde.Der = noda;
				return;
			}else {
				insertarDesde(noda,Desde.Der);
				return;
			}
		}else {
			//colocar a la izquierda
			if(Desde.Izq == null) {
				Desde.Izq = noda;
				return;
			}else {
				insertarDesde(noda,Desde.Izq);
				return;
			}
		}
	}
	//metodo que envuelve wrapper
	public void insertar (Nodo noda) {
		//esto pasa cuando la raiz es nula
		//es decir es el primer elemento
		if(raiz == null) {
			raiz = noda;
			return; //aqui termina el metodo
		}
		//////
		//si llego aqui la raiz no es nula
		insertarDesde(noda,raiz);
	}
	public boolean buscar(Nodo noba) {
		return buscarDesde(noba,raiz);
	}
	private boolean buscarDesde(Nodo noba,Nodo Desde) {
		if (Desde == null) {
			return false;
		}
		//es cuando el nodo es el encontrado
		if (Desde.obtenerData() == noba.obtenerData()) {
			return true;
		}
		
		if (noba.obtenerData() > Desde.obtenerData()) {
			//derecha
			return buscarDesde(noba,Desde.Der);
		}else {
			//izquierda
			return buscarDesde(noba,Desde.Izq);
		}
	}
	
	public String toStringPreOrder() {
		Recorrido = "";
		//////////////
		preOrderDesde(raiz);
		return Recorrido;
	}
	public String toStringInOrder() {
		Recorrido = "";
		//////////////
		inOrderDesde(raiz);
		return Recorrido;
	}
	public String toStringPostOrder() {
		Recorrido = "";
		//////////////
		postOrderDesde(raiz);
		return Recorrido;
	}
	//       VID     //
	private void preOrderDesde(Nodo Desde) {
		if (Desde == null) {
			return;
		}
		//VALOR
		Recorrido = Recorrido+" "+ Desde;
		//IZQ
		preOrderDesde(Desde.Izq);
		//DER
		preOrderDesde(Desde.Der);
	}
	//       IVD     //
	private void inOrderDesde(Nodo Desde) {
		if (Desde == null) {
			return;
		}
		//IZQ
		inOrderDesde(Desde.Izq);
		//VALOR
		Recorrido = Recorrido+" "+ Desde;
		//DER
		inOrderDesde(Desde.Der);
	}
	//       IDV     //
	private void postOrderDesde(Nodo Desde) {
		if (Desde == null) {
			return;
		}
		//IZQ
		postOrderDesde(Desde.Izq);
		//DER
		postOrderDesde(Desde.Der);
		//VALOR
		Recorrido = Recorrido+" "+ Desde;
	}
}
