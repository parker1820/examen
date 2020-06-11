package examen;
public class ListaPila <T> extends ListaEnla {
	private ListaPila Esquina;
	private int indice;
	@SuppressWarnings("unchecked")
	public ListaPila(){
		Esquina = new ListaPila();
		indice = 0;
	}
	public int cantidad(){
		return indice ;
	}
	public void apilar(int n)throws DesbordamientoPila{
	   Esquina.agregarAlInicio(new Nodo(null,n));
	   indice ++;
     }
	public Nodo sacar()throws SubDesbordamientoPila{ 
		Nodo esacar= Esquina.EliminarAlInicio();
		indice--;
		return esacar;
		}
}
