package com.facol.si.lpoo.mario.repositorio;
import java.util.ArrayList;

import com.facol.si.lpoo.mario.basicas.Carro;

public class RepositorioCarro {
	
	private ArrayList<Carro> listaCarro = new ArrayList<Carro>();
	private static RepositorioCarro instanteRepositorioCarro;
	
	private RepositorioCarro(){
		
	}
	
	public static RepositorioCarro getInstanceRepoCarro(){
		if(RepositorioCarro.instanteRepositorioCarro == null)
			RepositorioCarro.instanteRepositorioCarro = new RepositorioCarro();
		return instanteRepositorioCarro;
		
	}
		
	
	public void inserirRepCarro(Carro carro){
		
		listaCarro.add(carro);
	}
	
	public void removerRepCarro(Carro carro){
		
		listaCarro.add(carro);
	}	

}
