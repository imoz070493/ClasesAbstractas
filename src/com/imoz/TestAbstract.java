package com.imoz;

import java.util.Calendar;

public class TestAbstract {

	public static void main(String[] args) {
		
		Calendar fecha1 = Calendar.getInstance();
		fecha1.set(2019, 10, 22);
		
		ProfesorInterino pi1 = new ProfesorInterino("Jose", "Hernandez Lopez", 45, "PRO-IN-1", fecha1);
		ProfesorInterino pi2 = new ProfesorInterino("Andrés", "Moltó Parra", 87, "PRO-IN-2", fecha1);
        ProfesorInterino pi3 = new ProfesorInterino("José", "Ríos Mesa", 76, "PRO-IN-3", fecha1);
        ProfesorTitular pt1 = new ProfesorTitular("Juan", "Pérez Pérez", 23, "PRO-TI-1", 30);
        ProfesorTitular pt2 = new ProfesorTitular("Alberto", "Centa Mota", 49, "PRO-TI-2", 20);
        ProfesorTitular pt3 = new ProfesorTitular("Alberto", "Centa Mota", 49, "PRO-TI-3", 33);
        
        ListaProfesores lstProfesores = new ListaProfesores();
        
        lstProfesores.addProfesor(pi1);
        lstProfesores.addProfesor(pi2); 
        lstProfesores.addProfesor(pi3);
        lstProfesores.addProfesor(pt1); 
        lstProfesores.addProfesor(pt2); 
        lstProfesores.addProfesor(pt3);
        
		lstProfesores.imprimirListin();
		
		System.out.println ("El importe de las nóminas del profesorado que consta en el listín es: " +
		        lstProfesores.importeTotalNominaProfesorado()+ " euros");
		
	}

}
