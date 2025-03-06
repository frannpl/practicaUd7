package proyecto;

import java.util.Objects;

public class Pivote extends Centrocampista {

	private int intercepciones;

	public Pivote(String nombre, int dorsal, String equipo, int pasesCompletados, int intercepciones) {
		super(nombre, dorsal, equipo, pasesCompletados);
		this.intercepciones = intercepciones;
	}

	
	public int getIntercepciones() {
		return intercepciones;
	}

	public void setIntercepciones(int intercepciones) {
		this.intercepciones = intercepciones;
	}


	@Override
	public String toString() {
		return  super.toString() + String.format("Intercepciones : %d", intercepciones);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		boolean iguales = false;
		Pivote otro = (Pivote) obj;
		
		if((super.equals(obj)) && this.intercepciones == otro.intercepciones) {
			
			iguales = true;
		}
		
			return iguales;
	}
	
	@Override
	public void mostrarDatos() {
		
		super.mostrarDatos();
		System.out.println("Intercepciones : " + intercepciones);
	}

}
