package proyecto;

import java.util.Objects;

public abstract class Centrocampista extends Jugador {

	private int pasesCompletados;

	public Centrocampista(String nombre, int dorsal, String equipo, int pasesCompletados) {
		super(nombre, dorsal, equipo);
		// TODO Auto-generated constructor stub
		
		this.pasesCompletados = pasesCompletados;
	}

	
	
	// SETTER GETTER
	
	public int getPasesCompletados() {
		return pasesCompletados;
	}

	
	public void setPasesCompletados(int pasesCompletados) {
		this.pasesCompletados = pasesCompletados;
	}


	// METDOOS
	@Override
	public void mostrarDatos() {
		
		System.out.println(getNombre());
		System.out.println(getDorsal());
		System.out.println("Posicion: Centrocampista");
		System.out.println("Pases Completados: " + pasesCompletados);
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
		Centrocampista otro = (Centrocampista) obj;
	
		if((super.equals(obj)) && this.pasesCompletados == otro.pasesCompletados) {
			
			iguales = true;
		}
		
		return iguales;
	}



	@Override
	public String toString() {
		return  super.toString() + String.format("PasesCompletados: %d", pasesCompletados);
	}

	
	
}
