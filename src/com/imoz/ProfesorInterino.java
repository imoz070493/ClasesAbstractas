package com.imoz;

import java.util.Calendar;

public class ProfesorInterino extends Profesor{

	private Calendar fechaComienzoInterinidad;
		
	public ProfesorInterino(String nombre, String apellidos, int edad, String id, Calendar fechaInicioInterinidad){
		super(nombre, apellidos, edad, id);
		this.fechaComienzoInterinidad = fechaInicioInterinidad;
	}

	public Calendar getFechaComienzoInterinidad() {
		return fechaComienzoInterinidad;
	}

	@Override
	public String toString() {
		return super.toString().concat(" Fecha de Inicio: ")
				.concat(fechaComienzoInterinidad.getTime().toString());
	}
	
	public float importeNomina(){
		return 30f*35.60f;
	}

}
