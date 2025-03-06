package proyecto;

import java.util.Objects;

public class Portero extends Jugador {

	private int paradas;

	public Portero(String nombre, int dorsal, String equipo, int paradas) {
		super(nombre, dorsal, equipo);
		this.paradas = paradas;
	}

	
	
	
	public int getParadas() {
		return paradas;
	}



	public void setParadas(int paradas) {
		this.paradas = paradas;
	}



	@Override
	public void mostrarDatos() {
		
	}


	@Override
	public String toString() {
		return  super.toString() + String.format("Paradas: %d", paradas);
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
		Portero otro = (Portero) obj;
		
		if(super.equals(obj) && this.paradas == otro.paradas) {
		
			iguales = true;
		}
			
			return iguales;
	}


	
}
