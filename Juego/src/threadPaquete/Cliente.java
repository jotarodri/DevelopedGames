package threadPaquete;

public class Cliente {

	private String nombre;
	private int[] carroCompra;

	// Constructor, getter y setter
	
	public Cliente (String nombre, int[]vector) {
		
		this.nombre = nombre;
		carroCompra = vector;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int[] getCarroCompra() {
		return carroCompra;
	}

	public void setCarroCompra(int[] carroCompra) {
		this.carroCompra = carroCompra;
	}

}


