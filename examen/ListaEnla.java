package examen;
public class ListaEnla {
  private Nodo inicio;
  private Nodo Fin;
  private int NoElementos;
 public ListaEnla(){
	inicio=null;
        Fin=null;
        NoElementos=0;
    }
 
 public int obtenerNoElementos(){
	 return NoElementos;
 }
 public void agregarAlInicio(Nodo Ag){
     if(inicio==null){
         inicio=Ag;
         Fin=Ag;
         NoElementos++;
         }else{
         Ag.Siguiente=inicio;
         }
        inicio=Ag;
        NoElementos++;
   }
 
 public void agregarAlFin(Nodo Ag){
    if(Fin==null){
        Fin=Ag;
        inicio=Ag;
        NoElementos++;
        }else{
            Fin.Siguiente=Ag;
            Fin=Ag;
            NoElementos++;
       }
    }
 
 public boolean buscar(Nodo Ab){
    if(Ab !=null ){
       Nodo ref=inicio;
       boolean Encontrado=false;
       while((ref != null) && !Encontrado){
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
                    Ret.Siguiente=null;
                    NoElementos--;
                    return Ret;
                }
       }
 
 public Nodo EliminarAlFin(){
        if(Fin==null){
        	return null;
        	}else{
        	Nodo ref=inicio;
        	boolean Encontrado=false;
        	while((ref != null) && !Encontrado){
        	if(ref.Siguiente==Fin){
      		Encontrado=true;
       		}
                    if(!Encontrado){
                        ref=ref.Siguiente;
        		}
        	}
        	NoElementos--;
                    Nodo eliminar = Fin;
                    Fin =ref;
                    ref.Siguiente=null;
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
    	   if(!Encontrado){  
    		   refAzul=refRojo;
    		   refRojo=refRojo.Siguiente;
    		   }else{
    			   refAzul.Siguiente=refRojo.Siguiente;
    			   refElim.Siguiente=null;
    			   }
    	   }
       return refElim;
       }
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
     ref=new Nodo(null,ref.obtenerData());
     return ref;
     }
 }
