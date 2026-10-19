package uo.cpm.modulo.model;

public class Reserva {

	private String dni;
	private String numReserva;
	
	public Reserva(String dni, String numReserva) {
		this.dni = dni;
		this.numReserva = numReserva;
	}

	public Reserva() {
	}

	public String getDni() {
		return dni;
	}

	public String getNumReserva() {
		return numReserva;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNumReserva(String numReserva) {
		this.numReserva = numReserva;
	}
	
	
}
