package examenJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Clase en java que representa Una relacion entre el squema y los valores
 * dentro de una tabla.
 * @author Jairo González Lemus. Email : alu0100813272@ull.edu.es Universidad:
 *         Universidad de La Laguna. Práctica Asignatura: Modelado Sistemas
 *         Sofware. Examen en clase.
 * @version 1.0
 * @since 2018-03-14
 */
public class Relacion {
	private String name;
	private Schema sc;
	private Vector[] valor;
	
	Relacion(String name , Schema sc){
		this.name = name;
	    this.sc = sc;
	    valor = new Vector[1];
	    valor[0] = new Vector(1); 
	}
	
	Relacion(String nameFile){
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File(nameFile);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			// Lectura del fichero
			String linea;
			int cont = 0;
			String name = "att1,att2,att3";
			String types = "int,int,int";
			Schema miSchema = new Schema(name,types);
			String valor = "1,2,3";
			
			while ((linea = br.readLine()) != null) {	
			        
				System.out.println(linea);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
}
	}
	/**
	 * Método que crear una instacion nuvea para depsu añadirla
	 * @param m
	 */
	private void addNuevo() {
		
		Vector[] aux = valor;
		valor = new Vector[getNumInst()+1];
		
		for(int i = 0 ; i < getNumInst() - 1; i++) {
			valor[i] = aux[i];
		}
		
		valor[getNumInst() - 1] =  new Vector(getNumAttr());
     }
	/**
	 * Método que el nomgre de la relacion
	 * @return
	 */
	public String getName(){
		return name;
	}
	/**
	 * Método que devuleve el número de atributos.
	 * @return
	 */
	public int getNumAttr(){
		return sc.getAttr();
	}
	/**
	 * Metodo que devuelve el número de instancias de la relación
	 * @return
	 */
	public int getNumInst(){
		return valor.length;
	}
	/**
	 * Método que introduce una instancia nueva en la relación.
	 * @param inst
	 */
	public void addInstance(Vector inst){
		System.out.print("Nuevo");
		addNuevo();
		valor[getNumInst()-1] = inst;
	
	}
	/**
	 * Método para obtener una intancia de la relación.
	 * @param index
	 * @return
	 */
	public Vector getInstance( int index){
		return valor[index];
	}
	  /**
     * Método que devuleve un String con todo los elemento de la Relacion
     * @return
     */
    @Override
	public String toString() {
		String result = name + "\n";
		
		result = result + sc.toString()+ "\n";
		for(int i = 0; i< this.getNumInst();i++){
			result = result + valor[i].toString() + "\n";
		}
		return result;
    }
    public void print(){
    	System.out.println(toString());
    }
}
