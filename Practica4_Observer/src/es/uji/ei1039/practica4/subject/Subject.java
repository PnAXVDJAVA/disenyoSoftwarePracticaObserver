package es.uji.ei1039.practica4.subject;

import es.uji.ei1039.practica4.observer.Observer;

public interface Subject {

	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
	
}
