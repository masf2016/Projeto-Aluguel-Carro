package com.facol.si.lpoo.mario.controladores;
import java.util.ArrayList;


import com.facol.si.lpoo.mario.repositorio.RepositorioCarro;
import com.facol.si.lpoo.mario.basicas.Carro;


public class ControladorCarro {
	
	private static ControladorCarro instanceControladorCarro;
	
	private ControladorCarro(){
		
	}
		
		public static ControladorCarro getInstanceControlCarro(){
			
			if(ControladorCarro.instanceControladorCarro == null)
				ControladorCarro.instanceControladorCarro = new ControladorCarro();
			return instanceControladorCarro;
					
		}
	
	public void cadastrarCarro(Carro carro){
		RepositorioCarro repoCarro = RepositorioCarro.getInstanceRepoCarro();
		repoCarro.inserirRepCarro(carro);
		
	}
	
	
	public void removerCarro(Carro carro) {
		
	}
	
	
	public ArrayList<Carro> listarCarro() {
		
		return null;
	}

}
