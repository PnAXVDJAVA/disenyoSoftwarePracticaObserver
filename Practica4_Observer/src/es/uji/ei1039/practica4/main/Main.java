package es.uji.ei1039.practica4.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.uji.ei1039.practica4.observer.Jugador;
import es.uji.ei1039.practica4.subject.LoteriaPrimitiva;

public class Main {

	public static void main(String[] args) {
		
		LoteriaPrimitiva loteria = new LoteriaPrimitiva();
		
		List <Jugador> jugadores = new ArrayList<Jugador>();
		Jugador David = new Jugador("David", Arrays.asList(1,2,3,4,5,6));
		Jugador Valeriu = new Jugador("Valeriu", Arrays.asList(1,2,3,15,16,17));
		Jugador Xavi = new Jugador("Xavi", Arrays.asList(1,2,3,14,15,17));
		jugadores.add(David);
		jugadores.add(Valeriu);
		jugadores.add(Xavi);
		
		for (Jugador j : jugadores) {
			loteria.registerObserver(j);
		}
		
		loteria.nuevoSorteo();
	}
}
