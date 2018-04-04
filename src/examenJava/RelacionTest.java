package examenJava;

import static org.junit.Assert.*;

import org.junit.Test;

public class RelacionTest {

	@Test
	public void test() {
		String name = "att1,att2,att3";
		String types = "int,int,int";
		Schema miSchema = new Schema(name,types);
		String valor = "1,2,3";
		Vector val = new Vector(valor);
		Vector val2 = new Vector("2,6,7");
		Relacion nueva = new Relacion("Tabla", miSchema);
		nueva.addInstance(val);
		nueva.addInstance(val2);
		nueva.print();
	}

	@Test
	public void lecturaficherotest() {
	
		Relacion miRelacion = new Relacion("example.csv");
		//miRelacion.print();
	}

}
