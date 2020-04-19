package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		List<Integer> listaResultado = new ArrayList<>();
		int i=0;

		do{
			listaResultado.add(
					i <= 1 ? i : listaResultado.get(i-1) + listaResultado.get(i-2) );
			i++;
		}while(listaResultado.get(i-1) <= 350);

		return listaResultado;
	}

	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}
}