package proyecto;

import java.util.Objects;

public class Delantero extends Jugador {
	
	private int goles;

	public Delantero(String nombre, int dorsal, String equipo, int goles) {
		super(nombre, dorsal, equipo);
		this.goles = goles;
	}

	
	public int getGoles() {
		return goles;
	}


	public void setGoles(int goles) {
		this.goles = goles;
	}



	@Override
	public String toString() {
		return  super.toString() + String.format("Goles: %d", goles);
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
		Delantero otro = (Delantero) obj;
		
		if((super.equals(obj)) && this.goles == otro.goles) {
			iguales = true;
		}
			return iguales;
	}


	@Override
	public void mostrarDatos() {

		System.out.println(getNombre());
		System.out.println(getDorsal());
		System.out.println("Posicion: delantero");
		System.out.println("Goles : " + goles);
	}

}
