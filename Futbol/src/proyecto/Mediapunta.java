package proyecto;

import java.util.Objects;

public class Mediapunta extends Centrocampista {

	private int asistencias;

	public Mediapunta(String nombre, int dorsal, String equipo, int pasesCompletados, int asistencias) {
		super(nombre, dorsal, equipo, pasesCompletados);
		this.asistencias = asistencias;
	}
	

	public int getAsistencias() {
		return asistencias;
	}

	public void setAsistencias(int asistencias) {
		this.asistencias = asistencias;
	}


	@Override
	public String toString() {
		return  super.toString() + String.format("Asistencias : %d", asistencias);
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
		Mediapunta otro = (Mediapunta) obj;
		
		if((super.equals(obj)) && this.asistencias == otro.asistencias) {
		
			iguales = true;
		}
		
		return iguales;
	}
	
	
	@Override
	public void mostrarDatos() {
		
		super.mostrarDatos();
		System.out.println("Asistencias : " + asistencias);
	}

	

}
