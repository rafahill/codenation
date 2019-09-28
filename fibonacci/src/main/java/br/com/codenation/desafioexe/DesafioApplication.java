package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

import br.com.codenation.TestadorFibonacci;
import br.com.codenation.annotation.Desafio;

public class DesafioApplication {

	public static void main(String[] args) {
		new TestadorFibonacci().testaDesafio(DesafioApplication.class);
	}

	@Desafio("Fibonacci")
	public static List<Integer> fibonacci() {
		List<Integer> array = new ArrayList();
		int atual = 0;
		int ant = 0;
		int aux;

		while (atual < 350){
			if(atual == 0){
				array.add(atual);
				atual ++;
			} else {
				array.add(atual);
				aux = atual;
				atual = atual + ant;
				ant = aux;
			}
		}
		return array;
	}

	@Desafio("isFibonacci")
	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}

}
