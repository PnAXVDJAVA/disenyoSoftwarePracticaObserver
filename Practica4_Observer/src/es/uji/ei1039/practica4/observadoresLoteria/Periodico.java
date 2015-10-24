package es.uji.ei1039.practica4.observadoresLoteria;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.uji.ei1039.practica4.sorteo.LoteriaConfig;

public class Periodico implements IObserverSorteo, IObserverJugador {
	
	private List<Integer> numerosGanadores;
	
	// El mapa 'numeroAcertantesPorNumeroAciertos'
	//es una tabla como la siguiente:
	//ACERTANTES CON 1 ACIERTO:  15
	//ACERTANTES CON 2 ACIERTOS: 10
	//ACERTANTES CON 3 ACIERTOS:  7
	//ETC
	
	private Map<Integer, Integer> numeroAcertantesPorNumeroAciertos;
	
	public Periodico () {
		this.numerosGanadores = null;
		this.numeroAcertantesPorNumeroAciertos = new HashMap<>();
		for (int i = 0; i < LoteriaConfig.CANTIDAD_NUMEROS; i++) {
			this.numeroAcertantesPorNumeroAciertos.put(i, 0);
		}
	}
	
	@Override
	public void numeroAcertados( int numeroAciertos ) {
		int numAcertantes = this.numeroAcertantesPorNumeroAciertos.get( numeroAciertos );
		numAcertantes++;
		this.numeroAcertantesPorNumeroAciertos.put( numeroAciertos ,  numAcertantes );
	}

	@Override
	public void sorteoEfectuado( List<Integer> numGanLoteria ) {
		this.numerosGanadores = numGanLoteria;
	}

	public void Show() {
		System.out.println("Los numeros ganadores son: " + this.numerosGanadores);
		for (Integer numAcertantes : numeroAcertantesPorNumeroAciertos.keySet()) {
			System.out.println("Numero de acertantes de " + numAcertantes + ": "
								+ this.numeroAcertantesPorNumeroAciertos.get(numAcertantes));
		}
	}
}
