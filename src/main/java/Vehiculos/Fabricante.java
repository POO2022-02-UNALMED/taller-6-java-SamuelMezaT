package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private int contador;
	private static ArrayList<Fabricante> lista = new ArrayList<Fabricante>(); 
	
	// constructores
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		contador=0;
		lista.add(this);
	}
	
	public Fabricante() {
		lista.add(this);
	}
	
	//getters and setters

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public void SetContador() {
		this.contador++;
	}

	public int getContador() {
		return contador;
	}
	public static ArrayList<Fabricante> getLista() {
		return lista;
	}

	public static void setLista(ArrayList<Fabricante> lista) {
		Fabricante.lista = lista;
	}
	
	
	// Metodos maximo fabricante
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante ganador = lista.get(0);
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getContador() > ganador.getContador()) {
				ganador = lista.get(i);
			}
		}
		return ganador;
	}

}