package uo.cpm.modulo.model;

public class Articulo {

	private String codigo;
	private String denominacion;
	private String descripcion;
	private boolean intolerancias;
	private String categoria;
	private float precio;
	private int unidades;
	
	public Articulo(String codigo, String denominacion, String descripcion, String intolerancias, String categoria, float precio, int unidades) {
		this.codigo = codigo;
		this.denominacion = denominacion;
		this.descripcion = descripcion;
		if(intolerancias.equals("SI")) {
			this.intolerancias = true;
		}else {
			this.intolerancias = false;
		}
		this.categoria = categoria;
		this.precio = precio;
		this.unidades = unidades;
		
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public boolean isIntolerancias() {
		return intolerancias;
	}

	public String getCategoria() {
		return categoria;
	}

	public float getPrecio() {
		return precio;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setIntolerancias(boolean intolerancias) {
		this.intolerancias = intolerancias;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	
	
}
