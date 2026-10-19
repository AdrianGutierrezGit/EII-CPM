package uo.cpm.modulo.model;

import java.util.ArrayList;
import java.util.List;

import uo.cpm.modulo.util.FileUtilReservas;

public class Pedido {

	private Articulo pizzaDelDia;
	private float importeTotal;
	private List<Articulo> listaPedido;
	private Carta carta;
	private Reserva reserva;
	private Juego juego;
	private int numComanda;
	private String observacionesComanda;

	public float getImportePedido() {
		return importeTotal;
	}
	
	public Pedido() {
		listaPedido = new ArrayList<>();
		inicializarPedido();
	}

	public void inicializarPedido() {
		carta = new Carta();
		reserva = new Reserva();
		juego = new Juego();
		listaPedido.clear();
		setImporteTotal(0);
		observacionesComanda = "";
		numComanda = 0;
		pizzaDelDia = generarPizzaDelDia();
		
	}

	private void setImporteTotal(int importeTotal) {
		this.importeTotal = importeTotal;
		
	}

	private Articulo generarPizzaDelDia() {
		int numeroPizzaAleatorio = ((int) (Math.random() * carta.getNumPizzas()));
		List<Articulo> pizzas = carta.pizzasEnCarta();
		Articulo pizzaDelDia = pizzas.get(numeroPizzaAleatorio);
		pizzaDelDia.setPrecio((float) (pizzaDelDia.getPrecio()*0.8));
		return pizzaDelDia;
	}

	public float getPrecioPizzaDelDia() {
		return pizzaDelDia.getPrecio();
	}

	public String getCodigoPizzaDelDia() {
		return pizzaDelDia.getCodigo();
	}

	public String getDenominacionPizzaDelDia() {
		return pizzaDelDia.getDenominacion();
	}

	public String getDescripcionPizzaDelDia() {
		return pizzaDelDia.getDescripcion();
	}

	public void añadirAPedido(int indice) {
		Articulo articuloAAñadir =carta.getCarta().get(indice);
		Articulo articuloNuevo = null;
		for(Articulo art: listaPedido) {
			if(art.getCodigo().equals(articuloAAñadir.getCodigo())) {
				articuloNuevo = art;
			}
		}
		if(articuloNuevo != null) {
			articuloNuevo.setUnidades(articuloAAñadir.getUnidades() + 1);
		}else {
			articuloAAñadir.setUnidades(1);
			listaPedido.add(articuloAAñadir);
		}
		importeTotal += articuloAAñadir.getPrecio();
		
	}


	public void eliminarDePedido(int indice) {
		Articulo articuloAEliminar =carta.getCarta().get(indice);
		Articulo articuloEnPedido = null;
		for(Articulo art: listaPedido) {
			if(articuloAEliminar.getCodigo().equals(art.getCodigo())) {
				articuloEnPedido = art;
			}
		}
		if(articuloEnPedido != null) {
			if(articuloEnPedido.getUnidades() > 1) {
				articuloEnPedido.setUnidades(articuloEnPedido.getUnidades() - 1);
			}else {
				listaPedido.remove(articuloEnPedido);
			}
			importeTotal -= articuloAEliminar.getPrecio();
			if(importeTotal < 0) {
				importeTotal = 0;
			}
		}
		
	}


	public void guardarReserva(String dni, String numReserva) {
		reserva.setDni(dni);
		reserva.setNumReserva(numReserva);
		
	}

	public String escribirPedido() {
		String pedido = "";
		for(Articulo art: listaPedido) {
			if(art.getUnidades() != 0) {
				pedido += art.toString() + "\n";
			}
		}
		return pedido;
	}

	public void iniciarNuevaComanda() {
		listaPedido.clear();
		setImporteTotal(0);
		
	}

	public float getPrecioArticulo(int indice) {
		if(carta.getCarta().get(indice).getDenominacion().equals(pizzaDelDia.getDenominacion())) {
			carta.getCarta().get(indice).setPrecio(pizzaDelDia.getPrecio());
			return pizzaDelDia.getPrecio();
		}else {
			return carta.getCarta().get(indice).getPrecio();
		}
	}

	public boolean isPizzaDelDia(int indice) {
		if(carta.getCarta().get(indice).getDenominacion().equals(pizzaDelDia.getDenominacion())) {
			return true;
		}
		return false;
	}

	public void eliminarPizzaDelDia() {
		Articulo articuloAEliminar = pizzaDelDia;
		Articulo articuloEnPedido = null;
		for(Articulo art: listaPedido) {
			if(articuloAEliminar.getCodigo().equals(art.getCodigo())) {
				articuloEnPedido = art;
			}
		}
		if(articuloEnPedido != null) {
			if(articuloEnPedido.getUnidades() > 1) {
				articuloEnPedido.setUnidades(articuloEnPedido.getUnidades() - 1);
			}else {
				listaPedido.remove(articuloEnPedido);
			}
			importeTotal -= articuloAEliminar.getPrecio();
			if(importeTotal < 0) {
				importeTotal = 0;
			}
		}
		
	}

	public void añadirPizzaDelDia() {
		Articulo articuloAAñadir = pizzaDelDia;
		Articulo articuloNuevo = null;
		for(Articulo art: listaPedido) {
			if(art.getCodigo().equals(articuloAAñadir.getCodigo())) {
				articuloNuevo = art;
			}
		}
		if(articuloNuevo != null) {
			articuloNuevo.setUnidades(articuloAAñadir.getUnidades() + 1);
		}else {
			articuloAAñadir.setUnidades(1);
			listaPedido.add(articuloAAñadir);
		}
		importeTotal += articuloAAñadir.getPrecio();
		
		
	}

	public boolean noHayPedido() {
		return listaPedido.isEmpty();
	}

	public boolean yaHaJugado() {
		return juego.isHaJugado();
	}
	
	public boolean comprobarFinJuego() {
		if(juego.getNumIntentos()== 0) {
			return true;
		}
		return false;
		
	}
	
	public void haJugadoAlJuego() {
		juego.setHaJugado(true);
		
	}

	public int getNumIntentosJuego() {
		return juego.getNumIntentos();
	}

	public int getTamañoTablero() {
		return juego.getTamaño();
	}

	public void seleccionCasilla(int indice) {
		juego.seleccionCasilla(indice);
		
	}

	public String obtenerImagen(int indice) {
		return juego.obtenerImagen(indice);
	}

	public boolean comprobarParejas(int indice) {
		return juego.comprobarParejas(indice);
	}

	public boolean hayPareja() {
		return juego.hayPareja();
	}

	public void imprimirConfiguracionTablero() {
		juego.imprimirConfiguracionTablero();
		
	}

	public boolean hayDosCasillasSeleccionadas() {
		return juego.hayDosCasillasSeleccionadas();
	}

	public void añadirPremio() {
		juego.añadirPremio();
		
	}

	public boolean haObtenidoPremios() {
		return juego.haObtenidoPremios();
	}

	public int getNumPremios() {
		return juego.getNumPremios();
	}

	public String getDenominacionPremio(int indice) {
		return juego.getDenominacionPremio(indice);
	}

	public String getFotoPremio(int indice) {
		return juego.getFotoPremio(indice);
	}

	public boolean hayIntentos() {
		return juego.hayIntentos();
		
	}

	public int getNumArticulosPedido() {
		return listaPedido.size();
		
	}

	public String getDenominacionArticuloEnPedido(int indice) {
		return listaPedido.get(indice).getDenominacion();
	}

	public int getUnidadesArticuloEnPedido(int indice) {
		return listaPedido.get(indice).getUnidades();
	}

	public float getPrecioArticuloEnPedido(int indice) {
		return listaPedido.get(indice).getPrecio();
	}

	public boolean isSeleccionUno(int indice) {
		return juego.isSeleccionUno(indice);
	}

	public boolean isSeleccionDos(int indice) {
		return juego.isSeleccionDos(indice);
	}

	public void registrarComanda(String observaciones) {
		this.observacionesComanda = observaciones;
		numComanda++;
		FileUtilReservas.grabarComandas(this);
	}

	public String numeroDeComanda() {
		return reserva.getNumReserva() + "_C" + numComanda;
	}
	
	public String toString() {
		String cadena = "";
		for(Articulo art: listaPedido) {
			cadena += art.getCodigo() + "@" + art.getDenominacion() + "@" + art.getUnidades() + "\n";
		}
		if(observacionesComanda.equals("")) {
			cadena += "No hay observaciones";
		}else {
			cadena += "Observaciones: " + observacionesComanda;
		}
		return cadena;
	}
	
	
	
	
}
