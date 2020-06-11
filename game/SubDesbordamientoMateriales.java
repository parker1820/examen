package game;


public class SubDesbordamientoMateriales extends Exception {
	public SubDesbordamientoMateriales() {
		super("Imposible sacar elementos de una pila vacia");
	}

}