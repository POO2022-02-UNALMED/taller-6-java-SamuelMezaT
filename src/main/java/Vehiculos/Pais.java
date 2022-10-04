package vehiculos;
import java.util.*;


public class Pais {
	private String nombre;
	private static ArrayList<Pais> listaP = new ArrayList<Pais>(); 
	private int vehiculosFabricados;
	
	// constructores
	
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	public Pais() {      
		listaP.add(this);
	}
	
	// GETTERS AND SETTERS
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static ArrayList<Pais> getListaP() {
		return listaP;
	}
	public static void setListaP(ArrayList<Pais> listaP) {
		Pais.listaP = listaP;
	}
	
	public int getVehiculosFabricados() {
		return vehiculosFabricados;
	}
	
	public void setVehiculosFabricados() {
		vehiculosFabricados++;
	}
	
	
	// PAIS MAS VENDEDOR
	
	public static Pais paisMasVendedor() {
		Pais ganador = listaP.get(0);
		for (int i = 1; i < listaP.size(); i++) {
			if (listaP.get(i).getVehiculosFabricados() > ganador.getVehiculosFabricados()) {
				ganador = listaP.get(i);
			}
		}
		return ganador;
	}
	
}