package paquete;
/**
 * Esta clase {@code Clase2 } crea un objeto "gafa" al cual se le pasarara los valores (dioctrias)
 * mediante el setter {@code metodo2(int)}.
 * 
 * @author Manuel
 * @version 0.1
 * @since JDK1.8
 */
public class Clase2 {
	
	private int int1clase2;//dioctrias
	/**
	 * Constructor de la clase que inicializa sus valores a cero.
	 */
	public Clase2() {
		int1clase2=0;
	}
	/**
	 * Este metodo se utiliza para conocer las diactrias con las que estan graduadas las gafas.
	 * @return numero de dioctrias
	 */
	public int metodo1() {//getDioctrias()
		return int1clase2;
	}
	/**
	 * Este metodo otorga un valor, elegible por el usuario, y se asigna a la variable dioctrias
	 * @param int1clase2
	 */
	public void metodo2(int int1clase2) {//setDioctrias()
		this.int1clase2 = int1clase2;
	}

}
