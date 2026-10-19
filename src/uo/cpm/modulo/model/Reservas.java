package uo.cpm.modulo.model;

import java.util.ArrayList;
import java.util.List;

import uo.cpm.modulo.util.FileUtilReservas;

public class Reservas {

	private static final String FICHERO_RESERVAS = "files/reservas.dat";
	private List<Reserva> listaReservas = null;
	
	public Reservas() {
		listaReservas = new ArrayList<Reserva>();
		cargarReservas();
	}

	private void cargarReservas() {
		FileUtilReservas.loadFile(FICHERO_RESERVAS, listaReservas);
	}

	public boolean confirmarReserva(String dni, String numReserva) {
		for(Reserva reserva: listaReservas) {
			if(reserva.getDni().equals(dni) && reserva.getNumReserva().equals(numReserva)) {
				return true;
			}
		}
		return false;
	}

	public void eliminarReserva(String dni, String numReserva) {
		Reserva reservaAElminar = null;
		for(Reserva reserva: listaReservas) {
			if(reserva.getDni().equals(dni) && reserva.getNumReserva().equals(numReserva)) {
				reservaAElminar = reserva;
			}
		}
		if(reservaAElminar != null) {
			listaReservas.remove(reservaAElminar);
		}
		FileUtilReservas.eliminarReserva(dni,numReserva, listaReservas);
		
	}
}
