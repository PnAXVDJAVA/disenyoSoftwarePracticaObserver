package es.uji.ei1039.practica4.sorteo;

import es.uji.ei1039.practica4.observadoresLoteria.IObserverSorteo;

public interface ISubjectSorteo {

	public void registerObserver( IObserverSorteo observer );
	public void removeObserver( IObserverSorteo observer );
	public void notifyObservers();
	
}
