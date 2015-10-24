package es.uji.ei1039.practica4.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.uji.ei1039.practica4.observadoresLoteria.Jugador;
import es.uji.ei1039.practica4.observadoresLoteria.Periodico;
import es.uji.ei1039.practica4.sorteo.INumerosSorteoFactory;
import es.uji.ei1039.practica4.sorteo.LoteriaPrimitiva;
import es.uji.ei1039.practica4.sorteo.NumerosSorteoManipulado;
import es.uji.ei1039.practica4.sorteo.NumerosSorteoRandom;

public class Main {

	public static void main(String[] args) {
		
		//La factoria de numeros será o bien la factoria que da numeros aleatorios
		//o bien la que da numeros manipulados
		INumerosSorteoFactory numerosSorteoFactory = new NumerosSorteoRandom();
		
		//Pasamos a la loteria la factoria que le dará los números ganadores
		LoteriaPrimitiva loteria = new LoteriaPrimitiva( numerosSorteoFactory );
		Periodico periodico = new Periodico();
		
		List <Jugador> jugadores = new ArrayList<Jugador>();
		
		Jugador David = new Jugador( "David", Arrays.asList( 1, 2, 3, 4, 5, 6 ) );
		Jugador Valeriu = new Jugador( "Valeriu", Arrays.asList( 1, 2, 3, 15, 16, 17 ) );
		Jugador Xavi = new Jugador( "Xavi", Arrays.asList( 1, 2, 3, 14, 15, 17 ) );
		
		jugadores.add( David );
		jugadores.add( Valeriu );
		jugadores.add( Xavi );
		
		loteria.registerObserver( periodico );
		
		for ( Jugador j : jugadores ) {
			loteria.registerObserver( j );
		}
		
		for ( Jugador j : jugadores) {
			j.registerObserver( periodico );
		}
		
		
		loteria.nuevoSorteo();
		periodico.Show();
	}
}
