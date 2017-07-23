package com.facol.si.lpoo.mario.repositorio;

import java.util.ArrayList;
import com.facol.si.lpoo.mario.basicas.Cliente;

public class RepositorioCliente {
	
	private ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
	private static RepositorioCliente instanceRepositorioCliente;
	
	private RepositorioCliente(){
		
	}
	
	public static RepositorioCliente instanceRepoCliente(){
		if(RepositorioCliente.instanceRepositorioCliente == null)
			RepositorioCliente.instanceRepositorioCliente = new RepositorioCliente();
		return instanceRepositorioCliente;
		
	}
	
	public void inserirRepoCliente (Cliente cliente){
		
		listaCliente.add(cliente);
	}

}
