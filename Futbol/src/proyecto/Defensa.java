package proyecto;

import java.util.Objects;

public class Defensa extends Jugador {
	
	private int disputasRealizadas;

	public Defensa(String nombre, int dorsal, String equipo, int disputasRealizadas) {
		super(nombre, dorsal, equipo);
		this.disputasRealizadas = disputasRealizadas;
	}

	
	
	
	public int getDisputasRealizadas() {
		return disputasRealizadas;
	}

	

	public void setDisputasRealizadas(int disputasRealizadas) {
		this.disputasRealizadas = disputasRealizadas;
	}



	@Override
	public String toString() {
		return  super.toString() + String.format("Disputas Realizadas: %d", disputasRealizadas);
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
		Defensa otro = (Defensa) obj;
		
		if((super.equals(obj)) && this.disputasRealizadas == otro.disputasRealizadas) {
			
			iguales = true;
		}
		
			return iguales;
	}




	@Override
	public void mostrarDatos() {
		
		System.out.println(getNombre());
		System.out.println(getDorsal());
		System.out.println("Posicion: defensa");
		System.out.println("Disputas Realizadas: " + disputasRealizadas);
	}

}
