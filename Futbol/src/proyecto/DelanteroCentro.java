package proyecto;

import java.util.Objects;

public class DelanteroCentro extends Delantero {

	// Atributos

	private int golesPenalti;
	
	public DelanteroCentro(String nombre, int dorsal, String equipo, int paradas, int golesPenalti) {
		super(nombre, dorsal, equipo, paradas);
		this.golesPenalti = golesPenalti;
	}

	
	
	public int getGolesPenalti() {
		return golesPenalti;
	}

	public void setGolesPenalti(int golesPenalti) {
		this.golesPenalti = golesPenalti;
	}


	@Override
	public String toString() {
		return  super.toString() + String.format("Goles de Penalti: %d", golesPenalti);
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
		DelanteroCentro otro = (DelanteroCentro) obj;
		
		if((super.equals(obj)) && this.golesPenalti == otro.golesPenalti) {
			
			iguales = true;
		}
		
			return iguales;
	}
	
	
	@Override
	public void mostrarDatos() {

		super.mostrarDatos();
		System.out.println("Goles de Penalti: " + golesPenalti);
	}

}
