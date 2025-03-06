package proyecto;

public class Main {

	public static void main(String[] args) {
	
		 Equipo equipo = new Equipo();
	       
		 equipo.addJugador(0, new Portero("Juan", 1, "Equipo , ", 3));
	       equipo.addJugador(1, new Central("Pepe", 2, "equipo , ", 6, 2));
	       equipo.addJugador(2,  new Central("Sergio", 3, "equipo , ", 8, 6));
	       equipo.addJugador(3, new Pivote("Casemiro", 5, "equipo , ", 10, 3));
	       equipo.addJugador(4, new Pivote("Iván", 6,"equipo , ", 10, 5));
	       equipo.addJugador(5, new Lateral("Jordi", 17, "equipo , ", 10, "Izq"));
	       equipo.addJugador(6, new Lateral("Daniel", 14, "equipo , ", 15, "Dere"));;
	       equipo.addJugador(7, new Mediapunta("Pedri", 8, "equipo , ", 10, 3));
	       equipo.addJugador(8, new Delantero("Robert", 9, "equipo , ", 25));
	       equipo.addJugador(9, new Extremo("Rafa", 11, " equipo , ", 19, "Dere"));
	       equipo.addJugador(10, new Extremo("Isaac", 7, " equipo , ", 2, "Izq"));
	
		 	
		 	
	        equipo.mostrarAlineacion();
	        
	        for(Jugador j : equipo.getJugadores()) {
	        	System.out.println(j.toString());
	        }
	        for(Jugador j : equipo.getJugadores()) {
	        	j.mostrarDatos();
	        }

	        Portero p1 =  new Portero("Juan", 1, "Equipo , ", 3);
	        Portero p2 =  new Portero("Juan", 1, "Equipo , ", 3);
	        Portero p3 =  new Portero("Juanito", 12, "Equipo3 , ", 8);
	        
	        
	        
	        System.out.printf("p1 y p2 son iguale: %b \n", p1.equals(p2));

	        System.out.printf("p1 y p3 son iguales: %b \n", p1.equals(p3));
		
	
	
	
	}

}
