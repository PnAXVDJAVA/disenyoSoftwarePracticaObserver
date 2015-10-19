package es.uji.ei1039.practica4.subject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import es.uji.ei1039.practica4.observer.IObserverSorteo;

public class LoteriaPrimitiva implements ISubjectSorteo {
	
	private List<Integer> numerosSorteo;
	private List<IObserverSorteo> observers;
	
	public LoteriaPrimitiva() {
		this.numerosSorteo = new ArrayList<>();
		this.observers = new ArrayList<>();
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
		//Creamos los números de la lotería de forma manual para hacer las pruebas
	
		// Random r = new Random();
		/* Sumo + 1 porque el random va de 0 ala 49/
		/*Integer[] numeros = { r.nextInt(48) + 1, r.nextInt(48) + 1, r.nextInt(48) + 1,
							  r.nextInt(48) + 1, r.nextInt(48) + 1, r.nextInt(48) + 1 };
		*/
		
		Integer[] numeros = { 1, 2, 3, 25, 30, 48 };
		this.numerosSorteo.addAll( Arrays.asList( numeros ));
		notifyObservers();
	}
	
	public List<Integer> getNumerosSorteo() {
		return this.numerosSorteo;
	}

}
