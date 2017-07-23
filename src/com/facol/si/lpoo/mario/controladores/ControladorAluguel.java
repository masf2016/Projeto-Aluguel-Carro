package com.facol.si.lpoo.mario.controladores;
import java.util.ArrayList;

import com.facol.si.lpoo.mario.basicas.Aluguel;
import com.facol.si.lpoo.mario.repositorio.RepositorioAluguel;

public class ControladorAluguel {
	
	private static ControladorAluguel instanceControladorAluguel;
	
	private ControladorAluguel(){
		
	}
		public static ControladorAluguel getInstanceControlAluguel(){
			
			if(ControladorAluguel.instanceControladorAluguel == null)
				ControladorAluguel.instanceControladorAluguel = new ControladorAluguel();
			return ControladorAluguel.instanceControladorAluguel;
		}
	
	public void cadastrarAluguel(Aluguel aluguel){
		RepositorioAluguel repoAluguel = RepositorioAluguel.getInstanceRepoAluguel();
		repoAluguel.inserirRepAluguel(aluguel);
		
	}
	
	
	public void remover(Aluguel aluguel) {
		
	}
	
	
	public ArrayList<Aluguel> listarAluguel() {
		
		return null;
	}

}
