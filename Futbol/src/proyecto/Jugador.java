package proyecto;

public abstract class Jugador {
// Atributos
	private String nombre;
	private int dorsal;
	private String equipo;

//Constructor

	public Jugador(String nombre, int dorsal, String equipo) {

		this.nombre = nombre;
		this.dorsal = dorsal;
		this.equipo = equipo;
	}

	// settter getters


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	

	// METODOSSS
	
	public abstract void mostrarDatos();


	@Override
	public String toString() {
		return String.format("Nombre: %s, Dorsal: %d, Equipo: %s", nombre, dorsal, equipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!this.getClass().equals(obj.getClass())) {
			return false;
		}

		boolean iguales = false;
		Jugador otro = (Jugador) obj;

		if ((this.nombre == otro.nombre) && (this.dorsal == otro.dorsal) && (this.equipo == otro.equipo)) {

			iguales = true;
		}

		return iguales;
	}

}
