package proyecto;

import java.util.Objects;

public class Central extends Defensa {

	private int entradas;

	public Central(String nombre, int dorsal, String equipo, int disputasRealizadas, int entradas) {
		super(nombre, dorsal, equipo, disputasRealizadas);
		// TODO Auto-generated constructor stub
	}

	
	public int getEntradas() {
		return entradas;
	}

	public void setEntradas(int entradas) {
		this.entradas = entradas;
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
		Central otro = (Central) obj;
		
		if((super.equals(obj)) && this.entradas == otro.entradas) {
			
			iguales = true;
		}
		
			return iguales;
	}
	
	

	@Override
	public String toString() {
		return  super.toString() + String.format("Entradas", entradas);
	}

}
