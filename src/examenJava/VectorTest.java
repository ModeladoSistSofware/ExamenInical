package examenJava;

import static org.junit.Assert.*;

import org.junit.Test;

public class VectorTest {

	@Test
	public void contrucotrUnotest() {
		String val = "val";
		Vector aux = new Vector(3, val);
		assertEquals(3, aux.getTam());
         aux.print();
         val = "dos";
         aux.print();
	}
	@Test
	public void contructorDortest() {
		String val = "val,val,val";
		Vector aux = new Vector(val);
		assertEquals(3, aux.getTam());
        aux.print();
        val = "dos";
        aux.print();
	}

}
