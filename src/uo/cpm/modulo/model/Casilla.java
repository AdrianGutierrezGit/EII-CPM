package uo.cpm.modulo.model;

public class Casilla {

	private String imagen;
	public enum TipoCasilla {RODILLO,CORTADOR,CHAMPIÑON,PEPERONI,QUESO,HORNO,TOMATE,PIÑA,VACIO};
	private TipoCasilla tipo;
	private boolean parejaEncontrada;
	
	public Casilla(String imagen, TipoCasilla tipo, boolean parejaEncontrada) {
		this.tipo = tipo;
		this.imagen = imagen;
		this.parejaEncontrada = parejaEncontrada;
	}

	public TipoCasilla getTipo() {
		return tipo;
	}

	public String getImagen() {
		return imagen;
	}

	public boolean isParejaEncontrada() {
		return parejaEncontrada;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public void setTipo(TipoCasilla tipo) {
		this.tipo = tipo;
	}

	public void setParejaEncontrada(boolean parejaEncontrada) {
		this.parejaEncontrada = parejaEncontrada;
	}
	
	
	
	
}
