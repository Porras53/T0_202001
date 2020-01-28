package test.logic;

import static org.junit.Assert.*;
import model.logic.Modelo;

import org.junit.Before;
import org.junit.Test;

public class TestModelo {
	
	private Modelo modelo;
	private static int CAPACIDAD=100;
	
	@Before
	public void setUp1() {
		modelo= new Modelo(CAPACIDAD);
	}

	public void setUp2() {
		for(int i =0; i< CAPACIDAD;i++){
			modelo.agregar(i); 
		}
	}

	@Test
	public void testModelo() {
		assertTrue(modelo!=null);
		assertEquals(0, modelo.darTamano());  // Modelo con 0 elementos presentes.
	}

	@Test
	public void testDarTamano() {
		// TODO
		setUp2();
		assertEquals(100, modelo.darTamano());
	}

	@Test
	public void testAgregar() {
		// TODO Completar la prueba
		setUp2();
		assertEquals(100, modelo.darTamano());
		modelo.agregar(101);
		assertEquals(101, modelo.darTamano());
	}

	@Test
	public void testBuscar() {
		// TODO Completar la prueba
		setUp2();
		assertSame(30, modelo.buscar(30));
		
	}

	@Test
	public void testEliminar() {
		setUp2();
		// TODO Completar la prueba
		assertEquals(100, modelo.darTamano());
		assertSame(30, modelo.eliminar(30));
		assertEquals(99, modelo.darTamano());
		
	}

}
