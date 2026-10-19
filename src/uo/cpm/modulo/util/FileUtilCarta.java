package uo.cpm.modulo.util;
import java.io.*;
import java.util.*;

import uo.cpm.modulo.model.Articulo;
import uo.cpm.modulo.model.Pedido;
import uo.cpm.modulo.model.Reserva;


public abstract class FileUtilCarta {

	public static void loadFile(String nombreFicheroEntrada, List<Articulo> listaCatalogo) {

		String linea;
		String[] datosArticulo = null;

		try {
			BufferedReader fichero = new BufferedReader(new FileReader(nombreFicheroEntrada));
			while (fichero.ready()) {
				linea = fichero.readLine();
				datosArticulo = linea.split("@");
				listaCatalogo.add(new Articulo(datosArticulo[0], datosArticulo[1], datosArticulo[2],datosArticulo[3],
						datosArticulo[4], Float.parseFloat(datosArticulo[5]), 0));
			}
			fichero.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("El archivo no se ha encontrado.");
		} catch (IOException ioe) {
			new RuntimeException("Error de entrada/salida.");
		}
	}
}
