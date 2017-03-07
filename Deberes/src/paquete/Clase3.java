package paquete;

import java.util.Random;
/**
 * Esta clase {@code Clase3 } crea un objeto "Optica" que contiene una variable cliente, y otra gafas
 * .
 * 
 * @author Manuel
 * @version 0.1
 * @since JDK1.8
 */
public class Clase3 {
	
	private Clase1 cliente;
	private Clase2 gafa;
	/**
	 * Constructor por defecto en el que cliente es igual a <i>null</i>
	 */
	public Clase3() {
		cliente=null;
		gafa=new Clase2();
	}
	/**
	 * Este metodo instancia un cliente.
	 * @param cliente
	 */
	public void metodo1(Clase1 args){ //recibir cliente
		cliente=args;
		
	}
	/**
	 * Comprueba si el cliente necesita gafas o si ya lleva unas, de ser asi muestra un mensaje y expulsa al cliente.
	 */
	public void metodo2(){//valorar necesita gafas?
		if(cliente.metodo3()==false){
			if(cliente.metodo5()==true){
				System.out.println("El cliente necesita gafas");
			}
			else{
				System.out.println("El cliente no necesita gafas y se fue.");
				metodo5();
			}
		}
		else{
			System.out.println("El cliente ya lleva gafas y se fue");
			metodo5();
		}
	}
	/**
	 * Comprueba las dioctrias del cliente y las asigna a unas gafas.
	 */
	public void metodo6(){//setdioctrias
		Random r= new Random();
		int aux=r.nextInt(7);
		cliente.metodo1(aux);
		gafa.metodo2(aux);
	}
	/**
	 * Pone las gafas a un objeto Cliente.
	 */
	public void metodo3(){//poner gafas
		cliente.metodo2(gafa);
	}
	/**
	 * Realiza la factura para el cliente
	 */
	public void metodo4(){// facturar
		Random r= new Random();
		int aux=r.nextInt(91);
		System.out.println("El total de la factura del cliente "+ cliente.metodo4()+" asciende a "+ aux);
	}
	/**
	 * Expulsa al cliente de la optica.
	 */
	public void metodo5(){//despedir cliente
		cliente=null;
	}

}
