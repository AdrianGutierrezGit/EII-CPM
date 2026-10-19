package uo.cpm.modulo.model;

import java.util.ArrayList;
import java.util.List;

public class Juego {

	public static final int TAMAÑO_TABLERO = 16;
	private int numIntentos;
	private boolean haJugado;
	private Tablero tablero;
	private int casillasSeleccionadas;
	private Casilla primeraEleccion;
	private Casilla segundaEleccion;
	private List<Articulo> listaPremios;
	private Carta carta;
	
	public Juego() {
		tablero = new Tablero(TAMAÑO_TABLERO);
		listaPremios = new ArrayList<>();
		carta = new Carta();
		iniciarJuego();
	}

	private void iniciarJuego() {
		numIntentos = 5;
		haJugado = false;
		primeraEleccion = null;
		segundaEleccion = null;
		casillasSeleccionadas = 0;
		
	}

	public boolean isHaJugado() {
		return haJugado;
	}

	public int getTamaño() {
		return tablero.getTamaño();
	}

	public int getNumIntentos() {
		return numIntentos;
	}

	public void seleccionCasilla(int indice) {
		casillasSeleccionadas++;
		if(casillasSeleccionadas == 2) {
			segundaEleccion = tablero.getCasillas()[indice];
			numIntentos--;
			casillasSeleccionadas = 0;

			
		}else {
			primeraEleccion = tablero.getCasillas()[indice];
		}
		
	}

	public String obtenerImagen(int indice) {
		return tablero.obtenerImagen(indice);
		
	}

	public boolean comprobarParejas(int indice) {
		return tablero.getCasillas()[indice].isParejaEncontrada();
	}

	public boolean hayPareja() {
		if(casillasSeleccionadas == 0 && primeraEleccion.getTipo().equals(segundaEleccion.getTipo())) {
			for(int i = 0; i < tablero.getCasillas().length; i++) {
				if(tablero.getCasillas()[i].equals(primeraEleccion)) {
					tablero.getCasillas()[i].setParejaEncontrada(true);
				}
				if(tablero.getCasillas()[i].equals(segundaEleccion)) {
					tablero.getCasillas()[i].setParejaEncontrada(true);
				}
			}
			return true;
		}
		if(casillasSeleccionadas == 0) {
			return false;
		}else {
			return true;
		}
	}

	public void imprimirConfiguracionTablero() {
		tablero.imprimirConfiguaracionTablero();
		
	}

	public boolean hayDosCasillasSeleccionadas() {
		return casillasSeleccionadas == 0;
	}

	public void añadirPremio() {
		switch(numIntentos) {
			case 4:
				añadirPizzaAPremios();
				break;
			case 3:
				añadirEntranteAPremios();
				break;
			case 2:
				añadirEnsaladaAPremios();
				break;
			case 1:
				añadirPostreAPremios();
				break;
			case 0:
				añadirBebidaAPremios();
				break;
		}
		
	}

	private void añadirBebidaAPremios() {
		int numeroBebidaAleatorio = ((int) (Math.random() * carta.getNumBebidas()));
		List<Articulo> bebidas = carta.bebidasEnCarta();
		Articulo bebidaDePremio = bebidas.get(numeroBebidaAleatorio);
		listaPremios.add(bebidaDePremio);
		
	}

	private void añadirPostreAPremios() {
		int numeroPostreAleatorio = ((int) (Math.random() * carta.getNumPostres()));
		List<Articulo> postres = carta.postresEnCarta();
		Articulo postreDePremio = postres.get(numeroPostreAleatorio);
		listaPremios.add(postreDePremio);
		
	}

	private void añadirEnsaladaAPremios() {
		int numeroEnsaladaAleatorio = ((int) (Math.random() * carta.getNumEnsaladas()));
		List<Articulo> ensaladas = carta.ensaladasEnCarta();
		Articulo ensaladaDePremio = ensaladas.get(numeroEnsaladaAleatorio);
		listaPremios.add(ensaladaDePremio);
		
	}

	private void añadirEntranteAPremios() {
		int numeroEntranteAleatorio = ((int) (Math.random() * carta.getNumEntrantes()));
		List<Articulo> entrantes = carta.entrantesEnCarta();
		Articulo entranteDePremio = entrantes.get(numeroEntranteAleatorio);
		listaPremios.add(entranteDePremio);
		
	}

	private void añadirPizzaAPremios() {
		int numeroPizzaAleatorio = ((int) (Math.random() * carta.getNumPizzas()));
		List<Articulo> pizzas = carta.pizzasEnCarta();
		Articulo pizzaDePremio = pizzas.get(numeroPizzaAleatorio);
		listaPremios.add(pizzaDePremio);
		
	}

	public boolean haObtenidoPremios() {
		if(listaPremios.isEmpty()) {
			return false;
		}
		return true;
	}

	public int getNumPremios() {
		return listaPremios.size();
		
	}

	public String getDenominacionPremio(int indice) {
		return listaPremios.get(indice).getDenominacion();
	}

	public String getFotoPremio(int indice) {
		return listaPremios.get(indice).getCodigo();
	}

	public void setHaJugado(boolean haJugado) {
		this.haJugado = haJugado;
	}

	public boolean hayIntentos() {
		return numIntentos != 0;
		
	}

	public boolean isSeleccionUno(int indice) {
		if(tablero.getCasillas()[indice].equals(primeraEleccion)) {
			return true;
		}
		return false;
	}

	public boolean isSeleccionDos(int indice) {
		if(tablero.getCasillas()[indice].equals(segundaEleccion)) {
			return true;
		}
		return false;
	}
	

	
}
