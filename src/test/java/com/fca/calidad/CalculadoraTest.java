package com.fca.calidad;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CalculadoraTest {
	private Calculadora miCalculadora ;
	
	@Before
	public void setup(){
		 miCalculadora = new Calculadora();
	}
	

	@Test
	public void sumaPositivosTest() {
		
		//Llamar al código
		float resultadoEsperado = 10;
		float resultadoEjecucion = miCalculadora.suma(4, 6);
		//Verificar
		assertThat(resultadoEsperado, equalTo(resultadoEjecucion));
	}
	
	@Test
	public void sumaConCeroTest() {
		//Llamar al código
		float resultadoEsperado = 4;
		float resultadoEjecucion = miCalculadora.suma(0, 4);
	
		//Verificar
		assertThat(resultadoEsperado, equalTo(resultadoEjecucion));
		
	}
	
	@Test
	public void multiplicacionConCero() {
		
		float resultadoEsperado = 0;
		float resultadoEjecucion = miCalculadora.multiplica(0, 4);
		
		assertThat(resultadoEsperado, equalTo(resultadoEjecucion));
	}
	
	@Test
	public void multiplicacionPositivos() {
		
		float resultadoEsperado = 6;
		float resultadoEjecucion = miCalculadora.multiplica(3, 2);
		
		assertThat(resultadoEsperado, equalTo(resultadoEjecucion));
	}
	
	@Test
	public void DivideConCero() {
		
		float resultadoEsperado = 0;
		float resultadoEjecucion = miCalculadora.divide(0, 2);
		
		assertThat(resultadoEsperado, equalTo(resultadoEjecucion));
	}
	
	@Test
	public void DividePositivos() {
		
		float resultadoEsperado = 2;
		float resultadoEjecucion = miCalculadora.divide(6, 3);
		
		assertThat(resultadoEsperado, equalTo(resultadoEjecucion));
	}
	
	 @Test(expected = ArithmeticException.class)
	 public void dividirEntreCero()
	 {
		 float resultadoEjecucion = miCalculadora.divide(10, 0);
		 System.out.println("Ejecutando division entre cero");
	 }
	 
	
	
	@After
	public void tearDown(){
		System.out.println("Prueba terminada!");
	}
}