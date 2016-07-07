/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.veterinaria.bean;

import cl.veterinaria.entity.Dueno;
import cl.veterinaria.service.DuenoFacadeLocal;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author ignacio
 */
@Named(value = "ingresoDuenoBean")
@ViewScoped
public class InscripcionDuenoBean implements Serializable{

	@EJB
	private DuenoFacadeLocal duenoFacade;

	private int rut;
	private String nombre;
	private int telefono;
	/**
	 * Creates a new instance of IngresoDuenoBean
	 */
	public InscripcionDuenoBean() {
	}

	public String ingresarDueno(){
		Dueno d = new Dueno();
		d.setRut(rut);
		d.setNombre(nombre);
		d.setTelefono(telefono);
		duenoFacade.create(d);
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage("Dueno ingresado correctamente"));
		return "menu";
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
}
