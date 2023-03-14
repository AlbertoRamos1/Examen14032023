package com.arc.examen.models;

public class Nivel {

	private int id, idCentro;
	private String descripcion;
	/**
	 * 
	 */
	public Nivel() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param idCentro
	 * @param descripcion
	 */
	public Nivel(int id, int idCentro, String descripcion) {
		super();
		this.id = id;
		this.idCentro = idCentro;
		this.descripcion = descripcion;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the idCentro
	 */
	public int getIdCentro() {
		return idCentro;
	}
	/**
	 * @param idCentro the idCentro to set
	 */
	public void setIdCentro(int idCentro) {
		this.idCentro = idCentro;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return descripcion;
	}
	
	
}
