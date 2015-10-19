package es.uji.ei1039.practica4.observer;

import java.util.List;

public class Jugador implements Observer {

	private String nombreJugador;
	private List<Integer> numPredecidoLoteria;
	private List<Integer> numGanadoresLoteria;
	
	public Jugador(String nombre, List<Integer> numerosLoteria) {
		this.nombreJugador = nombre;
		this.numPredecidoLoteria = numerosLoteria;
	}
	

	@Override
	public void noticaNumerosGanadores( List<Integer> numGanLoteria ) {
		this.numGanadoresLoteria =  numGanLoteria;	
	}
	
	public int numeroAciertos( List<Integer> numGanLoteria ) {
		
	}
}
