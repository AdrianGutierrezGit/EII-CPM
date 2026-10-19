package uo.cpm.modulo.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import uo.cpm.modulo.model.Articulo;
import uo.cpm.modulo.model.ClaveEmpleado;

public class FileUtilClaves {
	public static void loadFile(String nombreFicheroEntrada, List<ClaveEmpleado> listaClaves) {

		String linea;
		String[] datosClave = null;

		try {
			BufferedReader fichero = new BufferedReader(new FileReader(nombreFicheroEntrada));
			while (fichero.ready()) {
				linea = fichero.readLine();
				datosClave = linea.split("@");
				listaClaves.add(new ClaveEmpleado(datosClave[0], datosClave[1]));
			}
			fichero.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("El archivo no se ha encontrado.");
		} catch (IOException ioe) {
			new RuntimeException("Error de entrada/salida.");
		}
	}
}
