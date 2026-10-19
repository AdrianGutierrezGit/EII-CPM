package uo.cpm.modulo.model;

import uo.cpm.modulo.model.Casilla.TipoCasilla;

public class Tablero {


	private int tamaño;
	private Casilla[] casillas;
	
	
	public Tablero(int tamaño) {
		this.tamaño = tamaño;
		casillas = new Casilla[this.tamaño];
		for(int i = 0; i < casillas.length; i++) {
			casillas[i] = new Casilla(null, TipoCasilla.VACIO,false);
		}
		colocarParejas();
	}


	private void colocarParejas() {
		for(int i = 0; i < 2; i++) {
			colocarRodillo();
			colocarCortador();
			colocarChampiñon();
			colocarPeperoni();
			colocarQueso();
			colocarHorno();
			colocarTomate();
			colocarPiña();
			
		}
		
	}



	private void colocarPiña() {
		int posicionPiña = (int) (Math.random() * tamaño);
		while(casillas[posicionPiña].getTipo() != 	TipoCasilla.VACIO) {
			posicionPiña = (int) (Math.random() * tamaño);
		}
		casillas[posicionPiña] = new Casilla("/img/piña.jpg", TipoCasilla.PIÑA,false);
		
	}


	private void colocarTomate() {
		int posicionTomate = (int) (Math.random() * tamaño);
		while(casillas[posicionTomate].getTipo() != TipoCasilla.VACIO) {
			posicionTomate = (int) (Math.random() * tamaño);
		}
		casillas[posicionTomate] = new Casilla("/img/tomate.jpg", TipoCasilla.TOMATE,false);
		
	}


	private void colocarHorno() {
		int posicionHorno = (int) (Math.random() * tamaño);
		while(casillas[posicionHorno].getTipo() != TipoCasilla.VACIO) {
			posicionHorno = (int) (Math.random() * tamaño);
		}
		casillas[posicionHorno] = new Casilla("/img/horno.jpg", TipoCasilla.HORNO,false);
		
	}


	private void colocarQueso() {
		int posicionQueso = (int) (Math.random() * tamaño);
		while(casillas[posicionQueso].getTipo() != TipoCasilla.VACIO) {
			posicionQueso = (int) (Math.random() * tamaño);
		}
		casillas[posicionQueso] = new Casilla("/img/queso.jpg", TipoCasilla.QUESO,false);
		
	}


	private void colocarPeperoni() {
		int posicionPeperoni = (int) (Math.random() * tamaño);
		while(casillas[posicionPeperoni].getTipo() != TipoCasilla.VACIO) {
			posicionPeperoni = (int) (Math.random() * tamaño);
		}
		casillas[posicionPeperoni] = new Casilla("/img/peperoni.jpg", TipoCasilla.PEPERONI,false);
		
	}


	private void colocarChampiñon() {
		int posicionChampiñon = (int) (Math.random() * tamaño);
		while(casillas[posicionChampiñon].getTipo() != TipoCasilla.VACIO) {
			posicionChampiñon = (int) (Math.random() * tamaño);
		}
		casillas[posicionChampiñon] = new Casilla("/img/champiñon.jpg", TipoCasilla.CHAMPIÑON,false);
		
	}


	private void colocarCortador() {
		int posicionCortador = (int) (Math.random() * tamaño);
		while(casillas[posicionCortador].getTipo() != TipoCasilla.VACIO) {
			posicionCortador = (int) (Math.random() * tamaño);
		}
		casillas[posicionCortador] = new Casilla("/img/cortador.jpg", TipoCasilla.CORTADOR,false);
		
	}


	private void colocarRodillo() {
		int posicionRodillo = (int) (Math.random() * tamaño);
		while(casillas[posicionRodillo].getTipo() != TipoCasilla.VACIO) {
			posicionRodillo = (int) (Math.random() * tamaño);
		}
		casillas[posicionRodillo] = new Casilla("/img/rodillo.jpg", TipoCasilla.RODILLO,false);
		
	}
	
	public int getTamaño() {
		return tamaño;
	}


	public String obtenerImagen(int indice) {
		return casillas[indice].getImagen();
		
	}
	
	public Casilla[] getCasillas() {
		return casillas;
	}


	public void imprimirConfiguaracionTablero() {
		int contadorLineas = 0;
		for(int i = 0; i < tamaño; i++) {
			contadorLineas++;
			System.out.print(casillas[i].getTipo() + "    ");
			if(contadorLineas == 4) {
				System.out.println();
				contadorLineas = 0;
			}
		}	
	}
}
