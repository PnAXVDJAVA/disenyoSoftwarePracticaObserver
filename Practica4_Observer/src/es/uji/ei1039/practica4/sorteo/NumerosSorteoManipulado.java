package es.uji.ei1039.practica4.sorteo;

public class NumerosSorteoManipulado implements INumerosSorteoFactory {
	
	@Override
	public Integer[] getNumerosSorteo() {
		Integer [] numerosSorteo = { 1, 2, 3, 25, 30, 48 };
		return numerosSorteo;
	}

}
