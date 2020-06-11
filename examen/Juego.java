package examen;
public class Juego {
	public static void main(String[] args) throws SubDesbordamientoPila{
		
	boolean Mesa=false;
	boolean Barco=false;
	boolean Baston=false;
	boolean Cana_p=false;
	boolean Cuerda=false;
	int tipAl=0;
	int al=0;
	
	ListaPila LH = new ListaPila();
	ListaPila LR = new ListaPila();
	ListaPila LM = new ListaPila();
	 int VarTM=0;
	boolean ResinaC=false;
	for(int x=0;x<30;x++) {
		VarTM=(int)(Math.random()*(2-(-1)));
		al=(int)(Math.random()*(10-1));
		if(VarTM==0) { 
			  try {
				  LM.apilar(al);
				  if((LM.cantidad()==4)&(Mesa==false)) {  
					  Mesa=true;
					  System.out.println("Obtuviste Mesa");
	                    LM.sacar();
	                    LM.sacar();
	                    LM.sacar();
	                    LM.sacar(); 
				  }if((LM.cantidad()==2)&(Baston==false)&(Mesa)) {
					  LM.sacar();
                            LM.sacar();
					  Baston=true;
					  System.out.println("Obtuviste Baston");
				  } 
				  if((LM.cantidad()>=5)&(Mesa)&(Baston)&(Cuerda)&(Cana_p)) {
					  Barco=true;
					  System.out.println("Obtuviste Barco");
					  System.exit(0);
				  }
			  }catch(DesbordamientoPila E) {	
				  System.out.println(E.getMessage()+" Madera esta Completa");
			  }
		}if(VarTM==1) {
			  try {
			 LR.apilar(al); 
		       if(ResinaC==false) {
			    ResinaC=true;
			     LR.sacar();
			     }  
		   }catch(DesbordamientoPila E) {
			  System.out.println(E.getMessage()+" Resina Completa ");
		   }
		 }
		  if(VarTM==2){
			  try {
			  LH.apilar(al);
			  if((Cuerda==false)&(Mesa)&(ResinaC)&(Baston)) { 
				  Cuerda=true;
				  System.out.println("Obtuviste Cuerda");
                  LH.sacar();
                  LH.sacar();
                  LH.sacar();
                  LH.sacar();
			    }
			   if((Cana_p==false)&(Mesa)&(Baston)&(Cuerda)) {
		    	  Cana_p=true;
		    	  System.out.println("Cana de Pescar Adquirida");
			     }
		    }catch(DesbordamientoPila E) {
			  System.out.println(E.getMessage()+" Hilo esta completa ");
		      }
		    }   
	    }
	}
}

