package game;


public class PilaMaterial<T>{
    
	private T Esquina[];
	private int indice;
	@SuppressWarnings("unchecked")
	public PilaMaterial(int n){
		Esquina = (T[])new Object[n];
		indice = 0;
	}
	public int cantidad(){
		return indice ;//-1
	}
	public void apilar(T valor) throws DesbordamientoMateriales{
		if (this.llena()){
			throw new DesbordamientoMateriales();
		}
		Esquina[indice] = valor;
		indice++;
	}
	public T sacar() throws SubDesbordamientoMateriales{
		if(this.vacia()){
			throw new SubDesbordamientoMateriales();
		}
		T esacar;
		esacar = Esquina[indice-1];
		indice--;
		return esacar;
	}
	public boolean vacia(){
		if (indice == 0){
			return true;
		}
		return false;
	}
	public boolean llena(){
		if (indice == Esquina.length){
			return true;
		}
		return false;
	}
	public int capacidad(){
		return Esquina.length;
	}
	public void vaciarComple() throws SubDesbordamientoMateriales {
		while(!vacia()) {
		sacar();
	  }
	}
}

