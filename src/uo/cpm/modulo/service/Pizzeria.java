package uo.cpm.modulo.service;


import uo.cpm.modulo.model.Carta;
import uo.cpm.modulo.model.ClavesEmpleados;
import uo.cpm.modulo.model.Pedido;
import uo.cpm.modulo.model.Reservas;

public class Pizzeria {

	public Pedido pedido = new Pedido();
	public Reservas reservas = new Reservas();
	public Carta carta = new Carta();
	public ClavesEmpleados clavesEmpleados = new ClavesEmpleados();

	public Pizzeria() {
		pedido.inicializarPedido();
	}
	
	public boolean confirmarReserva(String dni, String numReserva) {
		return reservas.confirmarReserva(dni,numReserva);
	}

	public int getNumArticulos() {
		return carta.getNumArticulos();
	}

	public String getCodigoArticulo(int indice) {
		return carta.getCodigoArticulo(indice);
	}

	public String getNombreProducto(int indice) {
		return carta.getNombreProducto(indice);
	}

	public float getPrecioArticulo(int indice) {
		return pedido.getPrecioArticulo(indice);
	}

	public void añadirArticulosFiltro(String actionCommand) {
		carta.añadirArticulosFiltrados(actionCommand);
		
	}

	public void eliminarArticulosFiltro(String actionCommand) {
		carta.eliminarArticulosFiltro(actionCommand);
		
	}

	public boolean estaEnFiltro(int i) {
		return carta.estaEnFiltro(i);
	}

	public float getImportePedido() {
		return pedido.getImportePedido();
	}

	public float getPrecioPizzaDelDia() {
		return pedido.getPrecioPizzaDelDia();
	}

	public String getCodigoPizzaDelDia() {
		return pedido.getCodigoPizzaDelDia();
	}

	public String getDenominancionPizzaDelDia() {
		return pedido.getDenominacionPizzaDelDia();
	}

	public String getDescripcionPizzaDelDia() {
		return pedido.getDescripcionPizzaDelDia();
	}

	public void añadirAPedido(int indice) {
		pedido.añadirAPedido(indice);
		
	}

	public void eliminarDePedido(int indice) {
		pedido.eliminarDePedido(indice);
		
	}

	public void inicializar() {
		reservas = new Reservas();
		carta = new Carta();
		pedido.inicializarPedido();
		
	}

	public boolean confirmarClave(String nombre, String contraseña) {
		return clavesEmpleados.confirmarClave(nombre,contraseña);
	}

	public void eliminarReserva(String dni, String numReserva) {
		reservas.eliminarReserva(dni, numReserva);
		
	}

	public void guardarDatosReserva(String dni, String numReserva) {
		pedido.guardarReserva(dni, numReserva);
		
	}

	public String escribirPedido() {
		return pedido.escribirPedido();
	}

	public boolean getIntoleranciaArticulo(int indiceArticulo) {
		return carta.getIntoleranciaArticulo(indiceArticulo);
	}

	public String getDescripcionArticulo(int indiceArticulo) {
		return carta.getDescripcionArticulo(indiceArticulo);
	}

	public String getDenominacionArticulo(int indiceArticulo) {
		return carta.getDenominacionArticulo(indiceArticulo);
	}

	public void iniciarNuevaComanda() {
		pedido.iniciarNuevaComanda();
		
	}

	public int getNumIntentos() {
		return pedido.getNumIntentosJuego();
	}

	public void haJugadoAlJuego() {
		pedido.haJugadoAlJuego();
		
	}

	public int getTamañoTablero() {
		return pedido.getTamañoTablero();
	}

	public void seleccionCasilla(int indice) {
		 pedido.seleccionCasilla(indice);
		
	}

	public String obtenerImagen(int indice) {
		return pedido.obtenerImagen(indice);
	}

	public boolean comprobarParejas(int indice) {
		return pedido.comprobarParejas(indice);
	}

	public boolean comprobarFinJuego() {
		return pedido.comprobarFinJuego();
		
	}

	public boolean hayPareja() {
		return pedido.hayPareja();
	}

	public void imprimirConfiguracionTablero() {
		pedido.imprimirConfiguracionTablero();
		
	}

	public boolean hayDosCasillasSeleccionadas() {
		return pedido.hayDosCasillasSeleccionadas();
	}

	public void añadirPremio() {
		pedido.añadirPremio();
		
	}

	public boolean haObtenidoPremios() {
		return pedido.haObtenidoPremios();
	}

	public int getNumPremios() {
		return pedido.getNumPremios();
	}

	public String getDenominacionPremio(int indice) {
		return pedido.getDenominacionPremio(indice);
	}

	public String getFotoPremio(int indice) {
		return pedido.getFotoPremio(indice);
	}

	public void limpiarListaArticulosFiltrados() {
		carta.limpiarListaArticulosFiltrados();
		
	}

	public boolean isPizzaDelDia(int indice) {
		return pedido.isPizzaDelDia(indice);
	}

	public void eliminarPizzaDelDia() {
		pedido.eliminarPizzaDelDia();
		
	}

	public void añadirPizzaDelDia() {
		pedido.añadirPizzaDelDia();
		
	}

	public boolean noHayPedido() {
		return pedido.noHayPedido();
	}

	public boolean yaSeHaJugado() {
		return pedido.yaHaJugado();
	}

	public boolean hayIntentos() {
		return pedido.hayIntentos();
	}

	public int getNumArticulosPedido() {
		return pedido.getNumArticulosPedido();
	}

	public String getDenominacionArticuloEnPedido(int indice) {
		return pedido.getDenominacionArticuloEnPedido(indice);
	}

	public int getUnidadesArticuloEnPedido(int indice) {
		return pedido.getUnidadesArticuloEnPedido(indice);
	}

	public float getPrecioArticuloEnPedido(int indice) {
		return pedido.getPrecioArticuloEnPedido(indice);
	}

	public boolean isSeleccionUno(int indice) {
		return pedido.isSeleccionUno(indice);
	}

	public boolean isSeleccionDos(int indice) {
		return pedido.isSeleccionDos(indice);
	}

	public void registrarComanda(String observaciones) {
		pedido.registrarComanda(observaciones);
		
	}

	public void añadirArticulosFiltroSoloIntolerancias(String actionCommand) {
		carta.añadirArticulosFiltroSoloIntolerancias(actionCommand);
		
	}

}
