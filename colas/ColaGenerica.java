package colas;

public class ColaGenerica<T> {
		private T Esquina[];
		private int Frente;
		private int Siguiente;
		@SuppressWarnings("unchecked")
		public ColaGenerica(int N) {
			Esquina=(T[])new Object[N];
			Siguiente=0;
			Frente=-1;
		}
		public boolean colaLLena() {
			if(Siguiente==Esquina.length) {
				return true;
			}else {
				return false;
			}
		}
		public void encolar(T Valor) throws ExcepcionColaLLena{
			if(colaVacia()) {
				System.out.println("//Reset");
				Frente=-1;
				Siguiente=0;
			}
			if(colaLLena()) {
				throw new ExcepcionColaLLena();
			}
			Esquina[Siguiente]=Valor;
			Siguiente++;
			if(Siguiente==1) {
				Frente=0;
			}
		}
		public boolean colaVacia() {
			if(Frente==Siguiente) {
				return true;
			}else if(Frente==-1) {
				return true;
			}else {
				return false;
			}
		}
		public T sacar() throws ExcepcionColaVacia {
			if(colaVacia()) {
				throw new ExcepcionColaVacia();
			}
			T Valor=Esquina[Frente];
			Frente++;
			return Valor;
		}
		

	}


