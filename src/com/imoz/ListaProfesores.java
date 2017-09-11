package com.imoz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaProfesores {

	private List<Profesor> listaProfesores;
	
	public ListaProfesores() {
		listaProfesores = new ArrayList<>();
	}
	
	public void addProfesor(Profesor profesor){
		listaProfesores.add(profesor);
	}
	
	public void imprimirListin(){
		String tipoProfesor = "";
		System.out.println("----------------------LISTADO DE PROFESORES---------------------- \n");
		for(Profesor profesor: listaProfesores){
			System.out.println(profesor.toString());
			if(profesor instanceof ProfesorInterino){
				tipoProfesor="Interino";
			}
			if(profesor instanceof ProfesorTitular){			
				tipoProfesor="Titular";
			}
			System.out.println("Tipo Profesor: "+tipoProfesor+" ---->Sueldo Profesor: "+(profesor.importeNomina()+"\n"));
		}
	}
	
	public float importeTotalNominaProfesorado(){
		float importeTotal = 0f;
		Iterator<Profesor> it = listaProfesores.iterator();
		while(it.hasNext()){
			importeTotal = importeTotal + it.next().importeNomina();
		}
		return importeTotal;
	}
	
}
