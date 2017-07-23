package com.facol.si.lpoo.mario.repositorio;
import java.util.ArrayList;
import com.facol.si.lpoo.mario.basicas.Aluguel;

public class RepositorioAluguel {
	
	private ArrayList<Aluguel> listaAluguel = new ArrayList<Aluguel>();
	private static RepositorioAluguel instanceRepositorioAluguel;
	
	
	private RepositorioAluguel(){
		
	}
	
	public static RepositorioAluguel getInstanceRepoAluguel(){
		if(RepositorioAluguel.instanceRepositorioAluguel == null)
			RepositorioAluguel.instanceRepositorioAluguel = new RepositorioAluguel();
		return instanceRepositorioAluguel;
		
	}
	
	public void inserirRepAluguel(Aluguel aluguel) {
		
		listaAluguel.add(aluguel);
	}
	
	public void removerRepAluguel(Aluguel aluguel){
		
		
	}


}
