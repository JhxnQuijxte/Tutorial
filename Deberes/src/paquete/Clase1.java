package paquete;
import java.util.Random;
/**
 * Esta clse {@code Clase1 } crea un objeto "cliente" del cual se recogeran mediante constructor los valores de nombre y edad
 * y recibira como parametro las dioctrias de este mediante el metodo {@code metodo1(int)}.
 * 
 * @author Manuel
 * @version 0.1
 * @since JDK1.8
 */
public class Clase1 {
/**
 * 
 */
	private int int1;
	private String string1;
	private int int2;//dioctrias
	private Clase2 patata;
	/**
	 * Constructor de cliente que recibe los parametros de edad y nombre respectivamente.
	 * @param nombre
	 * @param bolean
	 */
	public Clase1(int nombre, String bolean) {
		int1=nombre;
		string1=bolean;
		int2=0;
		patata=null;
	}
	/**
	 * Constructor por defecto de la Clase con un nombre por defecto, se recomienda para el ejercicio.
	 */
	public Clase1() {
		int1=0;
		string1="Pepe";
		int2=0;
		patata=null;
	}
	/**
	 * Este metodo sirve para asignar una cantidad de dioctrias al cliente.(set)
	 * @param args
	 */
	public void metodo1(int args){//setDioctrias()
		int2=args;
	}
	/**
	 * Este metodo es utilizado para asignar un objeto del tipo {@code Clase2} (gafa).
	 * @param args
	 */
	public void metodo2(Clase2 args){//setGafas()
		patata=args;
	}
	/**
	 * Este metodo devolvera true/false dependiendo si el cliente lleva o no lleva gafas.
	 * @return llevagafas?
	 */
	public boolean metodo3(){//llevaGafas()
		if(patata!=null){
			return true;
		}
		else{
			return false;
		}
	}
	/**
	 * Metodo que devuelve el nombre del cliente.
	 * @return nombre
	 */
	public String metodo4(){//getNombre()
		return string1;
	}
	/**
	 * Metodo que valora si el cliente necesita o no usar gafas.
	 * @return true/false
	 */
	public boolean metodo5(){//necesitaGafas?()
		Random r= new Random();
		int aux=r.nextInt(2);
		if (aux==0){
			return true;
		}
		return false;
	}
	
}
