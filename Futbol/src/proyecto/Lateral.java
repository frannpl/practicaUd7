package proyecto;

import java.util.Objects;

public class Lateral extends Defensa{

	private String puesto;
	
	public Lateral(String nombre, int dorsal, String equipo, int disputasRealizadas, String puesto) {
		super(nombre, dorsal, equipo, disputasRealizadas);
		this.puesto = puesto;
	}

	
	
	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public void mostrarDatos() {
		
		super.mostrarDatos();
		System.out.println("Puesto: " + puesto);
	}


	@Override
	public String toString() {
		return  super.toString() + String.format("Puesto : %s", puesto);
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
		Lateral otro = (Lateral) obj;
		
		if((super.equals(obj)) && this.puesto == otro.puesto) {
			
			iguales = true;
			}
		
			return iguales;
	}
		
	}
	
	
