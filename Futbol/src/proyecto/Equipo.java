package proyecto;

import java.util.Arrays;

public class Equipo {

	 private Jugador[] jugadores;
	    private static final int num_jugadores = 11;
	    private static final String[] posiciones = {
	        "Portero", "Lateral izquierdo", "Central", "Central", "Lateral derecho", 
	        "Pivote", "Pivote", "Mediapunta", "Extremo izquierdo", "Extremo derecho", "Delantero centro"
	    };

	    public Equipo() {
	        jugadores = new Jugador[num_jugadores];
	    }

	    public void addJugador(int posicion, Jugador jugador) {
	        if (posicion < 0 || posicion >= num_jugadores) {
	            throw new IllegalArgumentException("Posición inválida. Debe estar entre 1 y " + (num_jugadores ));
	        }
	        jugadores[posicion] = jugador;
	    }

	    public void mostrarAlineacion() {
	    	 for (Jugador jugador : jugadores) {
	             if (jugador == null) {
	                 throw new IllegalArgumentException("No están cubiertos todos los puestos de la alineación.");
	             }
	         
	        }
	        
	        for (int i = 0; i < num_jugadores; i++) {
	            System.out.println(i + ": " + posiciones[i] + " - " + jugadores[i]);
	        }
	    }
	}	
				
				
				
				
		
	
	
	

	



