package proyecto;

public class Main {

	public static void main(String[] args) {
	
		 Equipo equipo = new Equipo();
	       
		 equipo.addJugador(1, new Portero("Juan", 1, "Equipo", 3));
	       equipo.addJugador(2, new Central("Pepe", 2, "equipo", 6, 2));
	       equipo.addJugador(3,  new Central("Sergio", 3, "equipo", 8, 6));
	       equipo.addJugador(4, new Pivote("Casemiro", 5, "equipo", 10, 3));
	       equipo.addJugador(5, new Pivote("Iván", 6,"equipo", 10, 5));
	       equipo.addJugador(6, new Lateral("Jordi", 17, "equipo", 10, "Izq"));
	       equipo.addJugador(7, new Lateral("Daniel", 14, "equipo", 15, "Dere"));;
	       equipo.addJugador(8, new Mediapunta("Pedri", 8, "equipo", 10, 3));
	       equipo.addJugador(9, new Delantero("Robert", 9, "equipo", 25));
	       equipo.addJugador(10, new Extremo("Rafael", 11, "equipo", 18));
	      
		 	
		 	
	        equipo.mostrarAlineacion();
	
	        
	        
		
		
	
	
	
	}

}
