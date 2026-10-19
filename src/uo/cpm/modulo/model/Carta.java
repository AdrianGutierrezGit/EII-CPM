package uo.cpm.modulo.model;

import java.util.ArrayList;
import java.util.List;

import uo.cpm.modulo.util.FileUtilCarta;

public class Carta {

	private static final String FICHERO_ARTICULOS = "files/carta.dat";
	private List<Articulo> listaArticulos;
	private List<Articulo> listaArticulosFiltrados;
	
	public Carta() {
		listaArticulos = new ArrayList<>();
		listaArticulosFiltrados = new ArrayList<>();
		cargarArticulos();
	}

	private void cargarArticulos() {
		FileUtilCarta.loadFile(FICHERO_ARTICULOS, listaArticulos);
	}

	public int getNumArticulos() {
		return listaArticulos.size();
	}

	public String getCodigoArticulo(int indice) {
		return listaArticulos.get(indice).getCodigo();
	}

	public String getNombreProducto(int indice) {
		return listaArticulos.get(indice).getDenominacion();
	}

	public float getPrecioArticulo(int indice) {
		return listaArticulos.get(indice).getPrecio();
	}

	public void añadirArticulosFiltrados(String actionCommand) {
		for(Articulo art: listaArticulos) {
			if(art.getCategoria().equals(actionCommand)) {
				listaArticulosFiltrados.add(art);
			}
		}
		
	}

	public void eliminarArticulosFiltro(String actionCommand) {
		for(int i = 0; i < listaArticulosFiltrados.size(); i++) {
			if(listaArticulosFiltrados.get(i).getCategoria().equals(actionCommand)) {
				listaArticulosFiltrados.remove(i);
				i--;
			}
		}
		
	}

	public boolean estaEnFiltro(int indice) {
		for(Articulo art: listaArticulosFiltrados) {
			if(listaArticulos.get(indice).getCodigo().equals(art.getCodigo())) {
				return true;
			}
		}
		return false;
	}
	
	public List<Articulo> getCarta(){
		return listaArticulos;
	}

	public int getNumPizzas() {
		int numPizzas = 0;
		for(Articulo art: listaArticulos) {
			if(art.getCategoria().equals("Pizza")) {
				numPizzas++;
			}
		}
		return numPizzas;
	}

	public List<Articulo> pizzasEnCarta() {
		List<Articulo> pizzas = new ArrayList<>();
		for(Articulo art: listaArticulos) {
			if(art.getCategoria().equals("Pizza")) {
				pizzas.add(art);
			}
		}
		return pizzas;
	}

	public boolean getIntoleranciaArticulo(int indiceArticulo) {
		return listaArticulos.get(indiceArticulo).isIntolerancias();
	}

	public String getDescripcionArticulo(int indiceArticulo) {
		return listaArticulos.get(indiceArticulo).getDescripcion();
	}

	public String getDenominacionArticulo(int indiceArticulo) {
		return listaArticulos.get(indiceArticulo).getDenominacion();
	}

	public float getNumEntrantes() {
		int numEntrantes = 0;
		for(Articulo art: listaArticulos) {
			if(art.getCategoria().equals("Entrante")) {
				numEntrantes++;
			}
		}
		return numEntrantes;
	}

	public List<Articulo> entrantesEnCarta() {
		List<Articulo> entrantes = new ArrayList<>();
		for(Articulo art: listaArticulos) {
			if(art.getCategoria().equals("Entrante")) {
				entrantes.add(art);
			}
		}
		return entrantes;
	}

	public float getNumEnsaladas() {
		int numEnsaladas = 0;
		for(Articulo art: listaArticulos) {
			if(art.getCategoria().equals("Ensalada")) {
				numEnsaladas++;
			}
		}
		return numEnsaladas;
	}

	public List<Articulo> ensaladasEnCarta() {
		List<Articulo> ensaladas = new ArrayList<>();
		for(Articulo art: listaArticulos) {
			if(art.getCategoria().equals("Ensalada")) {
				ensaladas.add(art);
			}
		}
		return ensaladas;

	}

	public float getNumPostres() {
		int numPostres = 0;
		for(Articulo art: listaArticulos) {
			if(art.getCategoria().equals("Postre")) {
				numPostres++;
			}
		}
		return numPostres;
	}

	public List<Articulo> postresEnCarta() {
		List<Articulo> postres = new ArrayList<>();
		for(Articulo art: listaArticulos) {
			if(art.getCategoria().equals("Postre")) {
				postres.add(art);
			}
		}
		return postres;
	}

	public float getNumBebidas() {
		int numBebidas = 0;
		for(Articulo art: listaArticulos) {
			if(art.getCategoria().equals("Bebida")) {
				numBebidas++;
			}
		}
		return numBebidas;
	}

	public List<Articulo> bebidasEnCarta() {
		List<Articulo> bebidas = new ArrayList<>();
		for(Articulo art: listaArticulos) {
			if(art.getCategoria().equals("Bebida")) {
				bebidas.add(art);
			}
		}
		return bebidas;
	}

	public void limpiarListaArticulosFiltrados() {
		listaArticulosFiltrados.clear();
		
	}

	public void añadirArticulosFiltroSoloIntolerancias(String actionCommand) {
		for(Articulo art: listaArticulos) {
			if(art.getCategoria().equals(actionCommand)) {
				if(art.isIntolerancias()) {
					listaArticulosFiltrados.add(art);
				}
			}
		}
		
	}
}
