package colas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class NotacionPolaca {

	public static void main(String[] args) throws IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("---Bienvenidos a este programa---");
		int Op=0;
		int Ope1=0,Ope2=0,Ope3=0,Ope4=0,Ope5=0;
		String Signo="";
		ColaCirEnt ColNP=new ColaCirEnt(5);
		System.out.println("Favor de elegir una operacion \n 1)Suma  2)Resta  3)Multiplicacion 4)Division" );
		Op=Integer.parseInt(teclado.readLine());
		try{
			System.out.println("Escribe el Operando 1:");
			Ope1=Integer.parseInt(teclado.readLine());
		    ColNP.encolar(Ope1);
		    System.out.println("Escribe el Operando 2:");
		    Ope2=Integer.parseInt(teclado.readLine());
		    ColNP.encolar(Ope2);
		    System.out.println("Escribe el Operando 3:");
		    Ope3=Integer.parseInt(teclado.readLine());
		    ColNP.encolar(Ope3);
		    System.out.println("Escribe el Operando 4:");
		    Ope4=Integer.parseInt(teclado.readLine());
		    ColNP.encolar(Ope4);
		    System.out.println("Escribe el Operando 5:");
		    Ope5=Integer.parseInt(teclado.readLine());
		    ColNP.encolar(Ope5);
		}catch(ExcepcionColaCircularLL Err) {
			System.out.println(Err.getMessage());
		}
		float NumSacado=0;
		float NumNuevo=0;
		switch(Op) {
		    case 1:
		    	Signo="+";
		    	try {
		    		while(!ColNP.colaVacia()) {
		    	      NumSacado=ColNP.sacar();
		    	      NumNuevo=NumSacado+NumNuevo;
		    		    }
		    	     }catch(ExcepcionColaCirV Err) {
					      System.out.println(Err.getMessage());
		    	      }
			    break;
		    case 2:
		    	Signo="-";
		    	try {
		    		while(!ColNP.colaVacia()) {  
		    			NumSacado=ColNP.sacar();
		    			   if(ColNP.ObtenerFrente()==1) {
		    	              NumNuevo=NumSacado-NumNuevo;
		    		        }else {
		    			      NumNuevo=NumNuevo-NumSacado;
		    		           } 
		    		        }
		    	   }catch(ExcepcionColaCirV Err) {
					  System.out.println(Err.getMessage());
		    	}
		    	break;
		    case 3:
		    	Signo="*";
		    	try {
		    		while(!ColNP.colaVacia()) {  
		    			NumSacado=ColNP.sacar();
		    			  if(ColNP.ObtenerFrente()==1) {
		    	             NumNuevo=NumSacado;
		    		      }else {
		    			   NumNuevo=NumNuevo*NumSacado;
		    		   } 
		    		}
		    	  }catch(ExcepcionColaCirV Err) {
					System.out.println(Err.getMessage());
		    	     }
		    	break;
		    case 4:
		    	Signo="/";
		    	try {
		    		while(!ColNP.colaVacia()) {  
		    			NumSacado=ColNP.sacar();
		    	        //System.out.println(NumSacado);
		    	        //System.out.println("Frente:"+ColNP.ObtenerFrente());
		    			if(ColNP.ObtenerFrente()==1) {
		    	           NumNuevo=NumSacado;
		    	           //System.out.println("--"+NumNuevo);
		    		    }else  {
		    			   NumNuevo=(NumNuevo)/(NumSacado);
		    	           //System.out.println(NumNuevo);
		    		   } 
		    		}
		    	}catch(ExcepcionColaCirV Err) {
					System.out.println(Err.getMessage());
		    	}
		    	break;
		    default:
		    	System.out.println("Ingresa una opcion valida");
		    	break;
		}
		System.out.println("El resultado es :"+NumNuevo);
		System.out.println("Notacion Polaca: "+Signo+" "+Ope1+" "+Ope2+" "+Ope3+" "+Ope4+" "+Ope5);
	}

}
