package es.uji.ei1039.practica4.sorteo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.uji.ei1039.practica4.observadoresLoteria.IObserverSorteo;

public class LoteriaPrimitiva implements ISubjectSorteo {
	
	private List<Integer> numerosSorteo;
	private List<IObserverSorteo> observers;
	private INumerosSorteoFactory numerosSorteoFactory;
	
	public LoteriaPrimitiva( INumerosSorteoFactory numerosSorteoFactory ) {
		this.numerosSorteo = new ArrayList<>();
		this.observers = new ArrayList<>();
		this.numerosSorteoFactory = numerosSorteoFactory;
	}

	@Override
	public void registerObserver( IObserverSorteo observer ) {
		this.observers.add( observer );
	}

	@Override
	public void removeObserver( IObserverSorteo observer ) {
		this.observers.remove( observer );
	}

	@Override
	public void notifyObservers() {
		for( IObserverSorteo observer: this.observers ) {
			observer.sorteoEfectuado( this.numerosSorteo );
		}
	}
	
	public void nuevoSorteo() {
		
		Integer [] numeros = this.numerosSorteoFactory.getNumerosSorteo();
		
		this.numerosSorteo.addAll( Arrays.asList( numeros ) );
		notifyObservers();
	}
	
	public List<Integer> getNumerosSorteo() {
		return this.numerosSorteo;
	}

}
