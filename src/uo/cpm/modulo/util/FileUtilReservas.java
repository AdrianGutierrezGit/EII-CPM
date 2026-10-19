package uo.cpm.modulo.util;
import java.io.*;
import java.util.*;

import uo.cpm.modulo.model.Pedido;
import uo.cpm.modulo.model.Reserva;


public abstract class FileUtilReservas {

	public static void loadFile(String nombreFicheroEntrada, List<Reserva> listaReservas) {

		String linea;
		String[] datosReserva = null;

		try {
			BufferedReader fichero = new BufferedReader(new FileReader(nombreFicheroEntrada));
			while (fichero.ready()) {
				linea = fichero.readLine();
				datosReserva = linea.split("@");
				listaReservas.add(new Reserva(datosReserva[0], datosReserva[1]));
			}
			fichero.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("El archivo no se ha encontrado.");
		} catch (IOException ioe) {
			new RuntimeException("Error de entrada/salida.");
		}
	}

	public static void grabarComandas(Pedido pedido) {
		try {
			BufferedWriter fichero = new BufferedWriter(new FileWriter("files/" + pedido.numeroDeComanda() + ".dat"));
			fichero.write(pedido.toString());
			fichero.close();
		}

		catch (FileNotFoundException fnfe) {
			System.out.println("El archivo no se ha podido guardar");
		} catch (IOException ioe) {
			new RuntimeException("Error de entrada/salida");
		}
	}
	public static void eliminarReserva(String dni, String numReserva, List<Reserva> listaReservas) {
		try {
			BufferedWriter fichero = new BufferedWriter(new FileWriter("files/reservas.dat"));
			for(Reserva reserva: listaReservas) {
				if(reserva.getDni().equals(dni) && reserva.getNumReserva().equals(numReserva)) {
					break;
				}
				fichero.write(reserva.getDni() + "@" + reserva.getNumReserva() + "\n");
			}
			fichero.close();
		}

		catch (FileNotFoundException fnfe) {
			System.out.println("El archivo no se ha podido guardar");
		} catch (IOException ioe) {
			new RuntimeException("Error de entrada/salida");
		}
	}
}
