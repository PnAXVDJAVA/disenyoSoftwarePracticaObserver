package es.uji.ei1039.practica4.subject;

import es.uji.ei1039.practica4.observer.IObserverSorteo;

public interface ISubjectSorteo {

	public void registerObserver( IObserverSorteo observer );
	public void removeObserver( IObserverSorteo observer );
	public void notifyObservers();
	
}
