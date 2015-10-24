package es.uji.ei1039.practica4.sorteo;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class NumerosSorteoRandom implements INumerosSorteoFactory {

	@Override
	public Integer[] getNumerosSorteo() {
		ThreadLocalRandom random = ThreadLocalRandom.current();
		int min = LoteriaConfig.MINIMO_NUM;
		int max = LoteriaConfig.MAXIMO_NUM;
		int cantidadNumeros = LoteriaConfig.CANTIDAD_NUMEROS;
		
		//Utilizamos un Set ya que los números tienen que ser diferentes entre si
		Set<Integer> conjuntoNumerosDistintos = new HashSet<>();
		while( conjuntoNumerosDistintos.size() < cantidadNumeros) {
			conjuntoNumerosDistintos.add( random.nextInt( min, max + 1 ) );
		}
				
		//Pasamos los números del conjunto a un vector
		Integer [] numerosSorteo = new Integer[ cantidadNumeros ];
		int i = 0;
		for( Integer elem: conjuntoNumerosDistintos ) {
			numerosSorteo[i] = elem;
			i++;
		}
		return numerosSorteo;
	}

}
