package game;
public class Juego {
	public static void main(String[] args) throws SubDesbordamientoMateriales{
	boolean Mesa=false;
	boolean Barco=false;
	boolean Baston=false;
	boolean Cana_p=false;
	boolean Cuerda=false;
	int tipAl=0;
	int al=0;
	  PilaMaterial<Integer> PH = new PilaMaterial<>(4);
	  PilaMaterial<Integer> PR = new PilaMaterial<>(1);
	  PilaMaterial<Integer> PM = new PilaMaterial<>(5);
	  int VarTM=0;
	boolean ResinaC=false;
	for(int x=0;x<30;x++) {
		VarTM=(int)(Math.random()*(2-(-1)));
		al=(int)(Math.random()*(10-1));
		
		if(VarTM==0) { 
			  try {
				  PM.apilar(al);
				  if((PM.cantidad()==4)&(Mesa==false)) {  
					  Mesa=true;
					  System.out.println("Mesa adquirida");
					  PM.vaciarComple();  
				  }if((PM.cantidad()==2)&(Baston==false)&(Mesa)) {
					  Baston=true;
					  System.out.println("Baston adquirido");
					  PM.vaciarComple(); 
				  }
			  }catch(DesbordamientoMateriales E) {
				  System.out.println(E.getMessage()+" Madera esta completa");
				  if((Barco==false)&(Mesa)&(Baston)&(Cuerda)&(Cana_p)) {
					  Barco=true;
					  System.out.println("Barco adquirido");
					  //Vaciar la pila
					  PM.vaciarComple();
					  System.exit(0);
				  }
			  }
/***************************/
		}if(VarTM==1) {
			  try {
			 PR.apilar(al);
		   }catch(DesbordamientoMateriales E) {
			  System.out.println(E.getMessage()+" Resina esta Completa :v");
		       if(ResinaC==false) {
			    ResinaC=true;
			     PR.vaciarComple();
			     }
			   }  
		 }
		  if(VarTM==2){
			  try {
			  PH.apilar(al);
		    }catch(DesbordamientoMateriales E) {
			  System.out.println(E.getMessage()+" Hilo esta completa ");
			  if((Cuerda==false)&(Mesa)&(ResinaC)&(Baston)) {
				  Cuerda=true;
				  System.out.println("Cuerda adquirida");
				  PH.vaciarComple();
			    }
			   if((Cana_p==false)&(Mesa)&(Baston)&(Cuerda)) {
		    	  Cana_p=true;
		    	  System.out.println("Cana de Pescar Adquirida");
			     }
		      }
		    }   
	    }
	}
}

