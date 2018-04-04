package examenJava;

import static org.junit.Assert.*;

import org.junit.Test;

public class SchemaTest {

	@Test
	public void test() {
		String name = "att1,att2,att3";
		String types = "int,int,int";

		Schema nuevo = new Schema(name,types);
		nuevo.print();
	}

}
