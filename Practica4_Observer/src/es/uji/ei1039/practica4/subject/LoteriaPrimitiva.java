package es.uji.ei1039.practica4.subject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.uji.ei1039.practica4.observer.Observer;

public class LoteriaPrimitiva implements Subject {
	
	private List<Integer> numerosSorteo;
	
	private List<Observer> observers;
	
	public LoteriaPrimitiva() {
		this.numerosSorteo = new ArrayList<>();
		this.observers = new ArrayList<>();
	}

	@Override
	public void registerObserver( Observer observer ) {
		this.observers.add( observer );
	}

	@Override
	public void removeObserver( Observer observer ) {
		this.observers.remove( observer );
	}

	@Override
	public void notifyObservers() {
		for( Observer observer: this.observers ) {
			observer.noticaNumerosGanadores( this.numerosSorteo );
		}
	}
	
	public void nuevoSorteo() {
		//Creamos los números de la lotería de forma manual para hacer las pruebas
		Integer [] numeros = { 1, 2, 3, 25, 30, 48 };
		this.numerosSorteo.addAll( Arrays.asList( numeros ) );
	}
	
	public List<Integer> getNumerosSorteo() {
		return this.numerosSorteo;
	}

}
