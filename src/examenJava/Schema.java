package examenJava;

/**
 * Clase en java que representa El schema de uan tabla.
 * @author Jairo González Lemus. Email : alu0100813272@ull.edu.es Universidad:
 *         Universidad de La Laguna. Práctica Asignatura: Modelado Sistemas
 *         Sofware. Examen en clase.
 * @version 1.0
 * @since 2018-03-14
 */
public class Schema {
	private Vector name;
	private Vector types;
	/**
	 * Constructor se le pasa los atributos y el tipo de atributo.
	 * @param name
	 * @param types
	 */
	Schema(String name, String types){
		this.name = new Vector(name);
		this.types = new Vector(types);
	}
	/**
	 * Método que devuleve el nuemo de atirbutos
	 * @return
	 */
	public int getAttr(){
		return name.getTam();
	}

    /**
     * Métod qeu devuleve un String con todo los elemento del Scema.
     * @return
     */
    @Override
	public String toString() {
		String result = "";
        result = "Atributos: " + name.toString() + "\n";
        result = result + "Tipos: " +  types.toString();
		return result;
    }
    public void print(){
    	System.out.println(toString());
    }
}
