package colas;
public class ListaDobleEnlazada {
    //Referancia al inicio 
 private Nodo inicio;
   //Referencia al fin 
 private Nodo Fin;
 private int NoElementos;
 
 
 public ListaDobleEnlazada(){
inicio=null;
Fin=null;
NoElementos=0;
}
 
 public int obtenerNoElementos(){
 return NoElementos;
 }
 public void agregarAlInicio(Nodo Ag){
     //Cuando no tengo nodos 
 if(inicio==null){
 inicio=Ag;
 Fin=Ag;
 NoElementos++;
 }else{//mi lista al menos tiene un nodo 
 Ag.Siguiente=inicio;
 inicio.Anterior=Ag;
 inicio=Ag;
 NoElementos++;
 }
 
 }
 
 public void agregarAlFin(Nodo Ag){
     //Caso cuando no hay nodos 
 if(Fin==null){
 Fin=Ag;
 inicio=Ag;
 NoElementos++;
 }else{// mi lista al menos tiene un nodo 
 Fin.Siguiente=Ag;
 Ag.Anterior=Fin;
 Fin=Ag;
 NoElementos++;
 }
 
 }
 
 public boolean buscar(Nodo Ab){
     //Nodo no es nulo 
 if(Ab !=null ){
     if(inicio!=null){
     if(inicio.obtenerData()==Ab.obtenerData()){
     return true;
     }
     }
     if(Fin!=null){
     if(Fin.obtenerData()==Ab.obtenerData()){
     return true;
     }
     }
     //si el elemento a buscar no esta ni en el inicio ni fin
 Nodo ref=inicio;
 boolean Encontrado=false;
 while((ref != null) && !Encontrado){
     //si esto es cierto el nodo ya fue encontrado 
 if(ref.obtenerData()==Ab.obtenerData()){
 
     Encontrado= true;
 }
  ref=ref.Siguiente;
 
 }
 return Encontrado;
 }
 return false;
 }
 
 public Nodo EliminarAlInicio(){
     if(inicio==null){
     return null;
     }else{
 Nodo Ret=inicio;
 inicio=inicio.Siguiente;
 inicio.Anterior=null;
 Ret.Siguiente=null;
 Ret.Anterior=null;
 NoElementos--;
    return Ret;
     }

 }
 
 public Nodo EliminarAlFin(){
 if(Fin==null){
 return null;
 }else{
 
 

 Nodo eliminar = Fin;
 Fin =Fin.Anterior;
 Fin.Siguiente=null;
 
 eliminar.Siguiente=null;
 eliminar.Anterior=null;
 
  NoElementos--;
 return eliminar;
 }
 
 }
public Nodo EliminarPorNodo(Nodo AB){
    if(AB ==null){
    return null; 
    }   
 if(Fin==null){
 return null;
 }else{
  //////////////////
  if(inicio.obtenerData()==AB.obtenerData()){
  return this.EliminarAlInicio();
  }
  //////////////////
     if(Fin.obtenerData()==AB.obtenerData()){
  return this.EliminarAlFin();
  }
  //////////////////
     
 Nodo refRojo=inicio;
 Nodo refAzul=null;
 Nodo refElim=null;
 boolean Encontrado=false;
 while((refRojo!= null) && !Encontrado){
     if(refRojo.obtenerData()==AB.obtenerData()){
     Encontrado=true;
     refElim=refRojo;
     NoElementos--;
     }
     refRojo=refRojo.Siguiente;
 }
 if(Encontrado){
 refRojo = refElim.Anterior;
 refAzul=refElim.Siguiente;
 refRojo.Siguiente=refAzul;
 refAzul.Anterior=refRojo;
 refElim.Siguiente=null;
 refElim.Anterior=null;        
 }
 return refElim;
 }
 } 

public String toString(){
String temp= " ";
if(inicio ==null){
return " ";

}
Nodo ref=inicio;
while(ref != null){
temp=temp + " "+ref.toString();
ref=ref.Siguiente;
}
return temp;
}

public String toStringReverse(){
String temp= " ";
if(Fin ==null){
return " ";

}
Nodo ref=Fin;
while(ref != null){
temp=temp + " "+ref.toString();
ref=ref.Anterior;
}
return temp;
}



 public Nodo PorIndice(int p){
 if(inicio==null){
 return null;
 }
 if(p>=NoElementos){
 return null;
 }
  if(p<0){
 return null;
 }
  int i=0;
  Nodo ref=inicio;
  for(;i<p;i++){
  ref =ref.Siguiente;
  }
  ref=new Nodo(ref.obtenerData());
  return ref;
 }
}
