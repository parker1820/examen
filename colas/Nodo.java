package colas;
public class Nodo<T> {
   public Nodo Anterior;
    public Nodo Siguiente;
    private T Data;
    
    public Nodo(T Data){
    this.Siguiente= null;
    Anterior=null;
    this.Data=Data;
    }  
    public T obtenerData(){
    return Data;
    }
    public void ColocarData(T Data){
    this.Data=Data;
    }
    
   @Override
    public String toString(){
    
    return " "+Data;
    }
}
