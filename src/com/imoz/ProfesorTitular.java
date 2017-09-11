package com.imoz;

public class ProfesorTitular extends Profesor{
	
	private int tiempoTrabajo;
	
	public ProfesorTitular(String nombre, String apellidos, int edad, String id, int tiempoTrabajo){
		super(nombre, apellidos, edad, id);
		this.tiempoTrabajo = tiempoTrabajo;
	}
	
	public int getTiempoTrabajo() {
		return tiempoTrabajo;
	}

	@Override
	public String toString() {
		return super.toString().concat(" Años de Servicio: "+tiempoTrabajo);
	}
	
	public float importeNomina(){
		return 30f*43.20f;
	}

}
