package com.arc.examen.models;

public class Materia {
	
	int id, idNivel;
	String nombre, codigo, urlClassroom, fechaInicio;
	boolean admiteMatricula;
	
	
	
	/**
	 * 
	 */
	public Materia() {
		super();
		// TODO Auto-generated constructor stub
	}



	/**
	 * @param id
	 * @param idNivel
	 * @param nombre
	 * @param codigo
	 * @param urlClassroom
	 * @param fechaInicio
	 * @param admiteMatricula
	 */
	public Materia(int id, int idNivel, String nombre, String codigo, String urlClassroom, String fechaInicio,
			boolean admiteMatricula) {
		super();
		this.id = id;
		this.idNivel = idNivel;
		this.nombre = nombre;
		this.codigo = codigo;
		this.urlClassroom = urlClassroom;
		this.fechaInicio = fechaInicio;
		this.admiteMatricula = admiteMatricula;
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
	 * @return the idNivel
	 */
	public int getIdNivel() {
		return idNivel;
	}



	/**
	 * @param idNivel the idNivel to set
	 */
	public void setIdNivel(int idNivel) {
		this.idNivel = idNivel;
	}



	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}



	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}



	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	/**
	 * @return the urlClassroom
	 */
	public String getUrlClassroom() {
		return urlClassroom;
	}



	/**
	 * @param urlClassroom the urlClassroom to set
	 */
	public void setUrlClassroom(String urlClassroom) {
		this.urlClassroom = urlClassroom;
	}



	/**
	 * @return the fechaInicio
	 */
	public String getFechaInicio() {
		return fechaInicio;
	}



	/**
	 * @param fechaInicio the fechaInicio to set
	 */
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}



	/**
	 * @return the admiteMatricula
	 */
	public boolean isAdmiteMatricula() {
		return admiteMatricula;
	}



	/**
	 * @param admiteMatricula the admiteMatricula to set
	 */
	public void setAdmiteMatricula(boolean admiteMatricula) {
		this.admiteMatricula = admiteMatricula;
	}



	@Override
	public String toString() {
		return nombre;
	}
	

}
