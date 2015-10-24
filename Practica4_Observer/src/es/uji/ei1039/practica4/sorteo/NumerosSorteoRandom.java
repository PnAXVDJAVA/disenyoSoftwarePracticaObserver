package es.uji.ei1039.practica4.sorteo;

import java.util.Random;

public class NumerosSorteoRandom implements INumerosSorteoFactory {

	@Override
	public Integer[] getNumerosSorteo() {
		Random r = new Random();
		Integer [] numerosSorteo = 
							{ r.nextInt(48) + 1, r.nextInt(48) + 1, r.nextInt(48) + 1,
							r.nextInt(48) + 1, r.nextInt(48) + 1, r.nextInt(48) + 1 };
		return numerosSorteo;
	}

}
