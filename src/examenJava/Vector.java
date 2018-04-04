package examenJava;

import java.util.ArrayList;

/**
 * Clase en java que representa una un vector de numero String
 * 
 * @author Jairo González Lemus. Email : alu0100813272@ull.edu.es Universidad:
 *         Universidad de La Laguna. Práctica Asignatura: Modelado Sistemas
 *         Sofware. Examen en clase.
 * @version 1.0
 * @since 2018-03-14
 */
public class Vector implements Cloneable {
	private ArrayList<String> datos;
	/**
	 * Constructore que le pasamos al dimensiones de nuestro vector.
	 * @param n
	 */
	public Vector(int n) {
		datos = new ArrayList<String>(n);
	}
	/**	
	 * Constructor que crea un vector con n elementos,
	 * conteniendo cada elemento el valor val .* 
	 * @param n
	 * @param val
	 */
	public Vector(int n, String val) {
		datos = new ArrayList<String>(n);
		for(int i = 0 ; i < n ;i++){
			add(val);
		}
    }

	/**
	 * Método que permite duplicar este objeto.
	 */
	 public Vector clone() throws CloneNotSupportedException {
		Vector clon = (Vector) super.clone();
		return clon;
     }
	/**
	 * Constructor que recive como argumetno un strign de valore
	 * separado por comas y crea un vector con esos elemtos.
	 */
	public Vector(String linea) {
		String aux[] = linea.split(",");
		//System.out.println(aux.length);
		datos = new ArrayList<String>(aux.length);
		for(int i = 0 ; i < aux.length ;i++){
			add(aux[i]);
		}
    }
	/**
	 * Se añade un dato a continuación del último elemnto del vector 
	 * @param dato
	 */
	public void add(String datos) {
		this.datos.add(datos);
    } 
	/**
	 * Métod que devuleve el tamaño de mi vector.
	 * @return
	 */
	public int getTam(){
		return this.datos.size();
	}
	/**
	 * Metod que cambia el valor del indice index por val.
	 * @param index
	 * @param val
	 */
	public void set(int index, String val){
		datos.set(index, val);		
	}
	/**
	 * Método que devuleve el valor de la posicion index.
	 * @param index
	 * @return
	 */
    public String get(int index){
    	return datos.get(index);
    }
    /**
     * Métod qeu devuleve un String con todo los elemento del vector.
     * @return
     */
    @Override
	public String toString() {
		String result = "";

		for (int i = 0; i < this.getTam(); i++) {
			if (i < this.getTam() - 1) {
				result = result + this.get(i) + ",";
			} else {
				result = result + this.get(i);
			}
		}
		return result;
    }
    /**
     * Método que imprime por pantalla los elemntos del vector.
     */
    public void print(){
    	System.out.println(toString());
    }
    
}
