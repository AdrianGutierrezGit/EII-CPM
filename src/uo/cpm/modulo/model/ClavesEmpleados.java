package uo.cpm.modulo.model;

import java.util.ArrayList;
import java.util.List;

import uo.cpm.modulo.util.FileUtilClaves;

public class ClavesEmpleados {
	
	protected static final String FICHEROS_CLAVES = "files/claves.dat";
	private List<ClaveEmpleado> listaClaves;
	
	public ClavesEmpleados() {
		listaClaves = new ArrayList<>();
		cargarClaves();
	}

	private void cargarClaves() {
		FileUtilClaves.loadFile(FICHEROS_CLAVES, listaClaves);
		
	}

	public boolean confirmarClave(String nombre, String contraseña) {
		for(ClaveEmpleado clave: listaClaves) {
			if(clave.getNombre().equals(nombre) && clave.getContraseña().equals(contraseña)) {
				return true;
			}
		}
		return false;
	}
}
