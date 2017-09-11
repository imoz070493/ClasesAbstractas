package com.imoz;

public abstract class Profesor extends Persona{

	private String idProfesor;

	public Profesor(String nombre, String apellidos, int edad, String idProfesor) {
		super(nombre, apellidos, edad);
		this.idProfesor = idProfesor;
	}

	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}
	
	public String getIdProfesor() {
		return idProfesor;
	}

	public void mostrarDatos() {
        System.out.println ("Datos Profesor. Profesor de nombre: " + getNombre() + " " +
        getApellidos() + " con Id de profesor: " + getIdProfesor() );   
    }

	@Override
	public String toString() {
		return super.toString().concat(" -IdProfesor: "+idProfesor);
	}
	
	abstract public float importeNomina();
	
}
