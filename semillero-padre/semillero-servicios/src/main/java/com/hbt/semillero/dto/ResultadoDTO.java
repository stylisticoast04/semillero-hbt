package com.hbt.semillero.dto;

import java.io.Serializable;

/**
 * 
 * <b>Descripción:<b> Clase que determina de un servicio  o endpoint cuando sea success o error
 * <b>Caso de Uso:<b> Semillero 2022
 * @author Julian David Ruiz Morales
 * @version 1.0
 */
public class ResultadoDTO implements Serializable {
	
	/*
	 * Atributo que determina el serial de la clase
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * Atributo que determina si el request fue exitoso o no
	 */
	private boolean exitoso = false;
	/*
	 * Atributo que determina el mensaje response si fue exitoso ono 
	 */
	private String mensajeEjecucion;
	/**
	 * 
	 * Constructor de la clase.
	 * @param exitoso Atributo que determina si el request fue exitoso o no
	 * @param mensajeEjecucion Atributo que determina si el request fue exitoso o no
	 */
	public ResultadoDTO(boolean exitoso, String mensajeEjecucion) {
		// Se asigna heredando el constuctor de la clase xxx
		super();
		// Se asigna el valor  que  tenga por default en los parametros del constructor
		this.exitoso = exitoso;
		this.mensajeEjecucion = mensajeEjecucion;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo exitoso
	 * @return El exitoso asociado a la clase
	 */
	public boolean isExitoso() {
		return exitoso;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo exitoso
	 * @param exitoso El nuevo exitoso a modificar.
	 */
	public void setExitoso(boolean exitoso) {
		this.exitoso = exitoso;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo mensajeEjecucion
	 * @return El mensajeEjecucion asociado a la clase
	 */
	public String getMensajeEjecucion() {
		return mensajeEjecucion;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo mensajeEjecucion
	 * @param mensajeEjecucion El nuevo mensajeEjecucion a modificar.
	 */
	public void setMensajeEjecucion(String mensajeEjecucion) {
		this.mensajeEjecucion = mensajeEjecucion;
	}


}
