package es.uji.ei1039.practica4.observer;

import java.util.ArrayList;
import java.util.List;

public class Jugador implements IObserverSorteo, ISubjectJugador {

	private String nombreJugador;
	private List<Integer> numPredecidoLoteria;
	private List<Integer> numGanadoresLoteria;
	private List<IObserverJugador> observers;
	
	public Jugador(String nombre, List<Integer> numerosLoteria) {
		this.nombreJugador = nombre;
		this.numPredecidoLoteria = numerosLoteria;
		this.observers = new ArrayList<IObserverJugador>();
	}
	
	@Override
	public void sorteoEfectuado( List<Integer> numGanLoteria ) {
		this.numGanadoresLoteria =  numGanLoteria;
		int numAciertos = numeroAciertos();
		
		for( IObserverJugador observerJugador: this.observers ) {
			observerJugador.numeroAcertados( numAciertos );
		}
	}
	
	public String getNombre () {
		return this.nombreJugador;
	}
	
	public int numeroAciertos () {
		int numAciertos = 0;
		for( int i = 0; i < this.numPredecidoLoteria.size(); i++ ) {
			if( this.numPredecidoLoteria.get(i) == this.numGanadoresLoteria.get(i) ) {
				numAciertos++;
			}
		}
		return numAciertos;
	}

	@Override
	public void registerObserver(IObserverJugador jugador) {
		observers.add(jugador);
	}

	@Override
	public void removeObserver(IObserverJugador jugador) {
		observers.remove(jugador);
	}
}
