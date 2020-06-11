package examen;
public class SubDesbordamientoPila extends Exception {
	public SubDesbordamientoPila() {
		super("No puedo sacar elementos de una pila vacia");
	}

}