package Lista04;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Lista03.Quadrado;
import Lista03.UsaQuadrado;

public class TestQuadrado {

	@Test
	public void testQuadradoAreaOk() {
		// dado que...
		Quadrado q = new Quadrado(2);
		// quando eu...
		q.area();
		// espero que...
		assertTrue(q.area() == 4);
	}

	@Test
	public void testQuadradoPerimetroOK() {
		// dado que...
		Quadrado q = new Quadrado(2);
		// quando eu...
		q.perimetro();
		// espero que...
		assertTrue(q.perimetro() == 8);
	}
	
	@Test
	public void testUsaQuadradoArea1Ok() {
		//dado que...
		UsaQuadrado q = new UsaQuadrado();
		//quando eu...
		q.q1.area();
		//espero que...
		assertTrue(q.q1.area() == 4);
	}
	
	@Test
	public void testUsaQuadradoArea2Ok() {
		//dado que...
		UsaQuadrado q = new UsaQuadrado();
		//quando eu...
		q.q2.area();
		//espero que...
		assertTrue(q.q2.area() == 16 );
	}
	
	@Test
	public void testUsaQuadradoArea3Ok() {
		//dado que...
		UsaQuadrado q = new UsaQuadrado();
		//quando eu...
		q.q3.area();
		//espero que...
		assertTrue(q.q3.area() == 25);
	}
	
	@Test
	public void testUsaQuadradoPerimetro1Ok() {
		//dado que...
		UsaQuadrado q = new UsaQuadrado();
		//quando eu...
		q.q1.perimetro();
		//espero que...
		assertTrue(q.q1.perimetro() == 8);
	}
	
	@Test
	public void testUsaQuadradoPerimetro2Ok() {
		//dado que...
		UsaQuadrado q = new UsaQuadrado();
		//quando eu...
		q.q2.perimetro();
		//espero que...
		assertTrue(q.q2.perimetro() == 16);
	}
	
	@Test
	public void testUsaQuadradoPerimetro3Ok() {
		//dado que...
		UsaQuadrado q = new UsaQuadrado();
		//quando eu...
		q.q3.perimetro();
		//espero que...
		assertTrue(q.q3.perimetro() == 20);
	}
	
	

}
