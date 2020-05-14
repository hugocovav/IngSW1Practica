package com.fca.calidad;



import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AlumnoDAOTest {
	
	private AlumnoDAO alumnoDAO;

	
	@Before
	public void setup()
	{
		alumnoDAO =new AlumnoDAOHashMap();
		alumnoDAO.getAllAlumno().clear(); //limpiar nuestra BD
	}
	
	@After
	public void teardown()
	{
		
	}
	
	
	@Test
	public void insertarDatoNuevotest() {
		
		Alumno alumno = new Alumno("001", "nombre", "apellido", 20, 8.0f);//inseertar
		
		alumnoDAO.addAlumno(alumno);//CONSULTA
		
		String resultadoEsperado = "nombre apellido";
		String resultadoEjecucion = alumnoDAO.getAlumnoName("001");
		
		assertThat(resultadoEsperado, equalTo(resultadoEjecucion));
		
	}
	
	@Test
	public void borrarElementoTest() {
		Alumno alumno = new Alumno("001", "nombre", "apellido", 20, 8.0f);//agregaralumno
		alumnoDAO.addAlumno(alumno);
		
		alumnoDAO.removeAlumno(alumno);
		
		String resultadoEsperado="";
		String resultadoEjecucion = alumnoDAO.getAlumnoName("001");
		
		assertThat(resultadoEsperado, equalTo(resultadoEjecucion));
	}
	
	@Test
	public void actualizarElementoTest() {
		Alumno alumno = new Alumno("001", "nombre", "apellido", 20, 8.0f);//agregaralumno
		alumnoDAO.addAlumno(alumno);
		
		
		alumnoDAO.updateAlumnoPromedio(alumno, 9.0f);
		
		
		Float resultadoEsperado= 9.0f;
		Float resultadoEjecucion = alumno.getAverage();
		
		assertThat(resultadoEsperado, equalTo(resultadoEjecucion));
	}
	
}
