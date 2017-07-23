package com.facol.si.lpoo.mario.controladores;
import java.util.ArrayList;
import com.facol.si.lpoo.mario.basicas.Cliente;
import com.facol.si.lpoo.mario.repositorio.RepositorioCliente;

public class ControladorCliente {
	
	private static ControladorCliente instanceControladorCliente;
	
	private ControladorCliente(){
		
	}
	
	public static ControladorCliente getInstanceControlCliente(){
		if(ControladorCliente.instanceControladorCliente == null)
			ControladorCliente.instanceControladorCliente = new ControladorCliente();
		return instanceControladorCliente;
		
	}
	
	public void cadastrarCliente(Cliente cliente){
		RepositorioCliente repoCliente = RepositorioCliente.instanceRepoCliente();
		repoCliente.inserirRepoCliente(cliente);
	}
	
	public void removerCliente(Cliente cliente) {
		
	}
	
	
	public ArrayList<Cliente> listarClientes() {
		
		return null;
	}

}
