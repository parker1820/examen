/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;
public class Nodo {
	public Nodo Izq;
	public Nodo Der;
	public int Data;
	
	public Nodo(int Data) {
		this.Data=Data;
		Izq=null;
		Der=null;
	}
	public int obtenerData() {
		return Data;
	}
	public void asignarData(int Data) {
		this.Data=Data;
	}
        @Override
	public String toString() {
		return ""+ Data;
	}
	

}
