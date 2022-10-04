package vehiculos;


public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre; // como llaman al vehiculo
	private int precio;
	private float peso;
	private String traccion;
	private Fabricante fabricante;
	private static int cantidadVehiculos = 0;
	//private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	
	
	// contructores
	
	public Vehiculo() {
		cantidadVehiculos++;
	}
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, float peso,
			String traccion, Fabricante fabricante) {
	
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		cantidadVehiculos++;
		fabricante.SetContador();
		fabricante.getPais().setVehiculosFabricados();
		Fabricante.getLista().add(fabricante);
		Pais.getListaP().add(fabricante.getPais());
		
	}

	// Getters and Setters
	
	
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.cantidadVehiculos = cantidadVehiculos;
	

	// Vehiculos por tipo
	
	}
	public static String vehiculosPorTipo() {
		return  "Automoviles: " + Automovil.getCantidadAutomoviles() + "\nCamionetas: " + Camioneta.getCantidadCamionetas() + "\nCamiones: " + Camion.getCantidadCamiones();
				
	}
	
}