package proyecto;

import java.util.Objects;

public class Extremo extends Delantero {
	public Extremo(String nombre, int dorsal, String equipo, int goles) {
		super(nombre, dorsal, equipo, goles);
		this.puesto = puesto;

	
	}

// Atributos

	private String puesto;

	
	

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("Puesto : %s", puesto);
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
		Extremo otro = (Extremo) obj;

		if ((super.equals(obj)) && this.puesto == otro.puesto) {

			iguales = true;
		}

		return iguales;
	}

	@Override
	public void mostrarDatos() {

		super.mostrarDatos();
		System.out.println("Puesto : " + puesto);
	}

}
