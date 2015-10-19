package es.uji.ei1039.practica4.observer;

public interface ISubjectJugador {

	public void registerObserver (IObserverJugador jugador);
	public void removeObserver (IObserverJugador jugador);
}